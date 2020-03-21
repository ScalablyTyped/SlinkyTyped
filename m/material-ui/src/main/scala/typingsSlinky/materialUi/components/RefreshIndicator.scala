package typingsSlinky.materialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialUi.MaterialUI.RefreshIndicatorProps
import typingsSlinky.materialUi.materialUiStrings.hide
import typingsSlinky.materialUi.materialUiStrings.loading
import typingsSlinky.materialUi.materialUiStrings.ready
import typingsSlinky.materialUi.refreshIndicatorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RefreshIndicator
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/RefreshIndicator", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: size, style */
  def apply(
    left: Double,
    top: Double,
    color: String = null,
    loadingColor: String = null,
    percentage: Int | Double = null,
    status: ready | loading | hide = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (loadingColor != null) __obj.updateDynamic("loadingColor")(loadingColor.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RefreshIndicatorProps
}


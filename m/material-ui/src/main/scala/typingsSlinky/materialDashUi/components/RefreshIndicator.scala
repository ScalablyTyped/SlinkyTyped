package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.RefreshIndicatorProps
import typingsSlinky.materialDashUi.materialDashUiStrings.hide
import typingsSlinky.materialDashUi.materialDashUiStrings.loading
import typingsSlinky.materialDashUi.materialDashUiStrings.ready
import typingsSlinky.materialDashUi.refreshIndicatorMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: size */
object RefreshIndicator
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.materialDashUi.refreshIndicatorMod.default].asInstanceOf[String | js.Object]
  def apply(
    left: Double,
    top: Double,
    color: String = null,
    loadingColor: String = null,
    percentage: Int | Double = null,
    status: ready | loading | hide = null,
    style: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (loadingColor != null) __obj.updateDynamic("loadingColor")(loadingColor.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RefreshIndicatorProps
}


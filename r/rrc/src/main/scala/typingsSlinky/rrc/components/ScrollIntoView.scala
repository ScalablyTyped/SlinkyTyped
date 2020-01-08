package typingsSlinky.rrc.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.rrc.rrcMod.ScrollIntoViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollIntoView
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.rrc.rrcMod.ScrollIntoView] {
  @JSImport("rrc", "ScrollIntoView")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    id: String,
    alignToTop: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.rrc.rrcMod.ScrollIntoView] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(alignToTop)) __obj.updateDynamic("alignToTop")(alignToTop.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ScrollIntoViewProps
}


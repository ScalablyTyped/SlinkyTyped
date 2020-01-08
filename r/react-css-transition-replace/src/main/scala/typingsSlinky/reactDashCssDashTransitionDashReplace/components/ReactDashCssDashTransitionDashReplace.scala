package typingsSlinky.reactDashCssDashTransitionDashReplace.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashCssDashTransitionDashReplace
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-css-transition-replace", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    changeWidth: js.UndefOr[Boolean] = js.undefined,
    overflowHidden: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(changeWidth)) __obj.updateDynamic("changeWidth")(changeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowHidden)) __obj.updateDynamic("overflowHidden")(overflowHidden.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactDashCssDashTransitionDashReplace.reactDashCssDashTransitionDashReplaceMod.Props
}


package typingsSlinky.reactstrap.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactstrap.libButtonToggleMod.ButtonToggleProps
import typingsSlinky.reactstrap.libButtonToggleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ButtonToggle
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("reactstrap/lib/ButtonToggle", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onBlur, onClick, onFocus */
  def apply[T](defaultValue: js.UndefOr[Boolean] = js.undefined, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactstrap.libButtonToggleMod.default[js.Any]]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default[js.Any]] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactstrap.libButtonToggleMod.default[js.Any]](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ButtonToggleProps
}


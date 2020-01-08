package typingsSlinky.reactDashElemental.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashElemental.reactDashElementalMod.SpinnerProps
import typingsSlinky.reactDashElemental.reactDashElementalMod.SpinnerSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Spinner
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashElemental.reactDashElementalMod.Spinner] {
  @JSImport("react-elemental", "Spinner")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    accentColor: String = null,
    duration: Int | Double = null,
    ringColor: String = null,
    size: SpinnerSize = null,
    style: CSSProperties = null,
    thickness: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashElemental.reactDashElementalMod.Spinner] = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ringColor != null) __obj.updateDynamic("ringColor")(ringColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashElemental.reactDashElementalMod.Spinner] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashElemental.reactDashElementalMod.Spinner](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SpinnerProps
}


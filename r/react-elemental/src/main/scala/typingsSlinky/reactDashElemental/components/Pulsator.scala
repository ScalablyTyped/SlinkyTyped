package typingsSlinky.reactDashElemental.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashElemental.reactDashElementalMod.PulsatorProps
import typingsSlinky.reactDashElemental.reactDashElementalMod.PulsatorSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pulsator
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashElemental.reactDashElementalMod.Pulsator] {
  @JSImport("react-elemental", "Pulsator")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    color: String = null,
    inactive: js.UndefOr[Boolean] = js.undefined,
    size: PulsatorSize = null,
    style: CSSProperties = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashElemental.reactDashElementalMod.Pulsator] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(inactive)) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashElemental.reactDashElementalMod.Pulsator] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashElemental.reactDashElementalMod.Pulsator](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PulsatorProps
}


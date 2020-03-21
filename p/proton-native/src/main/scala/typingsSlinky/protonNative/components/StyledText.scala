package typingsSlinky.protonNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.protonNative.AnonBackgroundColor
import typingsSlinky.protonNative.mod.StyledTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyledText
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.protonNative.mod.StyledText] {
  @JSImport("proton-native", "StyledText")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    style: AnonBackgroundColor = null,
    x: Double | String = null,
    y: Double | String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.protonNative.mod.StyledText] = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.protonNative.mod.StyledText] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.protonNative.mod.StyledText](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StyledTextProps
}


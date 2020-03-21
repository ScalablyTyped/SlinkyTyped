package typingsSlinky.antdMobileRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdMobileRn.antdMobileRnStrings.lg
import typingsSlinky.antdMobileRn.antdMobileRnStrings.md
import typingsSlinky.antdMobileRn.antdMobileRnStrings.sm
import typingsSlinky.antdMobileRn.antdMobileRnStrings.xl
import typingsSlinky.antdMobileRn.antdMobileRnStrings.xs
import typingsSlinky.antdMobileRn.whiteSpaceIndexNativeMod.WhiteSpaceProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WhiteSpace
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antdMobileRn.mod.WhiteSpace] {
  @JSImport("antd-mobile-rn", "WhiteSpace")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    size: xs | sm | md | lg | xl = null,
    style: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.WhiteSpace] = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.WhiteSpace] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antdMobileRn.mod.WhiteSpace](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = WhiteSpaceProps
}


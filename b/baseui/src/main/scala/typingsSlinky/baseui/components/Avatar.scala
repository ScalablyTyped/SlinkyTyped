package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.avatarMod.AvatarOverrides
import typingsSlinky.baseui.avatarMod.AvatarProps
import typingsSlinky.baseui.avatarMod.StyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Avatar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.avatarMod.Avatar] {
  @JSImport("baseui/avatar", "Avatar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: src */
  def apply(
    name: String,
    overrides: AvatarOverrides[StyleProps] = null,
    size: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.avatarMod.Avatar] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AvatarProps
}


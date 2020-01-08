package typingsSlinky.reactDashNativeDashMaterialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.Image
import typingsSlinky.reactDashNativeDashMaterialDashUi.Anon_ContainerContent
import typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.AvatarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Avatar
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.Avatar
    ] {
  @JSImport("react-native-material-ui", "Avatar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: size */
  def apply(
    icon: String = null,
    iconColor: String = null,
    iconSize: Int | Double = null,
    image: Image = null,
    style: Anon_ContainerContent = null,
    text: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.Avatar
  ] = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.Avatar
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.Avatar](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AvatarProps
}


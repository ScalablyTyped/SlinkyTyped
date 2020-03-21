package typingsSlinky.reactNativeZssRichTextEditor.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeZssRichTextEditor.PartialRichTextToolbarPro
import typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS
import typingsSlinky.reactNativeZssRichTextEditor.mod.ElementStyles
import typingsSlinky.reactNativeZssRichTextEditor.mod.IconsMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RichTextToolbar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextToolbar] {
  @JSImport("react-native-zss-rich-text-editor", "RichTextToolbar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    actions: js.Array[ACTIONS] = null,
    getEditor: () => typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextEditor = null,
    iconMap: IconsMap = null,
    iconTint: String = null,
    onPressAddImage: () => Unit = null,
    onPressAddLink: () => Unit = null,
    renderAction: () => TagMod[Any] = null,
    selectedButtonStyle: ElementStyles = null,
    selectedIconTint: String = null,
    unselectedButtonStyle: ElementStyles = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextToolbar] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (getEditor != null) __obj.updateDynamic("getEditor")(js.Any.fromFunction0(getEditor))
    if (iconMap != null) __obj.updateDynamic("iconMap")(iconMap.asInstanceOf[js.Any])
    if (iconTint != null) __obj.updateDynamic("iconTint")(iconTint.asInstanceOf[js.Any])
    if (onPressAddImage != null) __obj.updateDynamic("onPressAddImage")(js.Any.fromFunction0(onPressAddImage))
    if (onPressAddLink != null) __obj.updateDynamic("onPressAddLink")(js.Any.fromFunction0(onPressAddLink))
    if (renderAction != null) __obj.updateDynamic("renderAction")(js.Any.fromFunction0(renderAction))
    if (selectedButtonStyle != null) __obj.updateDynamic("selectedButtonStyle")(selectedButtonStyle.asInstanceOf[js.Any])
    if (selectedIconTint != null) __obj.updateDynamic("selectedIconTint")(selectedIconTint.asInstanceOf[js.Any])
    if (unselectedButtonStyle != null) __obj.updateDynamic("unselectedButtonStyle")(unselectedButtonStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextToolbar] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextToolbar](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PartialRichTextToolbarPro
}


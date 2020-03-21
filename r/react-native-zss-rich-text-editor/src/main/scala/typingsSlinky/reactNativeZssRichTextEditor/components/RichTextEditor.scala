package typingsSlinky.reactNativeZssRichTextEditor.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeZssRichTextEditor.PartialRichTextEditorProp
import typingsSlinky.reactNativeZssRichTextEditor.mod.ContentInset
import typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RichTextEditor
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextEditor] {
  @JSImport("react-native-zss-rich-text-editor", "RichTextEditor")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    contentInset: ContentInset = null,
    contentPlaceholder: String = null,
    customCSS: RichTextStyles = null,
    editorInitializedCallback: () => Unit = null,
    enableOnChange: js.UndefOr[Boolean] = js.undefined,
    footerHeight: Int | Double = null,
    hiddenTitle: js.UndefOr[Boolean] = js.undefined,
    initialContentHTML: String = null,
    initialTitleHTML: String = null,
    titlePlaceholder: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextEditor] = {
    val __obj = js.Dynamic.literal()
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (contentPlaceholder != null) __obj.updateDynamic("contentPlaceholder")(contentPlaceholder.asInstanceOf[js.Any])
    if (customCSS != null) __obj.updateDynamic("customCSS")(customCSS.asInstanceOf[js.Any])
    if (editorInitializedCallback != null) __obj.updateDynamic("editorInitializedCallback")(js.Any.fromFunction0(editorInitializedCallback))
    if (!js.isUndefined(enableOnChange)) __obj.updateDynamic("enableOnChange")(enableOnChange.asInstanceOf[js.Any])
    if (footerHeight != null) __obj.updateDynamic("footerHeight")(footerHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenTitle)) __obj.updateDynamic("hiddenTitle")(hiddenTitle.asInstanceOf[js.Any])
    if (initialContentHTML != null) __obj.updateDynamic("initialContentHTML")(initialContentHTML.asInstanceOf[js.Any])
    if (initialTitleHTML != null) __obj.updateDynamic("initialTitleHTML")(initialTitleHTML.asInstanceOf[js.Any])
    if (titlePlaceholder != null) __obj.updateDynamic("titlePlaceholder")(titlePlaceholder.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextEditor] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextEditor](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PartialRichTextEditorProp
}


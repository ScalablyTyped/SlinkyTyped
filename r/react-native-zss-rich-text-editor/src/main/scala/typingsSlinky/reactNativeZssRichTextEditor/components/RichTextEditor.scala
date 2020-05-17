package typingsSlinky.reactNativeZssRichTextEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeZssRichTextEditor.anon.PartialRichTextEditorProp
import typingsSlinky.reactNativeZssRichTextEditor.mod.ContentInset
import typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RichTextEditor {
  @JSImport("react-native-zss-rich-text-editor", "RichTextEditor")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextEditor] {
    @scala.inline
    def contentInset(value: ContentInset): this.type = set("contentInset", value.asInstanceOf[js.Any])
    @scala.inline
    def contentPlaceholder(value: String): this.type = set("contentPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def customCSS(value: RichTextStyles): this.type = set("customCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def editorInitializedCallback(value: () => Unit): this.type = set("editorInitializedCallback", js.Any.fromFunction0(value))
    @scala.inline
    def enableOnChange(value: Boolean): this.type = set("enableOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def footerHeight(value: Double): this.type = set("footerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def hiddenTitle(value: Boolean): this.type = set("hiddenTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def initialContentHTML(value: String): this.type = set("initialContentHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def initialTitleHTML(value: String): this.type = set("initialTitleHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def titlePlaceholder(value: String): this.type = set("titlePlaceholder", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PartialRichTextEditorProp): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RichTextEditor.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}


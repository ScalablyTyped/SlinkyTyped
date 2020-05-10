package typingsSlinky.reactNativeZssRichTextEditor

import typingsSlinky.reactNativeZssRichTextEditor.mod.ContentInset
import typingsSlinky.reactNativeZssRichTextEditor.mod.FunctionWithZeroArgs
import typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextEditorProps> */
@js.native
trait PartialRichTextEditorProp extends js.Object {
  var contentInset: js.UndefOr[ContentInset] = js.native
  var contentPlaceholder: js.UndefOr[String] = js.native
  var customCSS: js.UndefOr[RichTextStyles] = js.native
  var editorInitializedCallback: js.UndefOr[FunctionWithZeroArgs] = js.native
  var enableOnChange: js.UndefOr[Boolean] = js.native
  var footerHeight: js.UndefOr[Double] = js.native
  var hiddenTitle: js.UndefOr[Boolean] = js.native
  var initialContentHTML: js.UndefOr[String] = js.native
  var initialTitleHTML: js.UndefOr[String] = js.native
  var titlePlaceholder: js.UndefOr[String] = js.native
}

object PartialRichTextEditorProp {
  @scala.inline
  def apply(): PartialRichTextEditorProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRichTextEditorProp]
  }
  @scala.inline
  implicit class PartialRichTextEditorPropOps[Self <: PartialRichTextEditorProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentInset(value: ContentInset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentInset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInset")(js.undefined)
        ret
    }
    @scala.inline
    def withContentPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomCSS(value: RichTextStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorInitializedCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorInitializedCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEditorInitializedCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorInitializedCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableOnChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOnChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOnChange")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialContentHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialContentHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialContentHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialContentHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialTitleHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTitleHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialTitleHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTitleHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withTitlePlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitlePlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePlaceholder")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.reactNativeZssRichTextEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RichTextEditorProps extends js.Object {
  var contentInset: ContentInset = js.native
  // Text that will be used as a placeholder when no text is present in the content section.
  var contentPlaceholder: String = js.native
  // Any custom CSS styles that you want to inject to the editor.
  var customCSS: RichTextStyles = js.native
  // A function that will be called when the editor has been initialized.
  var editorInitializedCallback: FunctionWithZeroArgs = js.native
  var enableOnChange: Boolean = js.native
  var footerHeight: Double = js.native
  // Hide title
  var hiddenTitle: Boolean = js.native
  // HTML that will be rendered in the content section on load.
  var initialContentHTML: String = js.native
  // HTML that will be rendered in the title section as soon as the component loads.
  var initialTitleHTML: String = js.native
  // Text that will be used as a placeholder when no text is present in the title section.
  var titlePlaceholder: String = js.native
}

object RichTextEditorProps {
  @scala.inline
  def apply(
    contentInset: ContentInset,
    contentPlaceholder: String,
    customCSS: RichTextStyles,
    editorInitializedCallback: () => Unit,
    enableOnChange: Boolean,
    footerHeight: Double,
    hiddenTitle: Boolean,
    initialContentHTML: String,
    initialTitleHTML: String,
    titlePlaceholder: String
  ): RichTextEditorProps = {
    val __obj = js.Dynamic.literal(contentInset = contentInset.asInstanceOf[js.Any], contentPlaceholder = contentPlaceholder.asInstanceOf[js.Any], customCSS = customCSS.asInstanceOf[js.Any], editorInitializedCallback = js.Any.fromFunction0(editorInitializedCallback), enableOnChange = enableOnChange.asInstanceOf[js.Any], footerHeight = footerHeight.asInstanceOf[js.Any], hiddenTitle = hiddenTitle.asInstanceOf[js.Any], initialContentHTML = initialContentHTML.asInstanceOf[js.Any], initialTitleHTML = initialTitleHTML.asInstanceOf[js.Any], titlePlaceholder = titlePlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichTextEditorProps]
  }
  @scala.inline
  implicit class RichTextEditorPropsOps[Self <: RichTextEditorProps] (val x: Self) extends AnyVal {
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
    def withContentPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomCSS(value: RichTextStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorInitializedCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorInitializedCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableOnChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOnChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialContentHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialContentHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialTitleHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTitleHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitlePlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


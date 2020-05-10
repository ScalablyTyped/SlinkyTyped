package typingsSlinky.markitup.MarkItUp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Function to be called after any markup insertion.
    */
  var afterInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, String]] = js.native
  /**
    * Function to be called before any markup insertion.
    */
  var beforeInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, String]] = js.native
  /**
    * Note that most of the settings below are used by the engine for all insertion calls ($.markItUp( {} ), onEnter, onShiftEnter, onCtrlEnter, onTab) except exclusive button properties marked by
    */
  var markupSet: js.UndefOr[js.Array[MarkupSet]] = js.native
  /**
    * Apply a specific className to the wrapping Div. Useful to prevent CSS conflicts between instances.
    */
  var nameSpace: js.UndefOr[String] = js.native
  /**
    * Define what to do when Ctrl+Enter keys are pressed.
    */
  var onCtrlEnter: js.UndefOr[MarkupSet] = js.native
  /**
    * Define what to do when Enter key is pressed.
    */
  var onEnter: js.UndefOr[MarkupSet] = js.native
  /**
    * Define what to do when Shift+Enter keys are pressed.
    */
  var onShiftEnter: js.UndefOr[MarkupSet] = js.native
  /**
    * Define what to do when Tab key is pressed. Warning, this key is also used to jump at the end of a new inserted markup.
    */
  var onTab: js.UndefOr[MarkupSet] = js.native
  /**
    * AutoRefresh the preview iFrame or window when the editor is used.
    */
  var previewAutoRefresh: js.UndefOr[Boolean] = js.native
  /**
    * Display the preview in a popup window with comma-separated list of specs. If empty or false, the preview will be displayed in the built-in iFrame preview.
    */
  var previewInWindow: js.UndefOr[String] = js.native
  /**
    * Parse the content with the javascript parser of your choice before passing it to the preview.
    *
    * default: false
    */
  var previewParser: js.UndefOr[Boolean] = js.native
  /**
    * You can set the path of your own parser to preview markup languages other than html. If this property is set, the built-in preview will be overridden by your own preview script.
    * Use ~/ for markItUp! root.
    */
  var previewParserPath: js.UndefOr[String] = js.native
  /**
    * Name of the var posted with the editor content to the parser defined above.
    *
    * default: 'data'
    */
  var previewParserVar: js.UndefOr[String] = js.native
  /**
    * Position of the Built-in preview before or after the main textarea.
    * 'before'|'after'
    *
    * default: 'after'
    */
  var previewPosition: js.UndefOr[String] = js.native
  /**
    * Path to the Html preview template.
    * Use ~/ for markItUp! root.
    *
    * default: '~/templates/preview.html'
    */
  var previewTemplatePath: js.UndefOr[String] = js.native
  /**
    * Enable/Disable the handle to resize the editor.
    */
  var resizeHandle: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterInsert(value: /* h */ MarkupSet => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInsert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeInsert(value: /* h */ MarkupSet => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInsert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkupSet(value: js.Array[MarkupSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markupSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkupSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markupSet")(js.undefined)
        ret
    }
    @scala.inline
    def withNameSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCtrlEnter(value: MarkupSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCtrlEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCtrlEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCtrlEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnter(value: MarkupSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShiftEnter(value: MarkupSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShiftEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnShiftEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShiftEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTab(value: MarkupSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTab")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewAutoRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewAutoRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewAutoRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewAutoRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewInWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewInWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewInWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewInWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewParser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewParser")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewParserPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewParserPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewParserPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewParserPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewParserVar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewParserVar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewParserVar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewParserVar")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewTemplatePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewTemplatePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewTemplatePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewTemplatePath")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeHandle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandle")(js.undefined)
        ret
    }
  }
  
}


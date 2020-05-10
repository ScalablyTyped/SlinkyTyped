package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDiffEditorOptions extends IEditorOptions {
  /**
    * Allow the user to resize the diff editor split view.
    * Defaults to true.
    */
  var enableSplitViewResizing: js.UndefOr[Boolean] = js.native
  /**
    * Compute the diff by ignoring leading/trailing whitespace
    * Defaults to true.
    */
  var ignoreTrimWhitespace: js.UndefOr[Boolean] = js.native
  /**
    * Original model should be editable?
    * Defaults to false.
    */
  var originalEditable: js.UndefOr[Boolean] = js.native
  /**
    * Render +/- indicators for added/deleted changes.
    * Defaults to true.
    */
  var renderIndicators: js.UndefOr[Boolean] = js.native
  /**
    * Render the differences in two side-by-side editors.
    * Defaults to true.
    */
  var renderSideBySide: js.UndefOr[Boolean] = js.native
}

object IDiffEditorOptions {
  @scala.inline
  def apply(): IDiffEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiffEditorOptions]
  }
  @scala.inline
  implicit class IDiffEditorOptionsOps[Self <: IDiffEditorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableSplitViewResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSplitViewResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSplitViewResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSplitViewResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreTrimWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTrimWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreTrimWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTrimWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEditable")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderIndicators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIndicators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderIndicators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIndicators")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSideBySide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSideBySide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderSideBySide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSideBySide")(js.undefined)
        ret
    }
  }
  
}


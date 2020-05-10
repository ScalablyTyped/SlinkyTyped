package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorPasteCleanup extends js.Object {
  var all: js.UndefOr[Boolean] = js.native
  var css: js.UndefOr[Boolean] = js.native
  var custom: js.UndefOr[js.Function] = js.native
  var keepNewLines: js.UndefOr[Boolean] = js.native
  var msAllFormatting: js.UndefOr[Boolean] = js.native
  var msConvertLists: js.UndefOr[Boolean] = js.native
  var msTags: js.UndefOr[Boolean] = js.native
  var none: js.UndefOr[Boolean] = js.native
  var span: js.UndefOr[Boolean] = js.native
}

object EditorPasteCleanup {
  @scala.inline
  def apply(): EditorPasteCleanup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorPasteCleanup]
  }
  @scala.inline
  implicit class EditorPasteCleanupOps[Self <: EditorPasteCleanup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepNewLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepNewLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepNewLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepNewLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMsAllFormatting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msAllFormatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsAllFormatting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msAllFormatting")(js.undefined)
        ret
    }
    @scala.inline
    def withMsConvertLists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msConvertLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsConvertLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msConvertLists")(js.undefined)
        ret
    }
    @scala.inline
    def withMsTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msTags")(js.undefined)
        ret
    }
    @scala.inline
    def withNone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(js.undefined)
        ret
    }
    @scala.inline
    def withSpan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(js.undefined)
        ret
    }
  }
  
}


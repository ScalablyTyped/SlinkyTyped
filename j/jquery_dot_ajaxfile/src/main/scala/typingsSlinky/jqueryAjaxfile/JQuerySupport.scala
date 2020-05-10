package typingsSlinky.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  Collection of properties of the current browser
*/
@js.native
trait JQuerySupport extends js.Object {
  var ajax: js.UndefOr[Boolean] = js.native
  var boxModel: js.UndefOr[Boolean] = js.native
  var changeBubbles: js.UndefOr[Boolean] = js.native
  var checkClone: js.UndefOr[Boolean] = js.native
  var checkOn: js.UndefOr[Boolean] = js.native
  var cors: js.UndefOr[Boolean] = js.native
  var cssFloat: js.UndefOr[Boolean] = js.native
  var hrefNormalized: js.UndefOr[Boolean] = js.native
  var htmlSerialize: js.UndefOr[Boolean] = js.native
  var leadingWhitespace: js.UndefOr[Boolean] = js.native
  var noCloneChecked: js.UndefOr[Boolean] = js.native
  var noCloneEvent: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Boolean] = js.native
  var optDisabled: js.UndefOr[Boolean] = js.native
  var optSelected: js.UndefOr[Boolean] = js.native
  var scriptEval: js.UndefOr[js.Function0[Boolean]] = js.native
  var style: js.UndefOr[Boolean] = js.native
  var submitBubbles: js.UndefOr[Boolean] = js.native
  var tbody: js.UndefOr[Boolean] = js.native
}

object JQuerySupport {
  @scala.inline
  def apply(): JQuerySupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQuerySupport]
  }
  @scala.inline
  implicit class JQuerySupportOps[Self <: JQuerySupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxModel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxModel")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeBubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeBubbles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeBubbles")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckClone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkClone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkClone")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOn")(js.undefined)
        ret
    }
    @scala.inline
    def withCors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(js.undefined)
        ret
    }
    @scala.inline
    def withCssFloat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssFloat")(js.undefined)
        ret
    }
    @scala.inline
    def withHrefNormalized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefNormalized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHrefNormalized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefNormalized")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlSerialize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlSerialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlSerialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlSerialize")(js.undefined)
        ret
    }
    @scala.inline
    def withLeadingWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeadingWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCloneChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCloneChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCloneChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCloneChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCloneEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCloneEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCloneEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCloneEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOptDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOptSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptEval(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptEval")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutScriptEval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptEval")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitBubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitBubbles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitBubbles")(js.undefined)
        ret
    }
    @scala.inline
    def withTbody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTbody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbody")(js.undefined)
        ret
    }
  }
  
}


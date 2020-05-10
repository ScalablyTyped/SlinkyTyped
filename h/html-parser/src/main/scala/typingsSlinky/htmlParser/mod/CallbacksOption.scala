package typingsSlinky.htmlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbacksOption extends js.Object {
  var attribute: js.UndefOr[js.Function2[/* name */ String, /* value */ js.Any, Unit]] = js.native
  var cdata: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.native
  var closeElement: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.native
  var closeOpenedElement: js.UndefOr[
    js.Function3[/* tagName */ String, /* token */ Token, /* isUnary */ Boolean, Unit]
  ] = js.native
  var comment: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.native
  var docType: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.native
  var openElement: js.UndefOr[js.Function1[/* tagName */ String, Unit]] = js.native
  var text: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var xmlProlog: js.UndefOr[js.Function0[Unit]] = js.native
}

object CallbacksOption {
  @scala.inline
  def apply(): CallbacksOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbacksOption]
  }
  @scala.inline
  implicit class CallbacksOptionOps[Self <: CallbacksOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: (/* name */ String, /* value */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(js.undefined)
        ret
    }
    @scala.inline
    def withCdata(value: /* content */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdata")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseElement(value: /* name */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCloseElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeElement")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOpenedElement(value: (/* tagName */ String, /* token */ Token, /* isUnary */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOpenedElement")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCloseOpenedElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOpenedElement")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: /* content */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withDocType(value: /* content */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDocType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docType")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenElement(value: /* tagName */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpenElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openElement")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: /* value */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlProlog(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlProlog")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutXmlProlog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlProlog")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTCDefaultDispatch extends js.Object {
  @JSName("MSHTML.HTCDefaultDispatch_typekey")
  var MSHTMLDotHTCDefaultDispatch_typekey: HTCDefaultDispatch = js.native
  val defaults: js.Any = js.native
  val document: js.Any = js.native
  val element: IHTMLElement = js.native
  def CreateEventObject(): IHTMLEventObj = js.native
}

object HTCDefaultDispatch {
  @scala.inline
  def apply(
    CreateEventObject: () => IHTMLEventObj,
    MSHTMLDotHTCDefaultDispatch_typekey: HTCDefaultDispatch,
    defaults: js.Any,
    document: js.Any,
    element: IHTMLElement
  ): HTCDefaultDispatch = {
    val __obj = js.Dynamic.literal(CreateEventObject = js.Any.fromFunction0(CreateEventObject), defaults = defaults.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTCDefaultDispatch_typekey")(MSHTMLDotHTCDefaultDispatch_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCDefaultDispatch]
  }
  @scala.inline
  implicit class HTCDefaultDispatchOps[Self <: HTCDefaultDispatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateEventObject(value: () => IHTMLEventObj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateEventObject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMSHTMLDotHTCDefaultDispatch_typekey(value: HTCDefaultDispatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTCDefaultDispatch_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: IHTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


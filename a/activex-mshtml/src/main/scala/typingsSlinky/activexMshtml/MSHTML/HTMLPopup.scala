package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLPopup extends js.Object {
  @JSName("MSHTML.HTMLPopup_typekey")
  var MSHTMLDotHTMLPopup_typekey: HTMLPopup = js.native
  val constructor: js.Any = js.native
  val document: IHTMLDocument = js.native
  val isOpen: Boolean = js.native
  def Hide(): Unit = js.native
  def Show(x: Double, y: Double, w: Double, h: Double, pElement: js.Any): Unit = js.native
}

object HTMLPopup {
  @scala.inline
  def apply(
    Hide: () => Unit,
    MSHTMLDotHTMLPopup_typekey: HTMLPopup,
    Show: (Double, Double, Double, Double, js.Any) => Unit,
    constructor: js.Any,
    document: IHTMLDocument,
    isOpen: Boolean
  ): HTMLPopup = {
    val __obj = js.Dynamic.literal(Hide = js.Any.fromFunction0(Hide), Show = js.Any.fromFunction5(Show), constructor = constructor.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLPopup_typekey")(MSHTMLDotHTMLPopup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPopup]
  }
  @scala.inline
  implicit class HTMLPopupOps[Self <: HTMLPopup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMSHTMLDotHTMLPopup_typekey(value: HTMLPopup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLPopup_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: (Double, Double, Double, Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Show")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withConstructor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: IHTMLDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLSelectionObject extends js.Object {
  @JSName("MSHTML.IHTMLSelectionObject_typekey")
  var MSHTMLDotIHTMLSelectionObject_typekey: IHTMLSelectionObject = js.native
  val `type`: String = js.native
  def clear(): Unit = js.native
  def createRange(): js.Any = js.native
  def empty(): Unit = js.native
}

object IHTMLSelectionObject {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLSelectionObject_typekey: IHTMLSelectionObject,
    clear: () => Unit,
    createRange: () => js.Any,
    empty: () => Unit,
    `type`: String
  ): IHTMLSelectionObject = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), createRange = js.Any.fromFunction0(createRange), empty = js.Any.fromFunction0(empty))
    __obj.updateDynamic("MSHTML.IHTMLSelectionObject_typekey")(MSHTMLDotIHTMLSelectionObject_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLSelectionObject]
  }
  @scala.inline
  implicit class IHTMLSelectionObjectOps[Self <: IHTMLSelectionObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIHTMLSelectionObject_typekey(value: IHTMLSelectionObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IHTMLSelectionObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateRange(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmpty(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


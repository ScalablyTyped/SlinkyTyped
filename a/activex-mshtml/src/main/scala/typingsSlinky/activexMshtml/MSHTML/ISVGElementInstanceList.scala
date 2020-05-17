package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGElementInstanceList extends js.Object {
  @JSName("MSHTML.ISVGElementInstanceList_typekey")
  var MSHTMLDotISVGElementInstanceList_typekey: ISVGElementInstanceList = js.native
  val length: Double = js.native
  def item(index: Double): ISVGElementInstance = js.native
}

object ISVGElementInstanceList {
  @scala.inline
  def apply(
    MSHTMLDotISVGElementInstanceList_typekey: ISVGElementInstanceList,
    item: Double => ISVGElementInstance,
    length: Double
  ): ISVGElementInstanceList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGElementInstanceList_typekey")(MSHTMLDotISVGElementInstanceList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGElementInstanceList]
  }
  @scala.inline
  implicit class ISVGElementInstanceListOps[Self <: ISVGElementInstanceList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotISVGElementInstanceList_typekey(value: ISVGElementInstanceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.ISVGElementInstanceList_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Double => ISVGElementInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


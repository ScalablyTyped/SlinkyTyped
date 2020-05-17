package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLTimeRanges extends js.Object {
  @JSName("MSHTML.HTMLTimeRanges_typekey")
  var MSHTMLDotHTMLTimeRanges_typekey: HTMLTimeRanges = js.native
  val length: Double = js.native
  def end(index: Double): Double = js.native
  def endDouble(index: Double): Double = js.native
  def start(index: Double): Double = js.native
  def startDouble(index: Double): Double = js.native
}

object HTMLTimeRanges {
  @scala.inline
  def apply(
    MSHTMLDotHTMLTimeRanges_typekey: HTMLTimeRanges,
    end: Double => Double,
    endDouble: Double => Double,
    length: Double,
    start: Double => Double,
    startDouble: Double => Double
  ): HTMLTimeRanges = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), endDouble = js.Any.fromFunction1(endDouble), length = length.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), startDouble = js.Any.fromFunction1(startDouble))
    __obj.updateDynamic("MSHTML.HTMLTimeRanges_typekey")(MSHTMLDotHTMLTimeRanges_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLTimeRanges]
  }
  @scala.inline
  implicit class HTMLTimeRangesOps[Self <: HTMLTimeRanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLTimeRanges_typekey(value: HTMLTimeRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLTimeRanges_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndDouble(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDouble")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartDouble(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDouble")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


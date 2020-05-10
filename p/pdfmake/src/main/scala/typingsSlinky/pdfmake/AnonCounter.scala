package typingsSlinky.pdfmake

import typingsSlinky.pdfmake.interfacesMod.OrderedListType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCounter extends js.Object {
  var counter: js.UndefOr[Double] = js.native
  var listType: js.UndefOr[OrderedListType] = js.native
}

object AnonCounter {
  @scala.inline
  def apply(): AnonCounter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCounter]
  }
  @scala.inline
  implicit class AnonCounterOps[Self <: AnonCounter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(js.undefined)
        ret
    }
    @scala.inline
    def withListType(value: OrderedListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(js.undefined)
        ret
    }
  }
  
}


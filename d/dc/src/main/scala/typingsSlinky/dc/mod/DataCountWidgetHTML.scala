package typingsSlinky.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCountWidgetHTML extends js.Object {
  var all: String = js.native
  var some: String = js.native
}

object DataCountWidgetHTML {
  @scala.inline
  def apply(all: String, some: String): DataCountWidgetHTML = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], some = some.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCountWidgetHTML]
  }
  @scala.inline
  implicit class DataCountWidgetHTMLOps[Self <: DataCountWidgetHTML] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSome(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("some")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


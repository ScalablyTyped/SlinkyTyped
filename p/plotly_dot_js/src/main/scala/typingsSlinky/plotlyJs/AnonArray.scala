package typingsSlinky.plotlyJs

import typingsSlinky.plotlyJs.mod.Datum
import typingsSlinky.plotlyJs.plotlyJsStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArray extends js.Object {
  var array: js.Array[Datum] = js.native
  var arrayminus: js.UndefOr[js.Array[Datum]] = js.native
  var `type`: data = js.native
}

object AnonArray {
  @scala.inline
  def apply(array: js.Array[Datum], `type`: data): AnonArray = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArray]
  }
  @scala.inline
  implicit class AnonArrayOps[Self <: AnonArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray(value: js.Array[Datum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrayminus(value: js.Array[Datum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayminus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayminus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayminus")(js.undefined)
        ret
    }
  }
  
}


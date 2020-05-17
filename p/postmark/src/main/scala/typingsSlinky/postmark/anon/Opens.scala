package typingsSlinky.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opens extends js.Object {
  var Date: String = js.native
  var Opens: Double = js.native
  var Unique: Double = js.native
}

object Opens {
  @scala.inline
  def apply(Date: String, Opens: Double, Unique: Double): Opens = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Opens = Opens.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opens]
  }
  @scala.inline
  implicit class OpensOps[Self <: Opens] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpens(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Opens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnique(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unique")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


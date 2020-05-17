package typingsSlinky.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lastsave extends js.Object {
  var lastsave: js.Date = js.native
  var savecount: Double = js.native
  var value: String = js.native
}

object Lastsave {
  @scala.inline
  def apply(lastsave: js.Date, savecount: Double, value: String): Lastsave = {
    val __obj = js.Dynamic.literal(lastsave = lastsave.asInstanceOf[js.Any], savecount = savecount.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastsave]
  }
  @scala.inline
  implicit class LastsaveOps[Self <: Lastsave] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastsave(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastsave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSavecount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savecount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.nopt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCooked extends js.Object {
  var cooked: js.Array[String] = js.native
  var original: js.Array[String] = js.native
  var remain: js.Array[String] = js.native
}

object AnonCooked {
  @scala.inline
  def apply(cooked: js.Array[String], original: js.Array[String], remain: js.Array[String]): AnonCooked = {
    val __obj = js.Dynamic.literal(cooked = cooked.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], remain = remain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCooked]
  }
  @scala.inline
  implicit class AnonCookedOps[Self <: AnonCooked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCooked(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemain(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


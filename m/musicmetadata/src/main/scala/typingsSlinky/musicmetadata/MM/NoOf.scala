package typingsSlinky.musicmetadata.MM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoOf extends js.Object {
  var no: Double = js.native
  var of: Double = js.native
}

object NoOf {
  @scala.inline
  def apply(no: Double, of: Double): NoOf = {
    val __obj = js.Dynamic.literal(no = no.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoOf]
  }
  @scala.inline
  implicit class NoOfOps[Self <: NoOf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("of")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


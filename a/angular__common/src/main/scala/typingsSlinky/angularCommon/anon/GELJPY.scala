package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GELJPY extends js.Object {
  var GEL: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
}

object GELJPY {
  @scala.inline
  def apply(GEL: js.Array[String], JPY: js.Array[String]): GELJPY = {
    val __obj = js.Dynamic.literal(GEL = GEL.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any])
    __obj.asInstanceOf[GELJPY]
  }
  @scala.inline
  implicit class GELJPYOps[Self <: GELJPY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGEL(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


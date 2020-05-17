package typingsSlinky.geodesy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lon1 extends js.Object {
  var lon1: Double = js.native
  var lon2: Double = js.native
}

object Lon1 {
  @scala.inline
  def apply(lon1: Double, lon2: Double): Lon1 = {
    val __obj = js.Dynamic.literal(lon1 = lon1.asInstanceOf[js.Any], lon2 = lon2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lon1]
  }
  @scala.inline
  implicit class Lon1Ops[Self <: Lon1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLon1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lon1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLon2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lon2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


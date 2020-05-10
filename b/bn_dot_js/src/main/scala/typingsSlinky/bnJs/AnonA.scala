package typingsSlinky.bnJs

import typingsSlinky.bnJs.mod.BN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonA extends js.Object {
  var a: BN = js.native
  var b: BN = js.native
  var gcd: BN = js.native
}

object AnonA {
  @scala.inline
  def apply(a: BN, b: BN, gcd: BN): AnonA = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], gcd = gcd.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonA]
  }
  @scala.inline
  implicit class AnonAOps[Self <: AnonA] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: BN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withB(value: BN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGcd(value: BN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


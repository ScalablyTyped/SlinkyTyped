package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I extends js.Object {
  var i: Double = js.native
  var r: BigInteger = js.native
  var s: BigInteger = js.native
}

object I {
  @scala.inline
  def apply(i: Double, r: BigInteger, s: BigInteger): I = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[I]
  }
  @scala.inline
  implicit class IOps[Self <: I] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: BigInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS(value: BigInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


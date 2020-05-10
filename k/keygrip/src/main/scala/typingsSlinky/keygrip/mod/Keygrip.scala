package typingsSlinky.keygrip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keygrip extends js.Object {
  def index(data: js.Any, digest: String): Double = js.native
  def sign(data: js.Any): String = js.native
  def verify(data: js.Any, digest: String): Boolean = js.native
}

object Keygrip {
  @scala.inline
  def apply(index: (js.Any, String) => Double, sign: js.Any => String, verify: (js.Any, String) => Boolean): Keygrip = {
    val __obj = js.Dynamic.literal(index = js.Any.fromFunction2(index), sign = js.Any.fromFunction1(sign), verify = js.Any.fromFunction2(verify))
    __obj.asInstanceOf[Keygrip]
  }
  @scala.inline
  implicit class KeygripOps[Self <: Keygrip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: (js.Any, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSign(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerify(value: (js.Any, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


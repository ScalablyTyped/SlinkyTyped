package typingsSlinky.iron.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IvBits extends js.Object {
  var ivBits: Double = js.native
  var keyBits: Double = js.native
}

object IvBits {
  @scala.inline
  def apply(ivBits: Double, keyBits: Double): IvBits = {
    val __obj = js.Dynamic.literal(ivBits = ivBits.asInstanceOf[js.Any], keyBits = keyBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[IvBits]
  }
  @scala.inline
  implicit class IvBitsOps[Self <: IvBits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIvBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ivBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


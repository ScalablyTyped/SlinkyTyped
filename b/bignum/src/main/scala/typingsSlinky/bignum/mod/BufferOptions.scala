package typingsSlinky.bignum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferOptions extends js.Object {
  /** Can be either 'big' or 'little'. Also accepts 1 for big and -1 for little. Doesn't matter when size = 1. */
  var endian: String | Double = js.native
  /** Number of bytes per word, or 'auto' to flip entire Buffer. */
  var size: Double | String = js.native
}

object BufferOptions {
  @scala.inline
  def apply(endian: String | Double, size: Double | String): BufferOptions = {
    val __obj = js.Dynamic.literal(endian = endian.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferOptions]
  }
  @scala.inline
  implicit class BufferOptionsOps[Self <: BufferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndian(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


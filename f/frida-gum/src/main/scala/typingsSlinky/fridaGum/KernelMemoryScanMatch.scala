package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KernelMemoryScanMatch extends js.Object {
  /**
    * Memory address where a match was found.
    */
  var address: UInt64 = js.native
  /**
    * Size of this match.
    */
  var size: Double = js.native
}

object KernelMemoryScanMatch {
  @scala.inline
  def apply(address: UInt64, size: Double): KernelMemoryScanMatch = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelMemoryScanMatch]
  }
  @scala.inline
  implicit class KernelMemoryScanMatchOps[Self <: KernelMemoryScanMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: UInt64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


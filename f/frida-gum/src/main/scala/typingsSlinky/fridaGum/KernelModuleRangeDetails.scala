package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KernelModuleRangeDetails extends js.Object {
  /**
    * Base address.
    */
  var base: UInt64_ = js.native
  /**
    * Name.
    */
  var name: String = js.native
  /**
    * Protection.
    */
  var protection: PageProtection = js.native
  /**
    * Size in bytes.
    */
  var size: Double = js.native
}

object KernelModuleRangeDetails {
  @scala.inline
  def apply(base: UInt64_, name: String, protection: PageProtection, size: Double): KernelModuleRangeDetails = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelModuleRangeDetails]
  }
  @scala.inline
  implicit class KernelModuleRangeDetailsOps[Self <: KernelModuleRangeDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: UInt64_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtection(value: PageProtection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(value.asInstanceOf[js.Any])
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


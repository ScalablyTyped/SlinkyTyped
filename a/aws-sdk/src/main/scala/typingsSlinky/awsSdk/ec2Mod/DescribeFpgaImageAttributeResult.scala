package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFpgaImageAttributeResult extends js.Object {
  /**
    * Information about the attribute.
    */
  var FpgaImageAttribute: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.FpgaImageAttribute] = js.native
}

object DescribeFpgaImageAttributeResult {
  @scala.inline
  def apply(): DescribeFpgaImageAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFpgaImageAttributeResult]
  }
  @scala.inline
  implicit class DescribeFpgaImageAttributeResultOps[Self <: DescribeFpgaImageAttributeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFpgaImageAttribute(value: FpgaImageAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FpgaImageAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFpgaImageAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FpgaImageAttribute")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyFpgaImageResult extends js.Object {
  /**
    * The ID of the new AFI.
    */
  var FpgaImageId: js.UndefOr[String] = js.native
}

object CopyFpgaImageResult {
  @scala.inline
  def apply(): CopyFpgaImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyFpgaImageResult]
  }
  @scala.inline
  implicit class CopyFpgaImageResultOps[Self <: CopyFpgaImageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFpgaImageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FpgaImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFpgaImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FpgaImageId")(js.undefined)
        ret
    }
  }
  
}


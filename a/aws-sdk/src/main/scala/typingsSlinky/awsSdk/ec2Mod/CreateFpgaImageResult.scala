package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFpgaImageResult extends js.Object {
  /**
    * The global FPGA image identifier (AGFI ID).
    */
  var FpgaImageGlobalId: js.UndefOr[String] = js.native
  /**
    * The FPGA image identifier (AFI ID).
    */
  var FpgaImageId: js.UndefOr[String] = js.native
}

object CreateFpgaImageResult {
  @scala.inline
  def apply(): CreateFpgaImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFpgaImageResult]
  }
  @scala.inline
  implicit class CreateFpgaImageResultOps[Self <: CreateFpgaImageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFpgaImageGlobalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FpgaImageGlobalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFpgaImageGlobalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FpgaImageGlobalId")(js.undefined)
        ret
    }
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


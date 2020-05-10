package typingsSlinky.awsSdkClientS3Browser.typesCopyObjectResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCopyObjectResult extends CopyObjectResult {
  /**
    * _LastModified shape
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledCopyObjectResult: js.UndefOr[js.Date] = js.native
}

object UnmarshalledCopyObjectResult {
  @scala.inline
  def apply(): UnmarshalledCopyObjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledCopyObjectResult]
  }
  @scala.inline
  implicit class UnmarshalledCopyObjectResultOps[Self <: UnmarshalledCopyObjectResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(js.undefined)
        ret
    }
  }
  
}


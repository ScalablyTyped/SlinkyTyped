package typingsSlinky.awsSdkClientS3Browser.typesCopyPartResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCopyPartResult extends CopyPartResult {
  /**
    * <p>Date and time at which the object was uploaded.</p>
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledCopyPartResult: js.UndefOr[js.Date] = js.native
}

object UnmarshalledCopyPartResult {
  @scala.inline
  def apply(): UnmarshalledCopyPartResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledCopyPartResult]
  }
  @scala.inline
  implicit class UnmarshalledCopyPartResultOps[Self <: UnmarshalledCopyPartResult] (val x: Self) extends AnyVal {
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


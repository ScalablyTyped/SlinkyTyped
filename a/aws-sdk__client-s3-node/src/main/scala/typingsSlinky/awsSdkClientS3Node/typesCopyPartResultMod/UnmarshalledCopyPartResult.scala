package typingsSlinky.awsSdkClientS3Node.typesCopyPartResultMod

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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLastModified(value: js.Date): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
  }
  
}


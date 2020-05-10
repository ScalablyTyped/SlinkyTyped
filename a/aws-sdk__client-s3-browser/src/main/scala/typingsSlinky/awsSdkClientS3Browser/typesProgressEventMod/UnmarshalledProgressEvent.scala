package typingsSlinky.awsSdkClientS3Browser.typesProgressEventMod

import typingsSlinky.awsSdkClientS3Browser.typesProgressMod.UnmarshalledProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledProgressEvent extends ProgressEvent {
  /**
    * <p>The Progress event details.</p>
    */
  @JSName("Details")
  var Details_UnmarshalledProgressEvent: js.UndefOr[UnmarshalledProgress] = js.native
}

object UnmarshalledProgressEvent {
  @scala.inline
  def apply(): UnmarshalledProgressEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledProgressEvent]
  }
  @scala.inline
  implicit class UnmarshalledProgressEventOps[Self <: UnmarshalledProgressEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: UnmarshalledProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(js.undefined)
        ret
    }
  }
  
}


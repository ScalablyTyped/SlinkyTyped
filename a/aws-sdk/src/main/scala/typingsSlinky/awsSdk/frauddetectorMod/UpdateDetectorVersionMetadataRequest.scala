package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDetectorVersionMetadataRequest extends js.Object {
  /**
    * The description.
    */
  var description: typingsSlinky.awsSdk.frauddetectorMod.description = js.native
  /**
    * The detector ID.
    */
  var detectorId: identifier = js.native
  /**
    * The detector version ID. 
    */
  var detectorVersionId: nonEmptyString = js.native
}

object UpdateDetectorVersionMetadataRequest {
  @scala.inline
  def apply(description: description, detectorId: identifier, detectorVersionId: nonEmptyString): UpdateDetectorVersionMetadataRequest = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorVersionMetadataRequest]
  }
  @scala.inline
  implicit class UpdateDetectorVersionMetadataRequestOps[Self <: UpdateDetectorVersionMetadataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectorId(value: identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectorVersionId(value: nonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorVersionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


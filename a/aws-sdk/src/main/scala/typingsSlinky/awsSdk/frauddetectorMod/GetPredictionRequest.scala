package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPredictionRequest extends js.Object {
  /**
    * The detector ID. 
    */
  var detectorId: String = js.native
  /**
    * The detector version ID.
    */
  var detectorVersionId: js.UndefOr[String] = js.native
  /**
    * Names of variables you defined in Amazon Fraud Detector to represent event data elements and their corresponding values for the event you are sending for evaluation.
    */
  var eventAttributes: js.UndefOr[EventAttributeMap] = js.native
  /**
    * The unique ID used to identify the event.
    */
  var eventId: String = js.native
  /**
    * The Amazon SageMaker model endpoint input data blobs.
    */
  var externalModelEndpointDataBlobs: js.UndefOr[ExternalModelEndpointDataBlobMap] = js.native
}

object GetPredictionRequest {
  @scala.inline
  def apply(detectorId: String, eventId: String): GetPredictionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPredictionRequest]
  }
  @scala.inline
  implicit class GetPredictionRequestOps[Self <: GetPredictionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectorVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withEventAttributes(value: EventAttributeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalModelEndpointDataBlobs(value: ExternalModelEndpointDataBlobMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalModelEndpointDataBlobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalModelEndpointDataBlobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalModelEndpointDataBlobs")(js.undefined)
        ret
    }
  }
  
}


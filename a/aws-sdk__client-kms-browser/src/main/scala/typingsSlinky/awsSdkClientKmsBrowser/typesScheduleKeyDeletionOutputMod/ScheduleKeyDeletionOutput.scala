package typingsSlinky.awsSdkClientKmsBrowser.typesScheduleKeyDeletionOutputMod

import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleKeyDeletionOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The date and time after which AWS KMS deletes the customer master key (CMK).</p>
    */
  var DeletionDate: js.UndefOr[js.Date] = js.undefined
  /**
    * <p>The unique identifier of the customer master key (CMK) for which deletion is scheduled.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
}

object ScheduleKeyDeletionOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, DeletionDate: js.Date = null, KeyId: String = null): ScheduleKeyDeletionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (DeletionDate != null) __obj.updateDynamic("DeletionDate")(DeletionDate.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleKeyDeletionOutput]
  }
}


package typingsSlinky.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsOutputMod

import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesContinuousBackupsDescriptionMod.UnmarshalledContinuousBackupsDescription
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContinuousBackupsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Represents the continuous backups and point in time recovery settings on the table.</p>
    */
  var ContinuousBackupsDescription: js.UndefOr[UnmarshalledContinuousBackupsDescription] = js.native
}

object DescribeContinuousBackupsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DescribeContinuousBackupsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContinuousBackupsOutput]
  }
  @scala.inline
  implicit class DescribeContinuousBackupsOutputOps[Self <: DescribeContinuousBackupsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinuousBackupsDescription(value: UnmarshalledContinuousBackupsDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinuousBackupsDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuousBackupsDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinuousBackupsDescription")(js.undefined)
        ret
    }
  }
  
}


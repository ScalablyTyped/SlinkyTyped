package typingsSlinky.awsSdkClientDynamodbNode.typesCreateGlobalTableOutputMod

import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableDescriptionMod.UnmarshalledGlobalTableDescription
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGlobalTableOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Contains the details of the global table.</p>
    */
  var GlobalTableDescription: js.UndefOr[UnmarshalledGlobalTableDescription] = js.native
}

object CreateGlobalTableOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): CreateGlobalTableOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalTableOutput]
  }
  @scala.inline
  implicit class CreateGlobalTableOutputOps[Self <: CreateGlobalTableOutput] (val x: Self) extends AnyVal {
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
    def withGlobalTableDescription(value: UnmarshalledGlobalTableDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableDescription")(js.undefined)
        ret
    }
  }
  
}


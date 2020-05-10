package typingsSlinky.awsSdkClientCodecommitNode.typesGetDifferencesOutputMod

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesDifferenceMod.UnmarshalledDifference
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDifferencesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>An enumeration token that can be used in a request to return the next batch of the results.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * <p>A differences data type object that contains information about the differences, including whether the difference is added, modified, or deleted (A, D, M).</p>
    */
  var differences: js.UndefOr[js.Array[UnmarshalledDifference]] = js.native
}

object GetDifferencesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetDifferencesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDifferencesOutput]
  }
  @scala.inline
  implicit class GetDifferencesOutputOps[Self <: GetDifferencesOutput] (val x: Self) extends AnyVal {
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
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withDifferences(value: js.Array[UnmarshalledDifference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("differences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDifferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("differences")(js.undefined)
        ret
    }
  }
  
}


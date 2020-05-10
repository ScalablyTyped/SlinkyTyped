package typingsSlinky.awsSdkClientCodecommitNode.typesTestRepositoryTriggersOutputMod

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryTriggerExecutionFailureMod.UnmarshalledRepositoryTriggerExecutionFailure
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRepositoryTriggersOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The list of triggers that were not able to be tested. This list provides the names of the triggers that could not be tested, separated by commas.</p>
    */
  var failedExecutions: js.UndefOr[js.Array[UnmarshalledRepositoryTriggerExecutionFailure]] = js.native
  /**
    * <p>The list of triggers that were successfully tested. This list provides the names of the triggers that were successfully tested, separated by commas.</p>
    */
  var successfulExecutions: js.UndefOr[js.Array[String]] = js.native
}

object TestRepositoryTriggersOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): TestRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRepositoryTriggersOutput]
  }
  @scala.inline
  implicit class TestRepositoryTriggersOutputOps[Self <: TestRepositoryTriggersOutput] (val x: Self) extends AnyVal {
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
    def withFailedExecutions(value: js.Array[UnmarshalledRepositoryTriggerExecutionFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedExecutions")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessfulExecutions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfulExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfulExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfulExecutions")(js.undefined)
        ret
    }
  }
  
}


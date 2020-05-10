package typingsSlinky.awsSdkClientLambdaNode.typesGetFunctionOutputMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesConcurrencyMod.UnmarshalledConcurrency
import typingsSlinky.awsSdkClientLambdaNode.typesFunctionCodeLocationMod.UnmarshalledFunctionCodeLocation
import typingsSlinky.awsSdkClientLambdaNode.typesFunctionConfigurationMod.UnmarshalledFunctionConfiguration
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The function's code.</p>
    */
  var Code: js.UndefOr[UnmarshalledFunctionCodeLocation] = js.native
  /**
    * <p>The concurrent execution limit set for this function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
    */
  var Concurrency: js.UndefOr[UnmarshalledConcurrency] = js.native
  /**
    * <p>The function's configuration.</p>
    */
  var Configuration: js.UndefOr[UnmarshalledFunctionConfiguration] = js.native
  /**
    * <p>Returns the list of tags associated with the function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS Lambda Developer Guide</b>.</p>
    */
  var Tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetFunctionOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetFunctionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionOutput]
  }
  @scala.inline
  implicit class GetFunctionOutputOps[Self <: GetFunctionOutput] (val x: Self) extends AnyVal {
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
    def withCode(value: UnmarshalledFunctionCodeLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(js.undefined)
        ret
    }
    @scala.inline
    def withConcurrency(value: UnmarshalledConcurrency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Concurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Concurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withConfiguration(value: UnmarshalledFunctionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}


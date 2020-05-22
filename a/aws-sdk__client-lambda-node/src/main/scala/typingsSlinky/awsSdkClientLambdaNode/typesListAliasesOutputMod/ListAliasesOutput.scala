package typingsSlinky.awsSdkClientLambdaNode.typesListAliasesOutputMod

import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesAliasConfigurationMod.UnmarshalledAliasConfiguration
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAliasesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A list of aliases.</p>
    */
  var Aliases: js.UndefOr[js.Array[UnmarshalledAliasConfiguration]] = js.undefined
  /**
    * <p>A string, present if there are more aliases.</p>
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}

object ListAliasesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Aliases: js.Array[UnmarshalledAliasConfiguration] = null,
    NextMarker: String = null
  ): ListAliasesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAliasesOutput]
  }
}


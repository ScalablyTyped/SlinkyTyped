package typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod

import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputType
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable
  extends ArgumentValue
     with IR
     with VisitNode {
  var kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Variable
  var loc: Location
  var metadata: Metadata
  var `type`: js.UndefOr[GraphQLInputType] = js.undefined
  var variableName: String
}

object Variable {
  @scala.inline
  def apply(
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Variable,
    loc: Location,
    variableName: String,
    metadata: Metadata = null,
    `type`: GraphQLInputType = null
  ): Variable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
}


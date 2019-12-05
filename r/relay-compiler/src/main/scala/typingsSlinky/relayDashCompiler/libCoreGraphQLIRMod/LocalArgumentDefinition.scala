package typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod

import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputType
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalArgumentDefinition
  extends ArgumentDefinition
     with IR
     with VisitNode {
  var defaultValue: js.Any
  var kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.LocalArgumentDefinition
  var loc: Location
  var metadata: Metadata
  var name: String
  var `type`: GraphQLInputType
}

object LocalArgumentDefinition {
  @scala.inline
  def apply(
    defaultValue: js.Any,
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.LocalArgumentDefinition,
    loc: Location,
    name: String,
    `type`: GraphQLInputType,
    metadata: Metadata = null
  ): LocalArgumentDefinition = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalArgumentDefinition]
  }
}


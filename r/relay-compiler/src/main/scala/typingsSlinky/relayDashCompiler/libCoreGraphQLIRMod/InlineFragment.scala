package typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod

import typingsSlinky.graphql.typeDefinitionMod.GraphQLCompositeType
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineFragment
  extends IR
     with Node
     with Selection
     with VisitNode {
  var directives: js.Array[Directive]
  var kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.InlineFragment
  var loc: Location
  var metadata: Metadata
  var selections: js.Array[Selection]
  var typeCondition: GraphQLCompositeType
}

object InlineFragment {
  @scala.inline
  def apply(
    directives: js.Array[Directive],
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.InlineFragment,
    loc: Location,
    selections: js.Array[Selection],
    typeCondition: GraphQLCompositeType,
    metadata: Metadata = null
  ): InlineFragment = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineFragment]
  }
}


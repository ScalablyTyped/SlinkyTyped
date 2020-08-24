package typingsSlinky.graphqlToolsDelegate

import typingsSlinky.graphql.astMod.OperationTypeNode
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.ICreateRequest
import typingsSlinky.graphqlToolsDelegate.typesMod.ICreateRequestFromInfo
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/createRequest", JSImport.Namespace)
@js.native
object createRequestMod extends js.Object {
  def createRequest(
    hasSourceSchemaSourceParentTypeSourceFieldNameFragmentsVariableDefinitionsVariableValuesTargetOperationNameTargetOperationTargetFieldNameSelectionSetFieldNodes: ICreateRequest
  ): Request = js.native
  def createRequestFromInfo(hasInfoOperationNameOperationFieldNameSelectionSetFieldNodes: ICreateRequestFromInfo): Request = js.native
  def getDelegatingOperation(parentType: GraphQLObjectType[_, _], schema: GraphQLSchema): OperationTypeNode = js.native
}


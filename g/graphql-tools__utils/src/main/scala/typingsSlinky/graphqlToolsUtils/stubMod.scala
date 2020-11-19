package typingsSlinky.graphqlToolsUtils

import typingsSlinky.graphql.astMod.TypeNode
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.definitionMod.GraphQLType
import typingsSlinky.graphql.mod.GraphQLInputObjectType
import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsStrings.`object`
import typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsStrings.input
import typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsStrings.interface
import typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsStrings.output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/utils/stub", JSImport.Namespace)
@js.native
object stubMod extends js.Object {
  
  @JSName("createNamedStub")
  def createNamedStub_input(name: String, `type`: input): GraphQLInputObjectType = js.native
  @JSName("createNamedStub")
  def createNamedStub_interface(name: String, `type`: interface): GraphQLInterfaceType = js.native
  @JSName("createNamedStub")
  def createNamedStub_object(name: String, `type`: `object`): GraphQLObjectType[_, _] = js.native
  
  @JSName("createStub")
  def createStub_input(node: TypeNode, `type`: input): GraphQLInputType = js.native
  @JSName("createStub")
  def createStub_input_GraphQLType(node: TypeNode, `type`: input): GraphQLType = js.native
  @JSName("createStub")
  def createStub_output(node: TypeNode, `type`: output): GraphQLType = js.native
  @JSName("createStub")
  def createStub_output_GraphQLOutputType(node: TypeNode, `type`: output): GraphQLOutputType = js.native
  
  def getBuiltInForStub(`type`: GraphQLNamedType): GraphQLNamedType = js.native
  
  def isNamedStub(`type`: GraphQLNamedType): Boolean = js.native
}

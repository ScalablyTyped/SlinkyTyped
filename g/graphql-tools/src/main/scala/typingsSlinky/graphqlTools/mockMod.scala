package typingsSlinky.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLList
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.IMockOptions
import typingsSlinky.graphqlTools.interfacesMod.IMockServer
import typingsSlinky.graphqlTools.interfacesMod.IMockTypeFn
import typingsSlinky.graphqlTools.interfacesMod.IMocks
import typingsSlinky.graphqlTools.interfacesMod.ITypeDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/mock", JSImport.Namespace)
@js.native
object mockMod extends js.Object {
  @js.native
  class MockList protected () extends js.Object {
    def this(len: js.Array[Double]) = this()
    def this(len: Double) = this()
    def this(len: js.Array[Double], wrappedFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
    def this(len: Double, wrappedFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
    var len: js.Any = js.native
    var randint: js.Any = js.native
    var wrappedFunction: js.Any = js.native
    def mock(
      root: js.Any,
      args: StringDictionary[js.Any],
      context: js.Any,
      info: GraphQLResolveInfo,
      fieldType: GraphQLList[_],
      mockTypeFunc: IMockTypeFn
    ): js.Array[_] = js.native
  }
  
  def addMockFunctionsToSchema(hasSchemaMocksPreserveResolvers: IMockOptions): Unit = js.native
  def mockServer(schema: GraphQLSchema, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: GraphQLSchema, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
}


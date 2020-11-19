package typingsSlinky.graphqlToolsMock

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsMock.typesMod.IMockOptions
import typingsSlinky.graphqlToolsMock.typesMod.IMockServer
import typingsSlinky.graphqlToolsMock.typesMod.IMocks
import typingsSlinky.graphqlToolsUtils.interfacesMod.ITypeDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/mock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addMocksToSchema(hasSchemaMocksPreserveResolvers: IMockOptions): GraphQLSchema = js.native
  
  def isMockList(obj: js.Any): /* is @graphql-tools/mock.@graphql-tools/mock/mocking.MockList */ Boolean = js.native
  
  def mockServer(schema: GraphQLSchema, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: GraphQLSchema, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  
  @js.native
  class MockList protected ()
    extends typingsSlinky.graphqlToolsMock.mockingMod.MockList {
    def this(length: js.Array[Double]) = this()
    /**
      * @param length Either the exact length of items to return or an inclusive
      * range of possible lengths.
      * @param mockFunction The function to call for each item in the list to
      * resolve it. It can return another MockList or a value.
      */
    def this(length: Double) = this()
    def this(length: js.Array[Double], mockFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
    def this(length: Double, mockFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
  }
}

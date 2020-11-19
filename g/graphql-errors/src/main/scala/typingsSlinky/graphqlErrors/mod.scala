package typingsSlinky.graphqlErrors

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-errors", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def maskErrors(schema: GraphQLSchema): Unit = js.native
  def maskErrors(schema: GraphQLSchema, fn: HandlerFunction): Unit = js.native
  
  def setDefaultHandler(fn: HandlerFunction): Unit = js.native
  
  @js.native
  class UserError protected () extends Error {
    def this(message: String) = this()
  }
  
  type HandlerFunction = js.Function1[/* err */ js.Error, js.Error]
}

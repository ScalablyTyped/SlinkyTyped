package typingsSlinky.graphql

import typingsSlinky.graphql.graphQLErrorMod.GraphQLError
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/type/validate", JSImport.Namespace)
@js.native
object validateMod extends js.Object {
  
  def assertValidSchema(schema: GraphQLSchema): Unit = js.native
  
  def validateSchema(schema: GraphQLSchema): js.Array[GraphQLError] = js.native
}

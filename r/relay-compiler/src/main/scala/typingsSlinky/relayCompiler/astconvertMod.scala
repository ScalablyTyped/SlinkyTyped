package typingsSlinky.relayCompiler

import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-compiler/lib/core/ASTConvert", JSImport.Namespace)
@js.native
object astconvertMod extends js.Object {
  
  def transformASTSchema(schema: GraphQLSchema, schemaExtensions: js.Array[String]): GraphQLSchema = js.native
}

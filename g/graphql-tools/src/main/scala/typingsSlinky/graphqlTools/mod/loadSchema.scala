package typingsSlinky.graphqlTools.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsLoad.loadTypedefsMod.UnnormalizedTypeDefPointer
import typingsSlinky.graphqlToolsLoad.schemaMod.LoadSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-tools", "loadSchema")
@js.native
object loadSchema extends js.Object {
  
  def apply(schemaPointers: js.Array[UnnormalizedTypeDefPointer], options: LoadSchemaOptions): js.Promise[GraphQLSchema] = js.native
  def apply(schemaPointers: UnnormalizedTypeDefPointer, options: LoadSchemaOptions): js.Promise[GraphQLSchema] = js.native
}

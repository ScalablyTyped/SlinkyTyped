package typingsSlinky.graphqlToolsLoad.schemaMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsLoad.loadTypedefsMod.UnnormalizedTypeDefPointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/load/schema", "loadSchema")
@js.native
object loadSchema extends js.Object {
  
  def apply(schemaPointers: js.Array[UnnormalizedTypeDefPointer], options: LoadSchemaOptions): js.Promise[GraphQLSchema] = js.native
  def apply(schemaPointers: UnnormalizedTypeDefPointer, options: LoadSchemaOptions): js.Promise[GraphQLSchema] = js.native
}

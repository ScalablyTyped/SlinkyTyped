package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsLoad.loadTypedefsMod.UnnormalizedTypeDefPointer
import typingsSlinky.graphqlToolsLoad.schemaMod.LoadSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "loadSchemaSync")
@js.native
object loadSchemaSync extends js.Object {
  
  def apply(schemaPointers: js.Array[UnnormalizedTypeDefPointer], options: LoadSchemaOptions): GraphQLSchema = js.native
  def apply(schemaPointers: UnnormalizedTypeDefPointer, options: LoadSchemaOptions): GraphQLSchema = js.native
}

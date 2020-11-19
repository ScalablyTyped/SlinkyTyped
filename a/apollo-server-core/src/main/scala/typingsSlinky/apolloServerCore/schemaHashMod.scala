package typingsSlinky.apolloServerCore

import typingsSlinky.apolloServerTypes.mod.SchemaHash
import typingsSlinky.graphql.typeMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-core/dist/utils/schemaHash", JSImport.Namespace)
@js.native
object schemaHashMod extends js.Object {
  
  def generateSchemaHash(schema: GraphQLSchema): SchemaHash = js.native
}

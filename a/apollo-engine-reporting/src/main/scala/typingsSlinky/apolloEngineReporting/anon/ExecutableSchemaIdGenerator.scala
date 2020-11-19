package typingsSlinky.apolloEngineReporting.anon

import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutableSchemaIdGenerator extends js.Object {
  
  def executableSchemaIdGenerator(schema: String): String = js.native
  def executableSchemaIdGenerator(schema: GraphQLSchema): String = js.native
  
  var schemaReport: Boolean = js.native
  
  def startSchemaReporting(hasExecutableSchemaExecutableSchemaId: ExecutableSchemaId): Unit = js.native
}

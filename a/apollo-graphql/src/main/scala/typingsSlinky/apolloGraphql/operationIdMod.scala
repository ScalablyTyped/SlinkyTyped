package typingsSlinky.apolloGraphql

import typingsSlinky.apolloGraphql.anon.PreserveStringAndNumericLiterals
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-graphql/lib/operationId", JSImport.Namespace)
@js.native
object operationIdMod extends js.Object {
  
  def defaultEngineReportingSignature(ast: DocumentNode, operationName: String): String = js.native
  
  def defaultOperationRegistrySignature(ast: DocumentNode, operationName: String): String = js.native
  
  def operationHash(operation: String): String = js.native
  
  def operationRegistrySignature(ast: DocumentNode, operationName: String): String = js.native
  def operationRegistrySignature(ast: DocumentNode, operationName: String, options: PreserveStringAndNumericLiterals): String = js.native
}

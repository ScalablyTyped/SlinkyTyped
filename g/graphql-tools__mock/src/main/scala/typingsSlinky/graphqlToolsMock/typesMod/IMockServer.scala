package typingsSlinky.graphqlToolsMock.typesMod

import typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMockServer extends js.Object {
  
  /**
    * Executes the provided query against the mocked schema.
    * @param query GraphQL query to execute
    * @param vars Variables
    */
  def query(query: String): js.Promise[ExecutionResult[Record[String, _]]] = js.native
  def query(query: String, vars: Record[String, _]): js.Promise[ExecutionResult[Record[String, _]]] = js.native
}

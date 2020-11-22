package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDataflow.anon.StageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StagesResource extends js.Object {
  
  /** Request detailed information about the execution status of a stage of the job. EXPERIMENTAL. This API is subject to change or removal without notice. */
  def getExecutionDetails(): Request[StageExecutionDetails] = js.native
  def getExecutionDetails(request: StageId): Request[StageExecutionDetails] = js.native
}

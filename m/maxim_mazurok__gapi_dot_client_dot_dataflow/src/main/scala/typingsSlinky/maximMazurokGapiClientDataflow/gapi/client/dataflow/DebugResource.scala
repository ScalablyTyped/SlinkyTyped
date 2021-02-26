package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDataflow.anon.JobId
import typingsSlinky.maximMazurokGapiClientDataflow.anon.Location
import typingsSlinky.maximMazurokGapiClientDataflow.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientDataflow.anon.ProjectId
import typingsSlinky.maximMazurokGapiClientDataflow.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientDataflow.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugResource extends StObject {
  
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: JobId): Request[GetDebugConfigResponse] = js.native
  /** Get encoded debug configuration for component. Not cacheable. */
  def getConfig(request: Location): Request[GetDebugConfigResponse] = js.native
  def getConfig(request: PrettyPrint, body: GetDebugConfigRequest): Request[GetDebugConfigResponse] = js.native
  def getConfig(request: QuotaUser, body: GetDebugConfigRequest): Request[GetDebugConfigResponse] = js.native
  
  def sendCapture(request: PrettyPrint, body: SendDebugCaptureRequest): Request[js.Object] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: ProjectId): Request[js.Object] = js.native
  def sendCapture(request: QuotaUser, body: SendDebugCaptureRequest): Request[js.Object] = js.native
  /** Send encoded debug capture data for component. */
  def sendCapture(request: Resource): Request[js.Object] = js.native
}

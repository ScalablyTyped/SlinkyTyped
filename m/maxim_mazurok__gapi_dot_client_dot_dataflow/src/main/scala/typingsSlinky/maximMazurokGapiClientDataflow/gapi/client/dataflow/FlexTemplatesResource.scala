package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDataflow.anon.QuotaUserResource
import typingsSlinky.maximMazurokGapiClientDataflow.anon.QuotaUserUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexTemplatesResource extends js.Object {
  
  /** Launch a job with a FlexTemplate. */
  def launch(request: QuotaUserResource): Request[LaunchFlexTemplateResponse] = js.native
  def launch(request: QuotaUserUploadType, body: LaunchFlexTemplateRequest): Request[LaunchFlexTemplateResponse] = js.native
}

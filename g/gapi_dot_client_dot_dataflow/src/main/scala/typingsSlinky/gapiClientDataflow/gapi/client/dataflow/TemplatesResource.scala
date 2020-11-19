package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDataflow.anon.GcsPath
import typingsSlinky.gapiClientDataflow.anon.QuotaUser
import typingsSlinky.gapiClientDataflow.anon.UploadType
import typingsSlinky.gapiClientDataflow.anon.Uploadprotocol
import typingsSlinky.gapiClientDataflow.anon.ValidateOnly
import typingsSlinky.gapiClientDataflow.anon.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplatesResource extends js.Object {
  
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: QuotaUser): Request[Job] = js.native
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: Uploadprotocol): Request[Job] = js.native
  
  /** Get the template associated with a template. */
  def get(request: GcsPath): Request[GetTemplateResponse] = js.native
  /** Get the template associated with a template. */
  def get(request: View): Request[GetTemplateResponse] = js.native
  
  /** Launch a template. */
  def launch(request: UploadType): Request[LaunchTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: ValidateOnly): Request[LaunchTemplateResponse] = js.native
}

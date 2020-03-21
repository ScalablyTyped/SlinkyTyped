package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDataflow.AnonGcsPath
import typingsSlinky.gapiClientDataflow.AnonQuotaUser
import typingsSlinky.gapiClientDataflow.AnonUploadType
import typingsSlinky.gapiClientDataflow.AnonUploadprotocol
import typingsSlinky.gapiClientDataflow.AnonValidateOnly
import typingsSlinky.gapiClientDataflow.AnonView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplatesResource extends js.Object {
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: AnonQuotaUser): Request_[Job] = js.native
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: AnonUploadprotocol): Request_[Job] = js.native
  /** Get the template associated with a template. */
  def get(request: AnonGcsPath): Request_[GetTemplateResponse] = js.native
  /** Get the template associated with a template. */
  def get(request: AnonView): Request_[GetTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: AnonUploadType): Request_[LaunchTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: AnonValidateOnly): Request_[LaunchTemplateResponse] = js.native
}


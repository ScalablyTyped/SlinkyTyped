package typingsSlinky.gapiDotClientDotDataflow.gapi.client.dataflow

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsGcsPath
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsGcsPathKey
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsGcsPathKeyLocation
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsGcsPathKeyLocationOauthtoken
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsKeyLocationOauthtoken
import typingsSlinky.gapiDotClientDotDataflow.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplatesResource extends js.Object {
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyLocationOauthtoken): Request[Job] = js.native
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request[Job] = js.native
  /** Get the template associated with a template. */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsGcsPath): Request[GetTemplateResponse] = js.native
  /** Get the template associated with a template. */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsGcsPathKeyLocation): Request[GetTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: Anon_AccesstokenAltBearertokenCallbackFieldsGcsPathKey): Request[LaunchTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: Anon_AccesstokenAltBearertokenCallbackFieldsGcsPathKeyLocationOauthtoken): Request[LaunchTemplateResponse] = js.native
}


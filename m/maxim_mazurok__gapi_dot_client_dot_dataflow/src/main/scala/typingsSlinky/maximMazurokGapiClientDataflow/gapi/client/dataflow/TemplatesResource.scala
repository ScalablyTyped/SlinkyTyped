package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDataflow.anon.AccesstokenAltCallback
import typingsSlinky.maximMazurokGapiClientDataflow.anon.CallbackDynamicTemplategcsPath
import typingsSlinky.maximMazurokGapiClientDataflow.anon.DynamicTemplategcsPath
import typingsSlinky.maximMazurokGapiClientDataflow.anon.DynamicTemplatestagingLocation
import typingsSlinky.maximMazurokGapiClientDataflow.anon.FieldsGcsPath
import typingsSlinky.maximMazurokGapiClientDataflow.anon.GcsPath
import typingsSlinky.maximMazurokGapiClientDataflow.anon.KeyOauthtoken
import typingsSlinky.maximMazurokGapiClientDataflow.anon.QuotaUserUploadType
import typingsSlinky.maximMazurokGapiClientDataflow.anon.ResourceUploadType
import typingsSlinky.maximMazurokGapiClientDataflow.anon.ValidateOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplatesResource extends StObject {
  
  def create(request: AccesstokenAltCallback, body: CreateJobFromTemplateRequest): Request[Job] = js.native
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: KeyOauthtoken): Request[Job] = js.native
  def create(request: QuotaUserUploadType, body: CreateJobFromTemplateRequest): Request[Job] = js.native
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: ResourceUploadType): Request[Job] = js.native
  
  /** Get the template associated with a template. */
  def get(): Request[GetTemplateResponse] = js.native
  def get(request: FieldsGcsPath): Request[GetTemplateResponse] = js.native
  def get(request: GcsPath): Request[GetTemplateResponse] = js.native
  
  def launch(request: CallbackDynamicTemplategcsPath, body: LaunchTemplateParameters): Request[LaunchTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: DynamicTemplategcsPath): Request[LaunchTemplateResponse] = js.native
  def launch(request: DynamicTemplatestagingLocation, body: LaunchTemplateParameters): Request[LaunchTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: ValidateOnly): Request[LaunchTemplateResponse] = js.native
}

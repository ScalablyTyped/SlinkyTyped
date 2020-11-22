package typingsSlinky.maximMazurokGapiClientSasportal.gapi.client.sasportal

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSasportal.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientSasportal.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientSasportal.anon.FieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallerResource extends js.Object {
  
  /** Generates a secret to be used with the ValidateInstaller method */
  def generateSecret(request: AltCallback): Request[SasPortalGenerateSecretResponse] = js.native
  def generateSecret(request: CallbackFields, body: SasPortalGenerateSecretRequest): Request[SasPortalGenerateSecretResponse] = js.native
  
  def validate(request: CallbackFields, body: SasPortalValidateInstallerRequest): Request[js.Object] = js.native
  /** Validates the identity of a Certified Professional Installer (CPI). */
  def validate(request: FieldsKey): Request[js.Object] = js.native
}

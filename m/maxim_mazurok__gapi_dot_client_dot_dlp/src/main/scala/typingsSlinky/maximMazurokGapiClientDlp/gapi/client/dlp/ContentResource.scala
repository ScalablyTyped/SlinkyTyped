package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDlp.anon.Fields
import typingsSlinky.maximMazurokGapiClientDlp.anon.Resource
import typingsSlinky.maximMazurokGapiClientDlp.anon.UploadType
import typingsSlinky.maximMazurokGapiClientDlp.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentResource extends StObject {
  
  def deidentify(request: Fields, body: GooglePrivacyDlpV2DeidentifyContentRequest): Request[GooglePrivacyDlpV2DeidentifyContentResponse] = js.native
  /**
    * De-identifies potentially sensitive info from a ContentItem. This method has limits on input size and output size. See https://cloud.google.com/dlp/docs/deidentify-sensitive-data to
    * learn more. When no InfoTypes or CustomInfoTypes are specified in this request, the system will automatically choose what detectors to run. By default this may be all types, but may
    * change over time as detectors are updated.
    */
  def deidentify(request: Resource): Request[GooglePrivacyDlpV2DeidentifyContentResponse] = js.native
  
  def inspect(request: Fields, body: GooglePrivacyDlpV2InspectContentRequest): Request[GooglePrivacyDlpV2InspectContentResponse] = js.native
  /**
    * Finds potentially sensitive info in content. This method has limits on input size, processing time, and output size. When no InfoTypes or CustomInfoTypes are specified in this
    * request, the system will automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated. For how to guides, see
    * https://cloud.google.com/dlp/docs/inspecting-images and https://cloud.google.com/dlp/docs/inspecting-text,
    */
  def inspect(request: UploadType): Request[GooglePrivacyDlpV2InspectContentResponse] = js.native
  
  def reidentify(request: Fields, body: GooglePrivacyDlpV2ReidentifyContentRequest): Request[GooglePrivacyDlpV2ReidentifyContentResponse] = js.native
  /** Re-identifies content that has been de-identified. See https://cloud.google.com/dlp/docs/pseudonymization#re-identification_in_free_text_code_example to learn more. */
  def reidentify(request: Uploadprotocol): Request[GooglePrivacyDlpV2ReidentifyContentResponse] = js.native
}

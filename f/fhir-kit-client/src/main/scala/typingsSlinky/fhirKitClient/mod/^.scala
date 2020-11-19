package typingsSlinky.fhirKitClient.mod

import typingsSlinky.fhirKitClient.anon.BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fhir-kit-client", JSImport.Namespace)
@js.native
class ^ protected () extends Client {
  /**
    * Create a FHIR client.
    *
    * @param {Object} config Client configuration
    * @param {String} config.baseUrl ISS for FHIR server
    * @param {Object} [config.customHeaders] Optional custom headers to send with
    *   each request
    * @throws An error will be thrown unless baseUrl is a non-empty string.
    */
  def this(config: BaseUrl) = this()
}

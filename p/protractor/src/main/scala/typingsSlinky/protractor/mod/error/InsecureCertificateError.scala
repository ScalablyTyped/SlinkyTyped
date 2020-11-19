package typingsSlinky.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates a navigation event caused the browser to generate a certificate
  * warning. This is usually caused by an expired or invalid TLS certificate.
  */
@JSImport("protractor", "error.InsecureCertificateError")
@js.native
class InsecureCertificateError ()
  extends typingsSlinky.seleniumWebdriver.mod.error.InsecureCertificateError {
  def this(message: String) = this()
}

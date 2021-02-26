package typingsSlinky.activexLibreoffice.com_.sun.star.security

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constant definition of a certificate container status. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
*/
trait CertificateContainerStatus extends StObject
object CertificateContainerStatus {
  
  /** The certificate was not found. */
  @scala.inline
  def NOCERT: `0` = 0.asInstanceOf[`0`]
  
  /** The certificate was found and is trusted. */
  @scala.inline
  def TRUSTED: `1` = 1.asInstanceOf[`1`]
  
  /** The certificate was found but is untrusted. */
  @scala.inline
  def UNTRUSTED: `2` = 2.asInstanceOf[`2`]
}

package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Service of {@link XMLEncryption} */
@js.native
trait XMLEncryption
  extends XXMLEncryption
     with XInitialization
object XMLEncryption {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    decrypt: (XXMLEncryptionTemplate, XXMLSecurityContext) => XXMLEncryptionTemplate,
    encrypt: (XXMLEncryptionTemplate, XSecurityEnvironment) => XXMLEncryptionTemplate,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMLEncryption = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), decrypt = js.Any.fromFunction2(decrypt), encrypt = js.Any.fromFunction2(encrypt), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMLEncryption]
  }
}

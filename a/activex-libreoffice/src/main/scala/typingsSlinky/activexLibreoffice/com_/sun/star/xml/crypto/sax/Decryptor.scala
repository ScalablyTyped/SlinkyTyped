package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XInitialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Service of {@link Decryptor} */
@js.native
trait Decryptor
  extends XReferenceResolvedListener
     with XBlockerMonitor
     with XDecryptionResultBroadcaster
     with XKeyCollector
     with XMissionTaker
     with XInitialization
object Decryptor {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addDecryptionResultListener: XDecryptionResultListener => Unit,
    endMission: () => Boolean,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    referenceResolved: Double => Unit,
    release: () => Unit,
    removeDecryptionResultListener: XDecryptionResultListener => Unit,
    setBlockerId: Double => Unit,
    setKeyId: Double => Unit
  ): Decryptor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addDecryptionResultListener = js.Any.fromFunction1(addDecryptionResultListener), endMission = js.Any.fromFunction0(endMission), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), referenceResolved = js.Any.fromFunction1(referenceResolved), release = js.Any.fromFunction0(release), removeDecryptionResultListener = js.Any.fromFunction1(removeDecryptionResultListener), setBlockerId = js.Any.fromFunction1(setBlockerId), setKeyId = js.Any.fromFunction1(setKeyId))
    __obj.asInstanceOf[Decryptor]
  }
}

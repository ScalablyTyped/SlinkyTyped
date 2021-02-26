package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Decryption Result Broadcaster.
  *
  * This interface is used to manipulate decryption result listener.
  */
@js.native
trait XDecryptionResultBroadcaster extends XInterface {
  
  /**
    * Adds a new decryption result listener.
    *
    * When the decryption is finished, the result information will be sent to this listener.
    * @param listener the listener to be added
    */
  def addDecryptionResultListener(listener: XDecryptionResultListener): Unit = js.native
  
  /**
    * Removes a decryption result listener.
    *
    * After a listener is removed, no result information will be sent to it.
    * @param listener the listener to be removed
    */
  def removeDecryptionResultListener(listener: XDecryptionResultListener): Unit = js.native
}
object XDecryptionResultBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addDecryptionResultListener: XDecryptionResultListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDecryptionResultListener: XDecryptionResultListener => Unit
  ): XDecryptionResultBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addDecryptionResultListener = js.Any.fromFunction1(addDecryptionResultListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDecryptionResultListener = js.Any.fromFunction1(removeDecryptionResultListener))
    __obj.asInstanceOf[XDecryptionResultBroadcaster]
  }
  
  @scala.inline
  implicit class XDecryptionResultBroadcasterMutableBuilder[Self <: XDecryptionResultBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddDecryptionResultListener(value: XDecryptionResultListener => Unit): Self = StObject.set(x, "addDecryptionResultListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveDecryptionResultListener(value: XDecryptionResultListener => Unit): Self = StObject.set(x, "removeDecryptionResultListener", js.Any.fromFunction1(value))
  }
}

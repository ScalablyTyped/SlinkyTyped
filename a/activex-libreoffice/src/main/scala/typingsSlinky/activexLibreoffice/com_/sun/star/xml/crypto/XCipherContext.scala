package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows to encrypt/decrypt data using the cipher context.
  *
  * The algorithm as well as encryption data are specified on object creation.
  * @see XCipherContextSupplier
  * @since OOo 3.4
  */
@js.native
trait XCipherContext extends XInterface {
  
  /**
    * encrypts/decrypts the data using the cipher.
    *
    * Please have in mind, the cipher object state might depend from the already encrypted/decrypted data ( it depends from the used algorithm ).
    *
    * Whether the object does encryption or decryption is specified by creation of the object.
    * @param aData data that should be encrypted/decrypted
    */
  def convertWithCipherContext(aData: SeqEquiv[Double]): SafeArray[Double] = js.native
  
  /** finalizes cipher and disposes context. */
  def finalizeCipherContextAndDispose(): SafeArray[Double] = js.native
}
object XCipherContext {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    convertWithCipherContext: SeqEquiv[Double] => SafeArray[Double],
    finalizeCipherContextAndDispose: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCipherContext = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertWithCipherContext = js.Any.fromFunction1(convertWithCipherContext), finalizeCipherContextAndDispose = js.Any.fromFunction0(finalizeCipherContextAndDispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCipherContext]
  }
  
  @scala.inline
  implicit class XCipherContextOps[Self <: XCipherContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConvertWithCipherContext(value: SeqEquiv[Double] => SafeArray[Double]): Self = this.set("convertWithCipherContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinalizeCipherContextAndDispose(value: () => SafeArray[Double]): Self = this.set("finalizeCipherContextAndDispose", js.Any.fromFunction0(value))
  }
}

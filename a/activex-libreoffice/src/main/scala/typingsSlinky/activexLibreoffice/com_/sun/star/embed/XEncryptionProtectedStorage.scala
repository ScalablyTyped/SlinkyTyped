package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows to set a password for an object.
  * @since OOo 3.4
  */
@js.native
trait XEncryptionProtectedStorage extends XEncryptionProtectedSource2 {
  
  /** allows to get the encryption algorithms of the object. */
  var EncryptionAlgorithms: SafeArray[NamedValue] = js.native
  
  /** allows to get the encryption algorithms of the object. */
  def getEncryptionAlgorithms(): SafeArray[NamedValue] = js.native
  
  /**
    * allows to set the encryption algorithms for the object.
    *
    * The algorithms will of course be used only for streams that have been marked to be encrypted. If no stream in the storage is marked to be encrypted,
    * the algorithms-related information may have no effect to the result package.
    *
    * The following values could be part of the provided sequence:
    *
    * **StartKeyGenerationAlgorithm **: specifies the algorithm that was used to generate the EncryptionKey from the original password; in case the contents
    * should be decrypted, the algorithm might be already known by the object; if a different one is set an exception should be thrown to indicate the
    * error; it should take values from {@link com.sun.star.xml} :crypto::DigestID.
    *
    * **EncryptionAlgorithm **: specifies the algorithm that should be used to encrypt/decrypt the contents; in case the contents should be decrypted, the
    * algorithm might be already known by the object; if a different one is set an exception should be thrown to indicate the error; it should take values
    * from {@link com.sun.star.xml} :crypto::CipherID.
    *
    * **ChecksumAlgorithm **: specifies the algorithm that was used to generate the checksum of the encrypted data; in case the contents should be
    * decrypted, the algorithm might be already known by the object; if a different one is set an exception should be thrown to indicate the error; it
    * should take values from {@link com.sun.star.xml} :crypto::DigestID.
    */
  def setEncryptionAlgorithms(aAlgorithms: SeqEquiv[NamedValue]): Unit = js.native
}
object XEncryptionProtectedStorage {
  
  @scala.inline
  def apply(
    EncryptionAlgorithms: SafeArray[NamedValue],
    acquire: () => Unit,
    getEncryptionAlgorithms: () => SafeArray[NamedValue],
    hasEncryptionData: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEncryption: () => Unit,
    setEncryptionAlgorithms: SeqEquiv[NamedValue] => Unit,
    setEncryptionData: SeqEquiv[NamedValue] => Unit,
    setEncryptionPassword: String => Unit
  ): XEncryptionProtectedStorage = {
    val __obj = js.Dynamic.literal(EncryptionAlgorithms = EncryptionAlgorithms.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEncryptionAlgorithms = js.Any.fromFunction0(getEncryptionAlgorithms), hasEncryptionData = js.Any.fromFunction0(hasEncryptionData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEncryption = js.Any.fromFunction0(removeEncryption), setEncryptionAlgorithms = js.Any.fromFunction1(setEncryptionAlgorithms), setEncryptionData = js.Any.fromFunction1(setEncryptionData), setEncryptionPassword = js.Any.fromFunction1(setEncryptionPassword))
    __obj.asInstanceOf[XEncryptionProtectedStorage]
  }
  
  @scala.inline
  implicit class XEncryptionProtectedStorageOps[Self <: XEncryptionProtectedStorage] (val x: Self) extends AnyVal {
    
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
    def setEncryptionAlgorithms(value: SafeArray[NamedValue]): Self = this.set("EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEncryptionAlgorithms(value: () => SafeArray[NamedValue]): Self = this.set("getEncryptionAlgorithms", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetEncryptionAlgorithms(value: SeqEquiv[NamedValue] => Unit): Self = this.set("setEncryptionAlgorithms", js.Any.fromFunction1(value))
  }
}

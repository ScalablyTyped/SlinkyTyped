package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.wrapper.XXMLElementWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of XML encryption template
  *
  * This interface represents a encryption template, which is the same as the desired XML encryption element[ EncryptedType ] but some of the nodes may be
  * empty. The empty entities include CipherValue, which is a subset of EncryptedData or EncryptedKey. Empty entities are not allowed in a encryption
  * template when performing decryption.
  *
  * In some cases, the encryptor or decryptor can determine and locate the EncryptedKey from the encryption template by dereference the RetrievalMethod
  * inside EncryptedData.
  *
  * In some cases, the EncryptedKey need to be clearly pointed out by the encryption template.
  *
  * With the help of encryption context, the encryptor or decryptor specifies the key from the KeyInfo in the encryption template.
  *
  * It isn't a good method to set the EncryptedKey here. In general, there is a RetrievalMethod in EncryptedData by which we can get the EncryptedKey.
  *
  * And some times, in the low level, it is hard to determine what the key is except that the high level application tell the mechanism and parameters.
  *
  * So I think it will be more simple that the application set the encrypted key information. In this case, the application only need to know the XML
  * schema or DTD and the encryption device. If so, the high level application takes the action of build the EncryptedKey template and references it in
  * the element of EncryptedData. And in this case, the calling to set up EncryptedKey template and target is not necessary, because the encryptor or
  * decryptor can determine and locate the EncryptedKey from the encryption template of EncryptedData by dereference the RetrievalMethod.
  *
  * In some situations, the high level applications do not want to know anything about crypto devices (maybe it must, because the lower level do not know
  * what the key is). If it gives the key value, it can get EncryptedKey by setting the key template and key value target.
  */
@js.native
trait XXMLEncryptionTemplate extends XXMLSecurityTemplate {
  
  /** Get the target XML element, i.e. the element to be encrypted */
  val Target: XXMLElementWrapper = js.native
  
  /** Get the target XML element, i.e. the element to be encrypted */
  def getTarget(): XXMLElementWrapper = js.native
}
object XXMLEncryptionTemplate {
  
  @scala.inline
  def apply(
    Status: SecurityOperationStatus,
    Target: XXMLElementWrapper,
    Template: XXMLElementWrapper,
    acquire: () => Unit,
    getStatus: () => SecurityOperationStatus,
    getTarget: () => XXMLElementWrapper,
    getTemplate: () => XXMLElementWrapper,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setStatus: SecurityOperationStatus => Unit,
    setTarget: XXMLElementWrapper => Unit,
    setTemplate: XXMLElementWrapper => Unit
  ): XXMLEncryptionTemplate = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], Template = Template.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStatus = js.Any.fromFunction0(getStatus), getTarget = js.Any.fromFunction0(getTarget), getTemplate = js.Any.fromFunction0(getTemplate), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setStatus = js.Any.fromFunction1(setStatus), setTarget = js.Any.fromFunction1(setTarget), setTemplate = js.Any.fromFunction1(setTemplate))
    __obj.asInstanceOf[XXMLEncryptionTemplate]
  }
  
  @scala.inline
  implicit class XXMLEncryptionTemplateOps[Self <: XXMLEncryptionTemplate] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: XXMLElementWrapper): Self = this.set("Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTarget(value: () => XXMLElementWrapper): Self = this.set("getTarget", js.Any.fromFunction0(value))
  }
}

package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * through this interface documents can provide access to their substorages
  *
  * A temporary interface to get access to documents substorages.
  */
@js.native
trait XDocumentSubStorageSupplier extends XInterface {
  
  /**
    * provides the list of substorages
    * @returns sequence of substorages names
    */
  val DocumentSubStoragesNames: SafeArray[String] = js.native
  
  /**
    * provides the access to a substorage with specified name
    * @param StorageName the name of requested substorage
    * @param nMode a mode the storage should be opened in can take value from {@link com.sun.star.embed.ElementModes}
    * @returns XStorage implementation that refers to specified substorage
    */
  def getDocumentSubStorage(StorageName: String, nMode: Double): XStorage = js.native
  
  /**
    * provides the list of substorages
    * @returns sequence of substorages names
    */
  def getDocumentSubStoragesNames(): SafeArray[String] = js.native
}
object XDocumentSubStorageSupplier {
  
  @scala.inline
  def apply(
    DocumentSubStoragesNames: SafeArray[String],
    acquire: () => Unit,
    getDocumentSubStorage: (String, Double) => XStorage,
    getDocumentSubStoragesNames: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentSubStorageSupplier = {
    val __obj = js.Dynamic.literal(DocumentSubStoragesNames = DocumentSubStoragesNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDocumentSubStorage = js.Any.fromFunction2(getDocumentSubStorage), getDocumentSubStoragesNames = js.Any.fromFunction0(getDocumentSubStoragesNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDocumentSubStorageSupplier]
  }
  
  @scala.inline
  implicit class XDocumentSubStorageSupplierOps[Self <: XDocumentSubStorageSupplier] (val x: Self) extends AnyVal {
    
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
    def setDocumentSubStoragesNames(value: SafeArray[String]): Self = this.set("DocumentSubStoragesNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDocumentSubStorage(value: (String, Double) => XStorage): Self = this.set("getDocumentSubStorage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDocumentSubStoragesNames(value: () => SafeArray[String]): Self = this.set("getDocumentSubStoragesNames", js.Any.fromFunction0(value))
  }
}

package typingsSlinky.ibmMobilefirst.global.WL

import typingsSlinky.ibmMobilefirst.WL.JSONStore.InitOptions
import typingsSlinky.ibmMobilefirst.WL.Options
import typingsSlinky.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WL.JSONStore")
@js.native
object JSONStore extends js.Object {
  
  /**
    * Creates a query for advanced find. See WL.JSONStore.QueryPart for more information.
    */
  def QueryPart(): typingsSlinky.ibmMobilefirst.WL.JSONStore.QueryPartObj = js.native
  
  /**
    * Changes the password for the internal storage. You must have an initialized collection before calling WL.JSONStore.changePassword.
    */
  def changePassword(oldPassword: String, newPassword: String, username: String, options: Options): JQueryDeferred[_] = js.native
  
  /**
    * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.init
    */
  def clearPassword(): Boolean = js.native
  
  /**
    * Locks access to all the collections until WL.JSONStore.init is called.
    */
  def closeAll(): JQueryDeferred[_] = js.native
  def closeAll(options: Options): JQueryDeferred[_] = js.native
  
  /**
    * Commit a transaction.
    */
  def commitTransaction(): JQueryDeferred[Double] = js.native
  
  /**
    * Completely wipes data for all users, destroys the internal storage, and clears security artifacts.
    * @parameters options is @deprecated
    */
  def destroy(username: String): JQueryDeferred[Double] = js.native
  def destroy(username: String, options: Options): JQueryDeferred[Double] = js.native
  
  /**
    * @deprecated since version 6.2.0.
    */
  def documentify(id: Double, data: js.Any): js.Any = js.native
  
  /**
    * Returns information about the file that is used to persist data in the store. The following key value pairs are returned:
    * name - name of the store
    * size - the total size, in bytes, of the store
    * isEncrypted - boolean that is true when encrypted and false otherwise.
    */
  def fileInfo(): JQueryDeferred[_] = js.native
  
  /**
    * Provides an accessor to the collection if the collection exists, otherwise it returns undefined.
    */
  def get(collectionName: String): typingsSlinky.ibmMobilefirst.WL.JSONStore.JSONStoreInstance = js.native
  
  /**
    * Returns the message that is associated with a JSONStore error code.
    */
  def getErrorMessage(errorCode: Double): String = js.native
  
  def init(collections: js.Any): JQueryDeferred[_] = js.native
  def init(collections: js.Any, options: InitOptions): JQueryDeferred[_] = js.native
  
  /**
    * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.init
    */
  def initCollection(name: String, searchFields: js.Any): typingsSlinky.ibmMobilefirst.WL.JSONStore.JSONStoreInstance = js.native
  def initCollection(name: String, searchFields: js.Any, options: InitOptions): typingsSlinky.ibmMobilefirst.WL.JSONStore.JSONStoreInstance = js.native
  
  /**
    * Roll back a transaction
    */
  def rollbackTransaction(): JQueryDeferred[Double] = js.native
  
  /**
    * Initiates a transaction
    */
  def startTransaction(): JQueryDeferred[Double] = js.native
  
  /**
    * Sets the password that is used to generate keys to encrypt data that is stored locally on the device.
    * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.init
    */
  def usePassword(pwd: String): Boolean = js.native
  
  @js.native
  class JSONStoreInstance ()
    extends typingsSlinky.ibmMobilefirst.WL.JSONStore.JSONStoreInstance
  
  @js.native
  class QueryPartObj ()
    extends typingsSlinky.ibmMobilefirst.WL.JSONStore.QueryPartObj
}

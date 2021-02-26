package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a persistence interface which supports to load/store user interface configuration data to a storage and to retrieve information about the
  * current state.
  * @since OOo 2.0
  */
@js.native
trait XUIConfigurationPersistence extends XInterface {
  
  /**
    * provides the current modify state of the configuration manager instance.
    * @returns `TRUE` if the configuration manager has changed since the last {@link store()} call. `FALSE` if the configuration manager has not been changed.
    */
  def isModified(): Boolean = js.native
  
  /**
    * provides the current read-only state of the user configuration manager. Storing a user interface configuration to a read-only storage is not possible.
    * A read-only configuration manager instance will also not support any changes to its configuration settings.
    * @returns `TRUE` if the configuration manager storage is read-only otherwise `FALSE` .
    */
  def isReadOnly(): Boolean = js.native
  
  /**
    * reloads the configuration data from the storage and reinitialize the user interface configuration manager instance with this data.
    *
    * It is up to the implementation if it defers the first loading process until the first data request using {@link XUIConfigurationManager} interface.
    */
  def reload(): Unit = js.native
  
  /**
    * stores the configuration data to the storage provided by setStorage() from the storage and initialize the user interface configuration manager
    * instance with the newly data. This call can throw an {@link com.sun.star.io.IOException} if {@link store()} cannot store its data into the internal
    * storage.
    */
  def store(): Unit = js.native
  
  /**
    * stores the configuration data to the provided storage, ignoring the previously set storage by setStorage(). Can be used to make copy of the current
    * user interface configuration data to another storage. This call will throw an {@link com.sun.star.io.IOException} if the provided storage is in
    * read-only mode.
    * @param Storage all configuration data will be stored to this storage.
    */
  def storeToStorage(Storage: XStorage): Unit = js.native
}
object XUIConfigurationPersistence {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    isModified: () => Boolean,
    isReadOnly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reload: () => Unit,
    store: () => Unit,
    storeToStorage: XStorage => Unit
  ): XUIConfigurationPersistence = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction0(reload), store = js.Any.fromFunction0(store), storeToStorage = js.Any.fromFunction1(storeToStorage))
    __obj.asInstanceOf[XUIConfigurationPersistence]
  }
  
  @scala.inline
  implicit class XUIConfigurationPersistenceMutableBuilder[Self <: XUIConfigurationPersistence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsModified(value: () => Boolean): Self = StObject.set(x, "isModified", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsReadOnly(value: () => Boolean): Self = StObject.set(x, "isReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReload(value: () => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStore(value: () => Unit): Self = StObject.set(x, "store", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStoreToStorage(value: XStorage => Unit): Self = StObject.set(x, "storeToStorage", js.Any.fromFunction1(value))
  }
}

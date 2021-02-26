package typingsSlinky.angularStorage

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-storage", JSImport.Namespace)
  @js.native
  val ^ : String = js.native
  
  type _To = String
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: String = ^
  
  /* augmented module */
  object angularAugmentingMod {
    
    object a0 {
      
      object storage {
        
        @js.native
        trait INamespacedStoreService extends StObject {
          
          /**
            * Returns the saved value with they key name.
            *
            * @param {String} name - The key name for the location of the value
            * @returns The saved value; if you saved an object, you get an object
            */
          def get(name: String): js.Any = js.native
          
          /**
            * Deletes the saved value with the key name
            *
            * @param {String} name - The key name for the location of the value to remove
            */
          def remove(name: String): Unit = js.native
          
          /**
            * Sets a new value to the storage with the key name. It can be any object.
            *
            * @param {String} name - The key name for the location of the value
            * @param value - The value to store
            */
          def set(name: String, value: js.Any): Unit = js.native
        }
        object INamespacedStoreService {
          
          @scala.inline
          def apply(get: String => js.Any, remove: String => Unit, set: (String, js.Any) => Unit): INamespacedStoreService = {
            val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
            __obj.asInstanceOf[INamespacedStoreService]
          }
          
          @scala.inline
          implicit class INamespacedStoreServiceMutableBuilder[Self <: INamespacedStoreService] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
            
            @scala.inline
            def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
            
            @scala.inline
            def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
          }
        }
        
        @js.native
        trait IStoreProvider extends StObject {
          
          /**
            * Sets the storage.
            *
            * @param {String} storage - The storage name
            */
          def setStore(storage: String): Unit = js.native
        }
        object IStoreProvider {
          
          @scala.inline
          def apply(setStore: String => Unit): IStoreProvider = {
            val __obj = js.Dynamic.literal(setStore = js.Any.fromFunction1(setStore))
            __obj.asInstanceOf[IStoreProvider]
          }
          
          @scala.inline
          implicit class IStoreProviderMutableBuilder[Self <: IStoreProvider] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setSetStore(value: String => Unit): Self = StObject.set(x, "setStore", js.Any.fromFunction1(value))
          }
        }
        
        @js.native
        trait IStoreService extends INamespacedStoreService {
          
          /**
            * Returns a namespaced store
            *
            * @param {String} namespace - The namespace
            * @param {String} storage - The name of the storage service. Defaults to local storage.
            * @param {String} delimiter - The delimiter to use to separate the namespace and the keys.
            * @returns {INamespacedStoreService}
            */
          def getNamespacedStore(namespace: String): INamespacedStoreService = js.native
          def getNamespacedStore(namespace: String, storage: js.UndefOr[scala.Nothing], delimiter: String): INamespacedStoreService = js.native
          def getNamespacedStore(namespace: String, storage: String): INamespacedStoreService = js.native
          def getNamespacedStore(namespace: String, storage: String, delimiter: String): INamespacedStoreService = js.native
        }
      }
    }
  }
}

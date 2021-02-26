package typingsSlinky.firebaseApp

import typingsSlinky.firebaseAppTypes.mod.FirebaseApp
import typingsSlinky.firebaseAppTypes.mod.FirebaseAppConfig
import typingsSlinky.firebaseAppTypes.mod.FirebaseOptions
import typingsSlinky.firebaseAppTypes.privateMod.FirebaseNamespace
import typingsSlinky.firebaseAppTypes.privateMod.FirebaseService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseAppLiteMod {
  
  @JSImport("@firebase/app/dist/packages/app/src/lite/firebaseAppLite", "FirebaseAppLiteImpl")
  @js.native
  class FirebaseAppLiteImpl protected () extends FirebaseApp {
    def this(options: FirebaseOptions, config: FirebaseAppConfig, firebase_ : FirebaseNamespace) = this()
    
    /**
      * Return a service instance associated with this app (creating it
      * on demand), identified by the passed instanceIdentifier.
      *
      * NOTE: Currently storage is the only one that is leveraging this
      * functionality. They invoke it by calling:
      *
      * ```javascript
      * firebase.app().storage('STORAGE BUCKET ID')
      * ```
      *
      * The service name is passed to this already
      * @internal
      */
    def _getService(name: String): FirebaseService = js.native
    def _getService(name: String, instanceIdentifier: String): FirebaseService = js.native
    
    var automaticDataCollectionEnabled_ : js.Any = js.native
    
    @JSName("automaticDataCollectionEnabled")
    def automaticDataCollectionEnabled_MFirebaseAppLiteImpl: Boolean = js.native
    
    /**
      * This function will throw an Error if the App has already been deleted -
      * use before performing API actions on the App.
      */
    var checkDestroyed_ : js.Any = js.native
    
    var container: js.Any = js.native
    
    val firebase_ : js.Any = js.native
    
    var isDeleted_ : js.Any = js.native
    
    val name_ : js.Any = js.native
    
    @JSName("name")
    def name_MFirebaseAppLiteImpl: String = js.native
    
    val options_ : js.Any = js.native
    
    @JSName("options")
    def options_MFirebaseAppLiteImpl: FirebaseOptions = js.native
  }
}

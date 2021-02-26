package typingsSlinky.firebaseRemoteConfig

import typingsSlinky.firebaseAppTypes.privateMod.FirebaseNamespace
import typingsSlinky.firebaseRemoteConfigTypes.mod.RemoteConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/remote-config", "registerRemoteConfig")
  @js.native
  def registerRemoteConfig(firebaseInstance: FirebaseNamespace): Unit = js.native
  
  object firebaseAppTypesAugmentingMod {
    
    @js.native
    trait FirebaseApp extends StObject {
      
      def remoteConfig(): RemoteConfig = js.native
    }
    object FirebaseApp {
      
      @scala.inline
      def apply(remoteConfig: () => RemoteConfig): FirebaseApp = {
        val __obj = js.Dynamic.literal(remoteConfig = js.Any.fromFunction0(remoteConfig))
        __obj.asInstanceOf[FirebaseApp]
      }
      
      @scala.inline
      implicit class FirebaseAppMutableBuilder[Self <: FirebaseApp] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRemoteConfig(value: () => RemoteConfig): Self = StObject.set(x, "remoteConfig", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait FirebaseNamespace extends StObject {
      
      var remoteConfig: js.UndefOr[js.Function1[/* app */ js.UndefOr[FirebaseApp], RemoteConfig]] = js.native
    }
    object FirebaseNamespace {
      
      @scala.inline
      def apply(): typingsSlinky.firebaseRemoteConfig.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.firebaseRemoteConfig.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace]
      }
      
      @scala.inline
      implicit class FirebaseNamespaceMutableBuilder[Self <: typingsSlinky.firebaseRemoteConfig.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRemoteConfig(value: /* app */ js.UndefOr[FirebaseApp] => RemoteConfig): Self = StObject.set(x, "remoteConfig", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRemoteConfigUndefined: Self = StObject.set(x, "remoteConfig", js.undefined)
      }
    }
  }
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      var FIREBASE_REMOTE_CONFIG_URL_BASE: String = js.native
    }
    object Window {
      
      @scala.inline
      def apply(FIREBASE_REMOTE_CONFIG_URL_BASE: String): Window = {
        val __obj = js.Dynamic.literal(FIREBASE_REMOTE_CONFIG_URL_BASE = FIREBASE_REMOTE_CONFIG_URL_BASE.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFIREBASE_REMOTE_CONFIG_URL_BASE(value: String): Self = StObject.set(x, "FIREBASE_REMOTE_CONFIG_URL_BASE", value.asInstanceOf[js.Any])
      }
    }
  }
}

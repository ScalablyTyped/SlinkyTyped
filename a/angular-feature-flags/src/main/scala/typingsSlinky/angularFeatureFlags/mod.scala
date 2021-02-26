package typingsSlinky.angularFeatureFlags

import typingsSlinky.angular.mod.IHttpPromise
import typingsSlinky.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object featureflags {
    
    @js.native
    trait FeatureFlagsProvider extends StObject {
      
      def setInitialFlags(flags: js.Array[FlagData]): Unit = js.native
    }
    object FeatureFlagsProvider {
      
      @scala.inline
      def apply(setInitialFlags: js.Array[FlagData] => Unit): FeatureFlagsProvider = {
        val __obj = js.Dynamic.literal(setInitialFlags = js.Any.fromFunction1(setInitialFlags))
        __obj.asInstanceOf[FeatureFlagsProvider]
      }
      
      @scala.inline
      implicit class FeatureFlagsProviderMutableBuilder[Self <: FeatureFlagsProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSetInitialFlags(value: js.Array[FlagData] => Unit): Self = StObject.set(x, "setInitialFlags", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait FeatureFlagsService extends StObject {
      
      def set(flagsPromise: IHttpPromise[js.Array[FlagData]] | IPromise[js.Array[FlagData]]): Unit = js.native
    }
    
    @js.native
    trait FlagData extends StObject {
      
      /**
        * Boolean value for enabling/disabling the feature
        */
      var active: Boolean = js.native
      
      /**
        * A long description of the flag to further explain the feature being toggled
        * (only visible in the list of flags)
        */
      var description: String = js.native
      
      /**
        * Unique key that is used from the markup to resolve whether a flag is active or not.
        */
      var key: String = js.native
      
      /**
        * A short name of the flag (only visible in the list of flags)
        */
      var name: String = js.native
    }
    object FlagData {
      
      @scala.inline
      def apply(active: Boolean, description: String, key: String, name: String): FlagData = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[FlagData]
      }
      
      @scala.inline
      implicit class FlagDataMutableBuilder[Self <: FlagData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
}

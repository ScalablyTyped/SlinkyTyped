package typingsSlinky.relayRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayFeatureFlagsMod {
  
  @JSImport("relay-runtime/lib/util/RelayFeatureFlags", "RelayFeatureFlags")
  @js.native
  val RelayFeatureFlags: FeatureFlags = js.native
  
  @js.native
  trait FeatureFlags extends StObject {
    
    var ENABLE_PARTIAL_RENDERING_DEFAULT: Boolean = js.native
    
    var ENABLE_RELAY_CONTAINERS_SUSPENSE: Boolean = js.native
    
    var ENABLE_UNIQUE_MUTATION_ROOT: Boolean = js.native
    
    var ENABLE_VARIABLE_CONNECTION_KEY: Boolean = js.native
  }
  object FeatureFlags {
    
    @scala.inline
    def apply(
      ENABLE_PARTIAL_RENDERING_DEFAULT: Boolean,
      ENABLE_RELAY_CONTAINERS_SUSPENSE: Boolean,
      ENABLE_UNIQUE_MUTATION_ROOT: Boolean,
      ENABLE_VARIABLE_CONNECTION_KEY: Boolean
    ): FeatureFlags = {
      val __obj = js.Dynamic.literal(ENABLE_PARTIAL_RENDERING_DEFAULT = ENABLE_PARTIAL_RENDERING_DEFAULT.asInstanceOf[js.Any], ENABLE_RELAY_CONTAINERS_SUSPENSE = ENABLE_RELAY_CONTAINERS_SUSPENSE.asInstanceOf[js.Any], ENABLE_UNIQUE_MUTATION_ROOT = ENABLE_UNIQUE_MUTATION_ROOT.asInstanceOf[js.Any], ENABLE_VARIABLE_CONNECTION_KEY = ENABLE_VARIABLE_CONNECTION_KEY.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureFlags]
    }
    
    @scala.inline
    implicit class FeatureFlagsMutableBuilder[Self <: FeatureFlags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setENABLE_PARTIAL_RENDERING_DEFAULT(value: Boolean): Self = StObject.set(x, "ENABLE_PARTIAL_RENDERING_DEFAULT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setENABLE_RELAY_CONTAINERS_SUSPENSE(value: Boolean): Self = StObject.set(x, "ENABLE_RELAY_CONTAINERS_SUSPENSE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setENABLE_UNIQUE_MUTATION_ROOT(value: Boolean): Self = StObject.set(x, "ENABLE_UNIQUE_MUTATION_ROOT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setENABLE_VARIABLE_CONNECTION_KEY(value: Boolean): Self = StObject.set(x, "ENABLE_VARIABLE_CONNECTION_KEY", value.asInstanceOf[js.Any])
    }
  }
}

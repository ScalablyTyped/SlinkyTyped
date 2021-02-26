package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedReflectiveProvider extends StObject {
  
  /**
    * A key, usually a `Type<any>`.
    */
  var key: ReflectiveKey = js.native
  
  /**
    * Indicates if the provider is a multi-provider or a regular provider.
    */
  var multiProvider: Boolean = js.native
  
  /**
    * Factory function which can return an instance of an object represented by a key.
    */
  var resolvedFactories: js.Array[ResolvedReflectiveFactory] = js.native
}
object ResolvedReflectiveProvider {
  
  @scala.inline
  def apply(key: ReflectiveKey, multiProvider: Boolean, resolvedFactories: js.Array[ResolvedReflectiveFactory]): ResolvedReflectiveProvider = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], multiProvider = multiProvider.asInstanceOf[js.Any], resolvedFactories = resolvedFactories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedReflectiveProvider]
  }
  
  @scala.inline
  implicit class ResolvedReflectiveProviderMutableBuilder[Self <: ResolvedReflectiveProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: ReflectiveKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiProvider(value: Boolean): Self = StObject.set(x, "multiProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedFactories(value: js.Array[ResolvedReflectiveFactory]): Self = StObject.set(x, "resolvedFactories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedFactoriesVarargs(value: ResolvedReflectiveFactory*): Self = StObject.set(x, "resolvedFactories", js.Array(value :_*))
  }
}

package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueProvider
  extends ValueSansProvider
     with _Provider
     with _StaticProvider {
  
  /**
    * When true, injector returns an array of instances. This is useful to allow multiple
    * providers spread across many files to provide configuration information to a common token.
    */
  var multi: js.UndefOr[Boolean] = js.native
  
  /**
    * An injection token. Typically an instance of `Type` or `InjectionToken`, but can be `any`.
    */
  var provide: js.Any = js.native
}
object ValueProvider {
  
  @scala.inline
  def apply(provide: js.Any, useValue: js.Any): ValueProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueProvider]
  }
  
  @scala.inline
  implicit class ValueProviderMutableBuilder[Self <: ValueProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setProvide(value: js.Any): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
  }
}

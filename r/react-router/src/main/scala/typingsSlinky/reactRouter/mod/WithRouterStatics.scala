package typingsSlinky.reactRouter.mod

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithRouterStatics[C /* <: ReactComponentClass[_] */] extends StObject {
  
  var WrappedComponent: C = js.native
}
object WithRouterStatics {
  
  @scala.inline
  def apply[C /* <: ReactComponentClass[_] */](WrappedComponent: C): WithRouterStatics[C] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithRouterStatics[C]]
  }
  
  @scala.inline
  implicit class WithRouterStaticsMutableBuilder[Self <: WithRouterStatics[_], C /* <: ReactComponentClass[_] */] (val x: Self with WithRouterStatics[C]) extends AnyVal {
    
    @scala.inline
    def setWrappedComponent(value: C): Self = StObject.set(x, "WrappedComponent", value.asInstanceOf[js.Any])
  }
}

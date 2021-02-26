package typingsSlinky.next.anon

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<next.next/dist/next-server/lib/router/router.CompletePrivateRouteInfo, 'Component' | 'err'> */
@js.native
trait PickCompletePrivateRouteI extends StObject {
  
  var Component: ReactComponentClass[js.Object] = js.native
  
  var err: js.UndefOr[js.Error] = js.native
}
object PickCompletePrivateRouteI {
  
  @scala.inline
  def apply(Component: ReactComponentClass[js.Object]): PickCompletePrivateRouteI = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCompletePrivateRouteI]
  }
  
  @scala.inline
  implicit class PickCompletePrivateRouteIMutableBuilder[Self <: PickCompletePrivateRouteI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
  }
}

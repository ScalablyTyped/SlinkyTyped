package typingsSlinky.next.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<next.next/dist/next-server/lib/router/router.CompletePrivateRouteInfo, 'Component' | 'err'> */
@js.native
trait PickCompletePrivateRouteI extends js.Object {
  
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
  implicit class PickCompletePrivateRouteIOps[Self <: PickCompletePrivateRouteI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponent(value: ReactComponentClass[js.Object]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErr(value: js.Error): Self = this.set("err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
  }
}

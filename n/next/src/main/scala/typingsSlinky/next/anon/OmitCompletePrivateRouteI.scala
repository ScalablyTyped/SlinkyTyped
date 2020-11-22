package typingsSlinky.next.anon

import slinky.core.ReactComponentClass
import typingsSlinky.next.nextBooleans.`true`
import typingsSlinky.next.routerMod.PrivateRouteInfo
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<next.next/dist/next-server/lib/router/router.CompletePrivateRouteInfo, 'styleSheets'> & {  initial :true} */
@js.native
trait OmitCompletePrivateRouteI extends PrivateRouteInfo {
  
  var Component: ReactComponentClass[js.Object] = js.native
  
  var __N_SSG: js.UndefOr[Boolean] = js.native
  
  var __N_SSP: js.UndefOr[Boolean] = js.native
  
  var err: js.UndefOr[js.Error] = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  var initial: `true` = js.native
  
  var props: js.UndefOr[Record[String, _]] = js.native
}
object OmitCompletePrivateRouteI {
  
  @scala.inline
  def apply(Component: ReactComponentClass[js.Object], initial: `true`): OmitCompletePrivateRouteI = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitCompletePrivateRouteI]
  }
  
  @scala.inline
  implicit class OmitCompletePrivateRouteIOps[Self <: OmitCompletePrivateRouteI] (val x: Self) extends AnyVal {
    
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
    def setInitial(value: `true`): Self = this.set("initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__N_SSG(value: Boolean): Self = this.set("__N_SSG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__N_SSG: Self = this.set("__N_SSG", js.undefined)
    
    @scala.inline
    def set__N_SSP(value: Boolean): Self = this.set("__N_SSP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__N_SSP: Self = this.set("__N_SSP", js.undefined)
    
    @scala.inline
    def setErr(value: js.Error): Self = this.set("err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
    
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setProps(value: Record[String, _]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
}

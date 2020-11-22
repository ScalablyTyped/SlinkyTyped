package typingsSlinky.next.routeLoaderMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadedEntrypointSuccess extends RouteEntrypoint {
  
  var component: ReactComponentClass[js.Object] = js.native
  
  var exports: js.Any = js.native
}
object LoadedEntrypointSuccess {
  
  @scala.inline
  def apply(component: ReactComponentClass[js.Object], exports: js.Any): LoadedEntrypointSuccess = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadedEntrypointSuccess]
  }
  
  @scala.inline
  implicit class LoadedEntrypointSuccessOps[Self <: LoadedEntrypointSuccess] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: ReactComponentClass[js.Object]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExports(value: js.Any): Self = this.set("exports", value.asInstanceOf[js.Any])
  }
}

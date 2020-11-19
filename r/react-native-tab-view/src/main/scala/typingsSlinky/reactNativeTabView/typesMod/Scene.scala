package typingsSlinky.reactNativeTabView.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scene[T /* <: Route */] extends js.Object {
  
  var route: T = js.native
}
object Scene {
  
  @scala.inline
  def apply[T /* <: Route */](route: T): Scene[T] = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene[T]]
  }
  
  @scala.inline
  implicit class SceneOps[Self <: Scene[_], T /* <: Route */] (val x: Self with Scene[T]) extends AnyVal {
    
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
    def setRoute(value: T): Self = this.set("route", value.asInstanceOf[js.Any])
  }
}

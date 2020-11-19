package typingsSlinky.amapJsApiDriving.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsWaypoint extends js.Object {
  
  var isWaypoint: Boolean = js.native
}
object IsWaypoint {
  
  @scala.inline
  def apply(isWaypoint: Boolean): IsWaypoint = {
    val __obj = js.Dynamic.literal(isWaypoint = isWaypoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsWaypoint]
  }
  
  @scala.inline
  implicit class IsWaypointOps[Self <: IsWaypoint] (val x: Self) extends AnyVal {
    
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
    def setIsWaypoint(value: Boolean): Self = this.set("isWaypoint", value.asInstanceOf[js.Any])
  }
}

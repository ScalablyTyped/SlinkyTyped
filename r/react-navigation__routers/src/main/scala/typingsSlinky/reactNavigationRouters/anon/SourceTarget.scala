package typingsSlinky.reactNavigationRouters.anon

import typingsSlinky.reactNavigationRouters.drawerRouterMod.DrawerActionType
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.CLOSE_DRAWER
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.OPEN_DRAWER
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.TOGGLE_DRAWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceTarget extends DrawerActionType {
  
  var source: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var `type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER = js.native
}
object SourceTarget {
  
  @scala.inline
  def apply(`type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): SourceTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceTarget]
  }
  
  @scala.inline
  implicit class SourceTargetMutableBuilder[Self <: SourceTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

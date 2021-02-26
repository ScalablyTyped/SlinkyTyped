package typingsSlinky.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target[EventName /* <: String */] extends StObject {
  
  val target: js.UndefOr[String] = js.native
  
  /**
    * Type of the event (e.g. `focus`, `blur`)
    */
  val `type`: EventName = js.native
}
object Target {
  
  @scala.inline
  def apply[EventName /* <: String */](`type`: EventName): Target[EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target[EventName]]
  }
  
  @scala.inline
  implicit class TargetMutableBuilder[Self <: Target[_], EventName /* <: String */] (val x: Self with Target[EventName]) extends AnyVal {
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: EventName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICurrentRepresentationSwitch extends StObject {
  
  var mt: Double = js.native
  
  var t: js.Date = js.native
}
object ICurrentRepresentationSwitch {
  
  @scala.inline
  def apply(mt: Double, t: js.Date): ICurrentRepresentationSwitch = {
    val __obj = js.Dynamic.literal(mt = mt.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentRepresentationSwitch]
  }
  
  @scala.inline
  implicit class ICurrentRepresentationSwitchMutableBuilder[Self <: ICurrentRepresentationSwitch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMt(value: Double): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: js.Date): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}

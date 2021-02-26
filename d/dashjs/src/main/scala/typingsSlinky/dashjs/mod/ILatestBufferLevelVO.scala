package typingsSlinky.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILatestBufferLevelVO extends StObject {
  
  var level: Double = js.native
  
  var t: js.Date = js.native
}
object ILatestBufferLevelVO {
  
  @scala.inline
  def apply(level: Double, t: js.Date): ILatestBufferLevelVO = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILatestBufferLevelVO]
  }
  
  @scala.inline
  implicit class ILatestBufferLevelVOMutableBuilder[Self <: ILatestBufferLevelVO] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: js.Date): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}

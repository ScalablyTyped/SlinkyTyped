package typingsSlinky.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overflow extends StObject {
  
  var overflow: AdjustX = js.native
}
object Overflow {
  
  @scala.inline
  def apply(overflow: AdjustX): Overflow = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overflow]
  }
  
  @scala.inline
  implicit class OverflowMutableBuilder[Self <: Overflow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverflow(value: AdjustX): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropEffect extends StObject {
  
  var direction: js.UndefOr[Double] = js.native
}
object DropEffect {
  
  @scala.inline
  def apply(): DropEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropEffect]
  }
  
  @scala.inline
  implicit class DropEffectMutableBuilder[Self <: DropEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}

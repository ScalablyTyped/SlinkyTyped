package typingsSlinky.overlayscrollbars.anon

import typingsSlinky.overlayscrollbars.mod.Easing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var x: js.UndefOr[Easing] = js.native
  
  var y: js.UndefOr[Easing] = js.native
}
object `1` {
  
  @scala.inline
  def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Easing): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXNull: Self = StObject.set(x, "x", null)
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Easing): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYNull: Self = StObject.set(x, "y", null)
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

package typingsSlinky.overlayscrollbars.anon

import typingsSlinky.overlayscrollbars.mod.ScrollBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Y extends StObject {
  
  var x: js.UndefOr[ScrollBehavior] = js.native
  
  var y: js.UndefOr[ScrollBehavior] = js.native
}
object Y {
  
  @scala.inline
  def apply(): Y = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Y]
  }
  
  @scala.inline
  implicit class YMutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: ScrollBehavior): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: ScrollBehavior): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

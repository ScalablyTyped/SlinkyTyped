package typingsSlinky.betterScroll.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BounceObjectOption extends StObject {
  
  var bottom: js.UndefOr[Boolean] = js.native
  
  var left: js.UndefOr[Boolean] = js.native
  
  var right: js.UndefOr[Boolean] = js.native
  
  var top: js.UndefOr[Boolean] = js.native
}
object BounceObjectOption {
  
  @scala.inline
  def apply(): BounceObjectOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BounceObjectOption]
  }
  
  @scala.inline
  implicit class BounceObjectOptionMutableBuilder[Self <: BounceObjectOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}

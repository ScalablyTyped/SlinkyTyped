package typingsSlinky.overlayscrollbars.anon

import typingsSlinky.overlayscrollbars.mod.BlockBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XY extends StObject {
  
  var x: js.UndefOr[BlockBehavior] = js.native
  
  var y: js.UndefOr[BlockBehavior] = js.native
}
object XY {
  
  @scala.inline
  def apply(): XY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XY]
  }
  
  @scala.inline
  implicit class XYMutableBuilder[Self <: XY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: BlockBehavior): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: BlockBehavior): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

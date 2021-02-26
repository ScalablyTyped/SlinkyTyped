package typingsSlinky.reactVis.anon

import typingsSlinky.reactVis.reactVisStrings.auto
import typingsSlinky.reactVis.reactVisStrings.bottom
import typingsSlinky.reactVis.reactVisStrings.bottomEdge
import typingsSlinky.reactVis.reactVisStrings.left
import typingsSlinky.reactVis.reactVisStrings.leftEdge
import typingsSlinky.reactVis.reactVisStrings.right
import typingsSlinky.reactVis.reactVisStrings.rightEdge
import typingsSlinky.reactVis.reactVisStrings.top
import typingsSlinky.reactVis.reactVisStrings.topEdge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vertical extends StObject {
  
  var horizontal: js.UndefOr[auto | left | right | leftEdge | rightEdge] = js.native
  
  var vertical: js.UndefOr[auto | bottom | top | bottomEdge | topEdge] = js.native
}
object Vertical {
  
  @scala.inline
  def apply(): Vertical = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vertical]
  }
  
  @scala.inline
  implicit class VerticalMutableBuilder[Self <: Vertical] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontal(value: auto | left | right | leftEdge | rightEdge): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setVertical(value: auto | bottom | top | bottomEdge | topEdge): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}

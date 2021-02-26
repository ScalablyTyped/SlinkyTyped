package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Placement extends StObject {
  
  @JSName("$placement")
  var $placement: topLeft | topRight | bottomLeft | bottomRight | bottom | top = js.native
}
object Placement {
  
  @scala.inline
  def apply($placement: topLeft | topRight | bottomLeft | bottomRight | bottom | top): Placement = {
    val __obj = js.Dynamic.literal($placement = $placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
  
  @scala.inline
  implicit class PlacementMutableBuilder[Self <: Placement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$placement(value: topLeft | topRight | bottomLeft | bottomRight | bottom | top): Self = StObject.set(x, "$placement", value.asInstanceOf[js.Any])
  }
}

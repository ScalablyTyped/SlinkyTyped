package typingsSlinky.rcMenu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hover extends StObject {
  
  var hover: Boolean = js.native
  
  var key: typingsSlinky.react.mod.Key = js.native
}
object Hover {
  
  @scala.inline
  def apply(hover: Boolean, key: typingsSlinky.react.mod.Key): Hover = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hover]
  }
  
  @scala.inline
  implicit class HoverMutableBuilder[Self <: Hover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: typingsSlinky.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}

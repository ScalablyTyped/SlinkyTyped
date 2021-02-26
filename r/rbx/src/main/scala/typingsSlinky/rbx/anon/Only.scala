package typingsSlinky.rbx.anon

import typingsSlinky.rbx.rbxStrings.`inline-block`
import typingsSlinky.rbx.rbxStrings.`inline-flex`
import typingsSlinky.rbx.rbxStrings.`inline`
import typingsSlinky.rbx.rbxStrings.block
import typingsSlinky.rbx.rbxStrings.flex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Only extends StObject {
  
  var only: js.UndefOr[Boolean] = js.native
  
  var value: block | flex | `inline` | `inline-block` | `inline-flex` = js.native
}
object Only {
  
  @scala.inline
  def apply(value: block | flex | `inline` | `inline-block` | `inline-flex`): Only = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Only]
  }
  
  @scala.inline
  implicit class OnlyMutableBuilder[Self <: Only] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    @scala.inline
    def setValue(value: block | flex | `inline` | `inline-block` | `inline-flex`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

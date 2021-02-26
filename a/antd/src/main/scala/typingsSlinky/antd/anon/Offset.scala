package typingsSlinky.antd.anon

import typingsSlinky.antd.antdStrings.down
import typingsSlinky.antd.antdStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Offset extends StObject {
  
  var offset: Double = js.native
  
  var `type`: up | down = js.native
}
object Offset {
  
  @scala.inline
  def apply(offset: Double, `type`: up | down): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  @scala.inline
  implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: up | down): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

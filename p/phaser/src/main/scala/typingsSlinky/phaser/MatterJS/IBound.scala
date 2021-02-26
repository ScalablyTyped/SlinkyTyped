package typingsSlinky.phaser.MatterJS

import typingsSlinky.phaser.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBound extends StObject {
  
  var max: X = js.native
  
  var min: X = js.native
}
object IBound {
  
  @scala.inline
  def apply(max: X, min: X): IBound = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBound]
  }
  
  @scala.inline
  implicit class IBoundMutableBuilder[Self <: IBound] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: X): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: X): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Line extends StObject {
  
  var line: Double = js.native
  
  var offset: Double = js.native
}
object Line {
  
  @scala.inline
  def apply(line: Double, offset: Double): Line = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  
  @scala.inline
  implicit class LineMutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}

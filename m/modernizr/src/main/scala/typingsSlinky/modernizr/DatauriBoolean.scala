package typingsSlinky.modernizr

import typingsSlinky.std.Boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatauriBoolean extends Boolean {
  
  var over32kb: scala.Boolean = js.native
}
object DatauriBoolean {
  
  @scala.inline
  def apply(over32kb: scala.Boolean): DatauriBoolean = {
    val __obj = js.Dynamic.literal(over32kb = over32kb.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatauriBoolean]
  }
  
  @scala.inline
  implicit class DatauriBooleanMutableBuilder[Self <: DatauriBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOver32kb(value: scala.Boolean): Self = StObject.set(x, "over32kb", value.asInstanceOf[js.Any])
  }
}

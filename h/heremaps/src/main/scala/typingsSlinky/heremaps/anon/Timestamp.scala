package typingsSlinky.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timestamp extends StObject {
  
  var Timestamp: String = js.native
}
object Timestamp {
  
  @scala.inline
  def apply(Timestamp: String): Timestamp = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timestamp]
  }
  
  @scala.inline
  implicit class TimestampMutableBuilder[Self <: Timestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}

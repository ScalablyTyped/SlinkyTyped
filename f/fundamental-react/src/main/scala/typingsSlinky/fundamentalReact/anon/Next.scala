package typingsSlinky.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Next extends StObject {
  
  var next: String = js.native
  
  var previous: String = js.native
}
object Next {
  
  @scala.inline
  def apply(next: String, previous: String): Next = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
  
  @scala.inline
  implicit class NextMutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
  }
}

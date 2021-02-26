package typingsSlinky.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallerID extends StObject {
  
  /**
    * Name.
    */
  var name: String = js.native
  
  /**
    * Number.
    */
  var number: String = js.native
}
object CallerID {
  
  @scala.inline
  def apply(name: String, number: String): CallerID = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallerID]
  }
  
  @scala.inline
  implicit class CallerIDMutableBuilder[Self <: CallerID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}

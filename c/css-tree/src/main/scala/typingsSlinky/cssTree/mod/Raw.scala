package typingsSlinky.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Raw
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_Raw: typingsSlinky.cssTree.cssTreeStrings.Raw = js.native
  
  var value: String = js.native
}
object Raw {
  
  @scala.inline
  def apply(`type`: typingsSlinky.cssTree.cssTreeStrings.Raw, value: String): Raw = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw]
  }
  
  @scala.inline
  implicit class RawMutableBuilder[Self <: Raw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.cssTree.cssTreeStrings.Raw): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

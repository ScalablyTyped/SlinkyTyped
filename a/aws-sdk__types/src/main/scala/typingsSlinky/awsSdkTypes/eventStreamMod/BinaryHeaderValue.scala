package typingsSlinky.awsSdkTypes.eventStreamMod

import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryHeaderValue extends MessageHeaderValue {
  
  var `type`: binary = js.native
  
  var value: js.typedarray.Uint8Array = js.native
}
object BinaryHeaderValue {
  
  @scala.inline
  def apply(`type`: binary, value: js.typedarray.Uint8Array): BinaryHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryHeaderValue]
  }
  
  @scala.inline
  implicit class BinaryHeaderValueMutableBuilder[Self <: BinaryHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: binary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

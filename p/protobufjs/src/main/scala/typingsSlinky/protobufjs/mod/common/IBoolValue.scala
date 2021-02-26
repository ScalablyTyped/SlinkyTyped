package typingsSlinky.protobufjs.mod.common

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.BoolValue message. */
@js.native
trait IBoolValue extends StObject {
  
  var value: js.UndefOr[Boolean] = js.native
}
object IBoolValue {
  
  @scala.inline
  def apply(): IBoolValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoolValue]
  }
  
  @scala.inline
  implicit class IBoolValueMutableBuilder[Self <: IBoolValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

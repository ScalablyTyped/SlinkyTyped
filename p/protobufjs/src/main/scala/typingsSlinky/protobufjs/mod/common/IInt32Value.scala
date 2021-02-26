package typingsSlinky.protobufjs.mod.common

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.Int32Value message. */
@js.native
trait IInt32Value extends StObject {
  
  var value: js.UndefOr[Double] = js.native
}
object IInt32Value {
  
  @scala.inline
  def apply(): IInt32Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInt32Value]
  }
  
  @scala.inline
  implicit class IInt32ValueMutableBuilder[Self <: IInt32Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

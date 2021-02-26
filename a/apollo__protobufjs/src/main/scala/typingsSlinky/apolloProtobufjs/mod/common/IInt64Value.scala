package typingsSlinky.apolloProtobufjs.mod.common

import typingsSlinky.long.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.Int64Value message. */
@js.native
trait IInt64Value extends StObject {
  
  var value: js.UndefOr[Double | Long] = js.native
}
object IInt64Value {
  
  @scala.inline
  def apply(): IInt64Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInt64Value]
  }
  
  @scala.inline
  implicit class IInt64ValueMutableBuilder[Self <: IInt64Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double | Long): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

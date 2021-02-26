package typingsSlinky.dialogflow.mod.google.protobuf

import typingsSlinky.long.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Duration. */
@js.native
trait IDuration extends StObject {
  
  /** Duration nanos */
  var nanos: js.UndefOr[Double | Null] = js.native
  
  /** Duration seconds */
  var seconds: js.UndefOr[Double | Long | String | Null] = js.native
}
object IDuration {
  
  @scala.inline
  def apply(): IDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDuration]
  }
  
  @scala.inline
  implicit class IDurationMutableBuilder[Self <: IDuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanosNull: Self = StObject.set(x, "nanos", null)
    
    @scala.inline
    def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    @scala.inline
    def setSeconds(value: Double | Long | String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsNull: Self = StObject.set(x, "seconds", null)
    
    @scala.inline
    def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}

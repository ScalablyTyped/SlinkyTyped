package typingsSlinky.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAndLockOptions extends StObject {
  
  var lockTime: js.UndefOr[Double] = js.native
}
object GetAndLockOptions {
  
  @scala.inline
  def apply(): GetAndLockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAndLockOptions]
  }
  
  @scala.inline
  implicit class GetAndLockOptionsMutableBuilder[Self <: GetAndLockOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLockTime(value: Double): Self = StObject.set(x, "lockTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockTimeUndefined: Self = StObject.set(x, "lockTime", js.undefined)
  }
}

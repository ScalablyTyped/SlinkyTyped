package typingsSlinky.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMUMPU6050Option extends IMUGeneralOption {
  
  var address: Double = js.native
}
object IMUMPU6050Option {
  
  @scala.inline
  def apply(address: Double): IMUMPU6050Option = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMUMPU6050Option]
  }
  
  @scala.inline
  implicit class IMUMPU6050OptionMutableBuilder[Self <: IMUMPU6050Option] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Double): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
  }
}

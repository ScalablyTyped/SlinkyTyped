package typingsSlinky.awsIotDeviceSdk

import typingsSlinky.awsIotDeviceSdk.awsIotDeviceSdkNumbers.`0`
import typingsSlinky.awsIotDeviceSdk.awsIotDeviceSdkNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Qos extends StObject {
    
    var qos: `0` | `1` = js.native
  }
  object Qos {
    
    @scala.inline
    def apply(qos: `0` | `1`): Qos = {
      val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Qos]
    }
    
    @scala.inline
    implicit class QosMutableBuilder[Self <: Qos] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQos(value: `0` | `1`): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    }
  }
}

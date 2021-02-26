package typingsSlinky.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaconvert {
  
  @js.native
  trait QueueReservationPlanSettings extends StObject {
    
    /**
      * The length of the term of your reserved queue pricing plan commitment. Valid value is `ONE_YEAR`.
      */
    var commitment: String = js.native
    
    /**
      * Specifies whether the term of your reserved queue pricing plan. Valid values are `AUTO_RENEW` or `EXPIRE`.
      */
    var renewalType: String = js.native
    
    /**
      * Specifies the number of reserved transcode slots (RTS) for queue.
      */
    var reservedSlots: Double = js.native
  }
  object QueueReservationPlanSettings {
    
    @scala.inline
    def apply(commitment: String, renewalType: String, reservedSlots: Double): QueueReservationPlanSettings = {
      val __obj = js.Dynamic.literal(commitment = commitment.asInstanceOf[js.Any], renewalType = renewalType.asInstanceOf[js.Any], reservedSlots = reservedSlots.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueReservationPlanSettings]
    }
    
    @scala.inline
    implicit class QueueReservationPlanSettingsMutableBuilder[Self <: QueueReservationPlanSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommitment(value: String): Self = StObject.set(x, "commitment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenewalType(value: String): Self = StObject.set(x, "renewalType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservedSlots(value: Double): Self = StObject.set(x, "reservedSlots", value.asInstanceOf[js.Any])
    }
  }
}

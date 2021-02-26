package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Daily
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Weekly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInventoryScheduleMod {
  
  @js.native
  trait InventorySchedule extends StObject {
    
    /**
      * <p>Specifies how frequently inventory results are produced.</p>
      */
    var Frequency: Daily | Weekly | String = js.native
  }
  object InventorySchedule {
    
    @scala.inline
    def apply(Frequency: Daily | Weekly | String): InventorySchedule = {
      val __obj = js.Dynamic.literal(Frequency = Frequency.asInstanceOf[js.Any])
      __obj.asInstanceOf[InventorySchedule]
    }
    
    @scala.inline
    implicit class InventoryScheduleMutableBuilder[Self <: InventorySchedule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrequency(value: Daily | Weekly | String): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledInventorySchedule = InventorySchedule
}

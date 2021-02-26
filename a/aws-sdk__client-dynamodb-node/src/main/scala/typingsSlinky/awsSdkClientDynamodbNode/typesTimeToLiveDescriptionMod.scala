package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DISABLED
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DISABLING
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ENABLED
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ENABLING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTimeToLiveDescriptionMod {
  
  @js.native
  trait TimeToLiveDescription extends StObject {
    
    /**
      * <p> The name of the Time to Live attribute for items in the table.</p>
      */
    var AttributeName: js.UndefOr[String] = js.native
    
    /**
      * <p> The Time to Live status for the table.</p>
      */
    var TimeToLiveStatus: js.UndefOr[ENABLING | DISABLING | ENABLED | DISABLED | String] = js.native
  }
  object TimeToLiveDescription {
    
    @scala.inline
    def apply(): TimeToLiveDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeToLiveDescription]
    }
    
    @scala.inline
    implicit class TimeToLiveDescriptionMutableBuilder[Self <: TimeToLiveDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
      
      @scala.inline
      def setTimeToLiveStatus(value: ENABLING | DISABLING | ENABLED | DISABLED | String): Self = StObject.set(x, "TimeToLiveStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveStatusUndefined: Self = StObject.set(x, "TimeToLiveStatus", js.undefined)
    }
  }
  
  type UnmarshalledTimeToLiveDescription = TimeToLiveDescription
}

package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
import typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.UnmarshalledProvisionedThroughput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateGlobalSecondaryIndexActionMod {
  
  @js.native
  trait UnmarshalledUpdateGlobalSecondaryIndexAction extends UpdateGlobalSecondaryIndexAction {
    
    /**
      * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    @JSName("ProvisionedThroughput")
    var ProvisionedThroughput_UnmarshalledUpdateGlobalSecondaryIndexAction: UnmarshalledProvisionedThroughput = js.native
  }
  object UnmarshalledUpdateGlobalSecondaryIndexAction {
    
    @scala.inline
    def apply(IndexName: String, ProvisionedThroughput: UnmarshalledProvisionedThroughput): UnmarshalledUpdateGlobalSecondaryIndexAction = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledUpdateGlobalSecondaryIndexAction]
    }
    
    @scala.inline
    implicit class UnmarshalledUpdateGlobalSecondaryIndexActionMutableBuilder[Self <: UnmarshalledUpdateGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvisionedThroughput(value: UnmarshalledProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateGlobalSecondaryIndexAction extends StObject {
    
    /**
      * <p>The name of the global secondary index to be updated.</p>
      */
    var IndexName: String = js.native
    
    /**
      * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ProvisionedThroughput: typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput = js.native
  }
  object UpdateGlobalSecondaryIndexAction {
    
    @scala.inline
    def apply(IndexName: String, ProvisionedThroughput: ProvisionedThroughput): UpdateGlobalSecondaryIndexAction = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateGlobalSecondaryIndexAction]
    }
    
    @scala.inline
    implicit class UpdateGlobalSecondaryIndexActionMutableBuilder[Self <: UpdateGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    }
  }
}

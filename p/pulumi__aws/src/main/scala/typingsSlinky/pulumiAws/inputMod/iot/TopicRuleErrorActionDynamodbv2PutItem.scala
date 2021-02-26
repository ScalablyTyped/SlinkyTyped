package typingsSlinky.pulumiAws.inputMod.iot

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleErrorActionDynamodbv2PutItem extends StObject {
  
  /**
    * The name of the DynamoDB table.
    */
  var tableName: Input[String] = js.native
}
object TopicRuleErrorActionDynamodbv2PutItem {
  
  @scala.inline
  def apply(tableName: Input[String]): TopicRuleErrorActionDynamodbv2PutItem = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionDynamodbv2PutItem]
  }
  
  @scala.inline
  implicit class TopicRuleErrorActionDynamodbv2PutItemMutableBuilder[Self <: TopicRuleErrorActionDynamodbv2PutItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableName(value: Input[String]): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}

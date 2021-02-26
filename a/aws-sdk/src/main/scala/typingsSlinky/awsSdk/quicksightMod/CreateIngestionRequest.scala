package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIngestionRequest extends StObject {
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The ID of the dataset used in the ingestion.
    */
  var DataSetId: java.lang.String = js.native
  
  /**
    * An ID for the ingestion.
    */
  var IngestionId: typingsSlinky.awsSdk.quicksightMod.IngestionId = js.native
}
object CreateIngestionRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DataSetId: java.lang.String, IngestionId: IngestionId): CreateIngestionRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], IngestionId = IngestionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIngestionRequest]
  }
  
  @scala.inline
  implicit class CreateIngestionRequestMutableBuilder[Self <: CreateIngestionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetId(value: java.lang.String): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionId(value: IngestionId): Self = StObject.set(x, "IngestionId", value.asInstanceOf[js.Any])
  }
}

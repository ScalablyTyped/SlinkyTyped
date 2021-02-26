package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetModelSummary extends StObject {
  
  /**
    * The ARN of the asset model, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId} 
    */
  var arn: ARN = js.native
  
  /**
    * The date the asset model was created, in Unix epoch time.
    */
  var creationDate: js.Date = js.native
  
  /**
    * The asset model description.
    */
  var description: Description = js.native
  
  /**
    * The ID of the asset model (used with AWS IoT SiteWise APIs).
    */
  var id: ID = js.native
  
  /**
    * The date the asset model was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.Date = js.native
  
  /**
    * The name of the asset model.
    */
  var name: Name = js.native
  
  /**
    * The current status of the asset model.
    */
  var status: AssetModelStatus = js.native
}
object AssetModelSummary {
  
  @scala.inline
  def apply(
    arn: ARN,
    creationDate: js.Date,
    description: Description,
    id: ID,
    lastUpdateDate: js.Date,
    name: Name,
    status: AssetModelStatus
  ): AssetModelSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdateDate = lastUpdateDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelSummary]
  }
  
  @scala.inline
  implicit class AssetModelSummaryMutableBuilder[Self <: AssetModelSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateDate(value: js.Date): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AssetModelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

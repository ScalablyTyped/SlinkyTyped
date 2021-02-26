package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgorithmSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var AlgorithmArn: typingsSlinky.awsSdk.sagemakerMod.AlgorithmArn = js.native
  
  /**
    * A brief description of the algorithm.
    */
  var AlgorithmDescription: js.UndefOr[EntityDescription] = js.native
  
  /**
    * The name of the algorithm that is described by the summary.
    */
  var AlgorithmName: EntityName = js.native
  
  /**
    * The overall status of the algorithm.
    */
  var AlgorithmStatus: typingsSlinky.awsSdk.sagemakerMod.AlgorithmStatus = js.native
  
  /**
    * A timestamp that shows when the algorithm was created.
    */
  var CreationTime: js.Date = js.native
}
object AlgorithmSummary {
  
  @scala.inline
  def apply(
    AlgorithmArn: AlgorithmArn,
    AlgorithmName: EntityName,
    AlgorithmStatus: AlgorithmStatus,
    CreationTime: js.Date
  ): AlgorithmSummary = {
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn.asInstanceOf[js.Any], AlgorithmName = AlgorithmName.asInstanceOf[js.Any], AlgorithmStatus = AlgorithmStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmSummary]
  }
  
  @scala.inline
  implicit class AlgorithmSummaryMutableBuilder[Self <: AlgorithmSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmArn(value: AlgorithmArn): Self = StObject.set(x, "AlgorithmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmDescription(value: EntityDescription): Self = StObject.set(x, "AlgorithmDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmDescriptionUndefined: Self = StObject.set(x, "AlgorithmDescription", js.undefined)
    
    @scala.inline
    def setAlgorithmName(value: EntityName): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmStatus(value: AlgorithmStatus): Self = StObject.set(x, "AlgorithmStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
  }
}

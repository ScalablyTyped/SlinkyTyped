package typingsSlinky.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metadata associated with a long running operation resource.
  */
@js.native
trait SchemaOperationMetadata extends StObject {
  
  /**
    * Percentage of completion of this operation, ranging from 0 to 100.
    */
  var progressPercentage: js.UndefOr[Double] = js.native
  
  /**
    * The full name of the resources that this operation is directly associated
    * with.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The start time of the operation.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * Detailed status information for each step. The order is undetermined.
    */
  var steps: js.UndefOr[js.Array[SchemaStep]] = js.native
}
object SchemaOperationMetadata {
  
  @scala.inline
  def apply(): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaOperationMetadataMutableBuilder[Self <: SchemaOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgressPercentage(value: Double): Self = StObject.set(x, "progressPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressPercentageUndefined: Self = StObject.set(x, "progressPercentage", js.undefined)
    
    @scala.inline
    def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    @scala.inline
    def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[SchemaStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: SchemaStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}

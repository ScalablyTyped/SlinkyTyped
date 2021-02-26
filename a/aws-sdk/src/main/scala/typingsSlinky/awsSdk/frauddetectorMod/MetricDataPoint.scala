package typingsSlinky.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricDataPoint extends StObject {
  
  /**
    * The false positive rate. This is the percentage of total legitimate events that are incorrectly predicted as fraud.
    */
  var fpr: js.UndefOr[float] = js.native
  
  /**
    * The percentage of fraud events correctly predicted as fraudulent as compared to all events predicted as fraudulent.
    */
  var precision: js.UndefOr[float] = js.native
  
  /**
    * The model threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500 means any model score 500 or above is labeled as fraud.
    */
  var threshold: js.UndefOr[float] = js.native
  
  /**
    * The true positive rate. This is the percentage of total fraud the model detects. Also known as capture rate.
    */
  var tpr: js.UndefOr[float] = js.native
}
object MetricDataPoint {
  
  @scala.inline
  def apply(): MetricDataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDataPoint]
  }
  
  @scala.inline
  implicit class MetricDataPointMutableBuilder[Self <: MetricDataPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFpr(value: float): Self = StObject.set(x, "fpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFprUndefined: Self = StObject.set(x, "fpr", js.undefined)
    
    @scala.inline
    def setPrecision(value: float): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setThreshold(value: float): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    @scala.inline
    def setTpr(value: float): Self = StObject.set(x, "tpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTprUndefined: Self = StObject.set(x, "tpr", js.undefined)
  }
}

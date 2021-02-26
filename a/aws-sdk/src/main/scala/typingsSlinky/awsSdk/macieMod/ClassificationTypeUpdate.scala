package typingsSlinky.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassificationTypeUpdate extends StObject {
  
  /**
    * A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie Classic begins performing continuous classification after a bucket is successfully associated with Amazon Macie Classic. 
    */
  var continuous: js.UndefOr[S3ContinuousClassificationType] = js.native
  
  /**
    * A one-time classification of all of the existing objects in a specified S3 bucket. 
    */
  var oneTime: js.UndefOr[S3OneTimeClassificationType] = js.native
}
object ClassificationTypeUpdate {
  
  @scala.inline
  def apply(): ClassificationTypeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationTypeUpdate]
  }
  
  @scala.inline
  implicit class ClassificationTypeUpdateMutableBuilder[Self <: ClassificationTypeUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuous(value: S3ContinuousClassificationType): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    @scala.inline
    def setOneTime(value: S3OneTimeClassificationType): Self = StObject.set(x, "oneTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneTimeUndefined: Self = StObject.set(x, "oneTime", js.undefined)
  }
}

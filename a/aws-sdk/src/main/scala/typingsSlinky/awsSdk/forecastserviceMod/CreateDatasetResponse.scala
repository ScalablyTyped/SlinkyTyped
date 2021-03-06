package typingsSlinky.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDatasetResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: js.UndefOr[Arn] = js.native
}
object CreateDatasetResponse {
  
  @scala.inline
  def apply(): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetResponse]
  }
  
  @scala.inline
  implicit class CreateDatasetResponseMutableBuilder[Self <: CreateDatasetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetArn(value: Arn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
  }
}

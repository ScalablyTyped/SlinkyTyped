package typingsSlinky.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDatasetRequest extends StObject {
  
  /**
    * The name of the dataset to be described.
    */
  var Name: DatasetName = js.native
}
object DescribeDatasetRequest {
  
  @scala.inline
  def apply(Name: DatasetName): DescribeDatasetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetRequest]
  }
  
  @scala.inline
  implicit class DescribeDatasetRequestMutableBuilder[Self <: DescribeDatasetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: DatasetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

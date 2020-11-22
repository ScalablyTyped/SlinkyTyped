package typingsSlinky.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDatasetResponse extends js.Object {
  
  /**
    * The name of the dataset that you updated.
    */
  var Name: DatasetName = js.native
}
object UpdateDatasetResponse {
  
  @scala.inline
  def apply(Name: DatasetName): UpdateDatasetResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasetResponse]
  }
  
  @scala.inline
  implicit class UpdateDatasetResponseOps[Self <: UpdateDatasetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: DatasetName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobRequest extends js.Object {
  
  /**
    * The name of the job to be described.
    */
  var Name: JobName = js.native
}
object DescribeJobRequest {
  
  @scala.inline
  def apply(Name: JobName): DescribeJobRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobRequest]
  }
  
  @scala.inline
  implicit class DescribeJobRequestOps[Self <: DescribeJobRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: JobName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}

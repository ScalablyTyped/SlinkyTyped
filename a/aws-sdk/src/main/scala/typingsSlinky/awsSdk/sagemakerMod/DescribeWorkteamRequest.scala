package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorkteamRequest extends js.Object {
  
  /**
    * The name of the work team to return a description of.
    */
  var WorkteamName: typingsSlinky.awsSdk.sagemakerMod.WorkteamName = js.native
}
object DescribeWorkteamRequest {
  
  @scala.inline
  def apply(WorkteamName: WorkteamName): DescribeWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkteamRequest]
  }
  
  @scala.inline
  implicit class DescribeWorkteamRequestOps[Self <: DescribeWorkteamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWorkteamName(value: WorkteamName): Self = this.set("WorkteamName", value.asInstanceOf[js.Any])
  }
}

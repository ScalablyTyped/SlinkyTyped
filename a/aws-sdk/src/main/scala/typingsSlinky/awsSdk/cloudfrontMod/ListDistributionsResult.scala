package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDistributionsResult extends js.Object {
  
  /**
    * The DistributionList type. 
    */
  var DistributionList: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.DistributionList] = js.native
}
object ListDistributionsResult {
  
  @scala.inline
  def apply(): ListDistributionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsResult]
  }
  
  @scala.inline
  implicit class ListDistributionsResultOps[Self <: ListDistributionsResult] (val x: Self) extends AnyVal {
    
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
    def setDistributionList(value: DistributionList): Self = this.set("DistributionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionList: Self = this.set("DistributionList", js.undefined)
  }
}

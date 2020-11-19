package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDistributionResult extends js.Object {
  
  /**
    * The distribution's information.
    */
  var Distribution: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.Distribution] = js.native
  
  /**
    * The current version of the distribution's information. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
}
object GetDistributionResult {
  
  @scala.inline
  def apply(): GetDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionResult]
  }
  
  @scala.inline
  implicit class GetDistributionResultOps[Self <: GetDistributionResult] (val x: Self) extends AnyVal {
    
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
    def setDistribution(value: Distribution): Self = this.set("Distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistribution: Self = this.set("Distribution", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
  }
}

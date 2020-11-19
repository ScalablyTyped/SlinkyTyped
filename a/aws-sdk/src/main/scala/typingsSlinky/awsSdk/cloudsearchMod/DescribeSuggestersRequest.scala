package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSuggestersRequest extends js.Object {
  
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typingsSlinky.awsSdk.cloudsearchMod.DomainName = js.native
  
  /**
    * The suggesters you want to describe.
    */
  var SuggesterNames: js.UndefOr[StandardNameList] = js.native
}
object DescribeSuggestersRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): DescribeSuggestersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSuggestersRequest]
  }
  
  @scala.inline
  implicit class DescribeSuggestersRequestOps[Self <: DescribeSuggestersRequest] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployed(value: Boolean): Self = this.set("Deployed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployed: Self = this.set("Deployed", js.undefined)
    
    @scala.inline
    def setSuggesterNamesVarargs(value: StandardName*): Self = this.set("SuggesterNames", js.Array(value :_*))
    
    @scala.inline
    def setSuggesterNames(value: StandardNameList): Self = this.set("SuggesterNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggesterNames: Self = this.set("SuggesterNames", js.undefined)
  }
}

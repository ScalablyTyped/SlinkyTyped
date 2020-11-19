package typingsSlinky.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlanRateFilter extends js.Object {
  
  /**
    * The filter name.
    */
  var name: js.UndefOr[SavingsPlanRateFilterName] = js.native
  
  /**
    * The filter values.
    */
  var values: js.UndefOr[ListOfStrings] = js.native
}
object SavingsPlanRateFilter {
  
  @scala.inline
  def apply(): SavingsPlanRateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanRateFilter]
  }
  
  @scala.inline
  implicit class SavingsPlanRateFilterOps[Self <: SavingsPlanRateFilter] (val x: Self) extends AnyVal {
    
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
    def setName(value: SavingsPlanRateFilterName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: ListOfStrings): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}

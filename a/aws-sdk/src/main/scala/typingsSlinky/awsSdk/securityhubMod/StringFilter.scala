package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringFilter extends js.Object {
  
  /**
    * The condition to be applied to a string value when querying for findings. 
    */
  var Comparison: js.UndefOr[StringFilterComparison] = js.native
  
  /**
    * The string filter value.
    */
  var Value: js.UndefOr[NonEmptyString] = js.native
}
object StringFilter {
  
  @scala.inline
  def apply(): StringFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringFilter]
  }
  
  @scala.inline
  implicit class StringFilterOps[Self <: StringFilter] (val x: Self) extends AnyVal {
    
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
    def setComparison(value: StringFilterComparison): Self = this.set("Comparison", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparison: Self = this.set("Comparison", js.undefined)
    
    @scala.inline
    def setValue(value: NonEmptyString): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}

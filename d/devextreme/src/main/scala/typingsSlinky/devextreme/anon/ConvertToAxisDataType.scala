package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvertToAxisDataType extends js.Object {
  
  var checkTypeForAllData: js.UndefOr[Boolean] = js.native
  
  var convertToAxisDataType: js.UndefOr[Boolean] = js.native
  
  var sortingMethod: js.UndefOr[Boolean | (js.Function2[/* a */ Arg, /* b */ Arg, Double])] = js.native
}
object ConvertToAxisDataType {
  
  @scala.inline
  def apply(): ConvertToAxisDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertToAxisDataType]
  }
  
  @scala.inline
  implicit class ConvertToAxisDataTypeOps[Self <: ConvertToAxisDataType] (val x: Self) extends AnyVal {
    
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
    def setCheckTypeForAllData(value: Boolean): Self = this.set("checkTypeForAllData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckTypeForAllData: Self = this.set("checkTypeForAllData", js.undefined)
    
    @scala.inline
    def setConvertToAxisDataType(value: Boolean): Self = this.set("convertToAxisDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertToAxisDataType: Self = this.set("convertToAxisDataType", js.undefined)
    
    @scala.inline
    def setSortingMethodFunction2(value: (/* a */ Arg, /* b */ Arg) => Double): Self = this.set("sortingMethod", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortingMethod(value: Boolean | (js.Function2[/* a */ Arg, /* b */ Arg, Double])): Self = this.set("sortingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortingMethod: Self = this.set("sortingMethod", js.undefined)
  }
}

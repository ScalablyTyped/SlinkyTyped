package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceleratorTypesScopedList extends js.Object {
  
  /** [Output Only] List of accelerator types contained in this scope. */
  var acceleratorTypes: js.UndefOr[js.Array[AcceleratorType]] = js.native
  
  /** [Output Only] An informational warning that appears when the accelerator types list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object AcceleratorTypesScopedList {
  
  @scala.inline
  def apply(): AcceleratorTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorTypesScopedList]
  }
  
  @scala.inline
  implicit class AcceleratorTypesScopedListOps[Self <: AcceleratorTypesScopedList] (val x: Self) extends AnyVal {
    
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
    def setAcceleratorTypesVarargs(value: AcceleratorType*): Self = this.set("acceleratorTypes", js.Array(value :_*))
    
    @scala.inline
    def setAcceleratorTypes(value: js.Array[AcceleratorType]): Self = this.set("acceleratorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorTypes: Self = this.set("acceleratorTypes", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}

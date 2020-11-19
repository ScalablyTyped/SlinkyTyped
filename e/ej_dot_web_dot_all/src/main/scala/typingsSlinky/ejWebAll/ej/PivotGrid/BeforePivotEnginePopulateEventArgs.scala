package typingsSlinky.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforePivotEnginePopulateEventArgs extends js.Object {
  
  /** returns the PivotGrid object
    */
  var pivotGridObject: js.UndefOr[js.Any] = js.native
}
object BeforePivotEnginePopulateEventArgs {
  
  @scala.inline
  def apply(): BeforePivotEnginePopulateEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforePivotEnginePopulateEventArgs]
  }
  
  @scala.inline
  implicit class BeforePivotEnginePopulateEventArgsOps[Self <: BeforePivotEnginePopulateEventArgs] (val x: Self) extends AnyVal {
    
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
    def setPivotGridObject(value: js.Any): Self = this.set("pivotGridObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotGridObject: Self = this.set("pivotGridObject", js.undefined)
  }
}

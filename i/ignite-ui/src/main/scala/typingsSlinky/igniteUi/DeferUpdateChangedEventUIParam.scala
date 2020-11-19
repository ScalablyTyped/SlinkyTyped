package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeferUpdateChangedEventUIParam extends js.Object {
  
  /**
    * Gets the defer update value.
    */
  var deferUpdate: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets a reference to the data selector.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object DeferUpdateChangedEventUIParam {
  
  @scala.inline
  def apply(): DeferUpdateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeferUpdateChangedEventUIParam]
  }
  
  @scala.inline
  implicit class DeferUpdateChangedEventUIParamOps[Self <: DeferUpdateChangedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setDeferUpdate(value: Boolean): Self = this.set("deferUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferUpdate: Self = this.set("deferUpdate", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}

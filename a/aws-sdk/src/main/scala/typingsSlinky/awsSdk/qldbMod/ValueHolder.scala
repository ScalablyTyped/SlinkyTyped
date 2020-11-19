package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueHolder extends js.Object {
  
  /**
    * An Amazon Ion plaintext value contained in a ValueHolder structure.
    */
  var IonText: js.UndefOr[typingsSlinky.awsSdk.qldbMod.IonText] = js.native
}
object ValueHolder {
  
  @scala.inline
  def apply(): ValueHolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueHolder]
  }
  
  @scala.inline
  implicit class ValueHolderOps[Self <: ValueHolder] (val x: Self) extends AnyVal {
    
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
    def setIonText(value: IonText): Self = this.set("IonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIonText: Self = this.set("IonText", js.undefined)
  }
}

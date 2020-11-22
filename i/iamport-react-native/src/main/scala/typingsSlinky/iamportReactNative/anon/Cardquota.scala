package typingsSlinky.iamportReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cardquota extends js.Object {
  
  var card_quota: js.UndefOr[Double] = js.native
}
object Cardquota {
  
  @scala.inline
  def apply(): Cardquota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cardquota]
  }
  
  @scala.inline
  implicit class CardquotaOps[Self <: Cardquota] (val x: Self) extends AnyVal {
    
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
    def setCard_quota(value: Double): Self = this.set("card_quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCard_quota: Self = this.set("card_quota", js.undefined)
  }
}

package typingsSlinky.intlRelativeformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Now extends js.Object {
  
  var now: js.UndefOr[js.Date | Double | Null] = js.native
}
object Now {
  
  @scala.inline
  def apply(): Now = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Now]
  }
  
  @scala.inline
  implicit class NowOps[Self <: Now] (val x: Self) extends AnyVal {
    
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
    def setNowDate(value: js.Date): Self = this.set("now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNow(value: js.Date | Double): Self = this.set("now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNow: Self = this.set("now", js.undefined)
    
    @scala.inline
    def setNowNull: Self = this.set("now", null)
  }
}

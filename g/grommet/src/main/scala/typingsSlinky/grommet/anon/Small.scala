package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Small extends js.Object {
  
  var large: js.UndefOr[BorderPad] = js.native
  
  var medium: js.UndefOr[BorderPad] = js.native
  
  var small: js.UndefOr[BorderPad] = js.native
}
object Small {
  
  @scala.inline
  def apply(): Small = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Small]
  }
  
  @scala.inline
  implicit class SmallOps[Self <: Small] (val x: Self) extends AnyVal {
    
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
    def setLarge(value: BorderPad): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setMedium(value: BorderPad): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    
    @scala.inline
    def setSmall(value: BorderPad): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
  }
}

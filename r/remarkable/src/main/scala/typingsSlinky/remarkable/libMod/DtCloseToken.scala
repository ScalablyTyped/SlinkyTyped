package typingsSlinky.remarkable.libMod

import typingsSlinky.remarkable.remarkableStrings.dt_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.remarkable.libMod._Token because Already inherited */ @js.native
trait DtCloseToken extends TagToken {
  
  @JSName("type")
  var type_DtCloseToken: dt_close = js.native
}
object DtCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: dt_close): DtCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtCloseToken]
  }
  
  @scala.inline
  implicit class DtCloseTokenOps[Self <: DtCloseToken] (val x: Self) extends AnyVal {
    
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
    def setType(value: dt_close): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

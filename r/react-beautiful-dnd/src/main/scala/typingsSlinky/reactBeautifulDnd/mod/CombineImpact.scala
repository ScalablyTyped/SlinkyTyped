package typingsSlinky.reactBeautifulDnd.mod

import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.COMBINE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombineImpact extends ImpactLocation {
  
  var combine: Combine = js.native
  
  var `type`: COMBINE = js.native
}
object CombineImpact {
  
  @scala.inline
  def apply(combine: Combine, `type`: COMBINE): CombineImpact = {
    val __obj = js.Dynamic.literal(combine = combine.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombineImpact]
  }
  
  @scala.inline
  implicit class CombineImpactOps[Self <: CombineImpact] (val x: Self) extends AnyVal {
    
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
    def setCombine(value: Combine): Self = this.set("combine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: COMBINE): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.knockoutPunches

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutStatic extends js.Object {
  
  var filters: KnockoutPunchesFilters = js.native
  
  var punches: KnockoutPunchesStatic = js.native
}
object KnockoutStatic {
  
  @scala.inline
  def apply(filters: KnockoutPunchesFilters, punches: KnockoutPunchesStatic): KnockoutStatic = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], punches = punches.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  @scala.inline
  implicit class KnockoutStaticOps[Self <: KnockoutStatic] (val x: Self) extends AnyVal {
    
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
    def setFilters(value: KnockoutPunchesFilters): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPunches(value: KnockoutPunchesStatic): Self = this.set("punches", value.asInstanceOf[js.Any])
  }
}

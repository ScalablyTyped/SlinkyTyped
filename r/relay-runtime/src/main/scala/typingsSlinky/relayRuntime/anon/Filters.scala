package typingsSlinky.relayRuntime.anon

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filters extends js.Object {
  
  var filters: js.UndefOr[Variables] = js.native
  
  var key: String = js.native
  
  var rangeBehavior: String = js.native
}
object Filters {
  
  @scala.inline
  def apply(key: String, rangeBehavior: String): Filters = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], rangeBehavior = rangeBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
  
  @scala.inline
  implicit class FiltersOps[Self <: Filters] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeBehavior(value: String): Self = this.set("rangeBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: Variables): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
}

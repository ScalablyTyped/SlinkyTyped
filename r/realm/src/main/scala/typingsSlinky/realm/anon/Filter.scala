package typingsSlinky.realm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
  /** A filter document */
  var filter: typingsSlinky.realm.Realm.Services.MongoDB.Filter = js.native
}
object Filter {
  
  @scala.inline
  def apply(filter: typingsSlinky.realm.Realm.Services.MongoDB.Filter): Filter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: typingsSlinky.realm.Realm.Services.MongoDB.Filter): Self = this.set("filter", value.asInstanceOf[js.Any])
  }
}

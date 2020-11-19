package typingsSlinky.koaRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUrlOptionsQuery extends js.Object {
  
  var query: js.Object | String = js.native
}
object IUrlOptionsQuery {
  
  @scala.inline
  def apply(query: js.Object | String): IUrlOptionsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUrlOptionsQuery]
  }
  
  @scala.inline
  implicit class IUrlOptionsQueryOps[Self <: IUrlOptionsQuery] (val x: Self) extends AnyVal {
    
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
    def setQuery(value: js.Object | String): Self = this.set("query", value.asInstanceOf[js.Any])
  }
}

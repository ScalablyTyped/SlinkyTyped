package typingsSlinky.googleapis.betaMod.computeBeta

import typingsSlinky.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRoutersScopedList extends js.Object {
  
  /**
    * A list of routers contained in this scope.
    */
  var routers: js.UndefOr[js.Array[SchemaRouter]] = js.native
  
  /**
    * Informational warning which replaces the list of routers when the list is
    * empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaRoutersScopedList {
  
  @scala.inline
  def apply(): SchemaRoutersScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoutersScopedList]
  }
  
  @scala.inline
  implicit class SchemaRoutersScopedListOps[Self <: SchemaRoutersScopedList] (val x: Self) extends AnyVal {
    
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
    def setRoutersVarargs(value: SchemaRouter*): Self = this.set("routers", js.Array(value :_*))
    
    @scala.inline
    def setRouters(value: js.Array[SchemaRouter]): Self = this.set("routers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouters: Self = this.set("routers", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}

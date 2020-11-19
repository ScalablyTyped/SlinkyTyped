package typingsSlinky.jqueryElang

import typingsSlinky.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IELangEditEvents extends js.Object {
  
  var insert: JQueryDeferred[_] = js.native
  
  var modify: JQueryDeferred[_] = js.native
  
  var remove: JQueryDeferred[_] = js.native
  
  var select: JQueryDeferred[_] = js.native
}
object IELangEditEvents {
  
  @scala.inline
  def apply(
    insert: JQueryDeferred[_],
    modify: JQueryDeferred[_],
    remove: JQueryDeferred[_],
    select: JQueryDeferred[_]
  ): IELangEditEvents = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], modify = modify.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangEditEvents]
  }
  
  @scala.inline
  implicit class IELangEditEventsOps[Self <: IELangEditEvents] (val x: Self) extends AnyVal {
    
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
    def setInsert(value: JQueryDeferred[_]): Self = this.set("insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModify(value: JQueryDeferred[_]): Self = this.set("modify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: JQueryDeferred[_]): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: JQueryDeferred[_]): Self = this.set("select", value.asInstanceOf[js.Any])
  }
}

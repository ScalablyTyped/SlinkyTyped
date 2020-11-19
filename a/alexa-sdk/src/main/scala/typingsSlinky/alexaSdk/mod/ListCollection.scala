package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCollection extends js.Object {
  
  var lists: js.Array[ListObject] = js.native
}
object ListCollection {
  
  @scala.inline
  def apply(lists: js.Array[ListObject]): ListCollection = {
    val __obj = js.Dynamic.literal(lists = lists.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCollection]
  }
  
  @scala.inline
  implicit class ListCollectionOps[Self <: ListCollection] (val x: Self) extends AnyVal {
    
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
    def setListsVarargs(value: ListObject*): Self = this.set("lists", js.Array(value :_*))
    
    @scala.inline
    def setLists(value: js.Array[ListObject]): Self = this.set("lists", value.asInstanceOf[js.Any])
  }
}

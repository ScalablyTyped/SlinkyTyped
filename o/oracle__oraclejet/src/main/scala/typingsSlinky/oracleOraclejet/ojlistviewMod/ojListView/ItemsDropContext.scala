package typingsSlinky.oracleOraclejet.ojlistviewMod.ojListView

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.after
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.before
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.inside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ItemsDropContext extends js.Object {
  
  var item: Element = js.native
  
  var position: before | after | inside = js.native
  
  var reorder: Boolean = js.native
}
object ItemsDropContext {
  
  @scala.inline
  def apply(item: Element, position: before | after | inside, reorder: Boolean): ItemsDropContext = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsDropContext]
  }
  
  @scala.inline
  implicit class ItemsDropContextOps[Self <: ItemsDropContext] (val x: Self) extends AnyVal {
    
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
    def setItem(value: Element): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: before | after | inside): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReorder(value: Boolean): Self = this.set("reorder", value.asInstanceOf[js.Any])
  }
}

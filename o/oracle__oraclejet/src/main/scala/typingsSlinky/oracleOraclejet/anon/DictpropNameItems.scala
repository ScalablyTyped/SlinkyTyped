package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropNameItems
  extends /* key */ StringDictionary[js.Any] {
  
  var items: js.Array[org.scalajs.dom.raw.Element] = js.native
}
object DictpropNameItems {
  
  @scala.inline
  def apply(items: js.Array[org.scalajs.dom.raw.Element]): DictpropNameItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameItems]
  }
  
  @scala.inline
  implicit class DictpropNameItemsOps[Self <: DictpropNameItems] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: org.scalajs.dom.raw.Element*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[org.scalajs.dom.raw.Element]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
}

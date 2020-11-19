package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromItem
  extends /* key */ StringDictionary[js.Any] {
  
  var fromItem: org.scalajs.dom.raw.Element = js.native
  
  var fromKey: js.Any = js.native
  
  var toItem: org.scalajs.dom.raw.Element = js.native
  
  var toKey: js.Any = js.native
}
object FromItem {
  
  @scala.inline
  def apply(
    fromItem: org.scalajs.dom.raw.Element,
    fromKey: js.Any,
    toItem: org.scalajs.dom.raw.Element,
    toKey: js.Any
  ): FromItem = {
    val __obj = js.Dynamic.literal(fromItem = fromItem.asInstanceOf[js.Any], fromKey = fromKey.asInstanceOf[js.Any], toItem = toItem.asInstanceOf[js.Any], toKey = toKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromItem]
  }
  
  @scala.inline
  implicit class FromItemOps[Self <: FromItem] (val x: Self) extends AnyVal {
    
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
    def setFromItem(value: org.scalajs.dom.raw.Element): Self = this.set("fromItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromKey(value: js.Any): Self = this.set("fromKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToItem(value: org.scalajs.dom.raw.Element): Self = this.set("toItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToKey(value: js.Any): Self = this.set("toKey", value.asInstanceOf[js.Any])
  }
}

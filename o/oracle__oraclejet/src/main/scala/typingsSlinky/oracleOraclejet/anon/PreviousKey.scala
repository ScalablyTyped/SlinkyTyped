package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviousKey
  extends /* key */ StringDictionary[js.Any] {
  
  var item: org.scalajs.dom.raw.Element = js.native
  
  var key: js.Any = js.native
  
  var previousItem: org.scalajs.dom.raw.Element = js.native
  
  var previousKey: js.Any = js.native
}
object PreviousKey {
  
  @scala.inline
  def apply(
    item: org.scalajs.dom.raw.Element,
    key: js.Any,
    previousItem: org.scalajs.dom.raw.Element,
    previousKey: js.Any
  ): PreviousKey = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], previousItem = previousItem.asInstanceOf[js.Any], previousKey = previousKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousKey]
  }
  
  @scala.inline
  implicit class PreviousKeyOps[Self <: PreviousKey] (val x: Self) extends AnyVal {
    
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
    def setItem(value: org.scalajs.dom.raw.Element): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousItem(value: org.scalajs.dom.raw.Element): Self = this.set("previousItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousKey(value: js.Any): Self = this.set("previousKey", value.asInstanceOf[js.Any])
  }
}

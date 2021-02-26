package typingsSlinky.antvComponent.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItem
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * 唯一值，用于动画或者查找
    * @type {string}
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 图形标记
    * @type {object|string}
    */
  var marker: js.UndefOr[js.Object | String] = js.native
  
  /**
    * 名称
    * @type {string}
    */
  var name: String = js.native
  
  /**
    * 值
    * @type {any}
    */
  var value: js.Any = js.native
}
object ListItem {
  
  @scala.inline
  def apply(name: String, value: js.Any): ListItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItem]
  }
  
  @scala.inline
  implicit class ListItemMutableBuilder[Self <: ListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMarker(value: js.Object | String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.XmlMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapUrl extends StObject {
  
  var Cancel: Boolean = js.native
  
  val IsRefresh: Boolean = js.native
  
  val Map: XmlMap = js.native
  
  val Url: String = js.native
}
object MapUrl {
  
  @scala.inline
  def apply(Cancel: Boolean, IsRefresh: Boolean, Map: XmlMap, Url: String): MapUrl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], IsRefresh = IsRefresh.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapUrl]
  }
  
  @scala.inline
  implicit class MapUrlMutableBuilder[Self <: MapUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRefresh(value: Boolean): Self = StObject.set(x, "IsRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: XmlMap): Self = StObject.set(x, "Map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}

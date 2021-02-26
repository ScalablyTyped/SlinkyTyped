package typingsSlinky.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapId extends StObject {
  
  var mapId: String = js.native
  
  var tilesetName: js.UndefOr[String] = js.native
  
  var url: String = js.native
}
object MapId {
  
  @scala.inline
  def apply(mapId: String, url: String): MapId = {
    val __obj = js.Dynamic.literal(mapId = mapId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapId]
  }
  
  @scala.inline
  implicit class MapIdMutableBuilder[Self <: MapId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapId(value: String): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilesetName(value: String): Self = StObject.set(x, "tilesetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilesetNameUndefined: Self = StObject.set(x, "tilesetName", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

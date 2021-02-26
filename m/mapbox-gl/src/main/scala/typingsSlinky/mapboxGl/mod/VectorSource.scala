package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.tms
import typingsSlinky.mapboxGl.mapboxGlStrings.vector
import typingsSlinky.mapboxGl.mapboxGlStrings.xyz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorSource
  extends Source
     with AnySourceData {
  
  var attribution: js.UndefOr[String] = js.native
  
  var bounds: js.UndefOr[js.Array[Double]] = js.native
  
  var maxzoom: js.UndefOr[Double] = js.native
  
  var minzoom: js.UndefOr[Double] = js.native
  
  var promoteId: js.UndefOr[PromoteIdSpecification] = js.native
  
  var scheme: js.UndefOr[xyz | tms] = js.native
  
  var tiles: js.UndefOr[js.Array[String]] = js.native
  
  @JSName("type")
  var type_VectorSource: vector = js.native
  
  var url: js.UndefOr[String] = js.native
}
object VectorSource {
  
  @scala.inline
  def apply(`type`: vector): VectorSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorSource]
  }
  
  @scala.inline
  implicit class VectorSourceMutableBuilder[Self <: VectorSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
    @scala.inline
    def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    @scala.inline
    def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    @scala.inline
    def setPromoteId(value: PromoteIdSpecification): Self = StObject.set(x, "promoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromoteIdUndefined: Self = StObject.set(x, "promoteId", js.undefined)
    
    @scala.inline
    def setScheme(value: xyz | tms): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    @scala.inline
    def setTiles(value: js.Array[String]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
    
    @scala.inline
    def setTilesVarargs(value: String*): Self = StObject.set(x, "tiles", js.Array(value :_*))
    
    @scala.inline
    def setType(value: vector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

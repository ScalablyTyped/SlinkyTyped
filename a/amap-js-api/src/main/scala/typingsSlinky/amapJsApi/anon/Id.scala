package typingsSlinky.amapJsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id extends StObject {
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var position: js.Tuple2[Double | String, Double | String] = js.native
  
  var rank: js.UndefOr[Double] = js.native
  
  var txt: js.UndefOr[String] = js.native
  
  var zooms: js.Tuple2[Double, Double] = js.native
}
object Id {
  
  @scala.inline
  def apply(
    id: Double,
    name: String,
    position: js.Tuple2[Double | String, Double | String],
    zooms: js.Tuple2[Double, Double]
  ): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], zooms = zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    @scala.inline
    def setTxt(value: String): Self = StObject.set(x, "txt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxtUndefined: Self = StObject.set(x, "txt", js.undefined)
    
    @scala.inline
    def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkinDto extends StObject {
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var num: Double = js.native
}
object SkinDto {
  
  @scala.inline
  def apply(id: Double, name: String, num: Double): SkinDto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkinDto]
  }
  
  @scala.inline
  implicit class SkinDtoMutableBuilder[Self <: SkinDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
  }
}

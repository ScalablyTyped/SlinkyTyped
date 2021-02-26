package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpellVarsDto extends StObject {
  
  var coeff: js.Array[Double] = js.native
  
  var dyn: String = js.native
  
  var key: String = js.native
  
  var link: String = js.native
  
  var ranksWith: String = js.native
}
object SpellVarsDto {
  
  @scala.inline
  def apply(coeff: js.Array[Double], dyn: String, key: String, link: String, ranksWith: String): SpellVarsDto = {
    val __obj = js.Dynamic.literal(coeff = coeff.asInstanceOf[js.Any], dyn = dyn.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], ranksWith = ranksWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpellVarsDto]
  }
  
  @scala.inline
  implicit class SpellVarsDtoMutableBuilder[Self <: SpellVarsDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoeff(value: js.Array[Double]): Self = StObject.set(x, "coeff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoeffVarargs(value: Double*): Self = StObject.set(x, "coeff", js.Array(value :_*))
    
    @scala.inline
    def setDyn(value: String): Self = StObject.set(x, "dyn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanksWith(value: String): Self = StObject.set(x, "ranksWith", value.asInstanceOf[js.Any])
  }
}

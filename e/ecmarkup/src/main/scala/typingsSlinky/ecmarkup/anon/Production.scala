package typingsSlinky.ecmarkup.anon

import typingsSlinky.grammarkdown.mod.OneOfList
import typingsSlinky.grammarkdown.mod.RightHandSide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Production extends StObject {
  
  var production: typingsSlinky.grammarkdown.mod.Production = js.native
  
  var rhses: js.Array[RightHandSide | OneOfList] = js.native
}
object Production {
  
  @scala.inline
  def apply(production: typingsSlinky.grammarkdown.mod.Production, rhses: js.Array[RightHandSide | OneOfList]): Production = {
    val __obj = js.Dynamic.literal(production = production.asInstanceOf[js.Any], rhses = rhses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Production]
  }
  
  @scala.inline
  implicit class ProductionMutableBuilder[Self <: Production] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProduction(value: typingsSlinky.grammarkdown.mod.Production): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRhses(value: js.Array[RightHandSide | OneOfList]): Self = StObject.set(x, "rhses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRhsesVarargs(value: (RightHandSide | OneOfList)*): Self = StObject.set(x, "rhses", js.Array(value :_*))
  }
}

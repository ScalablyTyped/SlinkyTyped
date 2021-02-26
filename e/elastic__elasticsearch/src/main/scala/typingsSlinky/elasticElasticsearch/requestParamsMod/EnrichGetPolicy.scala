package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnrichGetPolicy extends Generic {
  
  var name: js.UndefOr[String | js.Array[String]] = js.native
}
object EnrichGetPolicy {
  
  @scala.inline
  def apply(): EnrichGetPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrichGetPolicy]
  }
  
  @scala.inline
  implicit class EnrichGetPolicyMutableBuilder[Self <: EnrichGetPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}

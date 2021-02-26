package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetClonesResponseData extends StObject {
  
  var clones: js.Array[Count] = js.native
  
  var count: Double = js.native
  
  var uniques: Double = js.native
}
object ReposGetClonesResponseData {
  
  @scala.inline
  def apply(clones: js.Array[Count], count: Double, uniques: Double): ReposGetClonesResponseData = {
    val __obj = js.Dynamic.literal(clones = clones.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetClonesResponseData]
  }
  
  @scala.inline
  implicit class ReposGetClonesResponseDataMutableBuilder[Self <: ReposGetClonesResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClones(value: js.Array[Count]): Self = StObject.set(x, "clones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClonesVarargs(value: Count*): Self = StObject.set(x, "clones", js.Array(value :_*))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniques(value: Double): Self = StObject.set(x, "uniques", value.asInstanceOf[js.Any])
  }
}

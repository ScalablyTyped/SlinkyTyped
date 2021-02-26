package typingsSlinky.psi.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Experience extends StObject {
  
  var id: String = js.native
  
  var initial_url: String = js.native
  
  var metrics: StringDictionary[typingsSlinky.psi.anon.Category] = js.native
  
  var overall_category: String = js.native
}
object Experience {
  
  @scala.inline
  def apply(
    id: String,
    initial_url: String,
    metrics: StringDictionary[typingsSlinky.psi.anon.Category],
    overall_category: String
  ): Experience = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], initial_url = initial_url.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], overall_category = overall_category.asInstanceOf[js.Any])
    __obj.asInstanceOf[Experience]
  }
  
  @scala.inline
  implicit class ExperienceMutableBuilder[Self <: Experience] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitial_url(value: String): Self = StObject.set(x, "initial_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: StringDictionary[typingsSlinky.psi.anon.Category]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverall_category(value: String): Self = StObject.set(x, "overall_category", value.asInstanceOf[js.Any])
  }
}

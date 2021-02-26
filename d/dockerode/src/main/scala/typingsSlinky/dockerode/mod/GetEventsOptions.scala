package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEventsOptions extends StObject {
  
  var filters: js.UndefOr[String | typingsSlinky.dockerode.anon.Container] = js.native
  
  var since: js.UndefOr[Double] = js.native
  
  var until: js.UndefOr[Double] = js.native
}
object GetEventsOptions {
  
  @scala.inline
  def apply(): GetEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventsOptions]
  }
  
  @scala.inline
  implicit class GetEventsOptionsMutableBuilder[Self <: GetEventsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: String | typingsSlinky.dockerode.anon.Container): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    @scala.inline
    def setUntil(value: Double): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
  }
}

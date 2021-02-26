package typingsSlinky.fhirKitClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsSearchParams extends StObject {
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var searchParams: typingsSlinky.fhirKitClient.mod.SearchParams = js.native
}
object OptionsSearchParams {
  
  @scala.inline
  def apply(searchParams: typingsSlinky.fhirKitClient.mod.SearchParams): OptionsSearchParams = {
    val __obj = js.Dynamic.literal(searchParams = searchParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsSearchParams]
  }
  
  @scala.inline
  implicit class OptionsSearchParamsMutableBuilder[Self <: OptionsSearchParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setSearchParams(value: typingsSlinky.fhirKitClient.mod.SearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
  }
}

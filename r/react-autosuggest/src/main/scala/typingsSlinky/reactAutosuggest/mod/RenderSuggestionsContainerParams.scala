package typingsSlinky.reactAutosuggest.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactAutosuggest.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderSuggestionsContainerParams extends StObject {
  
  var children: ReactElement = js.native
  
  var containerProps: ClassName = js.native
  
  var query: String = js.native
}
object RenderSuggestionsContainerParams {
  
  @scala.inline
  def apply(containerProps: ClassName, query: String): RenderSuggestionsContainerParams = {
    val __obj = js.Dynamic.literal(containerProps = containerProps.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderSuggestionsContainerParams]
  }
  
  @scala.inline
  implicit class RenderSuggestionsContainerParamsMutableBuilder[Self <: RenderSuggestionsContainerParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setContainerProps(value: ClassName): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}

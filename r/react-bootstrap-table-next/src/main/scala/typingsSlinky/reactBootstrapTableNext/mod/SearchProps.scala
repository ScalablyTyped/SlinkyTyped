package typingsSlinky.reactBootstrapTableNext.mod

import typingsSlinky.reactBootstrapTableNext.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchProps[T] extends StObject {
  
  var defaultSearch: js.UndefOr[String] = js.native
  
  /* custom search method, return true if matched and false if not */
  var onColumnMatch: js.UndefOr[js.Function1[/* searchProps */ Column[T], Boolean]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var searchText: js.UndefOr[String] = js.native
}
object SearchProps {
  
  @scala.inline
  def apply[T](): SearchProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProps[T]]
  }
  
  @scala.inline
  implicit class SearchPropsMutableBuilder[Self <: SearchProps[_], T] (val x: Self with SearchProps[T]) extends AnyVal {
    
    @scala.inline
    def setDefaultSearch(value: String): Self = StObject.set(x, "defaultSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSearchUndefined: Self = StObject.set(x, "defaultSearch", js.undefined)
    
    @scala.inline
    def setOnColumnMatch(value: /* searchProps */ Column[T] => Boolean): Self = StObject.set(x, "onColumnMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnColumnMatchUndefined: Self = StObject.set(x, "onColumnMatch", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
  }
}

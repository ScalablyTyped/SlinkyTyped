package typingsSlinky.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object or callback function called when performing a search or autocomplete
  * request.
  */
@js.native
trait SearchDelegate extends StObject {
  
  /**
    * When an autocomplete request successfully completes, this method returns
    * a data array that is the same as the one passed to the autocomplete
    * callback function.
    */
  var autocompleteDidComplete: js.UndefOr[js.Function1[/* data */ SearchAutocompleteResponse, Unit]] = js.native
  
  /**
    * Invoked when an autocomplete request fails.
    */
  var autocompleteDidError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  
  /**
    * Upon successful completion of a search request, this method returns a data
    * object that is the same as the one passed to the search callback function.
    */
  var searchDidComplete: js.UndefOr[js.Function1[/* data */ SearchResponse, Unit]] = js.native
  
  /**
    * Called when the search request fails.
    */
  var searchDidError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
}
object SearchDelegate {
  
  @scala.inline
  def apply(): SearchDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDelegate]
  }
  
  @scala.inline
  implicit class SearchDelegateMutableBuilder[Self <: SearchDelegate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocompleteDidComplete(value: /* data */ SearchAutocompleteResponse => Unit): Self = StObject.set(x, "autocompleteDidComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutocompleteDidCompleteUndefined: Self = StObject.set(x, "autocompleteDidComplete", js.undefined)
    
    @scala.inline
    def setAutocompleteDidError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "autocompleteDidError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutocompleteDidErrorUndefined: Self = StObject.set(x, "autocompleteDidError", js.undefined)
    
    @scala.inline
    def setSearchDidComplete(value: /* data */ SearchResponse => Unit): Self = StObject.set(x, "searchDidComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchDidCompleteUndefined: Self = StObject.set(x, "searchDidComplete", js.undefined)
    
    @scala.inline
    def setSearchDidError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "searchDidError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchDidErrorUndefined: Self = StObject.set(x, "searchDidError", js.undefined)
  }
}

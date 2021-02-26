package typingsSlinky.jsWorkerSearch

import typingsSlinky.jsWorkerSearch.anon.CaseSensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-worker-search", JSImport.Default)
  @js.native
  class default () extends SearchApi {
    def this(someParam: CaseSensitive) = this()
  }
  
  @js.native
  sealed trait INDEX_MODES extends StObject
  @JSImport("js-worker-search", "INDEX_MODES")
  @js.native
  object INDEX_MODES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[INDEX_MODES with String] = js.native
    
    @js.native
    sealed trait ALL_SUBSTRINGS extends INDEX_MODES
    /* "ALL_SUBSTRINGS" */ val ALL_SUBSTRINGS: typingsSlinky.jsWorkerSearch.mod.INDEX_MODES.ALL_SUBSTRINGS with String = js.native
    
    @js.native
    sealed trait EXACT_WORDS extends INDEX_MODES
    /* "EXACT_WORDS" */ val EXACT_WORDS: typingsSlinky.jsWorkerSearch.mod.INDEX_MODES.EXACT_WORDS with String = js.native
    
    @js.native
    sealed trait PREFIXES extends INDEX_MODES
    /* "PREFIXES" */ val PREFIXES: typingsSlinky.jsWorkerSearch.mod.INDEX_MODES.PREFIXES with String = js.native
  }
  
  @js.native
  trait SearchApi extends StObject {
    
    def indexDocument(uid: String, text: String): Unit = js.native
    
    def search(query: String): js.Promise[js.Array[String]] = js.native
  }
  object SearchApi {
    
    @scala.inline
    def apply(indexDocument: (String, String) => Unit, search: String => js.Promise[js.Array[String]]): SearchApi = {
      val __obj = js.Dynamic.literal(indexDocument = js.Any.fromFunction2(indexDocument), search = js.Any.fromFunction1(search))
      __obj.asInstanceOf[SearchApi]
    }
    
    @scala.inline
    implicit class SearchApiMutableBuilder[Self <: SearchApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexDocument(value: (String, String) => Unit): Self = StObject.set(x, "indexDocument", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSearch(value: String => js.Promise[js.Array[String]]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
    }
  }
}

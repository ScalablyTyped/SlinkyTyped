package typingsSlinky.frecency

import typingsSlinky.frecency.mod.idAttrFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ExactQueryMatchWeight extends StObject {
    
    var exactQueryMatchWeight: js.UndefOr[Double] = js.native
    
    var idAttribute: js.UndefOr[String | idAttrFn] = js.native
    
    var key: String = js.native
    
    var recentSelectionsLimit: js.UndefOr[Double] = js.native
    
    var recentSelectionsMatchWeight: js.UndefOr[Double] = js.native
    
    var storageProvider: js.UndefOr[js.Object] = js.native
    
    var subQueryMatchWeight: js.UndefOr[Double] = js.native
    
    var timeStampsLimit: js.UndefOr[Double] = js.native
  }
  object ExactQueryMatchWeight {
    
    @scala.inline
    def apply(key: String): ExactQueryMatchWeight = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExactQueryMatchWeight]
    }
    
    @scala.inline
    implicit class ExactQueryMatchWeightMutableBuilder[Self <: ExactQueryMatchWeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExactQueryMatchWeight(value: Double): Self = StObject.set(x, "exactQueryMatchWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactQueryMatchWeightUndefined: Self = StObject.set(x, "exactQueryMatchWeight", js.undefined)
      
      @scala.inline
      def setIdAttribute(value: String | idAttrFn): Self = StObject.set(x, "idAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdAttributeFunction1(value: /* result */ String => String): Self = StObject.set(x, "idAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIdAttributeUndefined: Self = StObject.set(x, "idAttribute", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecentSelectionsLimit(value: Double): Self = StObject.set(x, "recentSelectionsLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecentSelectionsLimitUndefined: Self = StObject.set(x, "recentSelectionsLimit", js.undefined)
      
      @scala.inline
      def setRecentSelectionsMatchWeight(value: Double): Self = StObject.set(x, "recentSelectionsMatchWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecentSelectionsMatchWeightUndefined: Self = StObject.set(x, "recentSelectionsMatchWeight", js.undefined)
      
      @scala.inline
      def setStorageProvider(value: js.Object): Self = StObject.set(x, "storageProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageProviderUndefined: Self = StObject.set(x, "storageProvider", js.undefined)
      
      @scala.inline
      def setSubQueryMatchWeight(value: Double): Self = StObject.set(x, "subQueryMatchWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubQueryMatchWeightUndefined: Self = StObject.set(x, "subQueryMatchWeight", js.undefined)
      
      @scala.inline
      def setTimeStampsLimit(value: Double): Self = StObject.set(x, "timeStampsLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStampsLimitUndefined: Self = StObject.set(x, "timeStampsLimit", js.undefined)
    }
  }
  
  @js.native
  trait FrecencyScore extends StObject {
    
    var _frecencyScore: js.UndefOr[Double] = js.native
  }
  object FrecencyScore {
    
    @scala.inline
    def apply(): FrecencyScore = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrecencyScore]
    }
    
    @scala.inline
    implicit class FrecencyScoreMutableBuilder[Self <: FrecencyScore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_frecencyScore(value: Double): Self = StObject.set(x, "_frecencyScore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_frecencyScoreUndefined: Self = StObject.set(x, "_frecencyScore", js.undefined)
    }
  }
  
  @js.native
  trait KeepScores[T] extends StObject {
    
    var keepScores: js.UndefOr[Boolean] = js.native
    
    var searchQuery: T = js.native
    
    var searchResults: js.Array[T] = js.native
  }
  object KeepScores {
    
    @scala.inline
    def apply[T](searchQuery: T, searchResults: js.Array[T]): KeepScores[T] = {
      val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], searchResults = searchResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeepScores[T]]
    }
    
    @scala.inline
    implicit class KeepScoresMutableBuilder[Self <: KeepScores[_], T] (val x: Self with KeepScores[T]) extends AnyVal {
      
      @scala.inline
      def setKeepScores(value: Boolean): Self = StObject.set(x, "keepScores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepScoresUndefined: Self = StObject.set(x, "keepScores", js.undefined)
      
      @scala.inline
      def setSearchQuery(value: T): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchResults(value: js.Array[T]): Self = StObject.set(x, "searchResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchResultsVarargs(value: T*): Self = StObject.set(x, "searchResults", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SearchQuery[T] extends StObject {
    
    var searchQuery: T = js.native
    
    var selectedId: String = js.native
  }
  object SearchQuery {
    
    @scala.inline
    def apply[T](searchQuery: T, selectedId: String): SearchQuery[T] = {
      val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], selectedId = selectedId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchQuery[T]]
    }
    
    @scala.inline
    implicit class SearchQueryMutableBuilder[Self <: SearchQuery[_], T] (val x: Self with SearchQuery[T]) extends AnyVal {
      
      @scala.inline
      def setSearchQuery(value: T): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedId(value: String): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchResults[T] extends StObject {
    
    var searchQuery: T = js.native
    
    var searchResults: js.Array[T] = js.native
  }
  object SearchResults {
    
    @scala.inline
    def apply[T](searchQuery: T, searchResults: js.Array[T]): SearchResults[T] = {
      val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], searchResults = searchResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResults[T]]
    }
    
    @scala.inline
    implicit class SearchResultsMutableBuilder[Self <: SearchResults[_], T] (val x: Self with SearchResults[T]) extends AnyVal {
      
      @scala.inline
      def setSearchQuery(value: T): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchResults(value: js.Array[T]): Self = StObject.set(x, "searchResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchResultsVarargs(value: T*): Self = StObject.set(x, "searchResults", js.Array(value :_*))
    }
  }
}

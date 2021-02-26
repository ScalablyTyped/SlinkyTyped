package typingsSlinky.chartmogulNode

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @js.native
  trait Cursor extends StObject {
    
    var current_page: js.UndefOr[Double] = js.native
    
    var has_more: js.UndefOr[Boolean] = js.native
    
    var page: js.UndefOr[Double] = js.native
    
    var per_page: js.UndefOr[Double] = js.native
    
    var total_pages: js.UndefOr[Double] = js.native
  }
  object Cursor {
    
    @scala.inline
    def apply(): Cursor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cursor]
    }
    
    @scala.inline
    implicit class CursorMutableBuilder[Self <: Cursor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent_page(value: Double): Self = StObject.set(x, "current_page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrent_pageUndefined: Self = StObject.set(x, "current_page", js.undefined)
      
      @scala.inline
      def setHas_more(value: Boolean): Self = StObject.set(x, "has_more", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_moreUndefined: Self = StObject.set(x, "has_more", js.undefined)
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
      
      @scala.inline
      def setTotal_pages(value: Double): Self = StObject.set(x, "total_pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_pagesUndefined: Self = StObject.set(x, "total_pages", js.undefined)
    }
  }
  
  @js.native
  trait CursorParams extends StObject {
    
    var page: js.UndefOr[Double] = js.native
    
    var per_page: js.UndefOr[Double] = js.native
  }
  object CursorParams {
    
    @scala.inline
    def apply(): CursorParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CursorParams]
    }
    
    @scala.inline
    implicit class CursorParamsMutableBuilder[Self <: CursorParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    }
  }
  
  @js.native
  trait Entries[T] extends Cursor {
    
    var entries: js.Array[T] = js.native
  }
  object Entries {
    
    @scala.inline
    def apply[T](entries: js.Array[T]): Entries[T] = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entries[T]]
    }
    
    @scala.inline
    implicit class EntriesMutableBuilder[Self <: Entries[_], T] (val x: Self with Entries[T]) extends AnyVal {
      
      @scala.inline
      def setEntries(value: js.Array[T]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesVarargs(value: T*): Self = StObject.set(x, "entries", js.Array(value :_*))
    }
  }
  
  @js.native
  trait EntriesSummary[T] extends StObject {
    
    var entries: js.Array[T] = js.native
    
    var summary: Summary = js.native
  }
  object EntriesSummary {
    
    @scala.inline
    def apply[T](entries: js.Array[T], summary: Summary): EntriesSummary[T] = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntriesSummary[T]]
    }
    
    @scala.inline
    implicit class EntriesSummaryMutableBuilder[Self <: EntriesSummary[_], T] (val x: Self with EntriesSummary[T]) extends AnyVal {
      
      @scala.inline
      def setEntries(value: js.Array[T]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesVarargs(value: T*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      @scala.inline
      def setSummary(value: Summary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
  
  type Map = StringDictionary[js.Any]
  
  type Strings = js.Array[String]
  
  @js.native
  trait Summary extends StObject {
    
    var current: Double = js.native
    
    var `percentage-change`: Double = js.native
    
    var previous: Double = js.native
  }
  object Summary {
    
    @scala.inline
    def apply(current: Double, `percentage-change`: Double, previous: Double): Summary = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
      __obj.updateDynamic("percentage-change")(`percentage-change`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Summary]
    }
    
    @scala.inline
    implicit class SummaryMutableBuilder[Self <: Summary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPercentage-change`(value: Double): Self = StObject.set(x, "percentage-change", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevious(value: Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    }
  }
}

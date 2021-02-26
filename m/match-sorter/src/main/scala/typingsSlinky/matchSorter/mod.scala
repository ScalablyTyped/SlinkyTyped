package typingsSlinky.matchSorter

import typingsSlinky.matchSorter.anon.Key
import typingsSlinky.matchSorter.anon.MaxRanking
import typingsSlinky.matchSorter.anon.MinRanking
import typingsSlinky.matchSorter.anon.Threshold
import typingsSlinky.matchSorter.matchSorterNumbers.`0`
import typingsSlinky.matchSorter.matchSorterNumbers.`1`
import typingsSlinky.matchSorter.matchSorterNumbers.`2`
import typingsSlinky.matchSorter.matchSorterNumbers.`3`
import typingsSlinky.matchSorter.matchSorterNumbers.`4`
import typingsSlinky.matchSorter.matchSorterNumbers.`5`
import typingsSlinky.matchSorter.matchSorterNumbers.`6`
import typingsSlinky.matchSorter.matchSorterNumbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object matchSorter {
    
    /**
      * Takes an array of items and a value and returns a new array with the items that match the given value
      * @param items - the items to sort
      * @param value - the value to use for ranking
      * @param options - Some options to configure the sorter
      * @return the new sorted array
      */
    @JSImport("match-sorter", "matchSorter")
    @js.native
    def apply[T](items: js.Array[T], value: String): js.Array[T] = js.native
    @JSImport("match-sorter", "matchSorter")
    @js.native
    def apply[T](items: js.Array[T], value: String, options: Options[T]): js.Array[T] = js.native
    
    object rankings {
      
      @JSImport("match-sorter", "matchSorter.rankings.ACRONYM")
      @js.native
      val ACRONYM: `2` = js.native
      
      @JSImport("match-sorter", "matchSorter.rankings.CASE_SENSITIVE_EQUAL")
      @js.native
      val CASE_SENSITIVE_EQUAL: `7` = js.native
      
      @JSImport("match-sorter", "matchSorter.rankings.CONTAINS")
      @js.native
      val CONTAINS: `3` = js.native
      
      @JSImport("match-sorter", "matchSorter.rankings.EQUAL")
      @js.native
      val EQUAL: `6` = js.native
      
      @JSImport("match-sorter", "matchSorter.rankings.MATCHES")
      @js.native
      val MATCHES: `1` = js.native
      
      @JSImport("match-sorter", "matchSorter.rankings.NO_MATCH")
      @js.native
      val NO_MATCH: `0` = js.native
      
      @JSImport("match-sorter", "matchSorter.rankings.STARTS_WITH")
      @js.native
      val STARTS_WITH: `5` = js.native
      
      @JSImport("match-sorter", "matchSorter.rankings.WORD_STARTS_WITH")
      @js.native
      val WORD_STARTS_WITH: `4` = js.native
    }
  }
  
  type ExtendedKeyOptions[T] = Key[T] with (MinRanking | MaxRanking | Threshold)
  
  type KeyOptions[T] = String | (js.Function1[/* item */ T, String | js.Array[String]])
  
  @js.native
  trait Options[T] extends StObject {
    
    var keepDiacritics: js.UndefOr[Boolean] = js.native
    
    var keys: js.UndefOr[js.Array[KeyOptions[T] | ExtendedKeyOptions[T]]] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
      
      @scala.inline
      def setKeepDiacritics(value: Boolean): Self = StObject.set(x, "keepDiacritics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepDiacriticsUndefined: Self = StObject.set(x, "keepDiacritics", js.undefined)
      
      @scala.inline
      def setKeys(value: js.Array[KeyOptions[T] | ExtendedKeyOptions[T]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setKeysVarargs(value: (KeyOptions[T] | ExtendedKeyOptions[T])*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}

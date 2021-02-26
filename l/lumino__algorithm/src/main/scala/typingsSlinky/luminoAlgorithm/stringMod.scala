package typingsSlinky.luminoAlgorithm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  object StringExt {
    
    /**
      * A 3-way string comparison function.
      *
      * @param a - The first string of interest.
      *
      * @param b - The second string of interest.
      *
      * @returns `-1` if `a < b`, else `1` if `a > b`, else `0`.
      */
    @JSImport("@lumino/algorithm/types/string", "StringExt.cmp")
    @js.native
    def cmp(a: String, b: String): Double = js.native
    
    /**
      * Find the indices of characters in a source text.
      *
      * @param source - The source text which should be searched.
      *
      * @param query - The characters to locate in the source text.
      *
      * @param start - The index to start the search.
      *
      * @returns The matched indices, or `null` if there is no match.
      *
      * #### Complexity
      * Linear on `sourceText`.
      *
      * #### Notes
      * In order for there to be a match, all of the characters in `query`
      * **must** appear in `source` in the order given by `query`.
      *
      * Characters are matched using strict `===` equality.
      */
    @JSImport("@lumino/algorithm/types/string", "StringExt.findIndices")
    @js.native
    def findIndices(source: String, query: String): js.Array[Double] | Null = js.native
    @JSImport("@lumino/algorithm/types/string", "StringExt.findIndices")
    @js.native
    def findIndices(source: String, query: String, start: Double): js.Array[Double] | Null = js.native
    
    /**
      * Highlight the matched characters of a source text.
      *
      * @param source - The text which should be highlighted.
      *
      * @param indices - The indices of the matched characters. They must
      *   appear in increasing order and must be in bounds of the source.
      *
      * @param fn - The function to apply to the matched chunks.
      *
      * @returns An array of unmatched and highlighted chunks.
      */
    @JSImport("@lumino/algorithm/types/string", "StringExt.highlight")
    @js.native
    def highlight[T](source: String, indices: js.Array[Double], fn: js.Function1[/* chunk */ String, T]): js.Array[String | T] = js.native
    
    /**
      * A string matcher which uses a sum-of-deltas algorithm.
      *
      * @param source - The source text which should be searched.
      *
      * @param query - The characters to locate in the source text.
      *
      * @param start - The index to start the search.
      *
      * @returns The match result, or `null` if there is no match.
      *   A lower `score` represents a stronger match.
      *
      * #### Complexity
      * Linear on `sourceText`.
      *
      * #### Notes
      * This scoring algorithm uses a sum-of-deltas approach to determine
      * the score. In order for there to be a match, all of the characters
      * in `query` **must** appear in `source` in order. The delta between
      * the indices are summed to create the score. This means that groups
      * of matched characters are preferred, while fragmented matches are
      * penalized.
      */
    @JSImport("@lumino/algorithm/types/string", "StringExt.matchSumOfDeltas")
    @js.native
    def matchSumOfDeltas(source: String, query: String): IMatchResult | Null = js.native
    @JSImport("@lumino/algorithm/types/string", "StringExt.matchSumOfDeltas")
    @js.native
    def matchSumOfDeltas(source: String, query: String, start: Double): IMatchResult | Null = js.native
    
    /**
      * A string matcher which uses a sum-of-squares algorithm.
      *
      * @param source - The source text which should be searched.
      *
      * @param query - The characters to locate in the source text.
      *
      * @param start - The index to start the search.
      *
      * @returns The match result, or `null` if there is no match.
      *   A lower `score` represents a stronger match.
      *
      * #### Complexity
      * Linear on `sourceText`.
      *
      * #### Notes
      * This scoring algorithm uses a sum-of-squares approach to determine
      * the score. In order for there to be a match, all of the characters
      * in `query` **must** appear in `source` in order. The index of each
      * matching character is squared and added to the score. This means
      * that early and consecutive character matches are preferred, while
      * late matches are heavily penalized.
      */
    @JSImport("@lumino/algorithm/types/string", "StringExt.matchSumOfSquares")
    @js.native
    def matchSumOfSquares(source: String, query: String): IMatchResult | Null = js.native
    @JSImport("@lumino/algorithm/types/string", "StringExt.matchSumOfSquares")
    @js.native
    def matchSumOfSquares(source: String, query: String, start: Double): IMatchResult | Null = js.native
    
    /**
      * The result of a string match function.
      */
    @js.native
    trait IMatchResult extends StObject {
      
      /**
        * The indices of the matched characters in the source text.
        *
        * The indices will appear in increasing order.
        */
      var indices: js.Array[Double] = js.native
      
      /**
        * A score which indicates the strength of the match.
        *
        * The documentation of a given match function should specify
        * whether a lower or higher score is a stronger match.
        */
      var score: Double = js.native
    }
    object IMatchResult {
      
      @scala.inline
      def apply(indices: js.Array[Double], score: Double): IMatchResult = {
        val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
        __obj.asInstanceOf[IMatchResult]
      }
      
      @scala.inline
      implicit class IMatchResultMutableBuilder[Self <: IMatchResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value :_*))
        
        @scala.inline
        def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      }
    }
  }
}

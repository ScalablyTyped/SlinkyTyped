package typingsSlinky.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfiniteHitsProvided[THit] extends StObject {
  
  /** indicates if there are more pages to load */
  var hasMore: Boolean = js.native
  
  var hasPrevious: Boolean = js.native
  
  /** the records that matched the search */
  var hits: js.Array[THit] = js.native
  
  def refineNext(args: js.Any*): js.Any = js.native
  
  def refinePrevious(args: js.Any*): js.Any = js.native
}
object InfiniteHitsProvided {
  
  @scala.inline
  def apply[THit](
    hasMore: Boolean,
    hasPrevious: Boolean,
    hits: js.Array[THit],
    refineNext: /* repeated */ js.Any => js.Any,
    refinePrevious: /* repeated */ js.Any => js.Any
  ): InfiniteHitsProvided[THit] = {
    val __obj = js.Dynamic.literal(hasMore = hasMore.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], refineNext = js.Any.fromFunction1(refineNext), refinePrevious = js.Any.fromFunction1(refinePrevious))
    __obj.asInstanceOf[InfiniteHitsProvided[THit]]
  }
  
  @scala.inline
  implicit class InfiniteHitsProvidedMutableBuilder[Self <: InfiniteHitsProvided[_], THit] (val x: Self with InfiniteHitsProvided[THit]) extends AnyVal {
    
    @scala.inline
    def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPrevious(value: Boolean): Self = StObject.set(x, "hasPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHits(value: js.Array[THit]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsVarargs(value: THit*): Self = StObject.set(x, "hits", js.Array(value :_*))
    
    @scala.inline
    def setRefineNext(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "refineNext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefinePrevious(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "refinePrevious", js.Any.fromFunction1(value))
  }
}

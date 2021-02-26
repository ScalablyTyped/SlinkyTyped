package typingsSlinky.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdWordsIterator[E] extends StObject {
  
  def hasNext(): Boolean = js.native
  
  def next(): E = js.native
  
  def totalNumEntities(): Double = js.native
}
object AdWordsIterator {
  
  @scala.inline
  def apply[E](hasNext: () => Boolean, next: () => E, totalNumEntities: () => Double): AdWordsIterator[E] = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next), totalNumEntities = js.Any.fromFunction0(totalNumEntities))
    __obj.asInstanceOf[AdWordsIterator[E]]
  }
  
  @scala.inline
  implicit class AdWordsIteratorMutableBuilder[Self <: AdWordsIterator[_], E] (val x: Self with AdWordsIterator[E]) extends AnyVal {
    
    @scala.inline
    def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: () => E): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTotalNumEntities(value: () => Double): Self = StObject.set(x, "totalNumEntities", js.Any.fromFunction0(value))
  }
}

package typingsSlinky.cassandraDriver.mod

import typingsSlinky.cassandraDriver.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object token {
  
  @js.native
  trait Token extends StObject {
    
    def compare(other: Token): Double = js.native
    
    def equals(other: Token): Boolean = js.native
    
    def getType(): Code = js.native
    
    def getValue(): js.Any = js.native
  }
  object Token {
    
    @scala.inline
    def apply(compare: Token => Double, equals_ : Token => Boolean, getType: () => Code, getValue: () => js.Any): Token = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction1(compare), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompare(value: Token => Double): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEquals_(value: Token => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetType(value: () => Code): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TokenRange extends StObject {
    
    def compare(other: TokenRange): Double = js.native
    
    def contains(token: Token): Boolean = js.native
    
    var end: Token = js.native
    
    def equals(other: TokenRange): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isWrappedAround(): Boolean = js.native
    
    def splitEvenly(numberOfSplits: Double): js.Array[TokenRange] = js.native
    
    var start: Token = js.native
    
    def unwrap(): js.Array[TokenRange] = js.native
  }
  object TokenRange {
    
    @scala.inline
    def apply(
      compare: TokenRange => Double,
      contains: Token => Boolean,
      end: Token,
      equals_ : TokenRange => Boolean,
      isEmpty: () => Boolean,
      isWrappedAround: () => Boolean,
      splitEvenly: Double => js.Array[TokenRange],
      start: Token,
      unwrap: () => js.Array[TokenRange]
    ): TokenRange = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction1(compare), contains = js.Any.fromFunction1(contains), end = end.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), isWrappedAround = js.Any.fromFunction0(isWrappedAround), splitEvenly = js.Any.fromFunction1(splitEvenly), start = start.asInstanceOf[js.Any], unwrap = js.Any.fromFunction0(unwrap))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[TokenRange]
    }
    
    @scala.inline
    implicit class TokenRangeMutableBuilder[Self <: TokenRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompare(value: TokenRange => Double): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContains(value: Token => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnd(value: Token): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquals_(value: TokenRange => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsWrappedAround(value: () => Boolean): Self = StObject.set(x, "isWrappedAround", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSplitEvenly(value: Double => js.Array[TokenRange]): Self = StObject.set(x, "splitEvenly", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStart(value: Token): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnwrap(value: () => js.Array[TokenRange]): Self = StObject.set(x, "unwrap", js.Any.fromFunction0(value))
    }
  }
}

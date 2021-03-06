package typingsSlinky.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenIterator extends StObject {
  
  /**
    * Returns the current tokenized string.
    **/
  def getCurrentToken(): TokenInfo = js.native
  
  /**
    * Returns the current column.
    **/
  def getCurrentTokenColumn(): Double = js.native
  
  /**
    * Returns the current row.
    **/
  def getCurrentTokenRow(): Double = js.native
  
  /**
    * Tokenizes all the items from the current point to the row prior in the document.
    **/
  def stepBackward(): js.Array[String] = js.native
  
  /**
    * Tokenizes all the items from the current point until the next row in the document. If the current point is at the end of the file, this function returns `null`. Otherwise, it returns the tokenized string.
    **/
  def stepForward(): String = js.native
}
object TokenIterator {
  
  @scala.inline
  def apply(
    getCurrentToken: () => TokenInfo,
    getCurrentTokenColumn: () => Double,
    getCurrentTokenRow: () => Double,
    stepBackward: () => js.Array[String],
    stepForward: () => String
  ): TokenIterator = {
    val __obj = js.Dynamic.literal(getCurrentToken = js.Any.fromFunction0(getCurrentToken), getCurrentTokenColumn = js.Any.fromFunction0(getCurrentTokenColumn), getCurrentTokenRow = js.Any.fromFunction0(getCurrentTokenRow), stepBackward = js.Any.fromFunction0(stepBackward), stepForward = js.Any.fromFunction0(stepForward))
    __obj.asInstanceOf[TokenIterator]
  }
  
  @scala.inline
  implicit class TokenIteratorMutableBuilder[Self <: TokenIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCurrentToken(value: () => TokenInfo): Self = StObject.set(x, "getCurrentToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentTokenColumn(value: () => Double): Self = StObject.set(x, "getCurrentTokenColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentTokenRow(value: () => Double): Self = StObject.set(x, "getCurrentTokenRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStepBackward(value: () => js.Array[String]): Self = StObject.set(x, "stepBackward", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStepForward(value: () => String): Self = StObject.set(x, "stepForward", js.Any.fromFunction0(value))
  }
}

package typingsSlinky.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SentimentAnalyzer extends StObject {
  
  def getSentiment(words: js.Array[String]): Double = js.native
}
object SentimentAnalyzer {
  
  @scala.inline
  def apply(getSentiment: js.Array[String] => Double): SentimentAnalyzer = {
    val __obj = js.Dynamic.literal(getSentiment = js.Any.fromFunction1(getSentiment))
    __obj.asInstanceOf[SentimentAnalyzer]
  }
  
  @scala.inline
  implicit class SentimentAnalyzerMutableBuilder[Self <: SentimentAnalyzer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSentiment(value: js.Array[String] => Double): Self = StObject.set(x, "getSentiment", js.Any.fromFunction1(value))
  }
}

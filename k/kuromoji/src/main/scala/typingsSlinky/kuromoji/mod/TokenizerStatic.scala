package typingsSlinky.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenizerStatic extends StObject {
  
  def splitByPunctuation(input: String): js.Array[String] = js.native
}
object TokenizerStatic {
  
  @scala.inline
  def apply(splitByPunctuation: String => js.Array[String]): TokenizerStatic = {
    val __obj = js.Dynamic.literal(splitByPunctuation = js.Any.fromFunction1(splitByPunctuation))
    __obj.asInstanceOf[TokenizerStatic]
  }
  
  @scala.inline
  implicit class TokenizerStaticMutableBuilder[Self <: TokenizerStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSplitByPunctuation(value: String => js.Array[String]): Self = StObject.set(x, "splitByPunctuation", js.Any.fromFunction1(value))
  }
}

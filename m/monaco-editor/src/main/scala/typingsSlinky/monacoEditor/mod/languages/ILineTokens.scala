package typingsSlinky.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILineTokens extends StObject {
  
  /**
    * The tokenization end state.
    * A pointer will be held to this and the object should not be modified by the tokenizer after the pointer is returned.
    */
  var endState: IState = js.native
  
  /**
    * The list of tokens on the line.
    */
  var tokens: js.Array[IToken] = js.native
}
object ILineTokens {
  
  @scala.inline
  def apply(endState: IState, tokens: js.Array[IToken]): ILineTokens = {
    val __obj = js.Dynamic.literal(endState = endState.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILineTokens]
  }
  
  @scala.inline
  implicit class ILineTokensMutableBuilder[Self <: ILineTokens] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndState(value: IState): Self = StObject.set(x, "endState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens(value: js.Array[IToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: IToken*): Self = StObject.set(x, "tokens", js.Array(value :_*))
  }
}

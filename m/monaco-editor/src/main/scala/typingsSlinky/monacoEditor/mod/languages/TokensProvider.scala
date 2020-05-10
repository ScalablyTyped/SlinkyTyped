package typingsSlinky.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokensProvider extends js.Object {
  /**
    * The initial state of a language. Will be the state passed in to tokenize the first line.
    */
  def getInitialState(): IState = js.native
  /**
    * Tokenize a line given the state at the beginning of the line.
    */
  def tokenize(line: String, state: IState): ILineTokens = js.native
}

object TokensProvider {
  @scala.inline
  def apply(getInitialState: () => IState, tokenize: (String, IState) => ILineTokens): TokensProvider = {
    val __obj = js.Dynamic.literal(getInitialState = js.Any.fromFunction0(getInitialState), tokenize = js.Any.fromFunction2(tokenize))
    __obj.asInstanceOf[TokensProvider]
  }
  @scala.inline
  implicit class TokensProviderOps[Self <: TokensProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetInitialState(value: () => IState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTokenize(value: (String, IState) => ILineTokens): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenize")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


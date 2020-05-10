package typingsSlinky.graphql.lexerMod

import typingsSlinky.graphql.astMod.Token
import typingsSlinky.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lexer[TOptions] extends js.Object {
  /**
    * The previously focused non-ignored token.
    */
  var lastToken: Token = js.native
  /**
    * The (1-indexed) line containing the current token.
    */
  var line: Double = js.native
  /**
    * The character offset at which the current line begins.
    */
  var lineStart: Double = js.native
  var options: TOptions = js.native
  var source: Source = js.native
  /**
    * The currently focused non-ignored token.
    */
  var token: Token = js.native
  /**
    * Advances the token stream to the next non-ignored token.
    */
  def advance(): Token = js.native
  /**
    * Looks ahead and returns the next non-ignored token, but does not change
    * the Lexer's state.
    */
  def lookahead(): Token = js.native
}

object Lexer {
  @scala.inline
  def apply[TOptions](
    advance: () => Token,
    lastToken: Token,
    line: Double,
    lineStart: Double,
    lookahead: () => Token,
    options: TOptions,
    source: Source,
    token: Token
  ): Lexer[TOptions] = {
    val __obj = js.Dynamic.literal(advance = js.Any.fromFunction0(advance), lastToken = lastToken.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], lookahead = js.Any.fromFunction0(lookahead), options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lexer[TOptions]]
  }
  @scala.inline
  implicit class LexerOps[Self[toptions] <: Lexer[toptions], TOptions] (val x: Self[TOptions]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TOptions] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TOptions]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TOptions] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TOptions] with Other]
    @scala.inline
    def withAdvance(value: () => Token): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLastToken(value: Token): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Double): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineStart(value: Double): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLookahead(value: () => Token): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookahead")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOptions(value: TOptions): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Source): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: Token): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


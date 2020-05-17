package typingsSlinky.nearley.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nearley.mod.LexerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var lexerState: LexerState = js.native
}

object Dictkey {
  @scala.inline
  def apply(lexerState: LexerState): Dictkey = {
    val __obj = js.Dynamic.literal(lexerState = lexerState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLexerState(value: LexerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lexerState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


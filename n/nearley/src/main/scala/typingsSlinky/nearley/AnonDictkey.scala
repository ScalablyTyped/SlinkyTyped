package typingsSlinky.nearley

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nearley.mod.LexerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var lexerState: LexerState = js.native
}

object AnonDictkey {
  @scala.inline
  def apply(lexerState: LexerState): AnonDictkey = {
    val __obj = js.Dynamic.literal(lexerState = lexerState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
  @scala.inline
  implicit class AnonDictkeyOps[Self <: AnonDictkey] (val x: Self) extends AnyVal {
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


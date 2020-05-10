package typingsSlinky.nodeTelegramBotApi.mod

import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.game
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineQueryResultGame
  extends InlineQueryResultBase
     with InlineQueryResult {
  var game_short_name: String = js.native
  var `type`: game = js.native
}

object InlineQueryResultGame {
  @scala.inline
  def apply(game_short_name: String, id: String, `type`: game): InlineQueryResultGame = {
    val __obj = js.Dynamic.literal(game_short_name = game_short_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultGame]
  }
  @scala.inline
  implicit class InlineQueryResultGameOps[Self <: InlineQueryResultGame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGame_short_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("game_short_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: game): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


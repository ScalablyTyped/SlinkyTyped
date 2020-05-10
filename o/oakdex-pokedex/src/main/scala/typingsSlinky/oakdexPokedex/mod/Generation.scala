package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Generation extends js.Object {
  var dex_name: String = js.native
  var games: js.Array[Translations] = js.native
  var names: Translations = js.native
  var number: Double = js.native
}

object Generation {
  @scala.inline
  def apply(dex_name: String, games: js.Array[Translations], names: Translations, number: Double): Generation = {
    val __obj = js.Dynamic.literal(dex_name = dex_name.asInstanceOf[js.Any], games = games.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generation]
  }
  @scala.inline
  implicit class GenerationOps[Self <: Generation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDex_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dex_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGames(value: js.Array[Translations]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("games")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: Translations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


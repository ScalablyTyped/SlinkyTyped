package typingsSlinky.oakdexPokedex.mod

import typingsSlinky.oakdexPokedex.anon.Bug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PokemonType extends js.Object {
  var color: String = js.native
  var effectivness: Bug = js.native
  var names: Translations = js.native
}

object PokemonType {
  @scala.inline
  def apply(color: String, effectivness: Bug, names: Translations): PokemonType = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], effectivness = effectivness.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[PokemonType]
  }
  @scala.inline
  implicit class PokemonTypeOps[Self <: PokemonType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectivness(value: Bug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectivness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: Translations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


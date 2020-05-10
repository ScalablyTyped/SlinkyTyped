package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationPokemon extends js.Object {
  var day_times: js.UndefOr[js.Array[String]] = js.native
  var games: js.Array[String] = js.native
  var location: String = js.native
  var max_level: Double = js.native
  var min_level: Double = js.native
  var pokemon: String = js.native
  var rarity: String = js.native
  var seasons: js.UndefOr[js.Array[String]] = js.native
  var variation: js.UndefOr[String] = js.native
}

object LocationPokemon {
  @scala.inline
  def apply(
    games: js.Array[String],
    location: String,
    max_level: Double,
    min_level: Double,
    pokemon: String,
    rarity: String
  ): LocationPokemon = {
    val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], max_level = max_level.asInstanceOf[js.Any], min_level = min_level.asInstanceOf[js.Any], pokemon = pokemon.asInstanceOf[js.Any], rarity = rarity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationPokemon]
  }
  @scala.inline
  implicit class LocationPokemonOps[Self <: LocationPokemon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("games")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_level(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin_level(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPokemon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pokemon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRarity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rarity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDay_times(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day_times")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDay_times: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day_times")(js.undefined)
        ret
    }
    @scala.inline
    def withSeasons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seasons")(js.undefined)
        ret
    }
    @scala.inline
    def withVariation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variation")(js.undefined)
        ret
    }
  }
  
}


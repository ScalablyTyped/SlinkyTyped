package typingsSlinky.oakdexPokedex.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oakdexPokedex.AnonFemale
import typingsSlinky.oakdexPokedex.AnonJump
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pokemon extends js.Object {
  var abilities: js.Array[PokemonAbility] = js.native
  var alola_id: Double | Null = js.native
  var base_exp_yield: Double = js.native
  var base_friendship: Double = js.native
  var base_stats: StatObject = js.native
  var catch_rate: Double = js.native
  var categories: Translations = js.native
  var color: String = js.native
  var egg_groups: js.Array[String] = js.native
  var ev_yield: StatObject = js.native
  var evolution_from: String | Null = js.native
  var evolutions: js.Array[PokemonEvolution] = js.native
  var gender_ratios: Null | AnonFemale = js.native
  var hatch_time: js.Array[Double] = js.native
  var height_eu: String = js.native
  var height_us: String = js.native
  var hoenn_id: Double | Null = js.native
  var johto_id: Double | Null = js.native
  var kalos_id: Double | Null = js.native
  var kanto_id: Double | Null = js.native
  var leveling_rate: String = js.native
  var mega_evolutions: js.Array[MegaEvolution] = js.native
  var move_learnsets: js.Array[MoveLearnset] = js.native
  var names: Translations = js.native
  var national_id: Double = js.native
  var pokeathlon_stats: js.UndefOr[AnonJump] = js.native
  var pokedex_entries: StringDictionary[Translations] = js.native
  var sinnoh_id: Double | Null = js.native
  var types: js.Array[String] = js.native
  var ultra_alola_id: Double | Null = js.native
  var unova_id: Double | Null = js.native
  var variation_names: js.UndefOr[Translations] = js.native
  var variations: js.Array[PokemonVariation] = js.native
  var weight_eu: String = js.native
  var weight_us: String = js.native
}

object Pokemon {
  @scala.inline
  def apply(
    abilities: js.Array[PokemonAbility],
    base_exp_yield: Double,
    base_friendship: Double,
    base_stats: StatObject,
    catch_rate: Double,
    categories: Translations,
    color: String,
    egg_groups: js.Array[String],
    ev_yield: StatObject,
    evolutions: js.Array[PokemonEvolution],
    hatch_time: js.Array[Double],
    height_eu: String,
    height_us: String,
    leveling_rate: String,
    mega_evolutions: js.Array[MegaEvolution],
    move_learnsets: js.Array[MoveLearnset],
    names: Translations,
    national_id: Double,
    pokedex_entries: StringDictionary[Translations],
    types: js.Array[String],
    variations: js.Array[PokemonVariation],
    weight_eu: String,
    weight_us: String
  ): Pokemon = {
    val __obj = js.Dynamic.literal(abilities = abilities.asInstanceOf[js.Any], base_exp_yield = base_exp_yield.asInstanceOf[js.Any], base_friendship = base_friendship.asInstanceOf[js.Any], base_stats = base_stats.asInstanceOf[js.Any], catch_rate = catch_rate.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], egg_groups = egg_groups.asInstanceOf[js.Any], ev_yield = ev_yield.asInstanceOf[js.Any], evolutions = evolutions.asInstanceOf[js.Any], hatch_time = hatch_time.asInstanceOf[js.Any], height_eu = height_eu.asInstanceOf[js.Any], height_us = height_us.asInstanceOf[js.Any], leveling_rate = leveling_rate.asInstanceOf[js.Any], mega_evolutions = mega_evolutions.asInstanceOf[js.Any], move_learnsets = move_learnsets.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], national_id = national_id.asInstanceOf[js.Any], pokedex_entries = pokedex_entries.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], variations = variations.asInstanceOf[js.Any], weight_eu = weight_eu.asInstanceOf[js.Any], weight_us = weight_us.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pokemon]
  }
  @scala.inline
  implicit class PokemonOps[Self <: Pokemon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbilities(value: js.Array[PokemonAbility]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase_exp_yield(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_exp_yield")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase_friendship(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_friendship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase_stats(value: StatObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCatch_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catch_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: Translations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEgg_groups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("egg_groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEv_yield(value: StatObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ev_yield")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvolutions(value: js.Array[PokemonEvolution]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evolutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHatch_time(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hatch_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight_eu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height_eu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight_us(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height_us")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeveling_rate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leveling_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMega_evolutions(value: js.Array[MegaEvolution]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mega_evolutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMove_learnsets(value: js.Array[MoveLearnset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move_learnsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: Translations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNational_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("national_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPokedex_entries(value: StringDictionary[Translations]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pokedex_entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariations(value: js.Array[PokemonVariation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight_eu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight_eu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight_us(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight_us")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlola_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alola_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlola_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alola_id")(null)
        ret
    }
    @scala.inline
    def withEvolution_from(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evolution_from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvolution_fromNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evolution_from")(null)
        ret
    }
    @scala.inline
    def withGender_ratios(value: AnonFemale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender_ratios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGender_ratiosNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender_ratios")(null)
        ret
    }
    @scala.inline
    def withHoenn_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoenn_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoenn_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoenn_id")(null)
        ret
    }
    @scala.inline
    def withJohto_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("johto_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJohto_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("johto_id")(null)
        ret
    }
    @scala.inline
    def withKalos_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kalos_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKalos_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kalos_id")(null)
        ret
    }
    @scala.inline
    def withKanto_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kanto_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKanto_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kanto_id")(null)
        ret
    }
    @scala.inline
    def withPokeathlon_stats(value: AnonJump): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pokeathlon_stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPokeathlon_stats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pokeathlon_stats")(js.undefined)
        ret
    }
    @scala.inline
    def withSinnoh_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sinnoh_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSinnoh_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sinnoh_id")(null)
        ret
    }
    @scala.inline
    def withUltra_alola_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ultra_alola_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUltra_alola_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ultra_alola_id")(null)
        ret
    }
    @scala.inline
    def withUnova_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unova_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnova_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unova_id")(null)
        ret
    }
    @scala.inline
    def withVariation_names(value: Translations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variation_names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariation_names: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variation_names")(js.undefined)
        ret
    }
  }
  
}


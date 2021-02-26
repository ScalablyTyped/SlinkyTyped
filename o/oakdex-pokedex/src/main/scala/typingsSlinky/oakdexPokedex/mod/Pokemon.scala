package typingsSlinky.oakdexPokedex.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oakdexPokedex.anon.Female
import typingsSlinky.oakdexPokedex.anon.Jump
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pokemon extends StObject {
  
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
  
  var gender_ratios: Null | Female = js.native
  
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
  
  var pokeathlon_stats: js.UndefOr[Jump] = js.native
  
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
  implicit class PokemonMutableBuilder[Self <: Pokemon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbilities(value: js.Array[PokemonAbility]): Self = StObject.set(x, "abilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbilitiesVarargs(value: PokemonAbility*): Self = StObject.set(x, "abilities", js.Array(value :_*))
    
    @scala.inline
    def setAlola_id(value: Double): Self = StObject.set(x, "alola_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlola_idNull: Self = StObject.set(x, "alola_id", null)
    
    @scala.inline
    def setBase_exp_yield(value: Double): Self = StObject.set(x, "base_exp_yield", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase_friendship(value: Double): Self = StObject.set(x, "base_friendship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase_stats(value: StatObject): Self = StObject.set(x, "base_stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatch_rate(value: Double): Self = StObject.set(x, "catch_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategories(value: Translations): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgg_groups(value: js.Array[String]): Self = StObject.set(x, "egg_groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgg_groupsVarargs(value: String*): Self = StObject.set(x, "egg_groups", js.Array(value :_*))
    
    @scala.inline
    def setEv_yield(value: StatObject): Self = StObject.set(x, "ev_yield", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvolution_from(value: String): Self = StObject.set(x, "evolution_from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvolution_fromNull: Self = StObject.set(x, "evolution_from", null)
    
    @scala.inline
    def setEvolutions(value: js.Array[PokemonEvolution]): Self = StObject.set(x, "evolutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvolutionsVarargs(value: PokemonEvolution*): Self = StObject.set(x, "evolutions", js.Array(value :_*))
    
    @scala.inline
    def setGender_ratios(value: Female): Self = StObject.set(x, "gender_ratios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGender_ratiosNull: Self = StObject.set(x, "gender_ratios", null)
    
    @scala.inline
    def setHatch_time(value: js.Array[Double]): Self = StObject.set(x, "hatch_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHatch_timeVarargs(value: Double*): Self = StObject.set(x, "hatch_time", js.Array(value :_*))
    
    @scala.inline
    def setHeight_eu(value: String): Self = StObject.set(x, "height_eu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight_us(value: String): Self = StObject.set(x, "height_us", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoenn_id(value: Double): Self = StObject.set(x, "hoenn_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoenn_idNull: Self = StObject.set(x, "hoenn_id", null)
    
    @scala.inline
    def setJohto_id(value: Double): Self = StObject.set(x, "johto_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJohto_idNull: Self = StObject.set(x, "johto_id", null)
    
    @scala.inline
    def setKalos_id(value: Double): Self = StObject.set(x, "kalos_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKalos_idNull: Self = StObject.set(x, "kalos_id", null)
    
    @scala.inline
    def setKanto_id(value: Double): Self = StObject.set(x, "kanto_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKanto_idNull: Self = StObject.set(x, "kanto_id", null)
    
    @scala.inline
    def setLeveling_rate(value: String): Self = StObject.set(x, "leveling_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMega_evolutions(value: js.Array[MegaEvolution]): Self = StObject.set(x, "mega_evolutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMega_evolutionsVarargs(value: MegaEvolution*): Self = StObject.set(x, "mega_evolutions", js.Array(value :_*))
    
    @scala.inline
    def setMove_learnsets(value: js.Array[MoveLearnset]): Self = StObject.set(x, "move_learnsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMove_learnsetsVarargs(value: MoveLearnset*): Self = StObject.set(x, "move_learnsets", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: Translations): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNational_id(value: Double): Self = StObject.set(x, "national_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPokeathlon_stats(value: Jump): Self = StObject.set(x, "pokeathlon_stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPokeathlon_statsUndefined: Self = StObject.set(x, "pokeathlon_stats", js.undefined)
    
    @scala.inline
    def setPokedex_entries(value: StringDictionary[Translations]): Self = StObject.set(x, "pokedex_entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinnoh_id(value: Double): Self = StObject.set(x, "sinnoh_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinnoh_idNull: Self = StObject.set(x, "sinnoh_id", null)
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    @scala.inline
    def setUltra_alola_id(value: Double): Self = StObject.set(x, "ultra_alola_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUltra_alola_idNull: Self = StObject.set(x, "ultra_alola_id", null)
    
    @scala.inline
    def setUnova_id(value: Double): Self = StObject.set(x, "unova_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnova_idNull: Self = StObject.set(x, "unova_id", null)
    
    @scala.inline
    def setVariation_names(value: Translations): Self = StObject.set(x, "variation_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariation_namesUndefined: Self = StObject.set(x, "variation_names", js.undefined)
    
    @scala.inline
    def setVariations(value: js.Array[PokemonVariation]): Self = StObject.set(x, "variations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariationsVarargs(value: PokemonVariation*): Self = StObject.set(x, "variations", js.Array(value :_*))
    
    @scala.inline
    def setWeight_eu(value: String): Self = StObject.set(x, "weight_eu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight_us(value: String): Self = StObject.set(x, "weight_us", value.asInstanceOf[js.Any])
  }
}

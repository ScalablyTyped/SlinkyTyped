package typingsSlinky.oakdexPokedex.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oakdexPokedex.anon.Increasedcriticalhitratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Move extends StObject {
  
  var accuracy: Double = js.native
  
  var affected_by_kings_rock: Boolean = js.native
  
  var affected_by_magic_coat: Boolean = js.native
  
  var affected_by_mirror_move: Boolean = js.native
  
  var affected_by_protect: Boolean = js.native
  
  var affected_by_snatch: Boolean = js.native
  
  var category: String = js.native
  
  var contests: js.Array[MoveContest] = js.native
  
  var critical_hit: Double = js.native
  
  var in_battle_properties: js.UndefOr[Increasedcriticalhitratio] = js.native
  
  var index_number: Double = js.native
  
  var makes_contact: Boolean = js.native
  
  var max_pp: Double = js.native
  
  var names: Translations = js.native
  
  var pokedex_entries: StringDictionary[Translations] = js.native
  
  var power: Double = js.native
  
  var pp: Double = js.native
  
  var priority: Double = js.native
  
  var stat_modifiers: js.UndefOr[js.Array[MoveStatModifier]] = js.native
  
  var target: String = js.native
  
  var `type`: String = js.native
}
object Move {
  
  @scala.inline
  def apply(
    accuracy: Double,
    affected_by_kings_rock: Boolean,
    affected_by_magic_coat: Boolean,
    affected_by_mirror_move: Boolean,
    affected_by_protect: Boolean,
    affected_by_snatch: Boolean,
    category: String,
    contests: js.Array[MoveContest],
    critical_hit: Double,
    index_number: Double,
    makes_contact: Boolean,
    max_pp: Double,
    names: Translations,
    pokedex_entries: StringDictionary[Translations],
    power: Double,
    pp: Double,
    priority: Double,
    target: String,
    `type`: String
  ): Move = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], affected_by_kings_rock = affected_by_kings_rock.asInstanceOf[js.Any], affected_by_magic_coat = affected_by_magic_coat.asInstanceOf[js.Any], affected_by_mirror_move = affected_by_mirror_move.asInstanceOf[js.Any], affected_by_protect = affected_by_protect.asInstanceOf[js.Any], affected_by_snatch = affected_by_snatch.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], contests = contests.asInstanceOf[js.Any], critical_hit = critical_hit.asInstanceOf[js.Any], index_number = index_number.asInstanceOf[js.Any], makes_contact = makes_contact.asInstanceOf[js.Any], max_pp = max_pp.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], pokedex_entries = pokedex_entries.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], pp = pp.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move]
  }
  
  @scala.inline
  implicit class MoveMutableBuilder[Self <: Move] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffected_by_kings_rock(value: Boolean): Self = StObject.set(x, "affected_by_kings_rock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffected_by_magic_coat(value: Boolean): Self = StObject.set(x, "affected_by_magic_coat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffected_by_mirror_move(value: Boolean): Self = StObject.set(x, "affected_by_mirror_move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffected_by_protect(value: Boolean): Self = StObject.set(x, "affected_by_protect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffected_by_snatch(value: Boolean): Self = StObject.set(x, "affected_by_snatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContests(value: js.Array[MoveContest]): Self = StObject.set(x, "contests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContestsVarargs(value: MoveContest*): Self = StObject.set(x, "contests", js.Array(value :_*))
    
    @scala.inline
    def setCritical_hit(value: Double): Self = StObject.set(x, "critical_hit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn_battle_properties(value: Increasedcriticalhitratio): Self = StObject.set(x, "in_battle_properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn_battle_propertiesUndefined: Self = StObject.set(x, "in_battle_properties", js.undefined)
    
    @scala.inline
    def setIndex_number(value: Double): Self = StObject.set(x, "index_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakes_contact(value: Boolean): Self = StObject.set(x, "makes_contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_pp(value: Double): Self = StObject.set(x, "max_pp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: Translations): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPokedex_entries(value: StringDictionary[Translations]): Self = StObject.set(x, "pokedex_entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPp(value: Double): Self = StObject.set(x, "pp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat_modifiers(value: js.Array[MoveStatModifier]): Self = StObject.set(x, "stat_modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat_modifiersUndefined: Self = StObject.set(x, "stat_modifiers", js.undefined)
    
    @scala.inline
    def setStat_modifiersVarargs(value: MoveStatModifier*): Self = StObject.set(x, "stat_modifiers", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

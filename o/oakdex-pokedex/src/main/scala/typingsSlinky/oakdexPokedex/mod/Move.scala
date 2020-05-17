package typingsSlinky.oakdexPokedex.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oakdexPokedex.anon.Increasedcriticalhitratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Move extends js.Object {
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
  implicit class MoveOps[Self <: Move] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAffected_by_kings_rock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affected_by_kings_rock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAffected_by_magic_coat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affected_by_magic_coat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAffected_by_mirror_move(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affected_by_mirror_move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAffected_by_protect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affected_by_protect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAffected_by_snatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affected_by_snatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContests(value: js.Array[MoveContest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCritical_hit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical_hit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMakes_contact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makes_contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_pp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_pp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: Translations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPokedex_entries(value: StringDictionary[Translations]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pokedex_entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPower(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIn_battle_properties(value: Increasedcriticalhitratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_battle_properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn_battle_properties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_battle_properties")(js.undefined)
        ret
    }
    @scala.inline
    def withStat_modifiers(value: js.Array[MoveStatModifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat_modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStat_modifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat_modifiers")(js.undefined)
        ret
    }
  }
  
}


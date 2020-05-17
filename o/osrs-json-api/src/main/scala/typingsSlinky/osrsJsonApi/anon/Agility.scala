package typingsSlinky.osrsJsonApi.anon

import typingsSlinky.osrsJsonApi.mod.hiscores.RankLevelXpObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agility extends js.Object {
  var agility: RankLevelXpObject = js.native
  var attack: RankLevelXpObject = js.native
  var construction: RankLevelXpObject = js.native
  var cooking: RankLevelXpObject = js.native
  var crafting: RankLevelXpObject = js.native
  var defence: RankLevelXpObject = js.native
  var farming: RankLevelXpObject = js.native
  var firemaking: RankLevelXpObject = js.native
  var fishing: RankLevelXpObject = js.native
  var fletching: RankLevelXpObject = js.native
  var herblore: RankLevelXpObject = js.native
  var hitpoints: RankLevelXpObject = js.native
  var hunter: RankLevelXpObject = js.native
  var magic: RankLevelXpObject = js.native
  var mining: RankLevelXpObject = js.native
  var overall: RankLevelXpObject = js.native
  var prayer: RankLevelXpObject = js.native
  var ranged: RankLevelXpObject = js.native
  var runecraft: RankLevelXpObject = js.native
  var slayer: RankLevelXpObject = js.native
  var smithing: RankLevelXpObject = js.native
  var strength: RankLevelXpObject = js.native
  var thieving: RankLevelXpObject = js.native
  var woodcutting: RankLevelXpObject = js.native
}

object Agility {
  @scala.inline
  def apply(
    agility: RankLevelXpObject,
    attack: RankLevelXpObject,
    construction: RankLevelXpObject,
    cooking: RankLevelXpObject,
    crafting: RankLevelXpObject,
    defence: RankLevelXpObject,
    farming: RankLevelXpObject,
    firemaking: RankLevelXpObject,
    fishing: RankLevelXpObject,
    fletching: RankLevelXpObject,
    herblore: RankLevelXpObject,
    hitpoints: RankLevelXpObject,
    hunter: RankLevelXpObject,
    magic: RankLevelXpObject,
    mining: RankLevelXpObject,
    overall: RankLevelXpObject,
    prayer: RankLevelXpObject,
    ranged: RankLevelXpObject,
    runecraft: RankLevelXpObject,
    slayer: RankLevelXpObject,
    smithing: RankLevelXpObject,
    strength: RankLevelXpObject,
    thieving: RankLevelXpObject,
    woodcutting: RankLevelXpObject
  ): Agility = {
    val __obj = js.Dynamic.literal(agility = agility.asInstanceOf[js.Any], attack = attack.asInstanceOf[js.Any], construction = construction.asInstanceOf[js.Any], cooking = cooking.asInstanceOf[js.Any], crafting = crafting.asInstanceOf[js.Any], defence = defence.asInstanceOf[js.Any], farming = farming.asInstanceOf[js.Any], firemaking = firemaking.asInstanceOf[js.Any], fishing = fishing.asInstanceOf[js.Any], fletching = fletching.asInstanceOf[js.Any], herblore = herblore.asInstanceOf[js.Any], hitpoints = hitpoints.asInstanceOf[js.Any], hunter = hunter.asInstanceOf[js.Any], magic = magic.asInstanceOf[js.Any], mining = mining.asInstanceOf[js.Any], overall = overall.asInstanceOf[js.Any], prayer = prayer.asInstanceOf[js.Any], ranged = ranged.asInstanceOf[js.Any], runecraft = runecraft.asInstanceOf[js.Any], slayer = slayer.asInstanceOf[js.Any], smithing = smithing.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any], thieving = thieving.asInstanceOf[js.Any], woodcutting = woodcutting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Agility]
  }
  @scala.inline
  implicit class AgilityOps[Self <: Agility] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgility(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttack(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstruction(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("construction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCooking(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrafting(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crafting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefence(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFarming(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("farming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiremaking(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firemaking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFishing(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fishing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFletching(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fletching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHerblore(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("herblore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitpoints(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHunter(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hunter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagic(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMining(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverall(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrayer(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRanged(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunecraft(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runecraft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlayer(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmithing(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smithing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrength(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThieving(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thieving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWoodcutting(value: RankLevelXpObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("woodcutting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsDto extends js.Object {
  var armor: Double = js.native
  var armorperlevel: Double = js.native
  var attackdamage: Double = js.native
  var attackdamageperlevel: Double = js.native
  var attackrange: Double = js.native
  var attackspeedoffset: Double = js.native
  var attackspeedperlevel: Double = js.native
  var crit: Double = js.native
  var critperlevel: Double = js.native
  var hp: Double = js.native
  var hpperlevel: Double = js.native
  var hpregen: Double = js.native
  var hpregenperlevel: Double = js.native
  var movespeed: Double = js.native
  var mp: Double = js.native
  var mpperlevel: Double = js.native
  var mpregen: Double = js.native
  var mpregenperlevel: Double = js.native
  var spellblock: Double = js.native
  var spellblockperlevel: Double = js.native
}

object StatsDto {
  @scala.inline
  def apply(
    armor: Double,
    armorperlevel: Double,
    attackdamage: Double,
    attackdamageperlevel: Double,
    attackrange: Double,
    attackspeedoffset: Double,
    attackspeedperlevel: Double,
    crit: Double,
    critperlevel: Double,
    hp: Double,
    hpperlevel: Double,
    hpregen: Double,
    hpregenperlevel: Double,
    movespeed: Double,
    mp: Double,
    mpperlevel: Double,
    mpregen: Double,
    mpregenperlevel: Double,
    spellblock: Double,
    spellblockperlevel: Double
  ): StatsDto = {
    val __obj = js.Dynamic.literal(armor = armor.asInstanceOf[js.Any], armorperlevel = armorperlevel.asInstanceOf[js.Any], attackdamage = attackdamage.asInstanceOf[js.Any], attackdamageperlevel = attackdamageperlevel.asInstanceOf[js.Any], attackrange = attackrange.asInstanceOf[js.Any], attackspeedoffset = attackspeedoffset.asInstanceOf[js.Any], attackspeedperlevel = attackspeedperlevel.asInstanceOf[js.Any], crit = crit.asInstanceOf[js.Any], critperlevel = critperlevel.asInstanceOf[js.Any], hp = hp.asInstanceOf[js.Any], hpperlevel = hpperlevel.asInstanceOf[js.Any], hpregen = hpregen.asInstanceOf[js.Any], hpregenperlevel = hpregenperlevel.asInstanceOf[js.Any], movespeed = movespeed.asInstanceOf[js.Any], mp = mp.asInstanceOf[js.Any], mpperlevel = mpperlevel.asInstanceOf[js.Any], mpregen = mpregen.asInstanceOf[js.Any], mpregenperlevel = mpregenperlevel.asInstanceOf[js.Any], spellblock = spellblock.asInstanceOf[js.Any], spellblockperlevel = spellblockperlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsDto]
  }
  @scala.inline
  implicit class StatsDtoOps[Self <: StatsDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArmor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("armor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArmorperlevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("armorperlevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttackdamage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attackdamage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttackdamageperlevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attackdamageperlevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttackrange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attackrange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttackspeedoffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attackspeedoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttackspeedperlevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attackspeedperlevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCritperlevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critperlevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHpperlevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hpperlevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHpregen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hpregen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHpregenperlevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hpregenperlevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMovespeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movespeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMpperlevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpperlevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMpregen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpregen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMpregenperlevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpregenperlevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpellblock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellblock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpellblockperlevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellblockperlevel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


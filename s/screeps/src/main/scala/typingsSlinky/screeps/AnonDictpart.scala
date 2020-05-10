package typingsSlinky.screeps

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictpart extends /* part */ StringDictionary[StringDictionary[StringDictionary[Double]]] {
  var attack: AnonUH = js.native
  var carry: AnonKH = js.native
  var heal: AnonLHO2 = js.native
  var move: AnonXZHO2 = js.native
  var ranged_attack: AnonKHO2 = js.native
  var tough: AnonGHO2 = js.native
  var work: AnonLH = js.native
}

object AnonDictpart {
  @scala.inline
  def apply(
    attack: AnonUH,
    carry: AnonKH,
    heal: AnonLHO2,
    move: AnonXZHO2,
    ranged_attack: AnonKHO2,
    tough: AnonGHO2,
    work: AnonLH
  ): AnonDictpart = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any], carry = carry.asInstanceOf[js.Any], heal = heal.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], ranged_attack = ranged_attack.asInstanceOf[js.Any], tough = tough.asInstanceOf[js.Any], work = work.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictpart]
  }
  @scala.inline
  implicit class AnonDictpartOps[Self <: AnonDictpart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttack(value: AnonUH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCarry(value: AnonKH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeal(value: AnonLHO2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMove(value: AnonXZHO2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRanged_attack(value: AnonKHO2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranged_attack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTough(value: AnonGHO2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWork(value: AnonLH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("work")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


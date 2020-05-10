package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatObject extends js.Object {
  var atk: Double = js.native
  var `def`: Double = js.native
  var hp: Double = js.native
  var sp_atk: Double = js.native
  var sp_def: Double = js.native
  var speed: Double = js.native
}

object StatObject {
  @scala.inline
  def apply(atk: Double, `def`: Double, hp: Double, sp_atk: Double, sp_def: Double, speed: Double): StatObject = {
    val __obj = js.Dynamic.literal(atk = atk.asInstanceOf[js.Any], hp = hp.asInstanceOf[js.Any], sp_atk = sp_atk.asInstanceOf[js.Any], sp_def = sp_def.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatObject]
  }
  @scala.inline
  implicit class StatObjectOps[Self <: StatObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtk(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDef(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("def")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSp_atk(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sp_atk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSp_def(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sp_def")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


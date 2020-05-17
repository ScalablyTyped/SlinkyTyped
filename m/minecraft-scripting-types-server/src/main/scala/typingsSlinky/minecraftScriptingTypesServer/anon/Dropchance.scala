package typingsSlinky.minecraftScriptingTypesServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dropchance extends js.Object {
  /**
    * The chance that the item in this slot will be dropped
    */
  var drop_chance: Double = js.native
  /**
    * The slot number
    */
  var slot: Double = js.native
}

object Dropchance {
  @scala.inline
  def apply(drop_chance: Double, slot: Double): Dropchance = {
    val __obj = js.Dynamic.literal(drop_chance = drop_chance.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dropchance]
  }
  @scala.inline
  implicit class DropchanceOps[Self <: Dropchance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrop_chance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop_chance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlot(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.bemCn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BemContext extends js.Object {
  var mixes: js.Array[BemMix] = js.native
  var mods: BemMods = js.native
  var name: String = js.native
  var states: BemStates = js.native
}

object BemContext {
  @scala.inline
  def apply(mixes: js.Array[BemMix], mods: BemMods, name: String, states: BemStates): BemContext = {
    val __obj = js.Dynamic.literal(mixes = mixes.asInstanceOf[js.Any], mods = mods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[BemContext]
  }
  @scala.inline
  implicit class BemContextOps[Self <: BemContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMixes(value: js.Array[BemMix]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMods(value: BemMods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStates(value: BemStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


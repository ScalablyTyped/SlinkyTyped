package typingsSlinky.minecraftScriptingTypesServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amplifier extends js.Object {
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  var amplifier: Double = js.native
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  var chance: Double = js.native
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  var duration: Double = js.native
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  var name: String = js.native
}

object Amplifier {
  @scala.inline
  def apply(amplifier: Double, chance: Double, duration: Double, name: String): Amplifier = {
    val __obj = js.Dynamic.literal(amplifier = amplifier.asInstanceOf[js.Any], chance = chance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amplifier]
  }
  @scala.inline
  implicit class AmplifierOps[Self <: Amplifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmplifier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amplifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


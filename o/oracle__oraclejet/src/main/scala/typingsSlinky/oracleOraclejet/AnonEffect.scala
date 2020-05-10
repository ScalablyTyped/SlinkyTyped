package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.ojanimationMod.AnimationMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEffect
  extends /* key */ StringDictionary[js.Any] {
  var effect: AnimationMethods = js.native
}

object AnonEffect {
  @scala.inline
  def apply(effect: AnimationMethods): AnonEffect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEffect]
  }
  @scala.inline
  implicit class AnonEffectOps[Self <: AnonEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffect(value: AnimationMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


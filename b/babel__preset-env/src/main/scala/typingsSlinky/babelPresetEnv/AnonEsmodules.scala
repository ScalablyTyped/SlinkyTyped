package typingsSlinky.babelPresetEnv

import typingsSlinky.babelPresetEnv.babelPresetEnvBooleans.`true`
import typingsSlinky.babelPresetEnv.mod._TargetsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEsmodules extends _TargetsOptions {
  var esmodules: `true` = js.native
}

object AnonEsmodules {
  @scala.inline
  def apply(esmodules: `true`): AnonEsmodules = {
    val __obj = js.Dynamic.literal(esmodules = esmodules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEsmodules]
  }
  @scala.inline
  implicit class AnonEsmodulesOps[Self <: AnonEsmodules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEsmodules(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esmodules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


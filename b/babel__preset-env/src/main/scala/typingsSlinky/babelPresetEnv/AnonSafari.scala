package typingsSlinky.babelPresetEnv

import typingsSlinky.babelPresetEnv.babelPresetEnvStrings.tp
import typingsSlinky.babelPresetEnv.mod._TargetsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSafari extends _TargetsOptions {
  var safari: String | tp = js.native
}

object AnonSafari {
  @scala.inline
  def apply(safari: String | tp): AnonSafari = {
    val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSafari]
  }
  @scala.inline
  implicit class AnonSafariOps[Self <: AnonSafari] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSafari(value: String | tp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safari")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


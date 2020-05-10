package typingsSlinky.bunyanPrettystream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMode extends js.Object {
  var mode: js.UndefOr[String] = js.native
  var useColor: js.UndefOr[Boolean] = js.native
}

object AnonMode {
  @scala.inline
  def apply(): AnonMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMode]
  }
  @scala.inline
  implicit class AnonModeOps[Self <: AnonMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withUseColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useColor")(js.undefined)
        ret
    }
  }
  
}


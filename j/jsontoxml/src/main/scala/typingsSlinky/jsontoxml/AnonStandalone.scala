package typingsSlinky.jsontoxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStandalone extends js.Object {
  var standalone: js.UndefOr[Boolean] = js.native
}

object AnonStandalone {
  @scala.inline
  def apply(): AnonStandalone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonStandalone]
  }
  @scala.inline
  implicit class AnonStandaloneOps[Self <: AnonStandalone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStandalone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandalone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(js.undefined)
        ret
    }
  }
  
}


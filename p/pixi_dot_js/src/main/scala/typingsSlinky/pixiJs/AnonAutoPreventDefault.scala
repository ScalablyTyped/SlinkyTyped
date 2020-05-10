package typingsSlinky.pixiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoPreventDefault extends js.Object {
  var autoPreventDefault: js.UndefOr[Boolean] = js.native
  var interactionFrequency: js.UndefOr[Double] = js.native
  var useSystemTicker: js.UndefOr[Double] = js.native
}

object AnonAutoPreventDefault {
  @scala.inline
  def apply(): AnonAutoPreventDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAutoPreventDefault]
  }
  @scala.inline
  implicit class AnonAutoPreventDefaultOps[Self <: AnonAutoPreventDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPreventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPreventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractionFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractionFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSystemTicker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSystemTicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSystemTicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSystemTicker")(js.undefined)
        ret
    }
  }
  
}


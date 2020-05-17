package typingsSlinky.qlik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoInteraction extends js.Object {
  var noInteraction: js.UndefOr[Boolean] = js.native
  var noSelections: js.UndefOr[Boolean] = js.native
}

object NoInteraction {
  @scala.inline
  def apply(): NoInteraction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoInteraction]
  }
  @scala.inline
  implicit class NoInteractionOps[Self <: NoInteraction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoInteraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInteraction")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSelections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSelections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSelections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSelections")(js.undefined)
        ret
    }
  }
  
}


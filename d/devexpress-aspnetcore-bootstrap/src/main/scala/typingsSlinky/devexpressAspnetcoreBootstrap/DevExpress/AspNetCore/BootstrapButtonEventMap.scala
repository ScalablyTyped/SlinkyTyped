package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapButtonEventMap extends ControlEventMap {
  var checkedChanged: ProcessingModeEventArgs = js.native
  var click: ButtonClickEventArgs = js.native
  var gotFocus: EventArgs = js.native
  var lostFocus: EventArgs = js.native
}

object BootstrapButtonEventMap {
  @scala.inline
  def apply(
    checkedChanged: ProcessingModeEventArgs,
    click: ButtonClickEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    lostFocus: EventArgs
  ): BootstrapButtonEventMap = {
    val __obj = js.Dynamic.literal(checkedChanged = checkedChanged.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapButtonEventMap]
  }
  @scala.inline
  implicit class BootstrapButtonEventMapOps[Self <: BootstrapButtonEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckedChanged(value: ProcessingModeEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: ButtonClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGotFocus(value: EventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLostFocus(value: EventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lostFocus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


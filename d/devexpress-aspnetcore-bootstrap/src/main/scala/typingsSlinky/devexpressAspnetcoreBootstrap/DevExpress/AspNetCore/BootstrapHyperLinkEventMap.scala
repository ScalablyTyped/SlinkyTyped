package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapHyperLinkEventMap extends ControlEventMap {
  var click: EditClickEventArgs = js.native
}

object BootstrapHyperLinkEventMap {
  @scala.inline
  def apply(click: EditClickEventArgs, init: EventArgs): BootstrapHyperLinkEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapHyperLinkEventMap]
  }
  @scala.inline
  implicit class BootstrapHyperLinkEventMapOps[Self <: BootstrapHyperLinkEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: EditClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


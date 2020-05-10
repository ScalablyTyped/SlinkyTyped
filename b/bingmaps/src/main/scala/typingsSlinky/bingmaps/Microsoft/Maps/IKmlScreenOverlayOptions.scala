package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKmlScreenOverlayOptions extends js.Object {
  /** A boolean indicating if the screen overlay can be displayed above or beow the navigaiton bar. Default: false */
  var belowNavigationBar: js.UndefOr[Boolean] = js.native
  /** The visibility of the screen overlay. Default: true */
  var visible: js.UndefOr[Boolean] = js.native
}

object IKmlScreenOverlayOptions {
  @scala.inline
  def apply(): IKmlScreenOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKmlScreenOverlayOptions]
  }
  @scala.inline
  implicit class IKmlScreenOverlayOptionsOps[Self <: IKmlScreenOverlayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBelowNavigationBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("belowNavigationBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBelowNavigationBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("belowNavigationBar")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}


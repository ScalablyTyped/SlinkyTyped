package typingsSlinky.overlayscrollbars.mod

import typingsSlinky.overlayscrollbars.AnonB
import typingsSlinky.overlayscrollbars.AnonHeight
import typingsSlinky.overlayscrollbars.AnonXBoolean
import typingsSlinky.overlayscrollbars.AnonXNumber
import typingsSlinky.overlayscrollbars.AnonXs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var autoUpdate: Boolean = js.native
  var contentScrollSize: AnonHeight = js.native
  var destroyed: Boolean = js.native
  var documentMixed: Boolean = js.native
  var hasOverflow: AnonXBoolean = js.native
  var heightAuto: Boolean = js.native
  var hideOverflow: AnonXs = js.native
  var hostSize: AnonHeight = js.native
  var overflowAmount: AnonXNumber = js.native
  var padding: AnonB = js.native
  var sleeping: Boolean = js.native
  var viewportSize: AnonHeight = js.native
  var widthAuto: Boolean = js.native
}

object State {
  @scala.inline
  def apply(
    autoUpdate: Boolean,
    contentScrollSize: AnonHeight,
    destroyed: Boolean,
    documentMixed: Boolean,
    hasOverflow: AnonXBoolean,
    heightAuto: Boolean,
    hideOverflow: AnonXs,
    hostSize: AnonHeight,
    overflowAmount: AnonXNumber,
    padding: AnonB,
    sleeping: Boolean,
    viewportSize: AnonHeight,
    widthAuto: Boolean
  ): State = {
    val __obj = js.Dynamic.literal(autoUpdate = autoUpdate.asInstanceOf[js.Any], contentScrollSize = contentScrollSize.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], documentMixed = documentMixed.asInstanceOf[js.Any], hasOverflow = hasOverflow.asInstanceOf[js.Any], heightAuto = heightAuto.asInstanceOf[js.Any], hideOverflow = hideOverflow.asInstanceOf[js.Any], hostSize = hostSize.asInstanceOf[js.Any], overflowAmount = overflowAmount.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], sleeping = sleeping.asInstanceOf[js.Any], viewportSize = viewportSize.asInstanceOf[js.Any], widthAuto = widthAuto.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentScrollSize(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentScrollSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroyed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentMixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentMixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasOverflow(value: AnonXBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideOverflow(value: AnonXs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostSize(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflowAmount(value: AnonXNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: AnonB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSleeping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sleeping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportSize(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidthAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthAuto")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


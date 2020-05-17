package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.fadeIn
import typingsSlinky.grommet.grommetStrings.fadeOut
import typingsSlinky.grommet.grommetStrings.jiggle
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.pulse
import typingsSlinky.grommet.grommetStrings.slideDown
import typingsSlinky.grommet.grommetStrings.slideLeft
import typingsSlinky.grommet.grommetStrings.slideRight
import typingsSlinky.grommet.grommetStrings.slideUp
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.zoomIn
import typingsSlinky.grommet.grommetStrings.zoomOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delay extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.native
  var `type`: js.UndefOr[
    fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut
  ] = js.native
}

object Delay {
  @scala.inline
  def apply(): Delay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delay]
  }
  @scala.inline
  implicit class DelayOps[Self <: Delay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: xsmall | small | medium | large | xlarge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}


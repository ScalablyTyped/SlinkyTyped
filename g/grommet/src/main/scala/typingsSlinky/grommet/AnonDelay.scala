package typingsSlinky.grommet

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

trait AnonDelay extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
  var `type`: js.UndefOr[
    fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut
  ] = js.undefined
}

object AnonDelay {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    duration: Int | Double = null,
    size: xsmall | small | medium | large | xlarge = null,
    `type`: fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut = null
  ): AnonDelay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelay]
  }
}


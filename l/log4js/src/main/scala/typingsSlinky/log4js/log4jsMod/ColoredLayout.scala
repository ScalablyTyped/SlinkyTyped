package typingsSlinky.log4js.log4jsMod

import typingsSlinky.log4js.log4jsStrings.colored
import typingsSlinky.log4js.log4jsStrings.coloured
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColoredLayout extends Layout {
  var `type`: colored | coloured
}

object ColoredLayout {
  @scala.inline
  def apply(`type`: colored | coloured): ColoredLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColoredLayout]
  }
}


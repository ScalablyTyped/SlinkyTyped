package typingsSlinky.qiniuDashJs.qiniuDashJsMod

import typingsSlinky.qiniuDashJs.qiniuDashJsNumbers.`2`
import typingsSlinky.qiniuDashJs.qiniuDashJsStrings.Center
import typingsSlinky.qiniuDashJs.qiniuDashJsStrings.East
import typingsSlinky.qiniuDashJs.qiniuDashJsStrings.North
import typingsSlinky.qiniuDashJs.qiniuDashJsStrings.NorthEast
import typingsSlinky.qiniuDashJs.qiniuDashJsStrings.NorthWest
import typingsSlinky.qiniuDashJs.qiniuDashJsStrings.South
import typingsSlinky.qiniuDashJs.qiniuDashJsStrings.SouthEast
import typingsSlinky.qiniuDashJs.qiniuDashJsStrings.SouthWest
import typingsSlinky.qiniuDashJs.qiniuDashJsStrings.West
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterMarkFopOptions2 extends WaterMarkOptions2 {
  var fop: typingsSlinky.qiniuDashJs.qiniuDashJsStrings.watermark
}

object WaterMarkFopOptions2 {
  @scala.inline
  def apply(
    dissolve: Double,
    dx: Double,
    dy: Double,
    fill: String,
    font: String,
    fontsize: Double,
    fop: typingsSlinky.qiniuDashJs.qiniuDashJsStrings.watermark,
    gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast,
    mode: `2`,
    text: String
  ): WaterMarkFopOptions2 = {
    val __obj = js.Dynamic.literal(dissolve = dissolve.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontsize = fontsize.asInstanceOf[js.Any], fop = fop.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WaterMarkFopOptions2]
  }
}


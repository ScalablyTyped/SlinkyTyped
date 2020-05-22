package typingsSlinky.qiniuJs.mod

import typingsSlinky.qiniuJs.qiniuJsNumbers.`2`
import typingsSlinky.qiniuJs.qiniuJsStrings.Center
import typingsSlinky.qiniuJs.qiniuJsStrings.East
import typingsSlinky.qiniuJs.qiniuJsStrings.North
import typingsSlinky.qiniuJs.qiniuJsStrings.NorthEast
import typingsSlinky.qiniuJs.qiniuJsStrings.NorthWest
import typingsSlinky.qiniuJs.qiniuJsStrings.South
import typingsSlinky.qiniuJs.qiniuJsStrings.SouthEast
import typingsSlinky.qiniuJs.qiniuJsStrings.SouthWest
import typingsSlinky.qiniuJs.qiniuJsStrings.West
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterMarkFopOptions2 extends WaterMarkOptions2 {
  var fop: typingsSlinky.qiniuJs.qiniuJsStrings.watermark
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
    fop: typingsSlinky.qiniuJs.qiniuJsStrings.watermark,
    gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast,
    mode: `2`,
    text: String
  ): WaterMarkFopOptions2 = {
    val __obj = js.Dynamic.literal(dissolve = dissolve.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontsize = fontsize.asInstanceOf[js.Any], fop = fop.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterMarkFopOptions2]
  }
}


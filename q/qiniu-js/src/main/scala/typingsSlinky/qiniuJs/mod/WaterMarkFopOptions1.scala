package typingsSlinky.qiniuJs.mod

import typingsSlinky.qiniuJs.qiniuJsNumbers.`1`
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

trait WaterMarkFopOptions1 extends WaterMarkOptions1 {
  var fop: typingsSlinky.qiniuJs.qiniuJsStrings.watermark
}

object WaterMarkFopOptions1 {
  @scala.inline
  def apply(
    dissolve: Double,
    dx: Double,
    dy: Double,
    fop: typingsSlinky.qiniuJs.qiniuJsStrings.watermark,
    gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast,
    image: String,
    mode: `1`
  ): WaterMarkFopOptions1 = {
    val __obj = js.Dynamic.literal(dissolve = dissolve.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fop = fop.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterMarkFopOptions1]
  }
}


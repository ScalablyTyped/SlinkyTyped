package typingsSlinky.jpegAutorotate.anon

import typingsSlinky.jpegAutorotate.mod.RotateDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  var buffer: typingsSlinky.node.Buffer
  var dimensions: RotateDimensions
  var orientation: Double
  var quality: Double
}

object Buffer {
  @scala.inline
  def apply(
    buffer: typingsSlinky.node.Buffer,
    dimensions: RotateDimensions,
    orientation: Double,
    quality: Double
  ): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}


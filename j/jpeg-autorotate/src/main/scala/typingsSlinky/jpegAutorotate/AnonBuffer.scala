package typingsSlinky.jpegAutorotate

import typingsSlinky.jpegAutorotate.mod.RotateDimensions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  var buffer: Buffer
  var dimensions: RotateDimensions
  var orientation: Double
  var quality: Double
}

object AnonBuffer {
  @scala.inline
  def apply(buffer: Buffer, dimensions: RotateDimensions, orientation: Double, quality: Double): AnonBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBuffer]
  }
}


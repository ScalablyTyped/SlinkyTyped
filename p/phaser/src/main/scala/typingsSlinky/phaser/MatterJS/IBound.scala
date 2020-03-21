package typingsSlinky.phaser.MatterJS

import typingsSlinky.phaser.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBound extends js.Object {
  var max: AnonX
  var min: AnonX
}

object IBound {
  @scala.inline
  def apply(max: AnonX, min: AnonX): IBound = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBound]
  }
}


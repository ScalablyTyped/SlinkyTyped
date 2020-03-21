package typingsSlinky.node

import typingsSlinky.node.utilMod.InspectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: InspectOptions
}

object AnonOptions {
  @scala.inline
  def apply(options: InspectOptions): AnonOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOptions]
  }
}


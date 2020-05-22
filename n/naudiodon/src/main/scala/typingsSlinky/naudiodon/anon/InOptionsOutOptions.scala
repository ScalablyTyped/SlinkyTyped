package typingsSlinky.naudiodon.anon

import typingsSlinky.naudiodon.mod.AudioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InOptionsOutOptions extends js.Object {
  var inOptions: AudioOptions
  var outOptions: AudioOptions
}

object InOptionsOutOptions {
  @scala.inline
  def apply(inOptions: AudioOptions, outOptions: AudioOptions): InOptionsOutOptions = {
    val __obj = js.Dynamic.literal(inOptions = inOptions.asInstanceOf[js.Any], outOptions = outOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InOptionsOutOptions]
  }
}


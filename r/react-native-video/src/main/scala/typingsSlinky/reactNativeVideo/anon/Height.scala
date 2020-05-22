package typingsSlinky.reactNativeVideo.anon

import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.horizontal
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.landscape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var height: Double
  var orientation: horizontal | landscape
  var width: Double
}

object Height {
  @scala.inline
  def apply(height: Double, orientation: horizontal | landscape, width: Double): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}


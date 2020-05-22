package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputScrollEventData extends js.Object {
  var contentOffset: X
}

object TextInputScrollEventData {
  @scala.inline
  def apply(contentOffset: X): TextInputScrollEventData = {
    val __obj = js.Dynamic.literal(contentOffset = contentOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputScrollEventData]
  }
}


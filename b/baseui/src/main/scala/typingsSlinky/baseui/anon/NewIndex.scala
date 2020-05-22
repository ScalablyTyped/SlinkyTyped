package typingsSlinky.baseui.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewIndex extends js.Object {
  var newIndex: Double
  var newState: js.Array[TagMod[Any]]
  var oldIndex: Double
}

object NewIndex {
  @scala.inline
  def apply(newIndex: Double, newState: js.Array[TagMod[Any]], oldIndex: Double): NewIndex = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], newState = newState.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewIndex]
  }
}


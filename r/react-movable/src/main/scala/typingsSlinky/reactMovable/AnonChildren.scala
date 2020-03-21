package typingsSlinky.reactMovable

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: TagMod[Any]
  var isDragged: Boolean
  var props: AnonRef
}

object AnonChildren {
  @scala.inline
  def apply(children: TagMod[Any], isDragged: Boolean, props: AnonRef): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildren]
  }
}


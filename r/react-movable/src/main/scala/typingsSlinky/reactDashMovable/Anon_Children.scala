package typingsSlinky.reactDashMovable

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: TagMod[Any]
  var isDragged: Boolean
  var props: Anon_Ref
}

object Anon_Children {
  @scala.inline
  def apply(children: TagMod[Any], isDragged: Boolean, props: Anon_Ref): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Children]
  }
}


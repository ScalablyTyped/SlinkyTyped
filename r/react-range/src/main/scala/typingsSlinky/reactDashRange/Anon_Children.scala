package typingsSlinky.reactDashRange

import slinky.core.TagMod
import typingsSlinky.reactDashRange.libTypesMod.ITrackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: TagMod[Any]
  var disabled: Boolean
  var isDragged: Boolean
  var props: ITrackProps
}

object Anon_Children {
  @scala.inline
  def apply(children: TagMod[Any], disabled: Boolean, isDragged: Boolean, props: ITrackProps): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Children]
  }
}


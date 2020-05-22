package typingsSlinky.reactRange.anon

import slinky.core.TagMod
import typingsSlinky.reactRange.typesMod.ITrackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: TagMod[Any]
  var disabled: Boolean
  var isDragged: Boolean
  var props: ITrackProps
}

object Children {
  @scala.inline
  def apply(disabled: Boolean, isDragged: Boolean, props: ITrackProps, children: TagMod[Any] = null): Children = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}


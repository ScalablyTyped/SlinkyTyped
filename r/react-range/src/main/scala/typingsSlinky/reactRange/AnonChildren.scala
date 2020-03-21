package typingsSlinky.reactRange

import slinky.core.TagMod
import typingsSlinky.reactRange.typesMod.ITrackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: TagMod[Any]
  var disabled: Boolean
  var isDragged: Boolean
  var props: ITrackProps
}

object AnonChildren {
  @scala.inline
  def apply(children: TagMod[Any], disabled: Boolean, isDragged: Boolean, props: ITrackProps): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildren]
  }
}


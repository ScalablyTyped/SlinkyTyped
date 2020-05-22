package typingsSlinky.reactDnd.dragPreviewImageMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactDnd.connectorsMod.ConnectDragPreview
import typingsSlinky.reactDnd.connectorsMod.ConnectableElement
import typingsSlinky.reactDnd.optionsMod.DragPreviewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragPreviewImageProps extends js.Object {
  var connect: ConnectDragPreview
  var src: String
}

object DragPreviewImageProps {
  @scala.inline
  def apply(
    connect: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null,
    src: String
  ): DragPreviewImageProps = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragPreviewImageProps]
  }
}


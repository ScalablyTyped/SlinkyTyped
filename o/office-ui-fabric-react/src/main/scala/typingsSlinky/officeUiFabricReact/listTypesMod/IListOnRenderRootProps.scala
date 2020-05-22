package typingsSlinky.officeUiFabricReact.listTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListOnRenderRootProps[T] extends js.Object {
  /**
    * Props to apply to the list root element.
    */
  var divProps: HTMLAttributes[HTMLDivElement]
  /**
    * The active pages to be rendered into the list.
    * These will have been rendered using `onRenderPage`.
    */
  var pages: js.Array[IPage[T]]
  /**
    * The ref to be applied to the list root.
    * The `List` uses this element to track scroll position and sizing.
    */
  var rootRef: Ref[HTMLDivElement]
  /**
    * The content to be rendered as the list surface element.
    * This will have been rendered using `onRenderSurface`.
    */
  var surfaceElement: ReactElement | Null
}

object IListOnRenderRootProps {
  @scala.inline
  def apply[T](
    divProps: HTMLAttributes[HTMLDivElement],
    pages: js.Array[IPage[T]],
    rootRef: Ref[HTMLDivElement] = null,
    surfaceElement: ReactElement = null
  ): IListOnRenderRootProps[T] = {
    val __obj = js.Dynamic.literal(divProps = divProps.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], rootRef = rootRef.asInstanceOf[js.Any], surfaceElement = surfaceElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListOnRenderRootProps[T]]
  }
}


package typingsSlinky.officeUiFabricReact.listTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListOnRenderSurfaceProps[T] extends js.Object {
  /**
    * Props to apply to the list surface element.
    */
  var divProps: HTMLAttributes[HTMLDivElement]
  /**
    * The content to be rendered representing all active pages.
    */
  var pageElements: js.Array[ReactElement]
  /**
    * The active pages to be rendered into the list.
    * These will have been rendered using `onRenderPage`.
    */
  var pages: js.Array[IPage[T]]
  /**
    * A ref to be applied to the surface element.
    * The `List` uses this element to track content size and focus.
    */
  var surfaceRef: Ref[HTMLDivElement]
}

object IListOnRenderSurfaceProps {
  @scala.inline
  def apply[T](
    divProps: HTMLAttributes[HTMLDivElement],
    pageElements: js.Array[ReactElement],
    pages: js.Array[IPage[T]],
    surfaceRef: Ref[HTMLDivElement] = null
  ): IListOnRenderSurfaceProps[T] = {
    val __obj = js.Dynamic.literal(divProps = divProps.asInstanceOf[js.Any], pageElements = pageElements.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], surfaceRef = surfaceRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListOnRenderSurfaceProps[T]]
  }
}


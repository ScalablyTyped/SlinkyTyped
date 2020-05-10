package typingsSlinky.blueprintjsSelect.queryListMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsSelect.listItemsPropsMod.IListItemsProps
import typingsSlinky.react.mod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQueryListProps[T] extends IListItemsProps[T] {
  /**
    * Whether the list is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Initial active item, useful if the parent component is controlling its selectedItem but
    * not activeItem.
    */
  var initialActiveItem: js.UndefOr[T] = js.native
  /**
    * Callback invoked when user presses a key, after processing `QueryList`'s own key events
    * (up/down to navigate active item). This callback is passed to `renderer` and (along with
    * `onKeyUp`) can be attached to arbitrary content elements to support keyboard selection.
    */
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  /**
    * Callback invoked when user releases a key, after processing `QueryList`'s own key events
    * (enter to select active item). This callback is passed to `renderer` and (along with
    * `onKeyDown`) can be attached to arbitrary content elements to support keyboard selection.
    */
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  /**
    * Customize rendering of the component.
    * Receives an object with props that should be applied to elements as necessary.
    */
  def renderer(listProps: IQueryListRendererProps[T]): ReactElement = js.native
}


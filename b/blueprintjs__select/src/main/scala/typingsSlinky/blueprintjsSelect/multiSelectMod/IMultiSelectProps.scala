package typingsSlinky.blueprintjsSelect.multiSelectMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsSelect.anon.PartialIPopoverProps
import typingsSlinky.blueprintjsSelect.anon.PartialITagInputProps
import typingsSlinky.blueprintjsSelect.listItemsPropsMod.IListItemsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMultiSelectProps[T] extends IListItemsProps[T] {
  
  /**
    * Whether the component should take up the full width of its container.
    * This overrides `popoverProps.fill` and `tagInputProps.fill`.
    */
  var fill: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the component waits until a keydown event in the TagInput
    * before opening its popover.
    *
    * If false, the popover opens immediately after a mouse click focuses
    * the component's TagInput.
    *
    * N.B. the behavior of this prop differs slightly from the same one
    * in the Suggest component; see https://github.com/palantir/blueprint/issues/4152.
    *
    * @default false
    */
  var openOnKeyDown: js.UndefOr[Boolean] = js.native
  
  /**
    * Input placeholder text. Shorthand for `tagInputProps.placeholder`.
    * @default "Search..."
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /** Props to spread to `Popover`. Note that `content` cannot be changed. */
  var popoverProps: js.UndefOr[PartialIPopoverProps with js.Object] = js.native
  
  /** Controlled selected values. */
  var selectedItems: js.UndefOr[js.Array[T]] = js.native
  
  /** Props to spread to `TagInput`. Use `query` and `onQueryChange` to control the input. */
  var tagInputProps: js.UndefOr[PartialITagInputProps with js.Object] = js.native
  
  /** Custom renderer to transform an item into tag content. */
  def tagRenderer(item: T): ReactElement = js.native
}

package typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState
import typingsSlinky.officeUiFabricReact.libSelectionMod.Selection
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseSelectedItemsListProps[T]
  extends ClassAttributes[js.Any] {
  /**
    * A callback on whether this item can be deleted
    */
  var canRemoveItem: js.UndefOr[js.Function1[/* item */ T, Boolean]] = js.native
  var componentRef: js.UndefOr[IRefObject[IBaseSelectedItemsList[T]]] = js.native
  /**
    * Function that specifies how arbitrary text entered into the well is handled.
    */
  var createGenericItem: js.UndefOr[
    js.Function2[/* input */ String, /* ValidationState */ ValidationState, ISuggestionModel[T]]
  ] = js.native
  /**
    * Initial items that have already been selected and should appear in the people picker.
    */
  var defaultSelectedItems: js.UndefOr[js.Array[T]] = js.native
  /**
    * A callback for when the selected list of items changes.
    */
  var onChange: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Array[T]], Unit]] = js.native
  /**
    * A callback for when items are copied
    */
  var onCopyItems: js.UndefOr[js.Function1[/* items */ js.Array[T], String]] = js.native
  /**
    * A callback when an item is deleted
    * @deprecated Use `onItemsDeleted` instead.
    */
  var onItemDeleted: js.UndefOr[js.Function1[/* deletedItem */ T, Unit]] = js.native
  /**
    * A callback to process a selection after the user selects something from the picker.
    */
  var onItemSelected: js.UndefOr[js.Function1[/* selectedItem */ js.UndefOr[T], T | js.Thenable[T]]] = js.native
  /**
    * A callback when and item or items are deleted
    */
  var onItemsDeleted: js.UndefOr[js.Function1[/* deletedItems */ js.Array[T], Unit]] = js.native
  /**
    * Function that specifies how the selected item will appear.
    */
  var onRenderItem: js.UndefOr[js.Function1[/* props */ ISelectedItemProps[T], ReactElement]] = js.native
  /**
    * Aria label for the 'X' button in the selected item component.
    * @defaultvalue ''
    */
  var removeButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * The items that the base picker should currently display as selected.
    * If this is provided then the picker will act as a controlled component.
    */
  var selectedItems: js.UndefOr[js.Array[T]] = js.native
  /**
    * The selection
    */
  var selection: js.UndefOr[Selection[IObjectWithKey]] = js.native
}

object IBaseSelectedItemsListProps {
  @scala.inline
  def apply[T](): IBaseSelectedItemsListProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseSelectedItemsListProps[T]]
  }
  @scala.inline
  implicit class IBaseSelectedItemsListPropsOps[Self[t] <: IBaseSelectedItemsListProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCanRemoveItem(value: /* item */ T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRemoveItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCanRemoveItem: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRemoveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IBaseSelectedItemsList[T] | Null => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IBaseSelectedItemsList[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IBaseSelectedItemsList[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateGenericItem(value: (/* input */ String, /* ValidationState */ ValidationState) => ISuggestionModel[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createGenericItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreateGenericItem: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createGenericItem")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSelectedItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelectedItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* items */ js.UndefOr[js.Array[T]] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopyItems(value: /* items */ js.Array[T] => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopyItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCopyItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopyItems")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemDeleted(value: /* deletedItem */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDeleted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemDeleted: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemSelected(value: /* selectedItem */ js.UndefOr[T] => T | js.Thenable[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemSelected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemsDeleted(value: /* deletedItems */ js.Array[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemsDeleted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemsDeleted: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemsDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderItem(value: /* props */ ISelectedItemProps[T] => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRenderItem: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItem")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveButtonAriaLabel(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveButtonAriaLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButtonAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: Selection[IObjectWithKey]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
  }
  
}


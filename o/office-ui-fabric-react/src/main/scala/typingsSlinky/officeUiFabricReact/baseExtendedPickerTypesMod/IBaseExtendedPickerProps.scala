package typingsSlinky.officeUiFabricReact.baseExtendedPickerTypesMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IInputProps
import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typingsSlinky.officeUiFabricReact.libAutofillMod.Autofill
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseExtendedPickerProps[T] extends js.Object {
  /**
    * ClassName for the picker.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Ref of the component
    */
  var componentRef: js.UndefOr[IRefObject[IBaseExtendedPicker[T]]] = js.native
  /**
    * Current rendered query string that's corealte to current rendered result
    **/
  var currentRenderedQueryString: js.UndefOr[String] = js.native
  /**
    * Initial items that have already been selected and should appear in the people picker.
    */
  var defaultSelectedItems: js.UndefOr[js.Array[T]] = js.native
  /**
    * Flag for disabling the picker.
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Floating picker properties
    */
  var floatingPickerProps: IBaseFloatingPickerProps[T] = js.native
  /**
    * Focus zone props
    */
  var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.native
  /**
    * Header/title element for the picker
    */
  var headerComponent: js.UndefOr[ReactElement] = js.native
  /**
    * Autofill input native props
    * @defaultvalue undefined
    */
  var inputProps: js.UndefOr[IInputProps] = js.native
  /**
    * Restrict the amount of selectable items.
    * @defaultvalue undefined
    */
  var itemLimit: js.UndefOr[Double] = js.native
  /**
    * A callback for when the user moves the focus away from the picker
    */
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement | Autofill]] = js.native
  /**
    * A callback for when the selected list of items changes.
    */
  var onChange: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Array[T]], Unit]] = js.native
  /**
    * A callback for when the user put focus on the picker
    */
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement | Autofill]] = js.native
  /**
    * A callback on when an item was added to the selected item list
    */
  var onItemAdded: js.UndefOr[js.Function1[/* addedItem */ T, Unit]] = js.native
  /**
    * A callback to process a selection after the user selects a suggestion from the picker.
    * The returned item will be added to the selected items list
    */
  var onItemSelected: js.UndefOr[js.Function1[/* selectedItem */ js.UndefOr[T], T | js.Thenable[T]]] = js.native
  /**
    * A callback on when an item or items were removed from the selected item list
    */
  var onItemsRemoved: js.UndefOr[js.Function1[/* removedItems */ js.Array[T], Unit]] = js.native
  /**
    * A callback for when text is pasted into the input
    */
  var onPaste: js.UndefOr[js.Function1[/* pastedText */ String, js.Array[T]]] = js.native
  /**
    * Function that specifies how the floating picker will appear.
    */
  var onRenderFloatingPicker: ReactComponentClass[IBaseFloatingPickerProps[T]] = js.native
  /**
    * Function that specifies how the floating picker will appear.
    */
  var onRenderSelectedItems: ReactComponentClass[IBaseSelectedItemsListProps[T]] = js.native
  /**
    * If using as a controlled component use selectedItems here instead of the SelectedItemsList
    */
  var selectedItems: js.UndefOr[js.Array[T]] = js.native
  /**
    * Selected items list properties
    */
  var selectedItemsListProps: IBaseSelectedItemsListProps[T] = js.native
  /**
    * If using as a controlled component use suggestionItems here instead of FloatingPicker
    */
  var suggestionItems: js.UndefOr[js.Array[T]] = js.native
}

object IBaseExtendedPickerProps {
  @scala.inline
  def apply[T](
    floatingPickerProps: IBaseFloatingPickerProps[T],
    onRenderFloatingPicker: ReactComponentClass[IBaseFloatingPickerProps[T]],
    onRenderSelectedItems: ReactComponentClass[IBaseSelectedItemsListProps[T]],
    selectedItemsListProps: IBaseSelectedItemsListProps[T]
  ): IBaseExtendedPickerProps[T] = {
    val __obj = js.Dynamic.literal(floatingPickerProps = floatingPickerProps.asInstanceOf[js.Any], onRenderFloatingPicker = onRenderFloatingPicker.asInstanceOf[js.Any], onRenderSelectedItems = onRenderSelectedItems.asInstanceOf[js.Any], selectedItemsListProps = selectedItemsListProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseExtendedPickerProps[T]]
  }
  @scala.inline
  implicit class IBaseExtendedPickerPropsOps[Self[t] <: IBaseExtendedPickerProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFloatingPickerProps(value: IBaseFloatingPickerProps[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingPickerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRenderFloatingPicker(value: ReactComponentClass[IBaseFloatingPickerProps[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderFloatingPicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRenderSelectedItems(value: ReactComponentClass[IBaseSelectedItemsListProps[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderSelectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedItemsListProps(value: IBaseSelectedItemsListProps[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemsListProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IBaseExtendedPicker[T] | Null => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IBaseExtendedPicker[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IBaseExtendedPicker[T]]): Self[T] = {
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
    def withCurrentRenderedQueryString(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRenderedQueryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentRenderedQueryString: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRenderedQueryString")(js.undefined)
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
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusZoneProps(value: IFocusZoneProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusZoneProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusZoneProps: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusZoneProps")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderComponent(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderComponent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProps(value: IInputProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProps: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withItemLimit(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemLimit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: SyntheticFocusEvent[HTMLInputElement | Autofill] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
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
    def withOnFocus(value: SyntheticFocusEvent[HTMLInputElement | Autofill] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemAdded(value: /* addedItem */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemAdded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemAdded: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemAdded")(js.undefined)
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
    def withOnItemsRemoved(value: /* removedItems */ js.Array[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemsRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemsRemoved: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemsRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPaste(value: /* pastedText */ String => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPaste: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.undefined)
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
    def withSuggestionItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionItems")(js.undefined)
        ret
    }
  }
  
}


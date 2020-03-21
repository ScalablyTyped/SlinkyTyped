package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.input.tag
import typingsSlinky.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPicker
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IInputProps
import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typingsSlinky.officeUiFabricReact.extendedPeoplePickerMod.IExtendedPeoplePickerProps
import typingsSlinky.officeUiFabricReact.focusZoneTypesMod.IFocusZoneProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IExtendedPeoplePickerProps1507728780[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(
    floatingPickerProps: IBaseFloatingPickerProps[IPersonaProps],
    onRenderFloatingPicker: ReactComponentClass[IBaseFloatingPickerProps[IPersonaProps]],
    onRenderSelectedItems: ReactComponentClass[IBaseSelectedItemsListProps[IPersonaProps]],
    selectedItemsListProps: IBaseSelectedItemsListProps[IPersonaProps],
    componentRef: IRefObject[IBaseExtendedPicker[IPersonaProps]] = null,
    currentRenderedQueryString: String = null,
    defaultSelectedItems: js.Array[IPersonaProps] = null,
    focusZoneProps: IFocusZoneProps = null,
    headerComponent: ReactElement = null,
    inputProps: IInputProps = null,
    itemLimit: Int | Double = null,
    onBlur: SyntheticFocusEvent[HTMLInputElement | typingsSlinky.officeUiFabricReact.libAutofillMod.Autofill] => Unit = null,
    onChange: /* items */ js.UndefOr[js.Array[IPersonaProps]] => Unit = null,
    onFocus: SyntheticFocusEvent[HTMLInputElement | typingsSlinky.officeUiFabricReact.libAutofillMod.Autofill] => Unit = null,
    onItemAdded: IPersonaProps => Unit = null,
    onItemSelected: /* selectedItem */ js.UndefOr[IPersonaProps] => IPersonaProps | js.Thenable[IPersonaProps] = null,
    onItemsRemoved: /* removedItems */ js.Array[IPersonaProps] => Unit = null,
    onPaste: /* pastedText */ String => js.Array[IPersonaProps] = null,
    selectedItems: js.Array[IPersonaProps] = null,
    suggestionItems: js.Array[IPersonaProps] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(floatingPickerProps = floatingPickerProps.asInstanceOf[js.Any], onRenderFloatingPicker = onRenderFloatingPicker.asInstanceOf[js.Any], onRenderSelectedItems = onRenderSelectedItems.asInstanceOf[js.Any], selectedItemsListProps = selectedItemsListProps.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (currentRenderedQueryString != null) __obj.updateDynamic("currentRenderedQueryString")(currentRenderedQueryString.asInstanceOf[js.Any])
    if (defaultSelectedItems != null) __obj.updateDynamic("defaultSelectedItems")(defaultSelectedItems.asInstanceOf[js.Any])
    if (focusZoneProps != null) __obj.updateDynamic("focusZoneProps")(focusZoneProps.asInstanceOf[js.Any])
    if (headerComponent != null) __obj.updateDynamic("headerComponent")(headerComponent.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (itemLimit != null) __obj.updateDynamic("itemLimit")(itemLimit.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onItemAdded != null) __obj.updateDynamic("onItemAdded")(js.Any.fromFunction1(onItemAdded))
    if (onItemSelected != null) __obj.updateDynamic("onItemSelected")(js.Any.fromFunction1(onItemSelected))
    if (onItemsRemoved != null) __obj.updateDynamic("onItemsRemoved")(js.Any.fromFunction1(onItemsRemoved))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (suggestionItems != null) __obj.updateDynamic("suggestionItems")(suggestionItems.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IExtendedPeoplePickerProps
}


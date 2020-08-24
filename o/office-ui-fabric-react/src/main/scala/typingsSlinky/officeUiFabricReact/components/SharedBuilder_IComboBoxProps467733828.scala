package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.anon.PartialIButtonStyles
import typingsSlinky.officeUiFabricReact.anon.PartialIComboBoxOptionSty
import typingsSlinky.officeUiFabricReact.anon.PartialIComboBoxStyles
import typingsSlinky.officeUiFabricReact.autofillTypesMod.IAutofillProps
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.comboBoxClassNamesMod.IComboBoxClassNames
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBox
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBoxOption
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IOnRenderComboBoxLabelProps
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.on
import typingsSlinky.officeUiFabricReact.panelTypesMod.IPanelProps
import typingsSlinky.officeUiFabricReact.selectableDroppableTextTypesMod.ISelectableDroppableTextProps
import typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.reactStrings.`additions text`
import typingsSlinky.react.reactStrings.`inline`
import typingsSlinky.react.reactStrings.additions
import typingsSlinky.react.reactStrings.all
import typingsSlinky.react.reactStrings.ascending
import typingsSlinky.react.reactStrings.assertive
import typingsSlinky.react.reactStrings.both
import typingsSlinky.react.reactStrings.copy
import typingsSlinky.react.reactStrings.date
import typingsSlinky.react.reactStrings.decimal
import typingsSlinky.react.reactStrings.descending
import typingsSlinky.react.reactStrings.dialog
import typingsSlinky.react.reactStrings.email
import typingsSlinky.react.reactStrings.execute
import typingsSlinky.react.reactStrings.grammar
import typingsSlinky.react.reactStrings.grid
import typingsSlinky.react.reactStrings.horizontal
import typingsSlinky.react.reactStrings.inherit
import typingsSlinky.react.reactStrings.link
import typingsSlinky.react.reactStrings.list
import typingsSlinky.react.reactStrings.listbox
import typingsSlinky.react.reactStrings.location
import typingsSlinky.react.reactStrings.menu
import typingsSlinky.react.reactStrings.mixed
import typingsSlinky.react.reactStrings.move
import typingsSlinky.react.reactStrings.no
import typingsSlinky.react.reactStrings.none
import typingsSlinky.react.reactStrings.numeric
import typingsSlinky.react.reactStrings.off
import typingsSlinky.react.reactStrings.other
import typingsSlinky.react.reactStrings.page
import typingsSlinky.react.reactStrings.polite
import typingsSlinky.react.reactStrings.popup
import typingsSlinky.react.reactStrings.removals
import typingsSlinky.react.reactStrings.search
import typingsSlinky.react.reactStrings.spelling
import typingsSlinky.react.reactStrings.step
import typingsSlinky.react.reactStrings.tel
import typingsSlinky.react.reactStrings.text
import typingsSlinky.react.reactStrings.time
import typingsSlinky.react.reactStrings.tree
import typingsSlinky.react.reactStrings.url
import typingsSlinky.react.reactStrings.vertical
import typingsSlinky.react.reactStrings.yes
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_IComboBoxProps467733828[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
  @scala.inline
  def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
  @scala.inline
  def allowFreeform(value: Boolean): this.type = set("allowFreeform", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-atomic`(value: Boolean): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-busy`(value: Boolean): this.type = set("aria-busy", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-disabled`(value: Boolean): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-expanded`(value: Boolean): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-grabbed`(value: Boolean): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-hidden`(value: Boolean): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-modal`(value: Boolean): this.type = set("aria-modal", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-multiline`(value: Boolean): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-multiselectable`(value: Boolean): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-readonly`(value: Boolean): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-relevant`(value: additions | (`additions text`) | all | removals | text): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-required`(value: Boolean): this.type = set("aria-required", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-selected`(value: Boolean): this.type = set("aria-selected", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
  @scala.inline
  def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
  @scala.inline
  def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
  @scala.inline
  def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
  @scala.inline
  def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
  @scala.inline
  def autoComplete(value: on | typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.off): this.type = set("autoComplete", value.asInstanceOf[js.Any])
  @scala.inline
  def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
  @scala.inline
  def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
  @scala.inline
  def autofill(value: IAutofillProps): this.type = set("autofill", value.asInstanceOf[js.Any])
  @scala.inline
  def buttonIconProps(value: IIconProps): this.type = set("buttonIconProps", value.asInstanceOf[js.Any])
  @scala.inline
  def calloutProps(value: ICalloutProps): this.type = set("calloutProps", value.asInstanceOf[js.Any])
  @scala.inline
  def caretDownButtonStyles(value: PartialIButtonStyles): this.type = set("caretDownButtonStyles", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  @scala.inline
  def comboBoxOptionStyles(value: PartialIComboBoxOptionSty): this.type = set("comboBoxOptionStyles", value.asInstanceOf[js.Any])
  @scala.inline
  def componentRefFunction1(value: /* ref */ IComboBox | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
  @scala.inline
  def componentRefRefObject(value: ReactRef[IComboBox]): this.type = set("componentRef", value.asInstanceOf[js.Any])
  @scala.inline
  def componentRef(value: IRefObject[IComboBox]): this.type = set("componentRef", value.asInstanceOf[js.Any])
  @scala.inline
  def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
  @scala.inline
  def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
  @scala.inline
  def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
  @scala.inline
  def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
  @scala.inline
  def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
  @scala.inline
  def defaultSelectedKeyVarargs(value: (Double | String)*): this.type = set("defaultSelectedKey", js.Array(value :_*))
  @scala.inline
  def defaultSelectedKey(value: String | Double | (js.Array[Double | String])): this.type = set("defaultSelectedKey", value.asInstanceOf[js.Any])
  @scala.inline
  def defaultSelectedKeyNull: this.type = set("defaultSelectedKey", null)
  @scala.inline
  def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
  @scala.inline
  def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  @scala.inline
  def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  @scala.inline
  def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
  @scala.inline
  def dropdownMaxWidth(value: Double): this.type = set("dropdownMaxWidth", value.asInstanceOf[js.Any])
  @scala.inline
  def dropdownWidth(value: Double): this.type = set("dropdownWidth", value.asInstanceOf[js.Any])
  @scala.inline
  def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
  @scala.inline
  def getClassNames(
    value: (/* theme */ ITheme, /* isOpen */ Boolean, /* disabled */ Boolean, /* required */ Boolean, /* focused */ Boolean, /* allowFreeForm */ Boolean, /* hasErrorMessage */ Boolean, /* className */ js.UndefOr[String]) => IComboBoxClassNames
  ): this.type = set("getClassNames", js.Any.fromFunction8(value))
  @scala.inline
  def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
  @scala.inline
  def iconButtonProps(value: IButtonProps): this.type = set("iconButtonProps", value.asInstanceOf[js.Any])
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  @scala.inline
  def inlist(value: js.Any): this.type = set("inlist", value.asInstanceOf[js.Any])
  @scala.inline
  def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
  @scala.inline
  def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
  @scala.inline
  def isButtonAriaHidden(value: Boolean): this.type = set("isButtonAriaHidden", value.asInstanceOf[js.Any])
  @scala.inline
  def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
  @scala.inline
  def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
  @scala.inline
  def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
  @scala.inline
  def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
  @scala.inline
  def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
  @scala.inline
  def keytipProps(value: IKeytipProps): this.type = set("keytipProps", value.asInstanceOf[js.Any])
  @scala.inline
  def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
  @scala.inline
  def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
  @scala.inline
  def multiSelect(value: Boolean): this.type = set("multiSelect", value.asInstanceOf[js.Any])
  @scala.inline
  def multiSelectDelimiter(value: String): this.type = set("multiSelectDelimiter", value.asInstanceOf[js.Any])
  @scala.inline
  def onAbort(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
  @scala.inline
  def onAnimationEnd(value: SyntheticAnimationEvent[IComboBox] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
  @scala.inline
  def onAnimationIteration(value: SyntheticAnimationEvent[IComboBox] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
  @scala.inline
  def onAnimationStart(value: SyntheticAnimationEvent[IComboBox] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
  @scala.inline
  def onAuxClick(value: SyntheticMouseEvent[IComboBox] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
  @scala.inline
  def onBeforeInput(value: SyntheticEvent[EventTarget with IComboBox, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
  @scala.inline
  def onBlur(value: SyntheticFocusEvent[IComboBox] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
  @scala.inline
  def onCanPlay(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
  @scala.inline
  def onCanPlayThrough(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
  @scala.inline
  def onChange(
    value: (SyntheticEvent[EventTarget with IComboBox, Event], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Unit
  ): this.type = set("onChange", js.Any.fromFunction4(value))
  @scala.inline
  def onClick(value: SyntheticMouseEvent[IComboBox] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  @scala.inline
  def onCompositionEnd(value: SyntheticCompositionEvent[IComboBox] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
  @scala.inline
  def onCompositionStart(value: SyntheticCompositionEvent[IComboBox] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
  @scala.inline
  def onCompositionUpdate(value: SyntheticCompositionEvent[IComboBox] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
  @scala.inline
  def onContextMenu(value: SyntheticMouseEvent[IComboBox] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
  @scala.inline
  def onCopy(value: SyntheticClipboardEvent[IComboBox] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
  @scala.inline
  def onCut(value: SyntheticClipboardEvent[IComboBox] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
  @scala.inline
  def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
  @scala.inline
  def onDoubleClick(value: SyntheticMouseEvent[IComboBox] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
  @scala.inline
  def onDrag(value: DragEvent[IComboBox] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
  @scala.inline
  def onDragEnd(value: DragEvent[IComboBox] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
  @scala.inline
  def onDragEnter(value: DragEvent[IComboBox] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
  @scala.inline
  def onDragExit(value: DragEvent[IComboBox] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
  @scala.inline
  def onDragLeave(value: DragEvent[IComboBox] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
  @scala.inline
  def onDragOver(value: DragEvent[IComboBox] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
  @scala.inline
  def onDragStart(value: DragEvent[IComboBox] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
  @scala.inline
  def onDrop(value: DragEvent[IComboBox] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
  @scala.inline
  def onDurationChange(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
  @scala.inline
  def onEmptied(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
  @scala.inline
  def onEncrypted(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
  @scala.inline
  def onEnded(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
  @scala.inline
  def onError(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
  @scala.inline
  def onFocus(value: SyntheticFocusEvent[IComboBox] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
  @scala.inline
  def onInput(value: SyntheticEvent[EventTarget with IComboBox, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
  @scala.inline
  def onInvalid(value: SyntheticEvent[EventTarget with IComboBox, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
  @scala.inline
  def onItemClick(
    value: (SyntheticEvent[EventTarget with IComboBox, Event], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double]) => Unit
  ): this.type = set("onItemClick", js.Any.fromFunction3(value))
  @scala.inline
  def onKeyDown(value: SyntheticKeyboardEvent[IComboBox] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
  @scala.inline
  def onKeyPress(value: SyntheticKeyboardEvent[IComboBox] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
  @scala.inline
  def onKeyUp(value: SyntheticKeyboardEvent[IComboBox] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
  @scala.inline
  def onLoad(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
  @scala.inline
  def onLoadStart(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
  @scala.inline
  def onLoadedData(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
  @scala.inline
  def onLoadedMetadata(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
  @scala.inline
  def onMenuDismiss(value: () => Unit): this.type = set("onMenuDismiss", js.Any.fromFunction0(value))
  @scala.inline
  def onMenuDismissed(value: () => Unit): this.type = set("onMenuDismissed", js.Any.fromFunction0(value))
  @scala.inline
  def onMenuOpen(value: () => Unit): this.type = set("onMenuOpen", js.Any.fromFunction0(value))
  @scala.inline
  def onMouseDown(value: SyntheticMouseEvent[IComboBox] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
  @scala.inline
  def onMouseEnter(value: SyntheticMouseEvent[IComboBox] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  @scala.inline
  def onMouseLeave(value: SyntheticMouseEvent[IComboBox] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  @scala.inline
  def onMouseMove(value: SyntheticMouseEvent[IComboBox] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
  @scala.inline
  def onMouseOut(value: SyntheticMouseEvent[IComboBox] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
  @scala.inline
  def onMouseOver(value: SyntheticMouseEvent[IComboBox] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
  @scala.inline
  def onMouseUp(value: SyntheticMouseEvent[IComboBox] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
  @scala.inline
  def onPaste(value: SyntheticClipboardEvent[IComboBox] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
  @scala.inline
  def onPause(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
  @scala.inline
  def onPendingValueChanged(
    value: (/* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Unit
  ): this.type = set("onPendingValueChanged", js.Any.fromFunction3(value))
  @scala.inline
  def onPlay(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
  @scala.inline
  def onPlaying(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerCancel(value: SyntheticPointerEvent[IComboBox] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerDown(value: SyntheticPointerEvent[IComboBox] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerEnter(value: SyntheticPointerEvent[IComboBox] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerLeave(value: SyntheticPointerEvent[IComboBox] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerMove(value: SyntheticPointerEvent[IComboBox] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerOut(value: SyntheticPointerEvent[IComboBox] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerOver(value: SyntheticPointerEvent[IComboBox] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
  @scala.inline
  def onPointerUp(value: SyntheticPointerEvent[IComboBox] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
  @scala.inline
  def onProgress(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
  @scala.inline
  def onRateChange(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
  @scala.inline
  def onRenderContainer(
    value: (/* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], 
        ReactElement | Null
      ]
    ]) => ReactElement | Null
  ): this.type = set("onRenderContainer", js.Any.fromFunction2(value))
  @scala.inline
  def onRenderItem(
    value: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ISelectableOption], ReactElement | Null]]) => ReactElement | Null
  ): this.type = set("onRenderItem", js.Any.fromFunction2(value))
  @scala.inline
  def onRenderLabel(
    value: (/* props */ js.UndefOr[IOnRenderComboBoxLabelProps], /* defaultRender */ js.UndefOr[
      js.Function1[/* props */ js.UndefOr[IOnRenderComboBoxLabelProps], ReactElement | Null]
    ]) => ReactElement | Null
  ): this.type = set("onRenderLabel", js.Any.fromFunction2(value))
  @scala.inline
  def onRenderList(
    value: (/* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], 
        ReactElement | Null
      ]
    ]) => ReactElement | Null
  ): this.type = set("onRenderList", js.Any.fromFunction2(value))
  @scala.inline
  def onRenderLowerContent(
    value: (/* props */ js.UndefOr[IComboBoxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IComboBoxProps], ReactElement | Null]]) => ReactElement | Null
  ): this.type = set("onRenderLowerContent", js.Any.fromFunction2(value))
  @scala.inline
  def onRenderOption(
    value: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ISelectableOption], ReactElement | Null]]) => ReactElement | Null
  ): this.type = set("onRenderOption", js.Any.fromFunction2(value))
  @scala.inline
  def onRenderUpperContent(
    value: (/* props */ js.UndefOr[IComboBoxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IComboBoxProps], ReactElement | Null]]) => ReactElement | Null
  ): this.type = set("onRenderUpperContent", js.Any.fromFunction2(value))
  @scala.inline
  def onReset(value: SyntheticEvent[EventTarget with IComboBox, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
  @scala.inline
  def onResolveOptions(
    value: /* options */ js.Array[IComboBoxOption] => js.Array[IComboBoxOption] | js.Thenable[js.Array[IComboBoxOption]]
  ): this.type = set("onResolveOptions", js.Any.fromFunction1(value))
  @scala.inline
  def onScroll(value: SyntheticUIEvent[IComboBox] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
  @scala.inline
  def onScrollToItem(value: /* itemIndex */ Double => Unit): this.type = set("onScrollToItem", js.Any.fromFunction1(value))
  @scala.inline
  def onSeeked(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
  @scala.inline
  def onSeeking(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
  @scala.inline
  def onSelect(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
  @scala.inline
  def onStalled(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
  @scala.inline
  def onSubmit(value: SyntheticEvent[EventTarget with IComboBox, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
  @scala.inline
  def onSuspend(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
  @scala.inline
  def onTimeUpdate(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
  @scala.inline
  def onTouchCancel(value: SyntheticTouchEvent[IComboBox] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
  @scala.inline
  def onTouchEnd(value: SyntheticTouchEvent[IComboBox] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
  @scala.inline
  def onTouchMove(value: SyntheticTouchEvent[IComboBox] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
  @scala.inline
  def onTouchStart(value: SyntheticTouchEvent[IComboBox] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
  @scala.inline
  def onTransitionEnd(value: SyntheticTransitionEvent[IComboBox] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
  @scala.inline
  def onVolumeChange(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
  @scala.inline
  def onWaiting(value: SyntheticEvent[Event, IComboBox] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
  @scala.inline
  def onWheel(value: SyntheticWheelEvent[IComboBox] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
  @scala.inline
  def openOnKeyboardFocus(value: Boolean): this.type = set("openOnKeyboardFocus", value.asInstanceOf[js.Any])
  @scala.inline
  def panelProps(value: IPanelProps): this.type = set("panelProps", value.asInstanceOf[js.Any])
  @scala.inline
  def persistMenu(value: Boolean): this.type = set("persistMenu", value.asInstanceOf[js.Any])
  @scala.inline
  def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  @scala.inline
  def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
  @scala.inline
  def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
  @scala.inline
  def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
  @scala.inline
  def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
  @scala.inline
  def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
  @scala.inline
  def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
  @scala.inline
  def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
  @scala.inline
  def scrollSelectedToTop(value: Boolean): this.type = set("scrollSelectedToTop", value.asInstanceOf[js.Any])
  @scala.inline
  def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
  @scala.inline
  def selectedKeyVarargs(value: (Double | String)*): this.type = set("selectedKey", js.Array(value :_*))
  @scala.inline
  def selectedKey(value: String | Double | (js.Array[Double | String])): this.type = set("selectedKey", value.asInstanceOf[js.Any])
  @scala.inline
  def selectedKeyNull: this.type = set("selectedKey", null)
  @scala.inline
  def shouldRestoreFocus(value: Boolean): this.type = set("shouldRestoreFocus", value.asInstanceOf[js.Any])
  @scala.inline
  def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
  @scala.inline
  def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def styles(value: PartialIComboBoxStyles): this.type = set("styles", value.asInstanceOf[js.Any])
  @scala.inline
  def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
  @scala.inline
  def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
  @scala.inline
  def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  @scala.inline
  def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  @scala.inline
  def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  @scala.inline
  def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  @scala.inline
  def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
  @scala.inline
  def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
  @scala.inline
  def unselectable(value: typingsSlinky.react.reactStrings.on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
  @scala.inline
  def useComboBoxAsMenuWidth(value: Boolean): this.type = set("useComboBoxAsMenuWidth", value.asInstanceOf[js.Any])
  @scala.inline
  def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
}


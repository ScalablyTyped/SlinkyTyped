package typingsSlinky.atMaterialDashUiCore.tableCellTableCellMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLTableDataCellElement
import org.scalajs.dom.raw.HTMLTableHeaderCellElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
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
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`additions text`
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`inline`
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.additions
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.all
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.ascending
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.assertive
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.baseline
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.both
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.bottom
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.center
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.char
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.copy
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.date
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.decimal
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.descending
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.dialog
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.email
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.execute
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grammar
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grid
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.horizontal
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.justify
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.left
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.link
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.list
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.listbox
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.location
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.menu
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.middle
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.mixed
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.move
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.none
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.numeric
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.off
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.on
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.other
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.page
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.polite
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.popup
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.removals
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.right
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.search
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.spelling
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.step
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.tel
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.text
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.time
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.top
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.tree
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.url
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.vertical
import typingsSlinky.react.Anon_Html
import typingsSlinky.react.reactMod.AnimationEventHandler
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.ClipboardEventHandler
import typingsSlinky.react.reactMod.CompositionEventHandler
import typingsSlinky.react.reactMod.DragEvent
import typingsSlinky.react.reactMod.DragEventHandler
import typingsSlinky.react.reactMod.FocusEventHandler
import typingsSlinky.react.reactMod.FormEventHandler
import typingsSlinky.react.reactMod.KeyboardEventHandler
import typingsSlinky.react.reactMod.MouseEventHandler
import typingsSlinky.react.reactMod.PointerEventHandler
import typingsSlinky.react.reactMod.ReactEventHandler
import typingsSlinky.react.reactMod.TouchEventHandler
import typingsSlinky.react.reactMod.TransitionEventHandler
import typingsSlinky.react.reactMod.UIEventHandler
import typingsSlinky.react.reactMod.WheelEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ThHTMLAttributes<std.HTMLTableHeaderCellElement> & react.react.TdHTMLAttributes<std.HTMLTableDataCellElement> */
trait TableCellBaseProps extends js.Object {
  // RDFa Attributes
  var about: js.UndefOr[String] = js.undefined
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.undefined
  var align: js.UndefOr[left | center | right | justify | char] = js.undefined
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
    * @see aria-pressed @see aria-selected.
    */
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  /**
    * Defines the total number of columns in a table, grid, or treegrid.
    * @see aria-colindex.
    */
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  /**
    * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
    * @see aria-colcount @see aria-colspan.
    */
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  /**
    * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-colindex @see aria-rowspan.
    */
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  /**
    * Identifies the element (or elements) whose contents or presence are controlled by the current element.
    * @see aria-owns.
    */
  var `aria-controls`: js.UndefOr[String] = js.undefined
  /** Indicates the element that represents the current item within a container or set of related elements. */
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  /**
    * Identifies the element (or elements) that describes the object.
    * @see aria-labelledby
    */
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  /**
    * Identifies the element that provides a detailed, extended description for the object.
    * @see aria-describedby.
    */
  var `aria-details`: js.UndefOr[String] = js.undefined
  /**
    * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
    * @see aria-hidden @see aria-readonly.
    */
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates what functions can be performed when a dragged object is released on the drop target.
    * @deprecated in ARIA 1.1
    */
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  /**
    * Identifies the element that provides an error message for the object.
    * @see aria-invalid @see aria-describedby.
    */
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the entered value does not conform to the format expected by the application.
    * @see aria-errormessage.
    */
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  /**
    * Defines a string value that labels the current element.
    * @see aria-labelledby.
    */
  var `aria-label`: js.UndefOr[String] = js.undefined
  /**
    * Identifies the element (or elements) that labels the current element.
    * @see aria-describedby.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  /** Defines the hierarchical level of an element within a structure. */
  var `aria-level`: js.UndefOr[Double] = js.undefined
  /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  /** Indicates whether an element is modal when displayed. */
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  /**
    * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
    * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
    * @see aria-controls.
    */
  var `aria-owns`: js.UndefOr[String] = js.undefined
  /**
    * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
    * A hint could be a sample value or a brief description of the expected format.
    */
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  /**
    * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-setsize.
    */
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the current "pressed" state of toggle buttons.
    * @see aria-checked @see aria-selected.
    */
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  /**
    * Indicates that the element is not editable, but is otherwise operable.
    * @see aria-disabled.
    */
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  /** Defines a human-readable, author-localized description for the role of an element. */
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  /**
    * Defines the total number of rows in a table, grid, or treegrid.
    * @see aria-rowindex.
    */
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  /**
    * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
    * @see aria-rowcount @see aria-rowspan.
    */
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  /**
    * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-rowindex @see aria-colspan.
    */
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the current "selected" state of various widgets.
    * @see aria-checked @see aria-pressed.
    */
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-posinset.
    */
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  /** Indicates if items in a table or grid are sorted in ascending or descending order. */
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  /** Defines the maximum allowed value for a range widget. */
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  /** Defines the minimum allowed value for a range widget. */
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  /**
    * Defines the current value for a range widget.
    * @see aria-valuetext.
    */
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  /** Defines the human readable text alternative of aria-valuenow for a range widget. */
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Boolean] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Anon_Html] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  // Living Standard
  /**
    * Hints at the type of data that might be entered by the user while editing the element or its contents
    * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
    */
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  /**
    * Specify that a standard HTML element should behave like a defined custom built-in element
    * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
    */
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[HTMLTableDataCellElement | HTMLTableHeaderCellElement]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  // Unknown
  var radioGroup: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
   // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[String] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var valign: js.UndefOr[top | middle | bottom | baseline] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
}

object TableCellBaseProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    align: left | center | right | justify | char = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    children: TagMod[Any] = null,
    className: String = null,
    colSpan: Int | Double = null,
    color: String = null,
    contentEditable: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    headers: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    onAbort: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onAuxClick: SyntheticMouseEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with (HTMLTableDataCellElement | HTMLTableHeaderCellElement), Event] => Unit = null,
    onBlur: SyntheticFocusEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onCanPlay: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onCanPlayThrough: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onChange: SyntheticEvent[EventTarget with (HTMLTableDataCellElement | HTMLTableHeaderCellElement), Event] => Unit = null,
    onClick: SyntheticMouseEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onContextMenu: SyntheticMouseEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onCopy: SyntheticClipboardEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onCut: SyntheticClipboardEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onDoubleClick: SyntheticMouseEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onDrag: DragEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onDragEnd: DragEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onDragEnter: DragEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onDragExit: DragEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onDragLeave: DragEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onDragOver: DragEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onDragStart: DragEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onDrop: DragEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onDurationChange: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onEmptied: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onEncrypted: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onEnded: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onError: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onFocus: SyntheticFocusEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onInput: SyntheticEvent[EventTarget with (HTMLTableDataCellElement | HTMLTableHeaderCellElement), Event] => Unit = null,
    onInvalid: SyntheticEvent[EventTarget with (HTMLTableDataCellElement | HTMLTableHeaderCellElement), Event] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onLoad: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onLoadStart: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onLoadedData: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onLoadedMetadata: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onMouseDown: SyntheticMouseEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onMouseMove: SyntheticMouseEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onMouseOut: SyntheticMouseEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onMouseOver: SyntheticMouseEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onMouseUp: SyntheticMouseEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onPaste: SyntheticClipboardEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onPause: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onPlay: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onPlaying: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onPointerDown: SyntheticPointerEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onPointerMove: SyntheticPointerEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onPointerOut: SyntheticPointerEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onPointerOver: SyntheticPointerEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onPointerUp: SyntheticPointerEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onProgress: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onRateChange: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onReset: SyntheticEvent[EventTarget with (HTMLTableDataCellElement | HTMLTableHeaderCellElement), Event] => Unit = null,
    onScroll: SyntheticUIEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onSeeked: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onSeeking: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onSelect: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onStalled: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onSubmit: SyntheticEvent[EventTarget with (HTMLTableDataCellElement | HTMLTableHeaderCellElement), Event] => Unit = null,
    onSuspend: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onTimeUpdate: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onTouchMove: SyntheticTouchEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onTouchStart: SyntheticTouchEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onVolumeChange: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onWaiting: SyntheticEvent[Event, HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    onWheel: SyntheticWheelEvent[HTMLTableDataCellElement | HTMLTableHeaderCellElement] => Unit = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    rowSpan: Int | Double = null,
    scope: String = null,
    security: String = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    title: String = null,
    typeof: String = null,
    unselectable: on | off = null,
    valign: top | middle | bottom | baseline = null,
    vocab: String = null
  ): TableCellBaseProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellBaseProps]
  }
}


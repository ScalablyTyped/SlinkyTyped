package typingsSlinky.fundamentalReact.sideNavMod

import org.scalajs.dom.raw.Element
import slinky.core.TagMod
import typingsSlinky.fundamentalReact.fundamentalReactStrings.`additions text`
import typingsSlinky.fundamentalReact.fundamentalReactStrings.`inline`
import typingsSlinky.fundamentalReact.fundamentalReactStrings.additions
import typingsSlinky.fundamentalReact.fundamentalReactStrings.all
import typingsSlinky.fundamentalReact.fundamentalReactStrings.ascending
import typingsSlinky.fundamentalReact.fundamentalReactStrings.assertive
import typingsSlinky.fundamentalReact.fundamentalReactStrings.both
import typingsSlinky.fundamentalReact.fundamentalReactStrings.copy
import typingsSlinky.fundamentalReact.fundamentalReactStrings.date
import typingsSlinky.fundamentalReact.fundamentalReactStrings.decimal
import typingsSlinky.fundamentalReact.fundamentalReactStrings.descending
import typingsSlinky.fundamentalReact.fundamentalReactStrings.dialog
import typingsSlinky.fundamentalReact.fundamentalReactStrings.email
import typingsSlinky.fundamentalReact.fundamentalReactStrings.execute
import typingsSlinky.fundamentalReact.fundamentalReactStrings.grammar
import typingsSlinky.fundamentalReact.fundamentalReactStrings.grid
import typingsSlinky.fundamentalReact.fundamentalReactStrings.horizontal
import typingsSlinky.fundamentalReact.fundamentalReactStrings.inherit
import typingsSlinky.fundamentalReact.fundamentalReactStrings.link_
import typingsSlinky.fundamentalReact.fundamentalReactStrings.list_
import typingsSlinky.fundamentalReact.fundamentalReactStrings.listbox
import typingsSlinky.fundamentalReact.fundamentalReactStrings.location
import typingsSlinky.fundamentalReact.fundamentalReactStrings.menu_
import typingsSlinky.fundamentalReact.fundamentalReactStrings.mixed
import typingsSlinky.fundamentalReact.fundamentalReactStrings.move
import typingsSlinky.fundamentalReact.fundamentalReactStrings.no
import typingsSlinky.fundamentalReact.fundamentalReactStrings.none
import typingsSlinky.fundamentalReact.fundamentalReactStrings.numeric
import typingsSlinky.fundamentalReact.fundamentalReactStrings.off
import typingsSlinky.fundamentalReact.fundamentalReactStrings.on
import typingsSlinky.fundamentalReact.fundamentalReactStrings.other
import typingsSlinky.fundamentalReact.fundamentalReactStrings.page
import typingsSlinky.fundamentalReact.fundamentalReactStrings.polite
import typingsSlinky.fundamentalReact.fundamentalReactStrings.popup
import typingsSlinky.fundamentalReact.fundamentalReactStrings.removals
import typingsSlinky.fundamentalReact.fundamentalReactStrings.search
import typingsSlinky.fundamentalReact.fundamentalReactStrings.spelling
import typingsSlinky.fundamentalReact.fundamentalReactStrings.step
import typingsSlinky.fundamentalReact.fundamentalReactStrings.tel
import typingsSlinky.fundamentalReact.fundamentalReactStrings.text
import typingsSlinky.fundamentalReact.fundamentalReactStrings.time_
import typingsSlinky.fundamentalReact.fundamentalReactStrings.tree
import typingsSlinky.fundamentalReact.fundamentalReactStrings.url
import typingsSlinky.fundamentalReact.fundamentalReactStrings.vertical
import typingsSlinky.fundamentalReact.fundamentalReactStrings.yes
import typingsSlinky.fundamentalReact.iconMod.IconGlyph
import typingsSlinky.react.AnonHtml
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.CompositionEventHandler
import typingsSlinky.react.mod.DragEventHandler
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.WheelEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  expanded ? :boolean,   glyph ? :fundamental-react.fundamental-react/lib/Icon/Icon.IconGlyph,   id ? :string,   isSubItem ? :boolean,   name ? :string,   selected ? :boolean,   selectedId ? :string,   url ? :string, onClick ? (args : ...any): any, onItemSelect ? (args : ...any): any} & react.react.HTMLAttributes<std.Element> */
@js.native
trait SideNavListItemProps extends js.Object {
  // RDFa Attributes
  var about: js.UndefOr[String] = js.native
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.native
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list_ | both] = js.native
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
    * @see aria-pressed @see aria-selected.
    */
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  /**
    * Defines the total number of columns in a table, grid, or treegrid.
    * @see aria-colindex.
    */
  var `aria-colcount`: js.UndefOr[Double] = js.native
  /**
    * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
    * @see aria-colcount @see aria-colspan.
    */
  var `aria-colindex`: js.UndefOr[Double] = js.native
  /**
    * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-colindex @see aria-rowspan.
    */
  var `aria-colspan`: js.UndefOr[Double] = js.native
  /**
    * Identifies the element (or elements) whose contents or presence are controlled by the current element.
    * @see aria-owns.
    */
  var `aria-controls`: js.UndefOr[String] = js.native
  /** Indicates the element that represents the current item within a container or set of related elements. */
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time_] = js.native
  /**
    * Identifies the element (or elements) that describes the object.
    * @see aria-labelledby
    */
  var `aria-describedby`: js.UndefOr[String] = js.native
  /**
    * Identifies the element that provides a detailed, extended description for the object.
    * @see aria-describedby.
    */
  var `aria-details`: js.UndefOr[String] = js.native
  /**
    * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
    * @see aria-hidden @see aria-readonly.
    */
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates what functions can be performed when a dragged object is released on the drop target.
    * @deprecated in ARIA 1.1
    */
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link_ | move | popup] = js.native
  /**
    * Identifies the element that provides an error message for the object.
    * @see aria-invalid @see aria-describedby.
    */
  var `aria-errormessage`: js.UndefOr[String] = js.native
  /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: js.UndefOr[String] = js.native
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: js.UndefOr[Boolean | menu_ | listbox | tree | grid | dialog] = js.native
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the entered value does not conform to the format expected by the application.
    * @see aria-errormessage.
    */
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  /**
    * Defines a string value that labels the current element.
    * @see aria-labelledby.
    */
  var `aria-label`: js.UndefOr[String] = js.native
  /**
    * Identifies the element (or elements) that labels the current element.
    * @see aria-describedby.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.native
  /** Defines the hierarchical level of an element within a structure. */
  var `aria-level`: js.UndefOr[Double] = js.native
  /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  /** Indicates whether an element is modal when displayed. */
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
    * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
    * @see aria-controls.
    */
  var `aria-owns`: js.UndefOr[String] = js.native
  /**
    * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
    * A hint could be a sample value or a brief description of the expected format.
    */
  var `aria-placeholder`: js.UndefOr[String] = js.native
  /**
    * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-setsize.
    */
  var `aria-posinset`: js.UndefOr[Double] = js.native
  /**
    * Indicates the current "pressed" state of toggle buttons.
    * @see aria-checked @see aria-selected.
    */
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  /**
    * Indicates that the element is not editable, but is otherwise operable.
    * @see aria-disabled.
    */
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: js.UndefOr[Boolean] = js.native
  /** Defines a human-readable, author-localized description for the role of an element. */
  var `aria-roledescription`: js.UndefOr[String] = js.native
  /**
    * Defines the total number of rows in a table, grid, or treegrid.
    * @see aria-rowindex.
    */
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  /**
    * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
    * @see aria-rowcount @see aria-rowspan.
    */
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  /**
    * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-rowindex @see aria-colspan.
    */
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  /**
    * Indicates the current "selected" state of various widgets.
    * @see aria-checked @see aria-pressed.
    */
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  /**
    * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-posinset.
    */
  var `aria-setsize`: js.UndefOr[Double] = js.native
  /** Indicates if items in a table or grid are sorted in ascending or descending order. */
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  /** Defines the maximum allowed value for a range widget. */
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  /** Defines the minimum allowed value for a range widget. */
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  /**
    * Defines the current value for a range widget.
    * @see aria-valuetext.
    */
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  /** Defines the human readable text alternative of aria-valuenow for a range widget. */
  var `aria-valuetext`: js.UndefOr[String] = js.native
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.native
  var datatype: js.UndefOr[String] = js.native
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var expanded: js.UndefOr[Boolean] = js.native
  var glyph: js.UndefOr[IconGlyph] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  // Living Standard
  /**
    * Hints at the type of data that might be entered by the user while editing the element or its contents
    * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
    */
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  /**
    * Specify that a standard HTML element should behave like a defined custom built-in element
    * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
    */
  var is: js.UndefOr[String] = js.native
  var isSubItem: js.UndefOr[Boolean] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[Element]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[Element]] = js.native
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[Element]] = js.native
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[Element]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[Element]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[Element]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[Element]] = js.native
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[Element]] = js.native
  var onClick: js.UndefOr[(js.Function1[/* repeated */ js.Any, _]) | MouseEventHandler[Element]] = js.native
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[Element]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[Element]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[Element]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[Element]] = js.native
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[Element]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[Element]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[Element]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[Element]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[Element]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[Element]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[Element]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[Element]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[Element]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[Element]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[Element]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onError: js.UndefOr[ReactEventHandler[Element]] = js.native
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[Element]] = js.native
  var onInput: js.UndefOr[FormEventHandler[Element]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[Element]] = js.native
  var onItemSelect: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[Element]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[Element]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[Element]] = js.native
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[Element]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[Element]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[Element]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[Element]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[Element]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[Element]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[Element]] = js.native
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[Element]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[Element]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[Element]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[Element]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[Element]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[Element]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[Element]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onReset: js.UndefOr[FormEventHandler[Element]] = js.native
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[Element]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[Element]] = js.native
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[Element]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[Element]] = js.native
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[Element]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[Element]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[Element]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[Element]] = js.native
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[Element]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[Element]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[Element]] = js.native
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[Element]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  // Unknown
  var radioGroup: js.UndefOr[String] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
   // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[String] = js.native
  var security: js.UndefOr[String] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var selectedId: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var url: js.UndefOr[String] = js.native
  var vocab: js.UndefOr[String] = js.native
}


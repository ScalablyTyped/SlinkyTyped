package typingsSlinky.fundamentalReact.sideNavMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
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
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.CompositionEventHandler
import typingsSlinky.react.mod.DragEvent
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  className :string | undefined,   compact :boolean | undefined,   condensed :boolean | undefined,   hasParent :boolean | undefined,   isUtility :boolean | undefined,   level :number | undefined,   open :boolean | undefined,   selectedId :string | undefined,   title :string | undefined,   titleProps :any | undefined,   onItemSelect :(args : ...any): any | undefined} & react.react.HTMLAttributes<std.Element> */
@js.native
trait SideNavListProps extends js.Object {
  
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
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var compact: js.UndefOr[Boolean] = js.native
  
  var condensed: js.UndefOr[Boolean] = js.native
  
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  
  var contextMenu: js.UndefOr[String] = js.native
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  
  var datatype: js.UndefOr[String] = js.native
  
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.native
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  var draggable: js.UndefOr[Booleanish] = js.native
  
  var hasParent: js.UndefOr[Boolean] = js.native
  
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
  
  var isUtility: js.UndefOr[Boolean] = js.native
  
  var itemID: js.UndefOr[String] = js.native
  
  var itemProp: js.UndefOr[String] = js.native
  
  var itemRef: js.UndefOr[String] = js.native
  
  var itemScope: js.UndefOr[Boolean] = js.native
  
  var itemType: js.UndefOr[String] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var level: js.UndefOr[Double] = js.native
  
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
  
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.native
  
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
  
  var open: js.UndefOr[Boolean] = js.native
  
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
  
  var selectedId: js.UndefOr[String] = js.native
  
  var slot: js.UndefOr[String] = js.native
  
  var spellCheck: js.UndefOr[Booleanish] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleProps: js.UndefOr[js.Any] = js.native
  
  var translate: js.UndefOr[yes | no] = js.native
  
  var typeof: js.UndefOr[String] = js.native
  
  var unselectable: js.UndefOr[on | off] = js.native
  
  var vocab: js.UndefOr[String] = js.native
}
object SideNavListProps {
  
  @scala.inline
  def apply(): SideNavListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SideNavListProps]
  }
  
  @scala.inline
  implicit class SideNavListPropsOps[Self <: SideNavListProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbout(value: String): Self = this.set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list_ | both): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
    
    @scala.inline
    def `setAria-busy`(value: Boolean): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    
    @scala.inline
    def `setAria-colcount`(value: Double): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    
    @scala.inline
    def `setAria-colindex`(value: Double): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    
    @scala.inline
    def `setAria-colspan`(value: Double): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    
    @scala.inline
    def `setAria-controls`(value: String): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time_): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    
    @scala.inline
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-details`(value: String): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    
    @scala.inline
    def `setAria-disabled`(value: Boolean): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link_ | move | popup): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    
    @scala.inline
    def `setAria-errormessage`(value: String): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    
    @scala.inline
    def `setAria-flowto`(value: String): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    
    @scala.inline
    def `setAria-haspopup`(value: Boolean | menu_ | listbox | tree | grid | dialog): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
    
    @scala.inline
    def `setAria-hidden`(value: Boolean): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    
    @scala.inline
    def `setAria-level`(value: Double): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    
    @scala.inline
    def `setAria-multiline`(value: Boolean): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    
    @scala.inline
    def `setAria-multiselectable`(value: Boolean): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    
    @scala.inline
    def `setAria-owns`(value: String): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
    
    @scala.inline
    def `setAria-placeholder`(value: String): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    
    @scala.inline
    def `setAria-posinset`(value: Double): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    
    @scala.inline
    def `setAria-relevant`(value: additions | (`additions text`) | all | removals | text): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    
    @scala.inline
    def `setAria-required`(value: Boolean): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    
    @scala.inline
    def `setAria-roledescription`(value: String): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    
    @scala.inline
    def `setAria-selected`(value: Boolean): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    
    @scala.inline
    def `setAria-setsize`(value: Double): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    
    @scala.inline
    def `setAria-valuetext`(value: String): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: String): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: String): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoSave(value: String): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setCondensed(value: Boolean): Self = this.set("condensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondensed: Self = this.set("condensed", js.undefined)
    
    @scala.inline
    def setContentEditable(value: Booleanish | inherit): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    
    @scala.inline
    def setContextMenu(value: String): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
    
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    
    @scala.inline
    def setDefaultChecked(value: Boolean): Self = this.set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultChecked: Self = this.set("defaultChecked", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: String | Double | js.Array[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setDraggable(value: Booleanish): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setHasParent(value: Boolean): Self = this.set("hasParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasParent: Self = this.set("hasParent", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInlist(value: js.Any): Self = this.set("inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlist: Self = this.set("inlist", js.undefined)
    
    @scala.inline
    def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    
    @scala.inline
    def setIsUtility(value: Boolean): Self = this.set("isUtility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUtility: Self = this.set("isUtility", js.undefined)
    
    @scala.inline
    def setItemID(value: String): Self = this.set("itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemID: Self = this.set("itemID", js.undefined)
    
    @scala.inline
    def setItemProp(value: String): Self = this.set("itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemProp: Self = this.set("itemProp", js.undefined)
    
    @scala.inline
    def setItemRef(value: String): Self = this.set("itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemRef: Self = this.set("itemRef", js.undefined)
    
    @scala.inline
    def setItemScope(value: Boolean): Self = this.set("itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemScope: Self = this.set("itemScope", js.undefined)
    
    @scala.inline
    def setItemType(value: String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setOnAbort(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: SyntheticAnimationEvent[Element] => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationIteration(value: SyntheticAnimationEvent[Element] => Unit): Self = this.set("onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: SyntheticAnimationEvent[Element] => Unit): Self = this.set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnAuxClick(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAuxClick: Self = this.set("onAuxClick", js.undefined)
    
    @scala.inline
    def setOnBeforeInput(value: SyntheticEvent[EventTarget with Element, Event] => Unit): Self = this.set("onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeInput: Self = this.set("onBeforeInput", js.undefined)
    
    @scala.inline
    def setOnBlur(value: SyntheticFocusEvent[Element] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnChange(value: SyntheticEvent[EventTarget with Element, Event] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: SyntheticCompositionEvent[Element] => Unit): Self = this.set("onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: SyntheticCompositionEvent[Element] => Unit): Self = this.set("onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: SyntheticCompositionEvent[Element] => Unit): Self = this.set("onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnCopy(value: SyntheticClipboardEvent[Element] => Unit): Self = this.set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    
    @scala.inline
    def setOnCut(value: SyntheticClipboardEvent[Element] => Unit): Self = this.set("onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDrag(value: DragEvent[Element] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: DragEvent[Element] => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: DragEvent[Element] => Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: DragEvent[Element] => Unit): Self = this.set("onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: DragEvent[Element] => Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: DragEvent[Element] => Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: DragEvent[Element] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDrop(value: DragEvent[Element] => Unit): Self = this.set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEnded(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    
    @scala.inline
    def setOnError(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticFocusEvent[Element] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnInput(value: SyntheticEvent[EventTarget with Element, Event] => Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    
    @scala.inline
    def setOnInvalid(value: SyntheticEvent[EventTarget with Element, Event] => Unit): Self = this.set("onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    
    @scala.inline
    def setOnItemSelect(value: /* repeated */ js.Any => _): Self = this.set("onItemSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemSelect: Self = this.set("onItemSelect", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[Element] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: SyntheticKeyboardEvent[Element] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: SyntheticKeyboardEvent[Element] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOnLoad(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setOnPaste(value: SyntheticClipboardEvent[Element] => Unit): Self = this.set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    
    @scala.inline
    def setOnPause(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: SyntheticPointerEvent[Element] => Unit): Self = this.set("onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: SyntheticPointerEvent[Element] => Unit): Self = this.set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: SyntheticPointerEvent[Element] => Unit): Self = this.set("onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: SyntheticPointerEvent[Element] => Unit): Self = this.set("onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: SyntheticPointerEvent[Element] => Unit): Self = this.set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: SyntheticPointerEvent[Element] => Unit): Self = this.set("onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: SyntheticPointerEvent[Element] => Unit): Self = this.set("onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: SyntheticPointerEvent[Element] => Unit): Self = this.set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    
    @scala.inline
    def setOnProgress(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    
    @scala.inline
    def setOnReset(value: SyntheticEvent[EventTarget with Element, Event] => Unit): Self = this.set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    
    @scala.inline
    def setOnScroll(value: SyntheticUIEvent[Element] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnStalled(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: SyntheticEvent[EventTarget with Element, Event] => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: SyntheticTouchEvent[Element] => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: SyntheticTouchEvent[Element] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: SyntheticTouchEvent[Element] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[Element] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: SyntheticTransitionEvent[Element] => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[Event, Element] => Unit): Self = this.set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    
    @scala.inline
    def setOnWheel(value: SyntheticWheelEvent[Element] => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setRadioGroup(value: String): Self = this.set("radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioGroup: Self = this.set("radioGroup", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSecurity(value: String): Self = this.set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    
    @scala.inline
    def setSelectedId(value: String): Self = this.set("selectedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedId: Self = this.set("selectedId", js.undefined)
    
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: Booleanish): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSuppressContentEditableWarning(value: Boolean): Self = this.set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressContentEditableWarning: Self = this.set("suppressContentEditableWarning", js.undefined)
    
    @scala.inline
    def setSuppressHydrationWarning(value: Boolean): Self = this.set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressHydrationWarning: Self = this.set("suppressHydrationWarning", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleProps(value: js.Any): Self = this.set("titleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleProps: Self = this.set("titleProps", js.undefined)
    
    @scala.inline
    def setTranslate(value: yes | no): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setTypeof(value: String): Self = this.set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeof: Self = this.set("typeof", js.undefined)
    
    @scala.inline
    def setUnselectable(value: on | off): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
    
    @scala.inline
    def setVocab(value: String): Self = this.set("vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVocab: Self = this.set("vocab", js.undefined)
  }
}

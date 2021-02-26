package typingsSlinky.reactElemental.mod

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEventHandler
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
import typingsSlinky.reactElemental.reactElementalStrings.`additions removals`
import typingsSlinky.reactElemental.reactElementalStrings.`additions text`
import typingsSlinky.reactElemental.reactElementalStrings.`inline`
import typingsSlinky.reactElemental.reactElementalStrings.`removals additions`
import typingsSlinky.reactElemental.reactElementalStrings.`removals text`
import typingsSlinky.reactElemental.reactElementalStrings.`text additions`
import typingsSlinky.reactElemental.reactElementalStrings.`text removals`
import typingsSlinky.reactElemental.reactElementalStrings.additions
import typingsSlinky.reactElemental.reactElementalStrings.all
import typingsSlinky.reactElemental.reactElementalStrings.ascending
import typingsSlinky.reactElemental.reactElementalStrings.assertive
import typingsSlinky.reactElemental.reactElementalStrings.both
import typingsSlinky.reactElemental.reactElementalStrings.copy
import typingsSlinky.reactElemental.reactElementalStrings.date
import typingsSlinky.reactElemental.reactElementalStrings.decimal
import typingsSlinky.reactElemental.reactElementalStrings.descending
import typingsSlinky.reactElemental.reactElementalStrings.dialog
import typingsSlinky.reactElemental.reactElementalStrings.done
import typingsSlinky.reactElemental.reactElementalStrings.email
import typingsSlinky.reactElemental.reactElementalStrings.enter
import typingsSlinky.reactElemental.reactElementalStrings.execute
import typingsSlinky.reactElemental.reactElementalStrings.go
import typingsSlinky.reactElemental.reactElementalStrings.grammar
import typingsSlinky.reactElemental.reactElementalStrings.grid
import typingsSlinky.reactElemental.reactElementalStrings.horizontal
import typingsSlinky.reactElemental.reactElementalStrings.inherit
import typingsSlinky.reactElemental.reactElementalStrings.link
import typingsSlinky.reactElemental.reactElementalStrings.list
import typingsSlinky.reactElemental.reactElementalStrings.listbox
import typingsSlinky.reactElemental.reactElementalStrings.location
import typingsSlinky.reactElemental.reactElementalStrings.menu
import typingsSlinky.reactElemental.reactElementalStrings.mixed
import typingsSlinky.reactElemental.reactElementalStrings.move
import typingsSlinky.reactElemental.reactElementalStrings.next
import typingsSlinky.reactElemental.reactElementalStrings.no
import typingsSlinky.reactElemental.reactElementalStrings.none
import typingsSlinky.reactElemental.reactElementalStrings.numeric
import typingsSlinky.reactElemental.reactElementalStrings.off
import typingsSlinky.reactElemental.reactElementalStrings.on
import typingsSlinky.reactElemental.reactElementalStrings.other
import typingsSlinky.reactElemental.reactElementalStrings.page
import typingsSlinky.reactElemental.reactElementalStrings.polite
import typingsSlinky.reactElemental.reactElementalStrings.popup
import typingsSlinky.reactElemental.reactElementalStrings.previous
import typingsSlinky.reactElemental.reactElementalStrings.removals
import typingsSlinky.reactElemental.reactElementalStrings.search
import typingsSlinky.reactElemental.reactElementalStrings.send
import typingsSlinky.reactElemental.reactElementalStrings.spelling
import typingsSlinky.reactElemental.reactElementalStrings.step
import typingsSlinky.reactElemental.reactElementalStrings.tel
import typingsSlinky.reactElemental.reactElementalStrings.text
import typingsSlinky.reactElemental.reactElementalStrings.time
import typingsSlinky.reactElemental.reactElementalStrings.tree
import typingsSlinky.reactElemental.reactElementalStrings.url
import typingsSlinky.reactElemental.reactElementalStrings.vertical
import typingsSlinky.reactElemental.reactElementalStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.TextareaHTMLAttributes<std.HTMLTextAreaElement> & react.react.InputHTMLAttributes<std.HTMLInputElement> & { readonly error :string | undefined,  readonly secondary :boolean | undefined,  readonly textarea :boolean | undefined,  readonly style :react.react.CSSProperties | undefined} */
@js.native
trait TextFieldProps extends StObject {
  
  // RDFa Attributes
  var about: js.UndefOr[String] = js.native
  
  var accept: js.UndefOr[String] = js.native
  
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.native
  
  var alt: js.UndefOr[String] = js.native
  
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  
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
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  
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
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  
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
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  
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
  var `aria-relevant`: js.UndefOr[
    additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
  ] = js.native
  
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
  
  var autoComplete: js.UndefOr[String] = js.native
  
  var autoCorrect: js.UndefOr[String] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var autoSave: js.UndefOr[String] = js.native
  
  var capture: js.UndefOr[Boolean | String] = js.native
  
  // https://www.w3.org/TR/html-media-capture/#the-capture-attribute
  var checked: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var cols: js.UndefOr[Double] = js.native
  
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  
  var contextMenu: js.UndefOr[String] = js.native
  
  var crossOrigin: js.UndefOr[String] = js.native
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  
  var datatype: js.UndefOr[String] = js.native
  
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.native
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  var dirName: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var draggable: js.UndefOr[Booleanish] = js.native
  
  var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send] = js.native
  
  val error: js.UndefOr[String] = js.native
  
  var form: js.UndefOr[String] = js.native
  
  var formAction: js.UndefOr[String] = js.native
  
  var formEncType: js.UndefOr[String] = js.native
  
  var formMethod: js.UndefOr[String] = js.native
  
  var formNoValidate: js.UndefOr[Boolean] = js.native
  
  var formTarget: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
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
  
  var itemID: js.UndefOr[String] = js.native
  
  var itemProp: js.UndefOr[String] = js.native
  
  var itemRef: js.UndefOr[String] = js.native
  
  var itemScope: js.UndefOr[Boolean] = js.native
  
  var itemType: js.UndefOr[String] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var list: js.UndefOr[String] = js.native
  
  var max: js.UndefOr[Double | String] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double | String] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
  
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
  
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] with js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onChange: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement]] with js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
  
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
  
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onDrag: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragExit: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragOver: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDragStart: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDrop: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onEnded: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onError: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] with js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  var onInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  var onInvalid: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
  
  var onPause: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  
  var onProgress: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onReset: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[HTMLTextAreaElement]] with js.UndefOr[UIEventHandler[HTMLInputElement]] = js.native
  
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onStalled: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onSubmit: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLTextAreaElement]] with js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.native
  
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[HTMLTextAreaElement]] with js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.native
  
  var pattern: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var property: js.UndefOr[String] = js.native
  
  // Unknown
  var radioGroup: js.UndefOr[String] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var resource: js.UndefOr[String] = js.native
  
  var results: js.UndefOr[Double] = js.native
  
  // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[String] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  val secondary: js.UndefOr[Boolean] = js.native
  
  var security: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var slot: js.UndefOr[String] = js.native
  
  var spellCheck: js.UndefOr[Booleanish] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var step: js.UndefOr[Double | String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  val textarea: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var translate: js.UndefOr[yes | no] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var typeof: js.UndefOr[String] = js.native
  
  var unselectable: js.UndefOr[on | off] = js.native
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.native
  
  var vocab: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
  
  var wrap: js.UndefOr[String] = js.native
}
object TextFieldProps {
  
  @scala.inline
  def apply(
    onAbort: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]],
    onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]],
    onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]],
    onAuxClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onBeforeInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]],
    onBlur: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] with js.UndefOr[FocusEventHandler[HTMLInputElement]],
    onCanPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onChange: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement]] with js.UndefOr[ChangeEventHandler[HTMLInputElement]],
    onClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]],
    onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]],
    onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]],
    onContextMenu: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onCopy: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]],
    onCut: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]],
    onDoubleClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onDrag: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragEnd: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragEnter: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragExit: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragLeave: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragOver: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDragStart: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDrop: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]],
    onDurationChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onEmptied: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onEncrypted: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onEnded: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onError: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onFocus: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] with js.UndefOr[FocusEventHandler[HTMLInputElement]],
    onInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]],
    onInvalid: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]],
    onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]],
    onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]],
    onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]],
    onLoad: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onLoadStart: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onLoadedData: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onMouseDown: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseEnter: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseLeave: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseMove: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseOut: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseOver: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onMouseUp: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]],
    onPaste: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]],
    onPause: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onPlaying: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onPointerCancel: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerDown: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerEnter: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerLeave: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerMove: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerOut: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerOver: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onPointerUp: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]],
    onProgress: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onRateChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onReset: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]],
    onScroll: js.UndefOr[UIEventHandler[HTMLTextAreaElement]] with js.UndefOr[UIEventHandler[HTMLInputElement]],
    onSeeked: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onSeeking: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onSelect: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onStalled: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onSubmit: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]],
    onSuspend: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onTouchCancel: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTouchEnd: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTouchMove: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTouchStart: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]],
    onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLTextAreaElement]] with js.UndefOr[TransitionEventHandler[HTMLInputElement]],
    onVolumeChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onWaiting: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]],
    onWheel: js.UndefOr[WheelEventHandler[HTMLTextAreaElement]] with js.UndefOr[WheelEventHandler[HTMLInputElement]]
  ): TextFieldProps = {
    val __obj = js.Dynamic.literal(onAbort = onAbort.asInstanceOf[js.Any], onAnimationEnd = onAnimationEnd.asInstanceOf[js.Any], onAnimationIteration = onAnimationIteration.asInstanceOf[js.Any], onAnimationStart = onAnimationStart.asInstanceOf[js.Any], onAuxClick = onAuxClick.asInstanceOf[js.Any], onBeforeInput = onBeforeInput.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onCanPlay = onCanPlay.asInstanceOf[js.Any], onCanPlayThrough = onCanPlayThrough.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onCompositionEnd = onCompositionEnd.asInstanceOf[js.Any], onCompositionStart = onCompositionStart.asInstanceOf[js.Any], onCompositionUpdate = onCompositionUpdate.asInstanceOf[js.Any], onContextMenu = onContextMenu.asInstanceOf[js.Any], onCopy = onCopy.asInstanceOf[js.Any], onCut = onCut.asInstanceOf[js.Any], onDoubleClick = onDoubleClick.asInstanceOf[js.Any], onDrag = onDrag.asInstanceOf[js.Any], onDragEnd = onDragEnd.asInstanceOf[js.Any], onDragEnter = onDragEnter.asInstanceOf[js.Any], onDragExit = onDragExit.asInstanceOf[js.Any], onDragLeave = onDragLeave.asInstanceOf[js.Any], onDragOver = onDragOver.asInstanceOf[js.Any], onDragStart = onDragStart.asInstanceOf[js.Any], onDrop = onDrop.asInstanceOf[js.Any], onDurationChange = onDurationChange.asInstanceOf[js.Any], onEmptied = onEmptied.asInstanceOf[js.Any], onEncrypted = onEncrypted.asInstanceOf[js.Any], onEnded = onEnded.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onFocus = onFocus.asInstanceOf[js.Any], onInput = onInput.asInstanceOf[js.Any], onInvalid = onInvalid.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onKeyPress = onKeyPress.asInstanceOf[js.Any], onKeyUp = onKeyUp.asInstanceOf[js.Any], onLoad = onLoad.asInstanceOf[js.Any], onLoadStart = onLoadStart.asInstanceOf[js.Any], onLoadedData = onLoadedData.asInstanceOf[js.Any], onLoadedMetadata = onLoadedMetadata.asInstanceOf[js.Any], onMouseDown = onMouseDown.asInstanceOf[js.Any], onMouseEnter = onMouseEnter.asInstanceOf[js.Any], onMouseLeave = onMouseLeave.asInstanceOf[js.Any], onMouseMove = onMouseMove.asInstanceOf[js.Any], onMouseOut = onMouseOut.asInstanceOf[js.Any], onMouseOver = onMouseOver.asInstanceOf[js.Any], onMouseUp = onMouseUp.asInstanceOf[js.Any], onPaste = onPaste.asInstanceOf[js.Any], onPause = onPause.asInstanceOf[js.Any], onPlay = onPlay.asInstanceOf[js.Any], onPlaying = onPlaying.asInstanceOf[js.Any], onPointerCancel = onPointerCancel.asInstanceOf[js.Any], onPointerDown = onPointerDown.asInstanceOf[js.Any], onPointerEnter = onPointerEnter.asInstanceOf[js.Any], onPointerLeave = onPointerLeave.asInstanceOf[js.Any], onPointerMove = onPointerMove.asInstanceOf[js.Any], onPointerOut = onPointerOut.asInstanceOf[js.Any], onPointerOver = onPointerOver.asInstanceOf[js.Any], onPointerUp = onPointerUp.asInstanceOf[js.Any], onProgress = onProgress.asInstanceOf[js.Any], onRateChange = onRateChange.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any], onScroll = onScroll.asInstanceOf[js.Any], onSeeked = onSeeked.asInstanceOf[js.Any], onSeeking = onSeeking.asInstanceOf[js.Any], onSelect = onSelect.asInstanceOf[js.Any], onStalled = onStalled.asInstanceOf[js.Any], onSubmit = onSubmit.asInstanceOf[js.Any], onSuspend = onSuspend.asInstanceOf[js.Any], onTimeUpdate = onTimeUpdate.asInstanceOf[js.Any], onTouchCancel = onTouchCancel.asInstanceOf[js.Any], onTouchEnd = onTouchEnd.asInstanceOf[js.Any], onTouchMove = onTouchMove.asInstanceOf[js.Any], onTouchStart = onTouchStart.asInstanceOf[js.Any], onTransitionEnd = onTransitionEnd.asInstanceOf[js.Any], onVolumeChange = onVolumeChange.asInstanceOf[js.Any], onWaiting = onWaiting.asInstanceOf[js.Any], onWheel = onWheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldProps]
  }
  
  @scala.inline
  implicit class TextFieldPropsMutableBuilder[Self <: TextFieldProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    @scala.inline
    def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    @scala.inline
    def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
    
    @scala.inline
    def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
    
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
    
    @scala.inline
    def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
    
    @scala.inline
    def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
    
    @scala.inline
    def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
    
    @scala.inline
    def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
    
    @scala.inline
    def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
    
    @scala.inline
    def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
    
    @scala.inline
    def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    @scala.inline
    def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
    
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
    
    @scala.inline
    def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    @scala.inline
    def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
    
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    @scala.inline
    def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
    
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
    
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
    
    @scala.inline
    def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
    
    @scala.inline
    def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
    
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
    
    @scala.inline
    def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
    
    @scala.inline
    def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
    
    @scala.inline
    def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
    
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    @scala.inline
    def `setAria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
    
    @scala.inline
    def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    @scala.inline
    def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
    
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
    
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
    
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
    
    @scala.inline
    def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    @scala.inline
    def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
    
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
    
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
    
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
    
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
    
    @scala.inline
    def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    @scala.inline
    def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    @scala.inline
    def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    @scala.inline
    def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    @scala.inline
    def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    @scala.inline
    def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirName(value: String): Self = StObject.set(x, "dirName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirNameUndefined: Self = StObject.set(x, "dirName", js.undefined)
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setEnterKeyHint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterKeyHintUndefined: Self = StObject.set(x, "enterKeyHint", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
    
    @scala.inline
    def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
    
    @scala.inline
    def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
    
    @scala.inline
    def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
    
    @scala.inline
    def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    @scala.inline
    def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
    
    @scala.inline
    def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    @scala.inline
    def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
    
    @scala.inline
    def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
    
    @scala.inline
    def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
    
    @scala.inline
    def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
    
    @scala.inline
    def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    @scala.inline
    def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnAbort(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationEnd(
      value: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationIteration(
      value: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onAnimationIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationStart(
      value: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] with js.UndefOr[AnimationEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onAnimationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAuxClick(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onAuxClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBeforeInput(
      value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onBeforeInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlur(
      value: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] with js.UndefOr[FocusEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCanPlay(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onCanPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCanPlayThrough(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onCanPlayThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(
      value: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement]] with js.UndefOr[ChangeEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompositionEnd(
      value: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onCompositionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompositionStart(
      value: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onCompositionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompositionUpdate(
      value: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] with js.UndefOr[CompositionEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onCompositionUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnContextMenu(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCopy(
      value: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCut(
      value: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDoubleClick(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDrag(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragEnd(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragEnter(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDragEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragExit(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDragExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragLeave(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDragLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragOver(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragStart(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDrop(
      value: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] with js.UndefOr[DragEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDurationChange(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onDurationChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEmptied(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEncrypted(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEnded(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnError(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFocus(
      value: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] with js.UndefOr[FocusEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInput(
      value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInvalid(
      value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyDown(
      value: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyPress(
      value: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyUp(
      value: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[KeyboardEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoad(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadStart(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onLoadStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadedData(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onLoadedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadedMetadata(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onLoadedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseDown(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseEnter(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseLeave(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseMove(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseOut(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseOver(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseUp(
      value: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] with js.UndefOr[MouseEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPaste(
      value: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] with js.UndefOr[ClipboardEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPause(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPlay(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPlaying(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerCancel(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerDown(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerEnter(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerLeave(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerMove(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerOut(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerOver(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerUp(
      value: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] with js.UndefOr[PointerEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnProgress(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRateChange(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onRateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReset(
      value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScroll(
      value: js.UndefOr[UIEventHandler[HTMLTextAreaElement]] with js.UndefOr[UIEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSeeked(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSeeking(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelect(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStalled(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSubmit(
      value: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] with js.UndefOr[FormEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSuspend(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTimeUpdate(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onTimeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchCancel(
      value: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEnd(
      value: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchMove(
      value: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchStart(
      value: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] with js.UndefOr[TouchEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTransitionEnd(
      value: js.UndefOr[TransitionEventHandler[HTMLTextAreaElement]] with js.UndefOr[TransitionEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onTransitionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnVolumeChange(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onVolumeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWaiting(
      value: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] with js.UndefOr[ReactEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWheel(
      value: js.UndefOr[WheelEventHandler[HTMLTextAreaElement]] with js.UndefOr[WheelEventHandler[HTMLInputElement]]
    ): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
    @scala.inline
    def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
    
    @scala.inline
    def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTextarea(value: Boolean): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextareaUndefined: Self = StObject.set(x, "textarea", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    @scala.inline
    def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    
    @scala.inline
    def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}

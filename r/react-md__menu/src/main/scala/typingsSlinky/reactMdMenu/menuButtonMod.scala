package typingsSlinky.reactMdMenu

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLSpanElement
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
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.WheelEventHandler
import typingsSlinky.reactMdAppBar.useActionClassNameMod.AppBarActionClassNameProps
import typingsSlinky.reactMdButton.buttonThemeClassNamesMod.ButtonTheme
import typingsSlinky.reactMdButton.buttonThemeClassNamesMod.ButtonThemeType
import typingsSlinky.reactMdButton.buttonThemeClassNamesMod.ButtonType
import typingsSlinky.reactMdButton.fabMod.FABPosition
import typingsSlinky.reactMdButton.fabMod.FABProps
import typingsSlinky.reactMdButton.reactMdButtonStrings.`additions removals`
import typingsSlinky.reactMdButton.reactMdButtonStrings.`additions text`
import typingsSlinky.reactMdButton.reactMdButtonStrings.`inline`
import typingsSlinky.reactMdButton.reactMdButtonStrings.`removals additions`
import typingsSlinky.reactMdButton.reactMdButtonStrings.`removals text`
import typingsSlinky.reactMdButton.reactMdButtonStrings.`text additions`
import typingsSlinky.reactMdButton.reactMdButtonStrings.`text removals`
import typingsSlinky.reactMdButton.reactMdButtonStrings.additions
import typingsSlinky.reactMdButton.reactMdButtonStrings.all
import typingsSlinky.reactMdButton.reactMdButtonStrings.ascending
import typingsSlinky.reactMdButton.reactMdButtonStrings.assertive
import typingsSlinky.reactMdButton.reactMdButtonStrings.both
import typingsSlinky.reactMdButton.reactMdButtonStrings.button
import typingsSlinky.reactMdButton.reactMdButtonStrings.copy
import typingsSlinky.reactMdButton.reactMdButtonStrings.date
import typingsSlinky.reactMdButton.reactMdButtonStrings.decimal
import typingsSlinky.reactMdButton.reactMdButtonStrings.descending
import typingsSlinky.reactMdButton.reactMdButtonStrings.dialog
import typingsSlinky.reactMdButton.reactMdButtonStrings.email
import typingsSlinky.reactMdButton.reactMdButtonStrings.execute
import typingsSlinky.reactMdButton.reactMdButtonStrings.grammar
import typingsSlinky.reactMdButton.reactMdButtonStrings.grid
import typingsSlinky.reactMdButton.reactMdButtonStrings.horizontal
import typingsSlinky.reactMdButton.reactMdButtonStrings.inherit
import typingsSlinky.reactMdButton.reactMdButtonStrings.link
import typingsSlinky.reactMdButton.reactMdButtonStrings.list
import typingsSlinky.reactMdButton.reactMdButtonStrings.listbox
import typingsSlinky.reactMdButton.reactMdButtonStrings.location
import typingsSlinky.reactMdButton.reactMdButtonStrings.mixed
import typingsSlinky.reactMdButton.reactMdButtonStrings.move
import typingsSlinky.reactMdButton.reactMdButtonStrings.no
import typingsSlinky.reactMdButton.reactMdButtonStrings.none
import typingsSlinky.reactMdButton.reactMdButtonStrings.numeric
import typingsSlinky.reactMdButton.reactMdButtonStrings.off
import typingsSlinky.reactMdButton.reactMdButtonStrings.on
import typingsSlinky.reactMdButton.reactMdButtonStrings.other
import typingsSlinky.reactMdButton.reactMdButtonStrings.page
import typingsSlinky.reactMdButton.reactMdButtonStrings.polite
import typingsSlinky.reactMdButton.reactMdButtonStrings.popup
import typingsSlinky.reactMdButton.reactMdButtonStrings.removals
import typingsSlinky.reactMdButton.reactMdButtonStrings.reset
import typingsSlinky.reactMdButton.reactMdButtonStrings.search
import typingsSlinky.reactMdButton.reactMdButtonStrings.spelling
import typingsSlinky.reactMdButton.reactMdButtonStrings.step
import typingsSlinky.reactMdButton.reactMdButtonStrings.submit
import typingsSlinky.reactMdButton.reactMdButtonStrings.tel
import typingsSlinky.reactMdButton.reactMdButtonStrings.text
import typingsSlinky.reactMdButton.reactMdButtonStrings.time
import typingsSlinky.reactMdButton.reactMdButtonStrings.tree
import typingsSlinky.reactMdButton.reactMdButtonStrings.url
import typingsSlinky.reactMdButton.reactMdButtonStrings.vertical
import typingsSlinky.reactMdButton.reactMdButtonStrings.yes
import typingsSlinky.reactMdMenu.reactMdMenuStrings.`true`
import typingsSlinky.reactMdMenu.reactMdMenuStrings.menu
import typingsSlinky.reactMdStates.typesMod.MergableRippleHandlers
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import typingsSlinky.reactMdUtils.typesTypesMod.PropsWithRef
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuButtonMod {
  
  @JSImport("@react-md/menu/types/MenuButton", "MenuButton")
  @js.native
  val MenuButton: ForwardRefExoticComponent[MenuButtonProps with RefAttributes[HTMLButtonElement]] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.reactMdButton.buttonMod.ButtonProps because var conflicts: className. Inlined formAction, `aria-flowto`, `aria-invalid`, `aria-keyshortcuts`, contextMenu, onKeyDown, `aria-orientation`, vocab, `aria-colindex`, onPlaying, disableProgrammaticRipple, onMouseOver, onMouseMove, typeof, onPointerCancel, `aria-valuenow`, `aria-valuetext`, onDragStart, onMouseEnter, inputMode, onDragEnter, onPointerOver, themeType, `aria-rowspan`, onDragLeave, onMouseOut, onVolumeChange, `aria-relevant`, onSelect, onAnimationStart, onLoadedData, is, about, `aria-valuemax`, accessKey, `aria-pressed`, `aria-atomic`, onTouchStart, `aria-selected`, `aria-disabled`, itemScope, `aria-current`, style, onInput, security, `aria-labelledby`, `aria-multiline`, defaultValue, onCompositionStart, rippleClassNames, onScroll, onDragEnd, onLoadStart, autoSave, disableRipple, dangerouslySetInnerHTML, prefix, onFocus, onContextMenu, `aria-colcount`, onError, resource, onTouchMove, onTouchEnd, suppressHydrationWarning, itemType, onDrag, `aria-describedby`, onEnded, spellCheck, onAnimationIteration, tabIndex, `aria-label`, `aria-busy`, slot, onWaiting, onCompositionEnd, rippleClassName, `aria-valuemin`, rippleContainerClassName, autoCapitalize, placeholder, onDoubleClick, radioGroup, `aria-rowindex`, onEmptied, onStalled, onKeyPress, `aria-autocomplete`, formEncType, onMouseUp, id, `aria-activedescendant`, `aria-sort`, onPointerLeave, lang, `aria-errormessage`, onAuxClick, onWheel, form, `aria-posinset`, color, `aria-details`, `aria-colspan`, suppressContentEditableWarning, onPointerUp, translate, itemID, onProgress, `aria-expanded`, `aria-controls`, dir, onBlur, `aria-owns`, `aria-live`, value, `aria-grabbed`, onPointerMove, onPause, onDrop, onReset, onPointerDown, `aria-readonly`, onDragOver, onTimeUpdate, `aria-multiselectable`, name, onMouseDown, `aria-haspopup`, disabled, draggable, formMethod, `aria-hidden`, onDurationChange, contentEditable, onSubmit, onSuspend, onTransitionEnd, onCanPlay, onDragExit, buttonType, `aria-level`, formTarget, onEncrypted, onPlay, itemRef, onPointerOut, `aria-placeholder`, hidden, onCopy, inlist, property, floating, defaultChecked, `aria-dropeffect`, autoFocus, unselectable, onAbort, onInvalid, onCompositionUpdate, onTouchCancel, role, floatingProps, handlers, rippleTimeout, children, onCanPlayThrough, onClick, onLoad, onLoadedMetadata, onSeeked, `type`, onChange, enablePressedAndRipple, `aria-roledescription`, onPointerEnter, datatype, `aria-modal`, onBeforeInput, onAnimationEnd, formNoValidate, disableEnterClick, onCut, `aria-checked`, onSeeking, onPaste, onMouseLeave, theme, disablePressedFallback, itemProp, onRateChange, title, onKeyUp, `aria-setsize`, autoCorrect, `aria-rowcount`, `aria-required`, results */ @js.native
  trait MenuButtonProps extends AppBarActionClassNameProps {
    
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
    
    /**
      * This should probably be left at the default of `"menu"`, but can also be a
      * true string.  This is required for menu a11y.
      */
    var `aria-haspopup`: js.UndefOr[
        Boolean | dialog | grid | listbox | menu | typingsSlinky.reactMdButton.reactMdButtonStrings.menu | tree | `true` | typingsSlinky.reactMdMenu.reactMdMenuBooleans.`true`
      ] = js.native
    
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
    
    /**
      * Boolean if the menu button should be rendered as an `AppBarAction` button
      * instead of a default button. This will also be considered `true` if the
      * `first`, `last`, or `inheritColor` props are `true`.
      */
    var asAppBarAction: js.UndefOr[Boolean] = js.native
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    /**
      * This is the specific material design button type to use. This can either be
      * set to "text" or "icon". When this is set to "text", the styles applied
      * will make buttons with just text or text with icons render nicely. When
      * this is set to "icon", the styles applied will make icon only buttons
      * render nicely.
      */
    var buttonType: js.UndefOr[ButtonType] = js.native
    
    /**
      * Any children to render within the button. This will normally just be text
      * or an icon.
      *
      * Please note that it is considered invalid html to have a `<div>` as a
      * descendant of a `<button>`.
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    // React-specific Attributes
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    /**
      * Boolean if the dropdown icon should be removed from the button. The icon
      * will always be removed for icon buttons.
      */
    var disableDropdownIcon: js.UndefOr[Boolean] = js.native
    
    var disableEnterClick: js.UndefOr[Boolean] = js.native
    
    var disablePressedFallback: js.UndefOr[Boolean] = js.native
    
    var disableProgrammaticRipple: js.UndefOr[Boolean] = js.native
    
    var disableRipple: js.UndefOr[Boolean] = js.native
    
    /**
      * Enabling this prop will apply the disabled styles to a `Button`. When this
      * is also applied to the button component, the button will be updated so that
      * it can no longer be interacted with.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    /**
      * The icon to show after the children in the button when the `buttonType` is
      * not set to `"icon"`.
      */
    var dropdownIcon: js.UndefOr[ReactElement] = js.native
    
    var enablePressedAndRipple: js.UndefOr[Boolean] = js.native
    
    /**
      * The position within the viewport to display the button as a floating action
      * button.
      */
    var floating: js.UndefOr[FABPosition] = js.native
    
    /**
      * Any additional props to provide the to `FAB` container element when the
      * `floating` prop is provided
      */
    var floatingProps: js.UndefOr[PropsWithRef[FABProps, HTMLSpanElement]] = js.native
    
    var form: js.UndefOr[String] = js.native
    
    var formAction: js.UndefOr[String] = js.native
    
    var formEncType: js.UndefOr[String] = js.native
    
    var formMethod: js.UndefOr[String] = js.native
    
    var formNoValidate: js.UndefOr[Boolean] = js.native
    
    var formTarget: js.UndefOr[String] = js.native
    
    var handlers: js.UndefOr[MergableRippleHandlers[HTMLButtonElement]] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    /**
      * An id for the button. This is required so that the `Menu` can be positioned
      * relative to this component.
      */
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
    
    var name: js.UndefOr[String] = js.native
    
    // Media Events
    var onAbort: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.native
    
    // Animation Events
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.native
    
    // MouseEvents
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    // Form Events
    var onChange: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    // Composition Events
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    // Clipboard Events
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    // Focus Events
    var onFocus: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
    
    // also a Media Event
    // Keyboard Events
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
    
    // Image Events
    var onLoad: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    // Pointer Events
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
    
    // UI Events
    var onScroll: js.UndefOr[UIEventHandler[HTMLButtonElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    // Selection Events
    var onSelect: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    // Touch Events
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
    
    // Transition Events
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLButtonElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    // Wheel Events
    var onWheel: js.UndefOr[WheelEventHandler[HTMLButtonElement]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    var rippleClassName: js.UndefOr[String] = js.native
    
    var rippleClassNames: js.UndefOr[CSSTransitionClassNames] = js.native
    
    var rippleContainerClassName: js.UndefOr[String] = js.native
    
    var rippleTimeout: js.UndefOr[TransitionTimeout] = js.native
    
    // <command>, <menuitem>
    // WAI-ARIA
    var role: js.UndefOr[String] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    /**
      * The material design theme to apply to the button. The theme prop will
      * update the look and feel of the button by applying different background
      * and/or foreground colors.
      */
    var theme: js.UndefOr[ButtonTheme] = js.native
    
    /**
      * The material design theme type to apply. The themeTYpe prop will update the
      * look and feel of the button by applying different border or box shadow.
      */
    var themeType: js.UndefOr[ButtonThemeType] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    /**
      * The button's type attribute. This is set to "button" by default so that
      * forms are not accidentally submitted when this prop is omitted since
      * buttons without a type attribute work as submit by default.
      */
    var `type`: js.UndefOr[button | reset | submit] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.native
    
    /**
      * Boolean if the menu is currently visible. This is requied for `a11y` as it
      * will automatically set the `"aria-expanded"` prop to the correct value when
      * needed.
      */
    var visible: Boolean = js.native
    
    var vocab: js.UndefOr[String] = js.native
  }
  object MenuButtonProps {
    
    @scala.inline
    def apply(visible: Boolean): MenuButtonProps = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuButtonProps]
    }
    
    @scala.inline
    implicit class MenuButtonPropsMutableBuilder[Self <: MenuButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
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
      def `setAria-haspopup`(
        value: Boolean | dialog | grid | listbox | menu | typingsSlinky.reactMdButton.reactMdButtonStrings.menu | tree | `true` | typingsSlinky.reactMdMenu.reactMdMenuBooleans.`true`
      ): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
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
      def setAsAppBarAction(value: Boolean): Self = StObject.set(x, "asAppBarAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsAppBarActionUndefined: Self = StObject.set(x, "asAppBarAction", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
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
      def setButtonType(value: ButtonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
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
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDisableDropdownIcon(value: Boolean): Self = StObject.set(x, "disableDropdownIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDropdownIconUndefined: Self = StObject.set(x, "disableDropdownIcon", js.undefined)
      
      @scala.inline
      def setDisableEnterClick(value: Boolean): Self = StObject.set(x, "disableEnterClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEnterClickUndefined: Self = StObject.set(x, "disableEnterClick", js.undefined)
      
      @scala.inline
      def setDisablePressedFallback(value: Boolean): Self = StObject.set(x, "disablePressedFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePressedFallbackUndefined: Self = StObject.set(x, "disablePressedFallback", js.undefined)
      
      @scala.inline
      def setDisableProgrammaticRipple(value: Boolean): Self = StObject.set(x, "disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableProgrammaticRippleUndefined: Self = StObject.set(x, "disableProgrammaticRipple", js.undefined)
      
      @scala.inline
      def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setDropdownIcon(value: ReactElement): Self = StObject.set(x, "dropdownIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownIconReactElement(value: ReactElement): Self = StObject.set(x, "dropdownIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownIconUndefined: Self = StObject.set(x, "dropdownIcon", js.undefined)
      
      @scala.inline
      def setEnablePressedAndRipple(value: Boolean): Self = StObject.set(x, "enablePressedAndRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePressedAndRippleUndefined: Self = StObject.set(x, "enablePressedAndRipple", js.undefined)
      
      @scala.inline
      def setFloating(value: FABPosition): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingNull: Self = StObject.set(x, "floating", null)
      
      @scala.inline
      def setFloatingProps(value: PropsWithRef[FABProps, HTMLSpanElement]): Self = StObject.set(x, "floatingProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingPropsUndefined: Self = StObject.set(x, "floatingProps", js.undefined)
      
      @scala.inline
      def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
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
      def setHandlers(value: MergableRippleHandlers[HTMLButtonElement]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
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
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: SyntheticAnimationEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: SyntheticAnimationEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: SyntheticAnimationEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: SyntheticCompositionEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: SyntheticCompositionEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: SyntheticClipboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: SyntheticClipboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: SyntheticClipboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: SyntheticTouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticTouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticTouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: SyntheticTransitionEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: SyntheticWheelEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
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
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setRippleClassName(value: String): Self = StObject.set(x, "rippleClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleClassNameUndefined: Self = StObject.set(x, "rippleClassName", js.undefined)
      
      @scala.inline
      def setRippleClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "rippleClassNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleClassNamesUndefined: Self = StObject.set(x, "rippleClassNames", js.undefined)
      
      @scala.inline
      def setRippleContainerClassName(value: String): Self = StObject.set(x, "rippleContainerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleContainerClassNameUndefined: Self = StObject.set(x, "rippleContainerClassName", js.undefined)
      
      @scala.inline
      def setRippleTimeout(value: TransitionTimeout): Self = StObject.set(x, "rippleTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleTimeoutUndefined: Self = StObject.set(x, "rippleTimeout", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
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
      def setTheme(value: ButtonTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeType(value: ButtonThemeType): Self = StObject.set(x, "themeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeTypeUndefined: Self = StObject.set(x, "themeType", js.undefined)
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setType(value: button | reset | submit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
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
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
}

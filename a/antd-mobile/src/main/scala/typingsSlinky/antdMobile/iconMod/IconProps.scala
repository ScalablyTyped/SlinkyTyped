package typingsSlinky.antdMobile.iconMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.SVGSVGElement
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
import typingsSlinky.antdMobile.antdMobileStrings.`additions text`
import typingsSlinky.antdMobile.antdMobileStrings.`inline`
import typingsSlinky.antdMobile.antdMobileStrings.additions
import typingsSlinky.antdMobile.antdMobileStrings.all
import typingsSlinky.antdMobile.antdMobileStrings.ascending
import typingsSlinky.antdMobile.antdMobileStrings.assertive
import typingsSlinky.antdMobile.antdMobileStrings.both
import typingsSlinky.antdMobile.antdMobileStrings.copy
import typingsSlinky.antdMobile.antdMobileStrings.date
import typingsSlinky.antdMobile.antdMobileStrings.decimal
import typingsSlinky.antdMobile.antdMobileStrings.descending
import typingsSlinky.antdMobile.antdMobileStrings.dialog
import typingsSlinky.antdMobile.antdMobileStrings.email
import typingsSlinky.antdMobile.antdMobileStrings.execute
import typingsSlinky.antdMobile.antdMobileStrings.grammar
import typingsSlinky.antdMobile.antdMobileStrings.grid
import typingsSlinky.antdMobile.antdMobileStrings.horizontal
import typingsSlinky.antdMobile.antdMobileStrings.inherit
import typingsSlinky.antdMobile.antdMobileStrings.lg
import typingsSlinky.antdMobile.antdMobileStrings.link
import typingsSlinky.antdMobile.antdMobileStrings.list
import typingsSlinky.antdMobile.antdMobileStrings.listbox
import typingsSlinky.antdMobile.antdMobileStrings.location
import typingsSlinky.antdMobile.antdMobileStrings.md
import typingsSlinky.antdMobile.antdMobileStrings.menu
import typingsSlinky.antdMobile.antdMobileStrings.mixed
import typingsSlinky.antdMobile.antdMobileStrings.move
import typingsSlinky.antdMobile.antdMobileStrings.no
import typingsSlinky.antdMobile.antdMobileStrings.none
import typingsSlinky.antdMobile.antdMobileStrings.numeric
import typingsSlinky.antdMobile.antdMobileStrings.off
import typingsSlinky.antdMobile.antdMobileStrings.on
import typingsSlinky.antdMobile.antdMobileStrings.other
import typingsSlinky.antdMobile.antdMobileStrings.page
import typingsSlinky.antdMobile.antdMobileStrings.polite
import typingsSlinky.antdMobile.antdMobileStrings.popup
import typingsSlinky.antdMobile.antdMobileStrings.removals
import typingsSlinky.antdMobile.antdMobileStrings.search
import typingsSlinky.antdMobile.antdMobileStrings.sm
import typingsSlinky.antdMobile.antdMobileStrings.spelling
import typingsSlinky.antdMobile.antdMobileStrings.step
import typingsSlinky.antdMobile.antdMobileStrings.tel
import typingsSlinky.antdMobile.antdMobileStrings.text
import typingsSlinky.antdMobile.antdMobileStrings.time
import typingsSlinky.antdMobile.antdMobileStrings.tree
import typingsSlinky.antdMobile.antdMobileStrings.url
import typingsSlinky.antdMobile.antdMobileStrings.vertical
import typingsSlinky.antdMobile.antdMobileStrings.xs
import typingsSlinky.antdMobile.antdMobileStrings.xxs
import typingsSlinky.antdMobile.antdMobileStrings.yes
import typingsSlinky.antdMobile.iconPropsTypeMod.IconPropsType
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
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.LegacyRef
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

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.antdMobile.iconMod.SvgProps because var conflicts: color. Inlined formAction, `aria-flowto`, srcDoc, `aria-invalid`, `aria-keyshortcuts`, alt, coords, contextMenu, src, onKeyDown, max, marginWidth, `aria-orientation`, vocab, keyParams, required, `aria-colindex`, onPlaying, selected, onMouseOver, onMouseMove, typeof, onPointerCancel, kind, `aria-valuenow`, charSet, `aria-valuetext`, onDragStart, srcLang, onMouseEnter, sizes, dateTime, inputMode, onDragEnter, onPointerOver, `aria-rowspan`, onDragLeave, onMouseOut, onVolumeChange, multiple, `aria-relevant`, onSelect, onAnimationStart, onLoadedData, is, key, height, about, `aria-valuemax`, accessKey, `aria-pressed`, `aria-atomic`, onTouchStart, rowSpan, `aria-selected`, as, method, content, `aria-disabled`, nonce, start, itemScope, `aria-current`, style, onInput, security, `aria-labelledby`, `aria-multiline`, httpEquiv, default, defaultValue, optimum, target, scope, onCompositionStart, onScroll, sandbox, seamless, classID, onDragEnd, onLoadStart, noValidate, autoPlay, autoSave, min, cols, capture, dangerouslySetInnerHTML, prefix, onFocus, encType, onContextMenu, wmode, `aria-colcount`, wrap, keyType, frameBorder, onError, resource, onTouchMove, onTouchEnd, media, preload, suppressHydrationWarning, useMap, itemType, onDrag, `aria-describedby`, onEnded, scoped, spellCheck, onAnimationIteration, tabIndex, `aria-label`, `aria-busy`, slot, onWaiting, onCompositionEnd, `aria-valuemin`, autoCapitalize, placeholder, rel, maxLength, manifest, onDoubleClick, colSpan, radioGroup, `aria-rowindex`, data, onEmptied, onStalled, onKeyPress, `aria-autocomplete`, formEncType, onMouseUp, id, pattern, `aria-activedescendant`, `aria-sort`, onPointerLeave, lang, `aria-errormessage`, onAuxClick, onWheel, form, `aria-posinset`, `aria-details`, `aria-colspan`, suppressContentEditableWarning, onPointerUp, translate, itemID, open, onProgress, accept, step, defer, `aria-expanded`, `aria-controls`, dir, onBlur, `aria-owns`, shape, `aria-live`, value, `aria-grabbed`, onPointerMove, cite, onPause, onDrop, onReset, minLength, onPointerDown, `aria-readonly`, onDragOver, cellSpacing, label, readOnly, onTimeUpdate, challenge, poster, `aria-multiselectable`, name, onMouseDown, `aria-haspopup`, disabled, draggable, formMethod, `aria-hidden`, playsInline, marginHeight, htmlFor, allowTransparency, onDurationChange, contentEditable, onSubmit, headers, onSuspend, onTransitionEnd, onCanPlay, onDragExit, width, summary, `aria-level`, formTarget, onEncrypted, rows, onPlay, itemRef, onPointerOut, href, `aria-placeholder`, action, hidden, scrolling, onCopy, inlist, property, low, acceptCharset, defaultChecked, `aria-dropeffect`, className, reversed, autoFocus, unselectable, onAbort, onInvalid, onCompositionUpdate, onTouchCancel, role, controls, children, loop, mediaGroup, download, onCanPlayThrough, crossOrigin, muted, onClick, async, onLoad, onLoadedMetadata, integrity, onSeeked, high, checked, onChange, `aria-roledescription`, srcSet, onPointerEnter, ref, datatype, `aria-modal`, onBeforeInput, onAnimationEnd, formNoValidate, allowFullScreen, onCut, `aria-checked`, onSeeking, onPaste, onMouseLeave, list, cellPadding, itemProp, onRateChange, title, autoComplete, onKeyUp, `aria-setsize`, hrefLang, autoCorrect, `aria-rowcount`, span, `aria-required`, results */ trait IconProps extends IconPropsType {
  var about: js.UndefOr[String] = js.undefined
  var accept: js.UndefOr[String] = js.undefined
  var acceptCharset: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var action: js.UndefOr[String] = js.undefined
  var allowFullScreen: js.UndefOr[Boolean] = js.undefined
  var allowTransparency: js.UndefOr[Boolean] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var `aria-level`: js.UndefOr[Double] = js.undefined
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  var `aria-owns`: js.UndefOr[String] = js.undefined
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var async: js.UndefOr[Boolean] = js.undefined
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var capture: js.UndefOr[Boolean | String] = js.undefined
  var cellPadding: js.UndefOr[Double | String] = js.undefined
  var cellSpacing: js.UndefOr[Double | String] = js.undefined
  var challenge: js.UndefOr[String] = js.undefined
  var charSet: js.UndefOr[String] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var cite: js.UndefOr[String] = js.undefined
  var classID: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var cols: js.UndefOr[Double] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var coords: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var dateTime: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[Boolean] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var download: js.UndefOr[js.Any] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  var encType: js.UndefOr[String] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var formAction: js.UndefOr[String] = js.undefined
  var formEncType: js.UndefOr[String] = js.undefined
  var formMethod: js.UndefOr[String] = js.undefined
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  var formTarget: js.UndefOr[String] = js.undefined
  var frameBorder: js.UndefOr[Double | String] = js.undefined
  var headers: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var high: js.UndefOr[Double] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var hrefLang: js.UndefOr[String] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var httpEquiv: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var keyParams: js.UndefOr[String] = js.undefined
  var keyType: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var list: js.UndefOr[String] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var low: js.UndefOr[Double] = js.undefined
  var manifest: js.UndefOr[String] = js.undefined
  var marginHeight: js.UndefOr[Double] = js.undefined
  var marginWidth: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double | String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var mediaGroup: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[Double | String] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noValidate: js.UndefOr[Boolean] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[SVGSVGElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[SVGSVGElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[SVGSVGElement]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var optimum: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var playsInline: js.UndefOr[Boolean] = js.undefined
  var poster: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var preload: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[LegacyRef[SVGSVGElement]] = js.undefined
  var rel: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var sandbox: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var scoped: js.UndefOr[Boolean] = js.undefined
  var scrolling: js.UndefOr[String] = js.undefined
  var seamless: js.UndefOr[Boolean] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[xxs | xs | sm | md | lg] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var span: js.UndefOr[Double] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcDoc: js.UndefOr[String] = js.undefined
  var srcLang: js.UndefOr[String] = js.undefined
  var srcSet: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var useMap: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var wmode: js.UndefOr[String] = js.undefined
  var wrap: js.UndefOr[String] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    IconPropsType: IconPropsType,
    about: String = null,
    accept: String = null,
    acceptCharset: String = null,
    accessKey: String = null,
    action: String = null,
    allowFullScreen: js.UndefOr[Boolean] = js.undefined,
    allowTransparency: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: js.UndefOr[Double] = js.undefined,
    `aria-colindex`: js.UndefOr[Double] = js.undefined,
    `aria-colspan`: js.UndefOr[Double] = js.undefined,
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
    `aria-level`: js.UndefOr[Double] = js.undefined,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: js.UndefOr[Double] = js.undefined,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: js.UndefOr[Double] = js.undefined,
    `aria-rowindex`: js.UndefOr[Double] = js.undefined,
    `aria-rowspan`: js.UndefOr[Double] = js.undefined,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: js.UndefOr[Double] = js.undefined,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: js.UndefOr[Double] = js.undefined,
    `aria-valuemin`: js.UndefOr[Double] = js.undefined,
    `aria-valuenow`: js.UndefOr[Double] = js.undefined,
    `aria-valuetext`: String = null,
    as: String = null,
    async: js.UndefOr[Boolean] = js.undefined,
    autoCapitalize: String = null,
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    capture: Boolean | String = null,
    cellPadding: Double | String = null,
    cellSpacing: Double | String = null,
    challenge: String = null,
    charSet: String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    cite: String = null,
    classID: String = null,
    className: String = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    cols: js.UndefOr[Double] = js.undefined,
    content: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    coords: String = null,
    crossOrigin: String = null,
    dangerouslySetInnerHTML: Html = null,
    data: String = null,
    datatype: String = null,
    dateTime: String = null,
    default: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    download: js.Any = null,
    draggable: js.UndefOr[Booleanish] = js.undefined,
    encType: String = null,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    frameBorder: Double | String = null,
    headers: String = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    high: js.UndefOr[Double] = js.undefined,
    href: String = null,
    hrefLang: String = null,
    htmlFor: String = null,
    httpEquiv: String = null,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    integrity: String = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    key: Key = null,
    keyParams: String = null,
    keyType: String = null,
    kind: String = null,
    label: String = null,
    lang: String = null,
    list: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    low: js.UndefOr[Double] = js.undefined,
    manifest: String = null,
    marginHeight: js.UndefOr[Double] = js.undefined,
    marginWidth: js.UndefOr[Double] = js.undefined,
    max: Double | String = null,
    maxLength: js.UndefOr[Double] = js.undefined,
    media: String = null,
    mediaGroup: String = null,
    method: String = null,
    min: Double | String = null,
    minLength: js.UndefOr[Double] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    onAbort: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[SVGSVGElement] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[SVGSVGElement] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[SVGSVGElement] => Unit = null,
    onAuxClick: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit = null,
    onBlur: SyntheticFocusEvent[SVGSVGElement] => Unit = null,
    onCanPlay: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onCanPlayThrough: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onChange: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit = null,
    onClick: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[SVGSVGElement] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[SVGSVGElement] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[SVGSVGElement] => Unit = null,
    onContextMenu: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onCopy: SyntheticClipboardEvent[SVGSVGElement] => Unit = null,
    onCut: SyntheticClipboardEvent[SVGSVGElement] => Unit = null,
    onDoubleClick: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onDrag: DragEvent[SVGSVGElement] => Unit = null,
    onDragEnd: DragEvent[SVGSVGElement] => Unit = null,
    onDragEnter: DragEvent[SVGSVGElement] => Unit = null,
    onDragExit: DragEvent[SVGSVGElement] => Unit = null,
    onDragLeave: DragEvent[SVGSVGElement] => Unit = null,
    onDragOver: DragEvent[SVGSVGElement] => Unit = null,
    onDragStart: DragEvent[SVGSVGElement] => Unit = null,
    onDrop: DragEvent[SVGSVGElement] => Unit = null,
    onDurationChange: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onEmptied: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onEncrypted: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onEnded: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onError: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onFocus: SyntheticFocusEvent[SVGSVGElement] => Unit = null,
    onInput: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit = null,
    onInvalid: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[SVGSVGElement] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[SVGSVGElement] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[SVGSVGElement] => Unit = null,
    onLoad: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onLoadStart: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onLoadedData: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onLoadedMetadata: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onMouseDown: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onMouseMove: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onMouseOut: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onMouseOver: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onMouseUp: SyntheticMouseEvent[SVGSVGElement] => Unit = null,
    onPaste: SyntheticClipboardEvent[SVGSVGElement] => Unit = null,
    onPause: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onPlay: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onPlaying: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerDown: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerMove: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerOut: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerOver: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onPointerUp: SyntheticPointerEvent[SVGSVGElement] => Unit = null,
    onProgress: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onRateChange: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onReset: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit = null,
    onScroll: SyntheticUIEvent[SVGSVGElement] => Unit = null,
    onSeeked: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onSeeking: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onSelect: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onStalled: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onSubmit: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit = null,
    onSuspend: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onTimeUpdate: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[SVGSVGElement] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[SVGSVGElement] => Unit = null,
    onTouchMove: SyntheticTouchEvent[SVGSVGElement] => Unit = null,
    onTouchStart: SyntheticTouchEvent[SVGSVGElement] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[SVGSVGElement] => Unit = null,
    onVolumeChange: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onWaiting: SyntheticEvent[Event, SVGSVGElement] => Unit = null,
    onWheel: SyntheticWheelEvent[SVGSVGElement] => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    optimum: js.UndefOr[Double] = js.undefined,
    pattern: String = null,
    placeholder: String = null,
    playsInline: js.UndefOr[Boolean] = js.undefined,
    poster: String = null,
    prefix: String = null,
    preload: String = null,
    property: String = null,
    radioGroup: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    ref: js.UndefOr[Null | LegacyRef[SVGSVGElement]] = js.undefined,
    rel: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    results: js.UndefOr[Double] = js.undefined,
    reversed: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    rowSpan: js.UndefOr[Double] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined,
    sandbox: String = null,
    scope: String = null,
    scoped: js.UndefOr[Boolean] = js.undefined,
    scrolling: String = null,
    seamless: js.UndefOr[Boolean] = js.undefined,
    security: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    shape: String = null,
    size: xxs | xs | sm | md | lg = null,
    sizes: String = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IconPropsType)
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTransparency)) __obj.updateDynamic("allowTransparency")(allowTransparency.get.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.get.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.get.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colcount`)) __obj.updateDynamic("aria-colcount")(`aria-colcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colindex`)) __obj.updateDynamic("aria-colindex")(`aria-colindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colspan`)) __obj.updateDynamic("aria-colspan")(`aria-colspan`.get.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.get.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.get.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.get.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.get.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-level`)) __obj.updateDynamic("aria-level")(`aria-level`.get.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.get.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-posinset`)) __obj.updateDynamic("aria-posinset")(`aria-posinset`.get.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.get.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.get.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowcount`)) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowindex`)) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowspan`)) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-setsize`)) __obj.updateDynamic("aria-setsize")(`aria-setsize`.get.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemax`)) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemin`)) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuenow`)) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.get.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (challenge != null) __obj.updateDynamic("challenge")(challenge.asInstanceOf[js.Any])
    if (charSet != null) __obj.updateDynamic("charSet")(charSet.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (cite != null) __obj.updateDynamic("cite")(cite.asInstanceOf[js.Any])
    if (classID != null) __obj.updateDynamic("classID")(classID.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.get.asInstanceOf[js.Any])
    if (coords != null) __obj.updateDynamic("coords")(coords.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (encType != null) __obj.updateDynamic("encType")(encType.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.get.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (frameBorder != null) __obj.updateDynamic("frameBorder")(frameBorder.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(high)) __obj.updateDynamic("high")(high.get.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (httpEquiv != null) __obj.updateDynamic("httpEquiv")(httpEquiv.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.get.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(low)) __obj.updateDynamic("low")(low.get.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (!js.isUndefined(marginHeight)) __obj.updateDynamic("marginHeight")(marginHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginWidth)) __obj.updateDynamic("marginWidth")(marginWidth.get.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (mediaGroup != null) __obj.updateDynamic("mediaGroup")(mediaGroup.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.get.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
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
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (!js.isUndefined(optimum)) __obj.updateDynamic("optimum")(optimum.get.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(playsInline)) __obj.updateDynamic("playsInline")(playsInline.get.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (!js.isUndefined(results)) __obj.updateDynamic("results")(results.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(scoped)) __obj.updateDynamic("scoped")(scoped.get.asInstanceOf[js.Any])
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(seamless)) __obj.updateDynamic("seamless")(seamless.get.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}


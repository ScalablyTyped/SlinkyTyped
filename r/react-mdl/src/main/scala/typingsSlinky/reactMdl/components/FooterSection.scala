package typingsSlinky.reactMdl.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
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
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.reactMdl.mod.FooterSectionProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FooterSection
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactMdl.mod.FooterSection] {
  @JSImport("react-mdl", "FooterSection")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: accept, action, alt, async, autoComplete, autoFocus, challenge, checked, className, colSpan, cols, content, controls, coords, dangerouslySetInnerHTML, default, defaultChecked, defer, dir, disabled, download, draggable, form, headers, height, hidden, high, href, htmlFor, id, integrity, kind, lang, list, loop, low, manifest, max, media, method, min, multiple, muted, nonce, open, optimum, pattern, placeholder, poster, preload, readOnly, rel, required, reversed, rowSpan, sandbox, scope, scoped, scrolling, selected, shape, sizes, span, spellCheck, src, start, step, style, summary, tabIndex, target, title, type, width, wrap */
  def apply(
    about: String = null,
    acceptCharset: String = null,
    accessKey: String = null,
    allowFullScreen: js.UndefOr[Boolean] = js.undefined,
    allowTransparency: js.UndefOr[Boolean] = js.undefined,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    capture: js.UndefOr[Boolean] = js.undefined,
    cellPadding: Double | String = null,
    cellSpacing: Double | String = null,
    charSet: String = null,
    classID: String = null,
    color: String = null,
    contentEditable: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    crossOrigin: String = null,
    datatype: String = null,
    dateTime: String = null,
    defaultValue: Double | String | js.Array[String] = null,
    encType: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    frameBorder: Double | String = null,
    hrefLang: String = null,
    httpEquiv: String = null,
    inlist: js.Any = null,
    inputMode: String = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    keyParams: String = null,
    keyType: String = null,
    logo: TagMod[Any] = null,
    marginHeight: Int | Double = null,
    marginWidth: Int | Double = null,
    maxLength: Int | Double = null,
    mediaGroup: String = null,
    minLength: Int | Double = null,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    onAbort: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onAuxClick: SyntheticMouseEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with typingsSlinky.reactMdl.mod.FooterSection, Event_] => Unit = null,
    onBlur: SyntheticFocusEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onCanPlay: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onCanPlayThrough: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onChange: SyntheticEvent[EventTarget with typingsSlinky.reactMdl.mod.FooterSection, Event_] => Unit = null,
    onClick: SyntheticMouseEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onContextMenu: SyntheticMouseEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onCopy: SyntheticClipboardEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onCut: SyntheticClipboardEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onDoubleClick: SyntheticMouseEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onDrag: DragEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onDragEnd: DragEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onDragEnter: DragEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onDragExit: DragEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onDragLeave: DragEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onDragOver: DragEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onDragStart: DragEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onDrop: DragEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onDurationChange: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onEmptied: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onEncrypted: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onEnded: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onError: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onFocus: SyntheticFocusEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onInput: SyntheticEvent[EventTarget with typingsSlinky.reactMdl.mod.FooterSection, Event_] => Unit = null,
    onInvalid: SyntheticEvent[EventTarget with typingsSlinky.reactMdl.mod.FooterSection, Event_] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onLoad: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onLoadStart: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onLoadedData: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onLoadedMetadata: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onMouseDown: SyntheticMouseEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onMouseMove: SyntheticMouseEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onMouseOut: SyntheticMouseEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onMouseOver: SyntheticMouseEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onMouseUp: SyntheticMouseEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onPaste: SyntheticClipboardEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onPause: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onPlay: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onPlaying: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onPointerDown: SyntheticPointerEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onPointerMove: SyntheticPointerEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onPointerOut: SyntheticPointerEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onPointerOver: SyntheticPointerEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onPointerUp: SyntheticPointerEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onProgress: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onRateChange: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onReset: SyntheticEvent[EventTarget with typingsSlinky.reactMdl.mod.FooterSection, Event_] => Unit = null,
    onScroll: SyntheticUIEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onSeeked: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onSeeking: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onSelect: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onStalled: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onSubmit: SyntheticEvent[EventTarget with typingsSlinky.reactMdl.mod.FooterSection, Event_] => Unit = null,
    onSuspend: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onTimeUpdate: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onTouchMove: SyntheticTouchEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onTouchStart: SyntheticTouchEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onVolumeChange: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onWaiting: SyntheticEvent[Event_, typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    onWheel: SyntheticWheelEvent[typingsSlinky.reactMdl.mod.FooterSection] => Unit = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    seamless: js.UndefOr[Boolean] = js.undefined,
    security: String = null,
    size: String = null,
    srcDoc: String = null,
    srcLang: String = null,
    srcSet: String = null,
    typeof: String = null,
    unselectable: js.UndefOr[Boolean] = js.undefined,
    useMap: String = null,
    vocab: String = null,
    wmode: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactMdl.mod.FooterSection] = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTransparency)) __obj.updateDynamic("allowTransparency")(allowTransparency.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (charSet != null) __obj.updateDynamic("charSet")(charSet.asInstanceOf[js.Any])
    if (classID != null) __obj.updateDynamic("classID")(classID.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (encType != null) __obj.updateDynamic("encType")(encType.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (frameBorder != null) __obj.updateDynamic("frameBorder")(frameBorder.asInstanceOf[js.Any])
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang.asInstanceOf[js.Any])
    if (httpEquiv != null) __obj.updateDynamic("httpEquiv")(httpEquiv.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (marginHeight != null) __obj.updateDynamic("marginHeight")(marginHeight.asInstanceOf[js.Any])
    if (marginWidth != null) __obj.updateDynamic("marginWidth")(marginWidth.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (mediaGroup != null) __obj.updateDynamic("mediaGroup")(mediaGroup.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
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
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(seamless)) __obj.updateDynamic("seamless")(seamless.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (srcDoc != null) __obj.updateDynamic("srcDoc")(srcDoc.asInstanceOf[js.Any])
    if (srcLang != null) __obj.updateDynamic("srcLang")(srcLang.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (useMap != null) __obj.updateDynamic("useMap")(useMap.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (wmode != null) __obj.updateDynamic("wmode")(wmode.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactMdl.mod.FooterSection] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactMdl.mod.FooterSection](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FooterSectionProps
}


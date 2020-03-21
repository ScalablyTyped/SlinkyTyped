package typingsSlinky.reactOwlCarousel.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.DragEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.reactOwlCarousel.mod.OwlCarouselProps
import typingsSlinky.reactOwlCarousel.mod.default
import typingsSlinky.reactOwlCarousel.optionsMod.HandlerCallback
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.`additions text`
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.`inline`
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.additions
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.all
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.ascending
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.assertive
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.both
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.copy
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.date
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.decimal
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.descending
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.dialog
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.email
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.execute
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.grammar
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.grid
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.horizontal
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.inherit
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.link
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.list
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.listbox
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.location
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.menu
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.mixed
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.move
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.none
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.numeric
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.off
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.other
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.page
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.polite
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.popup
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.removals
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.search
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.spelling
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.step
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.tel
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.text
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.time
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.tree
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.url
import typingsSlinky.reactOwlCarousel.reactOwlCarouselStrings.vertical
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactOwlCarousel
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-owl-carousel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, dangerouslySetInnerHTML, dir, draggable, hidden, id, lang, onAbort, onAnimationEnd, onAnimationIteration, onAnimationStart, onBlur, onCanPlay, onCanPlayThrough, onClick, onCompositionEnd, onCompositionStart, onCompositionUpdate, onContextMenu, onCopy, onCut, onDoubleClick, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onDurationChange, onEmptied, onEncrypted, onEnded, onError, onFocus, onInput, onInvalid, onKeyDown, onKeyPress, onKeyUp, onLoad, onLoadStart, onLoadedData, onLoadedMetadata, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onPaste, onPause, onPlay, onPlaying, onPointerCancel, onPointerDown, onPointerEnter, onPointerLeave, onPointerMove, onPointerOut, onPointerOver, onPointerUp, onProgress, onRateChange, onScroll, onSeeked, onSeeking, onSelect, onStalled, onSubmit, onSuspend, onTimeUpdate, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, onTransitionEnd, onVolumeChange, onWaiting, onWheel, spellCheck, style, suppressContentEditableWarning, tabIndex, title */
  def apply(
    URLhashListener: js.UndefOr[Boolean] = js.undefined,
    about: String = null,
    accept: String = null,
    acceptCharset: String = null,
    accessKey: String = null,
    action: String = null,
    allowFullScreen: js.UndefOr[Boolean] = js.undefined,
    allowTransparency: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    animateIn: String | Boolean = null,
    animateOut: String | Boolean = null,
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
    as: String = null,
    async: js.UndefOr[Boolean] = js.undefined,
    autoCapitalize: String = null,
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoHeightClass: String = null,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayHoverPause: js.UndefOr[Boolean] = js.undefined,
    autoplaySpeed: Double | Boolean = null,
    autoplayTimeout: Int | Double = null,
    callbacks: js.UndefOr[Boolean] = js.undefined,
    capture: Boolean | String = null,
    cellPadding: Double | String = null,
    cellSpacing: Double | String = null,
    center: js.UndefOr[Boolean] = js.undefined,
    challenge: String = null,
    charSet: String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    cite: String = null,
    classID: String = null,
    colSpan: Int | Double = null,
    color: String = null,
    cols: Int | Double = null,
    content: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    controlsClass: String = null,
    coords: String = null,
    crossOrigin: String = null,
    data: String = null,
    datatype: String = null,
    dateTime: String = null,
    default: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dotClass: String = null,
    dotData: js.UndefOr[Boolean] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    dotsClass: String = null,
    dotsContainer: String | Boolean = null,
    dotsEach: Double | Boolean = null,
    dotsSpeed: Double | Boolean = null,
    download: js.Any = null,
    dragClass: String = null,
    dragEndSpeed: Double | Boolean = null,
    encType: String = null,
    fallbackEasing: String = null,
    fluidSpeed: Double | Boolean = null,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    frameBorder: Double | String = null,
    freeDrag: js.UndefOr[Boolean] = js.undefined,
    grabClass: String = null,
    headers: String = null,
    height: Double | String = null,
    high: Int | Double = null,
    href: String = null,
    hrefLang: String = null,
    htmlFor: String = null,
    httpEquiv: String = null,
    info: /* repeated */ js.Any => Unit = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    integrity: String = null,
    is: String = null,
    itemElement: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    items: Int | Double = null,
    keyParams: String = null,
    keyType: String = null,
    kind: String = null,
    label: String = null,
    lazyContent: js.UndefOr[Boolean] = js.undefined,
    lazyLoad: js.UndefOr[Boolean] = js.undefined,
    list: String = null,
    loadedClass: String = null,
    loadingClass: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    low: Int | Double = null,
    manifest: String = null,
    margin: Int | Double = null,
    marginHeight: Int | Double = null,
    marginWidth: Int | Double = null,
    max: Double | String = null,
    maxLength: Int | Double = null,
    media: String = null,
    mediaGroup: String = null,
    merge: js.UndefOr[Boolean] = js.undefined,
    mergeFit: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    min: Double | String = null,
    minLength: Int | Double = null,
    mouseDrag: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    nav: js.UndefOr[Boolean] = js.undefined,
    navClass: js.Array[String] = null,
    navContainer: String | Boolean = null,
    navContainerClass: String = null,
    navElement: String = null,
    navSpeed: Double | Boolean = null,
    navText: js.Array[String] = null,
    nestedItemSelector: String = null,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    onAuxClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with HTMLDivElement, Event_] => Unit = null,
    onChange: HandlerCallback with FormEventHandler[HTMLDivElement] = null,
    onChanged: /* repeated */ js.Any => Unit = null,
    onDrag: HandlerCallback with DragEventHandler[HTMLDivElement] = null,
    onDragged: /* repeated */ js.Any => Unit = null,
    onInitialize: /* repeated */ js.Any => Unit = null,
    onInitialized: /* repeated */ js.Any => Unit = null,
    onLoadLazy: /* repeated */ js.Any => Unit = null,
    onLoadedLazy: /* repeated */ js.Any => Unit = null,
    onPlayVideo: /* repeated */ js.Any => Unit = null,
    onRefresh: /* repeated */ js.Any => Unit = null,
    onRefreshed: /* repeated */ js.Any => Unit = null,
    onReset: SyntheticEvent[EventTarget with HTMLDivElement, Event_] => Unit = null,
    onResize: /* repeated */ js.Any => Unit = null,
    onResized: /* repeated */ js.Any => Unit = null,
    onStopVideo: /* repeated */ js.Any => Unit = null,
    onTranslate: /* repeated */ js.Any => Unit = null,
    onTranslated: /* repeated */ js.Any => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    optimum: Int | Double = null,
    pattern: String = null,
    placeholder: String = null,
    playsInline: js.UndefOr[Boolean] = js.undefined,
    poster: String = null,
    prefix: String = null,
    preload: String = null,
    property: String = null,
    pullDrag: js.UndefOr[Boolean] = js.undefined,
    radioGroup: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    refreshClass: String = null,
    rel: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    responsiveBaseElement: org.scalajs.dom.raw.Element = null,
    responsiveClass: String | Boolean = null,
    responsiveRefreshRate: Int | Double = null,
    results: Int | Double = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    rewind: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    rowSpan: Int | Double = null,
    rows: Int | Double = null,
    rtlClass: String = null,
    sandbox: String = null,
    scope: String = null,
    scoped: js.UndefOr[Boolean] = js.undefined,
    scrolling: String = null,
    seamless: js.UndefOr[Boolean] = js.undefined,
    security: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    shape: String = null,
    size: Int | Double = null,
    sizes: String = null,
    slideBy: Double | String = null,
    slot: String = null,
    smartSpeed: Double | Boolean = null,
    span: Int | Double = null,
    src: String = null,
    srcDoc: String = null,
    srcLang: String = null,
    srcSet: String = null,
    stageClass: String = null,
    stageElement: String = null,
    stageOuterClass: String = null,
    stagePadding: Int | Double = null,
    start: Int | Double = null,
    startPosition: Double | String = null,
    step: Double | String = null,
    summary: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(URLhashListener)) __obj.updateDynamic("URLhashListener")(URLhashListener.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTransparency)) __obj.updateDynamic("allowTransparency")(allowTransparency.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (animateIn != null) __obj.updateDynamic("animateIn")(animateIn.asInstanceOf[js.Any])
    if (animateOut != null) __obj.updateDynamic("animateOut")(animateOut.asInstanceOf[js.Any])
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
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoHeightClass != null) __obj.updateDynamic("autoHeightClass")(autoHeightClass.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayHoverPause)) __obj.updateDynamic("autoplayHoverPause")(autoplayHoverPause.asInstanceOf[js.Any])
    if (autoplaySpeed != null) __obj.updateDynamic("autoplaySpeed")(autoplaySpeed.asInstanceOf[js.Any])
    if (autoplayTimeout != null) __obj.updateDynamic("autoplayTimeout")(autoplayTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(callbacks)) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (challenge != null) __obj.updateDynamic("challenge")(challenge.asInstanceOf[js.Any])
    if (charSet != null) __obj.updateDynamic("charSet")(charSet.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (cite != null) __obj.updateDynamic("cite")(cite.asInstanceOf[js.Any])
    if (classID != null) __obj.updateDynamic("classID")(classID.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (controlsClass != null) __obj.updateDynamic("controlsClass")(controlsClass.asInstanceOf[js.Any])
    if (coords != null) __obj.updateDynamic("coords")(coords.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dotClass != null) __obj.updateDynamic("dotClass")(dotClass.asInstanceOf[js.Any])
    if (!js.isUndefined(dotData)) __obj.updateDynamic("dotData")(dotData.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (dotsClass != null) __obj.updateDynamic("dotsClass")(dotsClass.asInstanceOf[js.Any])
    if (dotsContainer != null) __obj.updateDynamic("dotsContainer")(dotsContainer.asInstanceOf[js.Any])
    if (dotsEach != null) __obj.updateDynamic("dotsEach")(dotsEach.asInstanceOf[js.Any])
    if (dotsSpeed != null) __obj.updateDynamic("dotsSpeed")(dotsSpeed.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (dragClass != null) __obj.updateDynamic("dragClass")(dragClass.asInstanceOf[js.Any])
    if (dragEndSpeed != null) __obj.updateDynamic("dragEndSpeed")(dragEndSpeed.asInstanceOf[js.Any])
    if (encType != null) __obj.updateDynamic("encType")(encType.asInstanceOf[js.Any])
    if (fallbackEasing != null) __obj.updateDynamic("fallbackEasing")(fallbackEasing.asInstanceOf[js.Any])
    if (fluidSpeed != null) __obj.updateDynamic("fluidSpeed")(fluidSpeed.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (frameBorder != null) __obj.updateDynamic("frameBorder")(frameBorder.asInstanceOf[js.Any])
    if (!js.isUndefined(freeDrag)) __obj.updateDynamic("freeDrag")(freeDrag.asInstanceOf[js.Any])
    if (grabClass != null) __obj.updateDynamic("grabClass")(grabClass.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (httpEquiv != null) __obj.updateDynamic("httpEquiv")(httpEquiv.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction1(info))
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyContent)) __obj.updateDynamic("lazyContent")(lazyContent.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyLoad)) __obj.updateDynamic("lazyLoad")(lazyLoad.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (loadedClass != null) __obj.updateDynamic("loadedClass")(loadedClass.asInstanceOf[js.Any])
    if (loadingClass != null) __obj.updateDynamic("loadingClass")(loadingClass.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginHeight != null) __obj.updateDynamic("marginHeight")(marginHeight.asInstanceOf[js.Any])
    if (marginWidth != null) __obj.updateDynamic("marginWidth")(marginWidth.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (mediaGroup != null) __obj.updateDynamic("mediaGroup")(mediaGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeFit)) __obj.updateDynamic("mergeFit")(mergeFit.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseDrag)) __obj.updateDynamic("mouseDrag")(mouseDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nav)) __obj.updateDynamic("nav")(nav.asInstanceOf[js.Any])
    if (navClass != null) __obj.updateDynamic("navClass")(navClass.asInstanceOf[js.Any])
    if (navContainer != null) __obj.updateDynamic("navContainer")(navContainer.asInstanceOf[js.Any])
    if (navContainerClass != null) __obj.updateDynamic("navContainerClass")(navContainerClass.asInstanceOf[js.Any])
    if (navElement != null) __obj.updateDynamic("navElement")(navElement.asInstanceOf[js.Any])
    if (navSpeed != null) __obj.updateDynamic("navSpeed")(navSpeed.asInstanceOf[js.Any])
    if (navText != null) __obj.updateDynamic("navText")(navText.asInstanceOf[js.Any])
    if (nestedItemSelector != null) __obj.updateDynamic("nestedItemSelector")(nestedItemSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onChanged != null) __obj.updateDynamic("onChanged")(js.Any.fromFunction1(onChanged))
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag.asInstanceOf[js.Any])
    if (onDragged != null) __obj.updateDynamic("onDragged")(js.Any.fromFunction1(onDragged))
    if (onInitialize != null) __obj.updateDynamic("onInitialize")(js.Any.fromFunction1(onInitialize))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onLoadLazy != null) __obj.updateDynamic("onLoadLazy")(js.Any.fromFunction1(onLoadLazy))
    if (onLoadedLazy != null) __obj.updateDynamic("onLoadedLazy")(js.Any.fromFunction1(onLoadedLazy))
    if (onPlayVideo != null) __obj.updateDynamic("onPlayVideo")(js.Any.fromFunction1(onPlayVideo))
    if (onRefresh != null) __obj.updateDynamic("onRefresh")(js.Any.fromFunction1(onRefresh))
    if (onRefreshed != null) __obj.updateDynamic("onRefreshed")(js.Any.fromFunction1(onRefreshed))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onResized != null) __obj.updateDynamic("onResized")(js.Any.fromFunction1(onResized))
    if (onStopVideo != null) __obj.updateDynamic("onStopVideo")(js.Any.fromFunction1(onStopVideo))
    if (onTranslate != null) __obj.updateDynamic("onTranslate")(js.Any.fromFunction1(onTranslate))
    if (onTranslated != null) __obj.updateDynamic("onTranslated")(js.Any.fromFunction1(onTranslated))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (optimum != null) __obj.updateDynamic("optimum")(optimum.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(playsInline)) __obj.updateDynamic("playsInline")(playsInline.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (!js.isUndefined(pullDrag)) __obj.updateDynamic("pullDrag")(pullDrag.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (refreshClass != null) __obj.updateDynamic("refreshClass")(refreshClass.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (responsiveBaseElement != null) __obj.updateDynamic("responsiveBaseElement")(responsiveBaseElement.asInstanceOf[js.Any])
    if (responsiveClass != null) __obj.updateDynamic("responsiveClass")(responsiveClass.asInstanceOf[js.Any])
    if (responsiveRefreshRate != null) __obj.updateDynamic("responsiveRefreshRate")(responsiveRefreshRate.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (!js.isUndefined(rewind)) __obj.updateDynamic("rewind")(rewind.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rtlClass != null) __obj.updateDynamic("rtlClass")(rtlClass.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(scoped)) __obj.updateDynamic("scoped")(scoped.asInstanceOf[js.Any])
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(seamless)) __obj.updateDynamic("seamless")(seamless.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (slideBy != null) __obj.updateDynamic("slideBy")(slideBy.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (smartSpeed != null) __obj.updateDynamic("smartSpeed")(smartSpeed.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcDoc != null) __obj.updateDynamic("srcDoc")(srcDoc.asInstanceOf[js.Any])
    if (srcLang != null) __obj.updateDynamic("srcLang")(srcLang.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    if (stageClass != null) __obj.updateDynamic("stageClass")(stageClass.asInstanceOf[js.Any])
    if (stageElement != null) __obj.updateDynamic("stageElement")(stageElement.asInstanceOf[js.Any])
    if (stageOuterClass != null) __obj.updateDynamic("stageOuterClass")(stageOuterClass.asInstanceOf[js.Any])
    if (stagePadding != null) __obj.updateDynamic("stagePadding")(stagePadding.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (startPosition != null) __obj.updateDynamic("startPosition")(startPosition.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.div.tag.type, typingsSlinky.reactOwlCarousel.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = OwlCarouselProps
}


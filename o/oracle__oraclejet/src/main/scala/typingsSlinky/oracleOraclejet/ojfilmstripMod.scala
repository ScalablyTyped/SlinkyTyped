package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.oracleOraclejet.anon.Id
import typingsSlinky.oracleOraclejet.anon.LabelAccArrowNextPage
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.mod.baseComponentEventMap
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.adjacent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrowPlacement
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrowPlacementChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrowVisibility
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrowVisibilityChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.currentItem
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.currentItemChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hover
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.looping
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loopingChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxItemsPerPage
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxItemsPerPageChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.overlay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.page
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.visible
import typingsSlinky.std.SecurityPolicyViolationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojfilmstripMod {
  
  @js.native
  trait ojFilmStrip extends baseComponent[ojFilmStripSettableProperties] {
    
    def addEventListener(`type`: arrowPlacementChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    def addEventListener(
      `type`: arrowPlacementChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(`type`: arrowVisibilityChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    def addEventListener(
      `type`: arrowVisibilityChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(`type`: loopingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    def addEventListener(
      `type`: loopingChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(`type`: orientationChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    def addEventListener(
      `type`: orientationChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_currentItemChanged(`type`: currentItemChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_currentItemChanged(
      `type`: currentItemChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_maxItemsPerPageChanged(`type`: maxItemsPerPageChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_maxItemsPerPageChanged(
      `type`: maxItemsPerPageChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    
    var arrowPlacement: adjacent | overlay = js.native
    
    var arrowVisibility: visible | hidden | hover | auto = js.native
    
    var currentItem: Id = js.native
    
    def getItemsPerPage(): Double = js.native
    
    @JSName("getProperty")
    def getProperty_arrowPlacement(property: arrowPlacement): adjacent | overlay = js.native
    @JSName("getProperty")
    def getProperty_arrowVisibility(property: arrowVisibility): visible | hidden | hover | auto = js.native
    @JSName("getProperty")
    def getProperty_currentItem(property: currentItem): Id = js.native
    @JSName("getProperty")
    def getProperty_looping(property: looping): off | page = js.native
    @JSName("getProperty")
    def getProperty_maxItemsPerPage(property: maxItemsPerPage): Double = js.native
    @JSName("getProperty")
    def getProperty_orientation(property: orientation): horizontal | vertical = js.native
    
    var looping: off | page = js.native
    
    var maxItemsPerPage: Double = js.native
    
    var onArrowPlacementChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onArrowVisibilityChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onCurrentItemChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onLoopingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onMaxItemsPerPageChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOrientationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var orientation: horizontal | vertical = js.native
    
    def setProperties(properties: ojFilmStripSettablePropertiesLenient): Unit = js.native
    
    def setProperty(property: arrowPlacement, value: adjacent): Unit = js.native
    def setProperty(property: arrowPlacement, value: overlay): Unit = js.native
    def setProperty(property: arrowVisibility, value: auto): Unit = js.native
    def setProperty(property: arrowVisibility, value: hidden): Unit = js.native
    def setProperty(property: arrowVisibility, value: hover): Unit = js.native
    def setProperty(property: arrowVisibility, value: visible): Unit = js.native
    def setProperty(property: looping, value: off): Unit = js.native
    def setProperty(property: looping, value: page): Unit = js.native
    def setProperty(property: orientation, value: horizontal): Unit = js.native
    def setProperty(property: orientation, value: vertical): Unit = js.native
    @JSName("setProperty")
    def setProperty_currentItem(property: currentItem, value: Id): Unit = js.native
    @JSName("setProperty")
    def setProperty_maxItemsPerPage(property: maxItemsPerPage, value: Double): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: LabelAccArrowNextPage): Unit = js.native
    
    @JSName("translations")
    var translations_ojFilmStrip: LabelAccArrowNextPage = js.native
  }
  
  @js.native
  trait ojFilmStripEventMap extends baseComponentEventMap[ojFilmStripSettableProperties] {
    
    var arrowPlacementChanged: CustomEvent = js.native
    
    var arrowVisibilityChanged: CustomEvent = js.native
    
    var currentItemChanged: CustomEvent = js.native
    
    var loopingChanged: CustomEvent = js.native
    
    var maxItemsPerPageChanged: CustomEvent = js.native
    
    var orientationChanged: CustomEvent = js.native
  }
  object ojFilmStripEventMap {
    
    @scala.inline
    def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      arrowPlacementChanged: CustomEvent,
      arrowVisibilityChanged: CustomEvent,
      auxclick: MouseEvent,
      blur: FocusEvent,
      cancel: Event,
      canplay: Event,
      canplaythrough: Event,
      change: Event,
      click: MouseEvent,
      close: Event,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: Event,
      currentItemChanged: CustomEvent,
      cut: ClipboardEvent,
      dblclick: MouseEvent,
      drag: DragEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
      dragexit: Event,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: Event,
      emptied: Event,
      ended: Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      fullscreenchange: Event,
      fullscreenerror: Event,
      gotpointercapture: PointerEvent,
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      loopingChanged: CustomEvent,
      lostpointercapture: PointerEvent,
      maxItemsPerPageChanged: CustomEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      orientationChanged: CustomEvent,
      paste: ClipboardEvent,
      pause: Event,
      play: Event,
      playing: Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      progress: ProgressEvent,
      ratechange: Event,
      reset: Event,
      resize: UIEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      stalled: Event,
      submit: Event,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      translationsChanged: CustomEvent,
      volumechange: Event,
      waiting: Event,
      wheel: WheelEvent
    ): ojFilmStripEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], arrowPlacementChanged = arrowPlacementChanged.asInstanceOf[js.Any], arrowVisibilityChanged = arrowVisibilityChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], currentItemChanged = currentItemChanged.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], loopingChanged = loopingChanged.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maxItemsPerPageChanged = maxItemsPerPageChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], orientationChanged = orientationChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojFilmStripEventMap]
    }
    
    @scala.inline
    implicit class ojFilmStripEventMapMutableBuilder[Self <: ojFilmStripEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowPlacementChanged(value: CustomEvent): Self = StObject.set(x, "arrowPlacementChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowVisibilityChanged(value: CustomEvent): Self = StObject.set(x, "arrowVisibilityChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentItemChanged(value: CustomEvent): Self = StObject.set(x, "currentItemChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopingChanged(value: CustomEvent): Self = StObject.set(x, "loopingChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxItemsPerPageChanged(value: CustomEvent): Self = StObject.set(x, "maxItemsPerPageChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationChanged(value: CustomEvent): Self = StObject.set(x, "orientationChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ojFilmStripSettableProperties extends baseComponentSettableProperties {
    
    var arrowPlacement: adjacent | overlay = js.native
    
    var arrowVisibility: visible | hidden | hover | auto = js.native
    
    var currentItem: Id = js.native
    
    var looping: off | page = js.native
    
    var maxItemsPerPage: Double = js.native
    
    var orientation: horizontal | vertical = js.native
    
    @JSName("translations")
    var translations_ojFilmStripSettableProperties: LabelAccArrowNextPage = js.native
  }
  object ojFilmStripSettableProperties {
    
    @scala.inline
    def apply(
      arrowPlacement: adjacent | overlay,
      arrowVisibility: visible | hidden | hover | auto,
      currentItem: Id,
      looping: off | page,
      maxItemsPerPage: Double,
      orientation: horizontal | vertical,
      translations: LabelAccArrowNextPage
    ): ojFilmStripSettableProperties = {
      val __obj = js.Dynamic.literal(arrowPlacement = arrowPlacement.asInstanceOf[js.Any], arrowVisibility = arrowVisibility.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], maxItemsPerPage = maxItemsPerPage.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojFilmStripSettableProperties]
    }
    
    @scala.inline
    implicit class ojFilmStripSettablePropertiesMutableBuilder[Self <: ojFilmStripSettableProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowPlacement(value: adjacent | overlay): Self = StObject.set(x, "arrowPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowVisibility(value: visible | hidden | hover | auto): Self = StObject.set(x, "arrowVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentItem(value: Id): Self = StObject.set(x, "currentItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLooping(value: off | page): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxItemsPerPage(value: Double): Self = StObject.set(x, "maxItemsPerPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslations(value: LabelAccArrowNextPage): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojfilmstrip.ojFilmStripSettableProperties> */
  @js.native
  trait ojFilmStripSettablePropertiesLenient
    extends /* key */ StringDictionary[js.Any] {
    
    var arrowPlacement: js.UndefOr[adjacent | overlay] = js.native
    
    var arrowVisibility: js.UndefOr[visible | hidden | hover | auto] = js.native
    
    var currentItem: js.UndefOr[Id] = js.native
    
    var looping: js.UndefOr[off | page] = js.native
    
    var maxItemsPerPage: js.UndefOr[Double] = js.native
    
    var orientation: js.UndefOr[horizontal | vertical] = js.native
    
    var translations: js.UndefOr[LabelAccArrowNextPage] = js.native
  }
  object ojFilmStripSettablePropertiesLenient {
    
    @scala.inline
    def apply(): ojFilmStripSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojFilmStripSettablePropertiesLenient]
    }
    
    @scala.inline
    implicit class ojFilmStripSettablePropertiesLenientMutableBuilder[Self <: ojFilmStripSettablePropertiesLenient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowPlacement(value: adjacent | overlay): Self = StObject.set(x, "arrowPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowPlacementUndefined: Self = StObject.set(x, "arrowPlacement", js.undefined)
      
      @scala.inline
      def setArrowVisibility(value: visible | hidden | hover | auto): Self = StObject.set(x, "arrowVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowVisibilityUndefined: Self = StObject.set(x, "arrowVisibility", js.undefined)
      
      @scala.inline
      def setCurrentItem(value: Id): Self = StObject.set(x, "currentItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentItemUndefined: Self = StObject.set(x, "currentItem", js.undefined)
      
      @scala.inline
      def setLooping(value: off | page): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopingUndefined: Self = StObject.set(x, "looping", js.undefined)
      
      @scala.inline
      def setMaxItemsPerPage(value: Double): Self = StObject.set(x, "maxItemsPerPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxItemsPerPageUndefined: Self = StObject.set(x, "maxItemsPerPage", js.undefined)
      
      @scala.inline
      def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setTranslations(value: LabelAccArrowNextPage): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}

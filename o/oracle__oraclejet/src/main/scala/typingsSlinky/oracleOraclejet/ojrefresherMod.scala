package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
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
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.mod.baseComponentEventMap
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.refreshContentChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.target
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.targetChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.text
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.textChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.threshold
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thresholdChanged
import typingsSlinky.std.SecurityPolicyViolationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojrefresherMod {
  
  @js.native
  trait ojRefresher extends baseComponent[ojRefresherSettableProperties] {
    
    @JSName("addEventListener")
    def addEventListener_refreshContentChanged(`type`: refreshContentChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_refreshContentChanged(
      `type`: refreshContentChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_targetChanged(`type`: targetChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_targetChanged(
      `type`: targetChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_textChanged(`type`: textChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_textChanged(
      `type`: textChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_thresholdChanged(`type`: thresholdChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_thresholdChanged(
      `type`: thresholdChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    
    @JSName("getProperty")
    def getProperty_target(property: target): Element = js.native
    @JSName("getProperty")
    def getProperty_text(property: text): String = js.native
    @JSName("getProperty")
    def getProperty_threshold(property: threshold): Double = js.native
    
    var onRefreshContentChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onTargetChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onTextChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onThresholdChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    def refreshContent(): js.Promise[_] = js.native
    
    def setProperties(properties: ojRefresherSettablePropertiesLenient): Unit = js.native
    
    @JSName("setProperty")
    def setProperty_target(property: target, value: Element): Unit = js.native
    @JSName("setProperty")
    def setProperty_text(property: text, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_threshold(property: threshold, value: Double): Unit = js.native
    
    var target: Element = js.native
    
    var text: String = js.native
    
    var threshold: Double = js.native
  }
  
  @js.native
  trait ojRefresherEventMap extends baseComponentEventMap[ojRefresherSettableProperties] {
    
    var refreshContentChanged: CustomEvent = js.native
    
    var targetChanged: CustomEvent = js.native
    
    var textChanged: CustomEvent = js.native
    
    var thresholdChanged: CustomEvent = js.native
  }
  object ojRefresherEventMap {
    
    @scala.inline
    def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
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
      lostpointercapture: PointerEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
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
      refreshContentChanged: CustomEvent,
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
      targetChanged: CustomEvent,
      textChanged: CustomEvent,
      thresholdChanged: CustomEvent,
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
    ): ojRefresherEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], refreshContentChanged = refreshContentChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], targetChanged = targetChanged.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], thresholdChanged = thresholdChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojRefresherEventMap]
    }
    
    @scala.inline
    implicit class ojRefresherEventMapMutableBuilder[Self <: ojRefresherEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefreshContentChanged(value: CustomEvent): Self = StObject.set(x, "refreshContentChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetChanged(value: CustomEvent): Self = StObject.set(x, "targetChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextChanged(value: CustomEvent): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdChanged(value: CustomEvent): Self = StObject.set(x, "thresholdChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ojRefresherSettableProperties extends baseComponentSettableProperties {
    
    def refreshContent(): js.Promise[_] = js.native
    
    var target: Element = js.native
    
    var text: String = js.native
    
    var threshold: Double = js.native
  }
  object ojRefresherSettableProperties {
    
    @scala.inline
    def apply(refreshContent: () => js.Promise[_], target: Element, text: String, threshold: Double): ojRefresherSettableProperties = {
      val __obj = js.Dynamic.literal(refreshContent = js.Any.fromFunction0(refreshContent), target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojRefresherSettableProperties]
    }
    
    @scala.inline
    implicit class ojRefresherSettablePropertiesMutableBuilder[Self <: ojRefresherSettableProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefreshContent(value: () => js.Promise[_]): Self = StObject.set(x, "refreshContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojrefresher.ojRefresherSettableProperties> */
  @js.native
  trait ojRefresherSettablePropertiesLenient
    extends /* key */ StringDictionary[js.Any] {
    
    var refreshContent: js.UndefOr[js.Function0[js.Promise[_]]] = js.native
    
    var target: js.UndefOr[Element] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
    
    var translations: js.UndefOr[js.Object | Null] = js.native
  }
  object ojRefresherSettablePropertiesLenient {
    
    @scala.inline
    def apply(): ojRefresherSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojRefresherSettablePropertiesLenient]
    }
    
    @scala.inline
    implicit class ojRefresherSettablePropertiesLenientMutableBuilder[Self <: ojRefresherSettablePropertiesLenient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefreshContent(value: () => js.Promise[_]): Self = StObject.set(x, "refreshContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRefreshContentUndefined: Self = StObject.set(x, "refreshContent", js.undefined)
      
      @scala.inline
      def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      @scala.inline
      def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsNull: Self = StObject.set(x, "translations", null)
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}

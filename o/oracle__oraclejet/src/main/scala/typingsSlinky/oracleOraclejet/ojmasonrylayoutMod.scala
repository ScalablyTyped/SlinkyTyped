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
import typingsSlinky.oracleOraclejet.anon.LabelCut
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.mod.baseComponentEventMap
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeInsert
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeRemove
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeReorder
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeResize
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojInsert
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojRemove
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojReorder
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojResize
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.reorderHandle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.reorderHandleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.std.SecurityPolicyViolationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojmasonrylayoutMod {
  
  @js.native
  trait ojMasonryLayout extends baseComponent[ojMasonryLayoutSettableProperties] {
    
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(`type`: ojAnimateEnd, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(
      `type`: ojAnimateEnd,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(`type`: ojAnimateStart, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(
      `type`: ojAnimateStart,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeInsert(`type`: ojBeforeInsert, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeInsert(
      `type`: ojBeforeInsert,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeRemove(`type`: ojBeforeRemove, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeRemove(
      `type`: ojBeforeRemove,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeReorder(`type`: ojBeforeReorder, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeReorder(
      `type`: ojBeforeReorder,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeResize(`type`: ojBeforeResize, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeResize(
      `type`: ojBeforeResize,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojInsert(`type`: ojInsert, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojInsert(
      `type`: ojInsert,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojRemove(`type`: ojRemove, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojRemove(
      `type`: ojRemove,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojReorder(`type`: ojReorder, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojReorder(
      `type`: ojReorder,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResize(`type`: ojResize, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResize(
      `type`: ojResize,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reorderHandleChanged(`type`: reorderHandleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reorderHandleChanged(
      `type`: reorderHandleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    
    @JSName("getProperty")
    def getProperty_reorderHandle(property: reorderHandle): String | Null = js.native
    
    def insertTile(selector: String, index: Double): Unit = js.native
    
    var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOjBeforeInsert: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOjBeforeRemove: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOjBeforeReorder: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOjBeforeResize: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOjInsert: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOjRemove: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOjReorder: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOjResize: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onReorderHandleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    def removeTile(selector: String): Unit = js.native
    
    var reorderHandle: String | Null = js.native
    
    def resizeTile(selector: String, sizeStyleClass: String): Unit = js.native
    
    def setProperties(properties: ojMasonryLayoutSettablePropertiesLenient): Unit = js.native
    
    @JSName("setProperty")
    def setProperty_reorderHandle(property: reorderHandle): Unit = js.native
    @JSName("setProperty")
    def setProperty_reorderHandle(property: reorderHandle, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: LabelCut): Unit = js.native
    
    @JSName("translations")
    var translations_ojMasonryLayout: LabelCut = js.native
  }
  object ojMasonryLayout {
    
    type ojAnimateEnd = CustomEvent
    
    type ojAnimateStart = CustomEvent
    
    type ojBeforeInsert = CustomEvent
    
    type ojBeforeRemove = CustomEvent
    
    type ojBeforeReorder = CustomEvent
    
    type ojBeforeResize = CustomEvent
    
    type ojInsert = CustomEvent
    
    type ojRemove = CustomEvent
    
    type ojReorder = CustomEvent
    
    type ojResize = CustomEvent
  }
  
  @js.native
  trait ojMasonryLayoutEventMap extends baseComponentEventMap[ojMasonryLayoutSettableProperties] {
    
    var ojAnimateEnd: CustomEvent = js.native
    
    var ojAnimateStart: CustomEvent = js.native
    
    var ojBeforeInsert: CustomEvent = js.native
    
    var ojBeforeRemove: CustomEvent = js.native
    
    var ojBeforeReorder: CustomEvent = js.native
    
    var ojBeforeResize: CustomEvent = js.native
    
    var ojInsert: CustomEvent = js.native
    
    var ojRemove: CustomEvent = js.native
    
    var ojReorder: CustomEvent = js.native
    
    var ojResize: CustomEvent = js.native
    
    var reorderHandleChanged: CustomEvent = js.native
  }
  object ojMasonryLayoutEventMap {
    
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
      ojAnimateEnd: CustomEvent,
      ojAnimateStart: CustomEvent,
      ojBeforeInsert: CustomEvent,
      ojBeforeRemove: CustomEvent,
      ojBeforeReorder: CustomEvent,
      ojBeforeResize: CustomEvent,
      ojInsert: CustomEvent,
      ojRemove: CustomEvent,
      ojReorder: CustomEvent,
      ojResize: CustomEvent,
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
      reorderHandleChanged: CustomEvent,
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
    ): ojMasonryLayoutEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeInsert = ojBeforeInsert.asInstanceOf[js.Any], ojBeforeRemove = ojBeforeRemove.asInstanceOf[js.Any], ojBeforeReorder = ojBeforeReorder.asInstanceOf[js.Any], ojBeforeResize = ojBeforeResize.asInstanceOf[js.Any], ojInsert = ojInsert.asInstanceOf[js.Any], ojRemove = ojRemove.asInstanceOf[js.Any], ojReorder = ojReorder.asInstanceOf[js.Any], ojResize = ojResize.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reorderHandleChanged = reorderHandleChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojMasonryLayoutEventMap]
    }
    
    @scala.inline
    implicit class ojMasonryLayoutEventMapMutableBuilder[Self <: ojMasonryLayoutEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOjAnimateEnd(value: CustomEvent): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateStart(value: CustomEvent): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeInsert(value: CustomEvent): Self = StObject.set(x, "ojBeforeInsert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeRemove(value: CustomEvent): Self = StObject.set(x, "ojBeforeRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeReorder(value: CustomEvent): Self = StObject.set(x, "ojBeforeReorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeResize(value: CustomEvent): Self = StObject.set(x, "ojBeforeResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjInsert(value: CustomEvent): Self = StObject.set(x, "ojInsert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjRemove(value: CustomEvent): Self = StObject.set(x, "ojRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjReorder(value: CustomEvent): Self = StObject.set(x, "ojReorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjResize(value: CustomEvent): Self = StObject.set(x, "ojResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReorderHandleChanged(value: CustomEvent): Self = StObject.set(x, "reorderHandleChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ojMasonryLayoutSettableProperties extends baseComponentSettableProperties {
    
    var reorderHandle: String | Null = js.native
    
    @JSName("translations")
    var translations_ojMasonryLayoutSettableProperties: LabelCut = js.native
  }
  object ojMasonryLayoutSettableProperties {
    
    @scala.inline
    def apply(translations: LabelCut): ojMasonryLayoutSettableProperties = {
      val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojMasonryLayoutSettableProperties]
    }
    
    @scala.inline
    implicit class ojMasonryLayoutSettablePropertiesMutableBuilder[Self <: ojMasonryLayoutSettableProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReorderHandle(value: String): Self = StObject.set(x, "reorderHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReorderHandleNull: Self = StObject.set(x, "reorderHandle", null)
      
      @scala.inline
      def setTranslations(value: LabelCut): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmasonrylayout.ojMasonryLayoutSettableProperties> */
  @js.native
  trait ojMasonryLayoutSettablePropertiesLenient
    extends /* key */ StringDictionary[js.Any] {
    
    var reorderHandle: js.UndefOr[String | Null] = js.native
    
    var translations: js.UndefOr[LabelCut] = js.native
  }
  object ojMasonryLayoutSettablePropertiesLenient {
    
    @scala.inline
    def apply(): ojMasonryLayoutSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojMasonryLayoutSettablePropertiesLenient]
    }
    
    @scala.inline
    implicit class ojMasonryLayoutSettablePropertiesLenientMutableBuilder[Self <: ojMasonryLayoutSettablePropertiesLenient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReorderHandle(value: String): Self = StObject.set(x, "reorderHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReorderHandleNull: Self = StObject.set(x, "reorderHandle", null)
      
      @scala.inline
      def setReorderHandleUndefined: Self = StObject.set(x, "reorderHandle", js.undefined)
      
      @scala.inline
      def setTranslations(value: LabelCut): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}

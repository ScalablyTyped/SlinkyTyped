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
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.mod.baseComponentEventMap
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.expanded
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multipleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeCollapse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeExpand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojCollapse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojExpand
import typingsSlinky.std.SecurityPolicyViolationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojaccordionMod {
  
  @js.native
  trait ojAccordion extends baseComponent[ojAccordionSettableProperties] {
    
    @JSName("addEventListener")
    def addEventListener_expandedChanged(`type`: expandedChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_expandedChanged(
      `type`: expandedChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_multipleChanged(`type`: multipleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_multipleChanged(
      `type`: multipleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeCollapse(`type`: ojBeforeCollapse, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeCollapse(
      `type`: ojBeforeCollapse,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeExpand(`type`: ojBeforeExpand, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeExpand(
      `type`: ojBeforeExpand,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojCollapse(`type`: ojCollapse, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojCollapse(
      `type`: ojCollapse,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojExpand(`type`: ojExpand, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojExpand(
      `type`: ojExpand,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    
    var expanded: js.Array[Id] | Null = js.native
    
    @JSName("getProperty")
    def getProperty_expanded(property: expanded): js.Array[Id] | Null = js.native
    @JSName("getProperty")
    def getProperty_multiple(property: multiple): Boolean = js.native
    
    var multiple: Boolean = js.native
    
    var onExpandedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onMultipleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOjBeforeCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOjBeforeExpand: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOjCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOjExpand: (js.Function1[CustomEvent, _]) | Null = js.native
    
    def setProperties(properties: ojAccordionSettablePropertiesLenient): Unit = js.native
    
    @JSName("setProperty")
    def setProperty_expanded(property: expanded): Unit = js.native
    @JSName("setProperty")
    def setProperty_expanded(property: expanded, value: js.Array[Double | Id | String]): Unit = js.native
    @JSName("setProperty")
    def setProperty_multiple(property: multiple, value: Boolean): Unit = js.native
  }
  object ojAccordion {
    
    type ojBeforeCollapse = CustomEvent
    
    type ojBeforeExpand = CustomEvent
    
    type ojCollapse = CustomEvent
    
    type ojExpand = CustomEvent
  }
  
  @js.native
  trait ojAccordionEventMap extends baseComponentEventMap[ojAccordionSettableProperties] {
    
    var expandedChanged: CustomEvent = js.native
    
    var multipleChanged: CustomEvent = js.native
    
    var ojBeforeCollapse: CustomEvent = js.native
    
    var ojBeforeExpand: CustomEvent = js.native
    
    var ojCollapse: CustomEvent = js.native
    
    var ojExpand: CustomEvent = js.native
  }
  object ojAccordionEventMap {
    
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
      expandedChanged: CustomEvent,
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
      multipleChanged: CustomEvent,
      ojBeforeCollapse: CustomEvent,
      ojBeforeExpand: CustomEvent,
      ojCollapse: CustomEvent,
      ojExpand: CustomEvent,
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
    ): ojAccordionEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], multipleChanged = multipleChanged.asInstanceOf[js.Any], ojBeforeCollapse = ojBeforeCollapse.asInstanceOf[js.Any], ojBeforeExpand = ojBeforeExpand.asInstanceOf[js.Any], ojCollapse = ojCollapse.asInstanceOf[js.Any], ojExpand = ojExpand.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojAccordionEventMap]
    }
    
    @scala.inline
    implicit class ojAccordionEventMapMutableBuilder[Self <: ojAccordionEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandedChanged(value: CustomEvent): Self = StObject.set(x, "expandedChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleChanged(value: CustomEvent): Self = StObject.set(x, "multipleChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeCollapse(value: CustomEvent): Self = StObject.set(x, "ojBeforeCollapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeExpand(value: CustomEvent): Self = StObject.set(x, "ojBeforeExpand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjCollapse(value: CustomEvent): Self = StObject.set(x, "ojCollapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjExpand(value: CustomEvent): Self = StObject.set(x, "ojExpand", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ojAccordionSettableProperties extends baseComponentSettableProperties {
    
    var expanded: (js.Array[Double | Id | String]) | Null = js.native
    
    var multiple: Boolean = js.native
  }
  object ojAccordionSettableProperties {
    
    @scala.inline
    def apply(multiple: Boolean): ojAccordionSettableProperties = {
      val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojAccordionSettableProperties]
    }
    
    @scala.inline
    implicit class ojAccordionSettablePropertiesMutableBuilder[Self <: ojAccordionSettableProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpanded(value: js.Array[Double | Id | String]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedNull: Self = StObject.set(x, "expanded", null)
      
      @scala.inline
      def setExpandedVarargs(value: (Double | Id | String)*): Self = StObject.set(x, "expanded", js.Array(value :_*))
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojaccordion.ojAccordionSettableProperties> */
  @js.native
  trait ojAccordionSettablePropertiesLenient
    extends /* key */ StringDictionary[js.Any] {
    
    var expanded: js.UndefOr[(js.Array[Double | Id | String]) | Null] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var translations: js.UndefOr[js.Object | Null] = js.native
  }
  object ojAccordionSettablePropertiesLenient {
    
    @scala.inline
    def apply(): ojAccordionSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojAccordionSettablePropertiesLenient]
    }
    
    @scala.inline
    implicit class ojAccordionSettablePropertiesLenientMutableBuilder[Self <: ojAccordionSettablePropertiesLenient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpanded(value: js.Array[Double | Id | String]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedNull: Self = StObject.set(x, "expanded", null)
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setExpandedVarargs(value: (Double | Id | String)*): Self = StObject.set(x, "expanded", js.Array(value :_*))
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsNull: Self = StObject.set(x, "translations", null)
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}

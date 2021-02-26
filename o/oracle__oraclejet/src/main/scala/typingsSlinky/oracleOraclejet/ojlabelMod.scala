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
import typingsSlinky.oracleOraclejet.anon.DefinitionSource
import typingsSlinky.oracleOraclejet.anon.TooltipHelp
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.mod.baseComponentEventMap
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`for`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.forChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.help
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.helpChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelId
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelIdChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.showRequired
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.showRequiredChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.std.SecurityPolicyViolationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojlabelMod {
  
  @js.native
  trait ojLabel extends baseComponent[ojLabelSettableProperties] {
    
    @JSName("addEventListener")
    def addEventListener_forChanged(`type`: forChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_forChanged(
      `type`: forChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_helpChanged(`type`: helpChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_helpChanged(
      `type`: helpChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_labelIdChanged(`type`: labelIdChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_labelIdChanged(
      `type`: labelIdChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_showRequiredChanged(`type`: showRequiredChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_showRequiredChanged(
      `type`: showRequiredChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    
    var `for`: String | Null = js.native
    
    @JSName("getProperty")
    def getProperty_for(property: `for`): String | Null = js.native
    @JSName("getProperty")
    def getProperty_help(property: help): DefinitionSource = js.native
    @JSName("getProperty")
    def getProperty_labelId(property: labelId): String | Null = js.native
    @JSName("getProperty")
    def getProperty_showRequired(property: showRequired): Boolean | Null = js.native
    
    var help: DefinitionSource = js.native
    
    var labelId: String | Null = js.native
    
    var onForChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onHelpChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onLabelIdChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onShowRequiredChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    def setProperties(properties: ojLabelSettablePropertiesLenient): Unit = js.native
    
    @JSName("setProperty")
    def setProperty_for(property: `for`): Unit = js.native
    @JSName("setProperty")
    def setProperty_for(property: `for`, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_help(property: help, value: DefinitionSource): Unit = js.native
    @JSName("setProperty")
    def setProperty_labelId(property: labelId): Unit = js.native
    @JSName("setProperty")
    def setProperty_labelId(property: labelId, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_showRequired(property: showRequired): Unit = js.native
    @JSName("setProperty")
    def setProperty_showRequired(property: showRequired, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: TooltipHelp): Unit = js.native
    
    var showRequired: Boolean | Null = js.native
    
    @JSName("translations")
    var translations_ojLabel: TooltipHelp = js.native
  }
  
  @js.native
  trait ojLabelEventMap extends baseComponentEventMap[ojLabelSettableProperties] {
    
    var forChanged: CustomEvent = js.native
    
    var helpChanged: CustomEvent = js.native
    
    var labelIdChanged: CustomEvent = js.native
    
    var showRequiredChanged: CustomEvent = js.native
  }
  object ojLabelEventMap {
    
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
      forChanged: CustomEvent,
      fullscreenchange: Event,
      fullscreenerror: Event,
      gotpointercapture: PointerEvent,
      helpChanged: CustomEvent,
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      labelIdChanged: CustomEvent,
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
      reset: Event,
      resize: UIEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      showRequiredChanged: CustomEvent,
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
    ): ojLabelEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], forChanged = forChanged.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], helpChanged = helpChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelIdChanged = labelIdChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], showRequiredChanged = showRequiredChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojLabelEventMap]
    }
    
    @scala.inline
    implicit class ojLabelEventMapMutableBuilder[Self <: ojLabelEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForChanged(value: CustomEvent): Self = StObject.set(x, "forChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpChanged(value: CustomEvent): Self = StObject.set(x, "helpChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelIdChanged(value: CustomEvent): Self = StObject.set(x, "labelIdChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRequiredChanged(value: CustomEvent): Self = StObject.set(x, "showRequiredChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ojLabelSettableProperties extends baseComponentSettableProperties {
    
    var `for`: String | Null = js.native
    
    var help: DefinitionSource = js.native
    
    var labelId: String | Null = js.native
    
    var showRequired: Boolean | Null = js.native
    
    @JSName("translations")
    var translations_ojLabelSettableProperties: TooltipHelp = js.native
  }
  object ojLabelSettableProperties {
    
    @scala.inline
    def apply(help: DefinitionSource, translations: TooltipHelp): ojLabelSettableProperties = {
      val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojLabelSettableProperties]
    }
    
    @scala.inline
    implicit class ojLabelSettablePropertiesMutableBuilder[Self <: ojLabelSettableProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForNull: Self = StObject.set(x, "for", null)
      
      @scala.inline
      def setHelp(value: DefinitionSource): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelIdNull: Self = StObject.set(x, "labelId", null)
      
      @scala.inline
      def setShowRequired(value: Boolean): Self = StObject.set(x, "showRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRequiredNull: Self = StObject.set(x, "showRequired", null)
      
      @scala.inline
      def setTranslations(value: TooltipHelp): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlabel.ojLabelSettableProperties> */
  @js.native
  trait ojLabelSettablePropertiesLenient
    extends /* key */ StringDictionary[js.Any] {
    
    var `for`: js.UndefOr[String | Null] = js.native
    
    var help: js.UndefOr[DefinitionSource] = js.native
    
    var labelId: js.UndefOr[String | Null] = js.native
    
    var showRequired: js.UndefOr[Boolean | Null] = js.native
    
    var translations: js.UndefOr[TooltipHelp] = js.native
  }
  object ojLabelSettablePropertiesLenient {
    
    @scala.inline
    def apply(): ojLabelSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojLabelSettablePropertiesLenient]
    }
    
    @scala.inline
    implicit class ojLabelSettablePropertiesLenientMutableBuilder[Self <: ojLabelSettablePropertiesLenient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForNull: Self = StObject.set(x, "for", null)
      
      @scala.inline
      def setForUndefined: Self = StObject.set(x, "for", js.undefined)
      
      @scala.inline
      def setHelp(value: DefinitionSource): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelIdNull: Self = StObject.set(x, "labelId", null)
      
      @scala.inline
      def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
      
      @scala.inline
      def setShowRequired(value: Boolean): Self = StObject.set(x, "showRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRequiredNull: Self = StObject.set(x, "showRequired", null)
      
      @scala.inline
      def setShowRequiredUndefined: Self = StObject.set(x, "showRequired", js.undefined)
      
      @scala.inline
      def setTranslations(value: TooltipHelp): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}

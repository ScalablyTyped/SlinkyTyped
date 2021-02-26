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
import typingsSlinky.oracleOraclejet.anon.LabelAndValue
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.days
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.endChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hours
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minutes
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.months
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.quarters
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scale
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scaleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.seconds
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.weeks
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.years
import typingsSlinky.std.SecurityPolicyViolationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojtimeaxisMod {
  
  @js.native
  trait ojTimeAxis extends dvtBaseComponent[ojTimeAxisSettableProperties] {
    
    def addEventListener(`type`: scaleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    def addEventListener(
      `type`: scaleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_converterChanged(`type`: converterChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_converterChanged(
      `type`: converterChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_endChanged(`type`: endChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_endChanged(
      `type`: endChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_startChanged(`type`: startChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_startChanged(
      `type`: startChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    
    var converter: Converters | Converter[String] = js.native
    
    var end: String = js.native
    
    @JSName("getProperty")
    def getProperty_converter(property: converter): Converters | Converter[String] = js.native
    @JSName("getProperty")
    def getProperty_end(property: end): String = js.native
    @JSName("getProperty")
    def getProperty_scale(property: scale): seconds | minutes | hours | days | weeks | months | quarters | years = js.native
    @JSName("getProperty")
    def getProperty_start(property: start): String = js.native
    
    var onConverterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onEndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onScaleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onStartChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var scale: seconds | minutes | hours | days | weeks | months | quarters | years = js.native
    
    def setProperties(properties: ojTimeAxisSettablePropertiesLenient): Unit = js.native
    
    def setProperty(property: scale, value: days): Unit = js.native
    def setProperty(property: scale, value: hours): Unit = js.native
    def setProperty(property: scale, value: minutes): Unit = js.native
    def setProperty(property: scale, value: months): Unit = js.native
    def setProperty(property: scale, value: quarters): Unit = js.native
    def setProperty(property: scale, value: seconds): Unit = js.native
    def setProperty(property: scale, value: weeks): Unit = js.native
    def setProperty(property: scale, value: years): Unit = js.native
    @JSName("setProperty")
    def setProperty_converter(property: converter, value: Converters): Unit = js.native
    @JSName("setProperty")
    def setProperty_converter(property: converter, value: Converter[String]): Unit = js.native
    @JSName("setProperty")
    def setProperty_end(property: end, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_start(property: start, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: LabelAndValue): Unit = js.native
    
    var start: String = js.native
    
    @JSName("translations")
    var translations_ojTimeAxis: LabelAndValue = js.native
  }
  object ojTimeAxis {
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait Converters extends StObject {
      
      var default: js.UndefOr[Converter[String]] = js.native
      
      var days: js.UndefOr[Converter[String]] = js.native
      
      var hours: js.UndefOr[Converter[String]] = js.native
      
      var minutes: js.UndefOr[Converter[String]] = js.native
      
      var months: js.UndefOr[Converter[String]] = js.native
      
      var quarters: js.UndefOr[Converter[String]] = js.native
      
      var seconds: js.UndefOr[Converter[String]] = js.native
      
      var weeks: js.UndefOr[Converter[String]] = js.native
      
      var years: js.UndefOr[Converter[String]] = js.native
    }
    object Converters {
      
      @scala.inline
      def apply(): Converters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Converters]
      }
      
      @scala.inline
      implicit class ConvertersMutableBuilder[Self <: Converters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDays(value: Converter[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
        
        @scala.inline
        def setDefault(value: Converter[String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setHours(value: Converter[String]): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
        
        @scala.inline
        def setMinutes(value: Converter[String]): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
        
        @scala.inline
        def setMonths(value: Converter[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
        
        @scala.inline
        def setQuarters(value: Converter[String]): Self = StObject.set(x, "quarters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuartersUndefined: Self = StObject.set(x, "quarters", js.undefined)
        
        @scala.inline
        def setSeconds(value: Converter[String]): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
        
        @scala.inline
        def setWeeks(value: Converter[String]): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWeeksUndefined: Self = StObject.set(x, "weeks", js.undefined)
        
        @scala.inline
        def setYears(value: Converter[String]): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
      }
    }
  }
  
  @js.native
  trait ojTimeAxisEventMap extends dvtBaseComponentEventMap[ojTimeAxisSettableProperties] {
    
    var converterChanged: CustomEvent = js.native
    
    var endChanged: CustomEvent = js.native
    
    var scaleChanged: CustomEvent = js.native
    
    var startChanged: CustomEvent = js.native
  }
  object ojTimeAxisEventMap {
    
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
      converterChanged: CustomEvent,
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
      endChanged: CustomEvent,
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
      reset: Event,
      resize: UIEvent,
      scaleChanged: CustomEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      stalled: Event,
      startChanged: CustomEvent,
      submit: Event,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      trackResizeChanged: CustomEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      translationsChanged: CustomEvent,
      volumechange: Event,
      waiting: Event,
      wheel: WheelEvent
    ): ojTimeAxisEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], converterChanged = converterChanged.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], endChanged = endChanged.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scaleChanged = scaleChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], startChanged = startChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojTimeAxisEventMap]
    }
    
    @scala.inline
    implicit class ojTimeAxisEventMapMutableBuilder[Self <: ojTimeAxisEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConverterChanged(value: CustomEvent): Self = StObject.set(x, "converterChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndChanged(value: CustomEvent): Self = StObject.set(x, "endChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleChanged(value: CustomEvent): Self = StObject.set(x, "scaleChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartChanged(value: CustomEvent): Self = StObject.set(x, "startChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ojTimeAxisSettableProperties extends dvtBaseComponentSettableProperties {
    
    var converter: Converters | Converter[String] = js.native
    
    var end: String = js.native
    
    var scale: seconds | minutes | hours | days | weeks | months | quarters | years = js.native
    
    var start: String = js.native
    
    @JSName("translations")
    var translations_ojTimeAxisSettableProperties: LabelAndValue = js.native
  }
  object ojTimeAxisSettableProperties {
    
    @scala.inline
    def apply(
      converter: Converters | Converter[String],
      end: String,
      scale: seconds | minutes | hours | days | weeks | months | quarters | years,
      start: String,
      trackResize: on | off,
      translations: LabelAndValue
    ): ojTimeAxisSettableProperties = {
      val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojTimeAxisSettableProperties]
    }
    
    @scala.inline
    implicit class ojTimeAxisSettablePropertiesMutableBuilder[Self <: ojTimeAxisSettableProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConverter(value: Converters | Converter[String]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale(value: seconds | minutes | hours | days | weeks | months | quarters | years): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtimeaxis.ojTimeAxisSettableProperties> */
  @js.native
  trait ojTimeAxisSettablePropertiesLenient
    extends /* key */ StringDictionary[js.Any] {
    
    var converter: js.UndefOr[Converters | Converter[String]] = js.native
    
    var end: js.UndefOr[String] = js.native
    
    var scale: js.UndefOr[seconds | minutes | hours | days | weeks | months | quarters | years] = js.native
    
    var start: js.UndefOr[String] = js.native
    
    var trackResize: js.UndefOr[on | off] = js.native
    
    var translations: js.UndefOr[LabelAndValue] = js.native
  }
  object ojTimeAxisSettablePropertiesLenient {
    
    @scala.inline
    def apply(): ojTimeAxisSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojTimeAxisSettablePropertiesLenient]
    }
    
    @scala.inline
    implicit class ojTimeAxisSettablePropertiesLenientMutableBuilder[Self <: ojTimeAxisSettablePropertiesLenient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConverter(value: Converters | Converter[String]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
      
      @scala.inline
      def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setScale(value: seconds | minutes | hours | days | weeks | months | quarters | years): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
      
      @scala.inline
      def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}

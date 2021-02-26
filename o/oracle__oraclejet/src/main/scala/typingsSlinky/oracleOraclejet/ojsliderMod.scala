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
import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.anon.InvalidStep
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValue
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValueEventMap
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`type`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.fromMax
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.fromMin
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.max
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.min
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.step
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stepChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transientValueChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.typeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.value
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsSlinky.std.SecurityPolicyViolationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojsliderMod {
  
  @js.native
  trait ojSlider extends editableValue[Double | Null, ojSliderSettableProperties, Double | Null, Double | Null] {
    
    def addEventListener(`type`: orientationChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    def addEventListener(
      `type`: orientationChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(`type`: typeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    def addEventListener(
      `type`: typeChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_maxChanged(`type`: maxChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_maxChanged(
      `type`: maxChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_minChanged(`type`: minChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_minChanged(
      `type`: minChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stepChanged(`type`: stepChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stepChanged(
      `type`: stepChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transientValueChanged(`type`: transientValueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transientValueChanged(
      `type`: transientValueChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    
    @JSName("getProperty")
    def getProperty_max(property: max): Double | Null = js.native
    @JSName("getProperty")
    def getProperty_min(property: min): Double | Null = js.native
    @JSName("getProperty")
    def getProperty_orientation(property: orientation): horizontal | vertical = js.native
    @JSName("getProperty")
    def getProperty_step(property: step): Double | Null = js.native
    @JSName("getProperty")
    def getProperty_transientValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transientValue): Double = js.native
    @JSName("getProperty")
    def getProperty_type(property: `type`): fromMin | fromMax | single = js.native
    
    var max: Double | Null = js.native
    
    var min: Double | Null = js.native
    
    var onMaxChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onMinChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    @JSName("onOjAnimateEnd")
    var onOjAnimateEnd_ojSlider: (js.Function1[CustomEvent, _]) | Null = js.native
    
    @JSName("onOjAnimateStart")
    var onOjAnimateStart_ojSlider: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOrientationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onStepChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onTransientValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var orientation: horizontal | vertical = js.native
    
    def setProperties(properties: ojSliderSettablePropertiesLenient): Unit = js.native
    
    def setProperty(property: `type`, value: fromMax): Unit = js.native
    def setProperty(property: `type`, value: fromMin): Unit = js.native
    def setProperty(property: `type`, value: single): Unit = js.native
    def setProperty(property: orientation, value: horizontal): Unit = js.native
    def setProperty(property: orientation, value: vertical): Unit = js.native
    @JSName("setProperty")
    def setProperty_max(property: max): Unit = js.native
    @JSName("setProperty")
    def setProperty_max(property: max, value: Double): Unit = js.native
    @JSName("setProperty")
    def setProperty_min(property: min): Unit = js.native
    @JSName("setProperty")
    def setProperty_min(property: min, value: Double): Unit = js.native
    @JSName("setProperty")
    def setProperty_step(property: step): Unit = js.native
    @JSName("setProperty")
    def setProperty_step(property: step, value: Double): Unit = js.native
    @JSName("setProperty")
    def setProperty_transientValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transientValue, value: Double): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: InvalidStep): Unit = js.native
    @JSName("setProperty")
    def setProperty_value(property: value): Unit = js.native
    @JSName("setProperty")
    def setProperty_value(property: value, value: Double): Unit = js.native
    
    var step: Double | Null = js.native
    
    val transientValue: Double = js.native
    
    @JSName("translations")
    var translations_ojSlider: InvalidStep = js.native
    
    var `type`: fromMin | fromMax | single = js.native
  }
  object ojSlider {
    
    type ojAnimateEnd = CustomEvent
    
    type ojAnimateStart = CustomEvent
  }
  
  @js.native
  trait ojSliderEventMap extends editableValueEventMap[Double | Null, ojSliderSettableProperties, Double | Null, Double | Null] {
    
    var maxChanged: CustomEvent = js.native
    
    var minChanged: CustomEvent = js.native
    
    @JSName("ojAnimateEnd")
    var ojAnimateEnd_ojSliderEventMap: CustomEvent = js.native
    
    @JSName("ojAnimateStart")
    var ojAnimateStart_ojSliderEventMap: CustomEvent = js.native
    
    var orientationChanged: CustomEvent = js.native
    
    var stepChanged: CustomEvent = js.native
    
    var transientValueChanged: CustomEvent = js.native
    
    var typeChanged: CustomEvent = js.native
  }
  object ojSliderEventMap {
    
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
      describedByChanged: CustomEvent,
      disabledChanged: CustomEvent,
      displayOptionsChanged: CustomEvent,
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
      helpChanged: CustomEvent,
      helpHintsChanged: CustomEvent,
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      labelHintChanged: CustomEvent,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      maxChanged: CustomEvent,
      messagesCustomChanged: CustomEvent,
      minChanged: CustomEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      ojAnimateEnd: CustomEvent,
      ojAnimateStart: CustomEvent,
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
      stepChanged: CustomEvent,
      submit: Event,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transientValueChanged: CustomEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      translationsChanged: CustomEvent,
      typeChanged: CustomEvent,
      validChanged: CustomEvent,
      valueChanged: CustomEvent,
      volumechange: Event,
      waiting: Event,
      wheel: WheelEvent
    ): ojSliderEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], describedByChanged = describedByChanged.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], displayOptionsChanged = displayOptionsChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], helpChanged = helpChanged.asInstanceOf[js.Any], helpHintsChanged = helpHintsChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelHintChanged = labelHintChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maxChanged = maxChanged.asInstanceOf[js.Any], messagesCustomChanged = messagesCustomChanged.asInstanceOf[js.Any], minChanged = minChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], orientationChanged = orientationChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], stepChanged = stepChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transientValueChanged = transientValueChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], typeChanged = typeChanged.asInstanceOf[js.Any], validChanged = validChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojSliderEventMap]
    }
    
    @scala.inline
    implicit class ojSliderEventMapMutableBuilder[Self <: ojSliderEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxChanged(value: CustomEvent): Self = StObject.set(x, "maxChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinChanged(value: CustomEvent): Self = StObject.set(x, "minChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateEnd(value: CustomEvent): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateStart(value: CustomEvent): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationChanged(value: CustomEvent): Self = StObject.set(x, "orientationChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepChanged(value: CustomEvent): Self = StObject.set(x, "stepChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransientValueChanged(value: CustomEvent): Self = StObject.set(x, "transientValueChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeChanged(value: CustomEvent): Self = StObject.set(x, "typeChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ojSliderSettableProperties extends editableValueSettableProperties[Double | Null, Double | Null, Double | Null] {
    
    var max: Double | Null = js.native
    
    var min: Double | Null = js.native
    
    var orientation: horizontal | vertical = js.native
    
    var step: Double | Null = js.native
    
    val transientValue: Double = js.native
    
    @JSName("translations")
    var translations_ojSliderSettableProperties: InvalidStep = js.native
    
    var `type`: fromMin | fromMax | single = js.native
  }
  object ojSliderSettableProperties {
    
    @scala.inline
    def apply(
      disabled: Boolean,
      displayOptions: ConverterHint,
      help: Instruction,
      helpHints: Definition,
      labelHint: String,
      messagesCustom: js.Array[^],
      orientation: horizontal | vertical,
      transientValue: Double,
      translations: InvalidStep,
      `type`: fromMin | fromMax | single,
      valid: valid | pending | invalidHidden | invalidShown
    ): ojSliderSettableProperties = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], transientValue = transientValue.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojSliderSettableProperties]
    }
    
    @scala.inline
    implicit class ojSliderSettablePropertiesMutableBuilder[Self <: ojSliderSettableProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxNull: Self = StObject.set(x, "max", null)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinNull: Self = StObject.set(x, "min", null)
      
      @scala.inline
      def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepNull: Self = StObject.set(x, "step", null)
      
      @scala.inline
      def setTransientValue(value: Double): Self = StObject.set(x, "transientValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslations(value: InvalidStep): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: fromMin | fromMax | single): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojslider.ojSliderSettableProperties> */
  @js.native
  trait ojSliderSettablePropertiesLenient
    extends /* key */ StringDictionary[js.Any] {
    
    var describedBy: js.UndefOr[String | Null] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var displayOptions: js.UndefOr[ConverterHint] = js.native
    
    var help: js.UndefOr[Instruction] = js.native
    
    var helpHints: js.UndefOr[Definition] = js.native
    
    var labelHint: js.UndefOr[String] = js.native
    
    var max: js.UndefOr[Double | Null] = js.native
    
    var messagesCustom: js.UndefOr[js.Array[^]] = js.native
    
    var min: js.UndefOr[Double | Null] = js.native
    
    var orientation: js.UndefOr[horizontal | vertical] = js.native
    
    var step: js.UndefOr[Double | Null] = js.native
    
    var transientValue: js.UndefOr[Double] = js.native
    
    var translations: js.UndefOr[InvalidStep] = js.native
    
    var `type`: js.UndefOr[fromMin | fromMax | single] = js.native
    
    var valid: js.UndefOr[
        typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
      ] = js.native
    
    var value: js.UndefOr[Double | Null] = js.native
  }
  object ojSliderSettablePropertiesLenient {
    
    @scala.inline
    def apply(): ojSliderSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojSliderSettablePropertiesLenient]
    }
    
    @scala.inline
    implicit class ojSliderSettablePropertiesLenientMutableBuilder[Self <: ojSliderSettablePropertiesLenient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescribedBy(value: String): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescribedByNull: Self = StObject.set(x, "describedBy", null)
      
      @scala.inline
      def setDescribedByUndefined: Self = StObject.set(x, "describedBy", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDisplayOptions(value: ConverterHint): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
      
      @scala.inline
      def setHelp(value: Instruction): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpHints(value: Definition): Self = StObject.set(x, "helpHints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpHintsUndefined: Self = StObject.set(x, "helpHints", js.undefined)
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setLabelHint(value: String): Self = StObject.set(x, "labelHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHintUndefined: Self = StObject.set(x, "labelHint", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxNull: Self = StObject.set(x, "max", null)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMessagesCustom(value: js.Array[^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesCustomUndefined: Self = StObject.set(x, "messagesCustom", js.undefined)
      
      @scala.inline
      def setMessagesCustomVarargs(value: ^ *): Self = StObject.set(x, "messagesCustom", js.Array(value :_*))
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinNull: Self = StObject.set(x, "min", null)
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepNull: Self = StObject.set(x, "step", null)
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setTransientValue(value: Double): Self = StObject.set(x, "transientValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransientValueUndefined: Self = StObject.set(x, "transientValue", js.undefined)
      
      @scala.inline
      def setTranslations(value: InvalidStep): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
      
      @scala.inline
      def setType(value: fromMin | fromMax | single): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

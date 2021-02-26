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
import typingsSlinky.oracleOraclejet.anon.Label
import typingsSlinky.oracleOraclejet.anon.LabelNone
import typingsSlinky.oracleOraclejet.ojcolorMod.^
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValue
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValueEventMap
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.grid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelDisplay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelDisplayChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelledBy
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelledByChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.layout
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.layoutChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lg
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.list
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.palette
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.paletteChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sm
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.swatchSize
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.swatchSizeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.xs
import typingsSlinky.std.SecurityPolicyViolationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojcolorpaletteMod {
  
  @js.native
  trait ojColorPalette extends editableValue[^, ojColorPaletteSettableProperties, ^, ^] {
    
    def addEventListener(`type`: labelDisplayChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    def addEventListener(
      `type`: labelDisplayChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(`type`: layoutChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    def addEventListener(
      `type`: layoutChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(`type`: swatchSizeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    def addEventListener(
      `type`: swatchSizeChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_labelledByChanged(`type`: labelledByChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_labelledByChanged(
      `type`: labelledByChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paletteChanged(`type`: paletteChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paletteChanged(
      `type`: paletteChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    
    @JSName("getProperty")
    def getProperty_labelDisplay(property: labelDisplay): auto | off = js.native
    @JSName("getProperty")
    def getProperty_labelledBy(property: labelledBy): String | Null = js.native
    @JSName("getProperty")
    def getProperty_layout(property: layout): grid | list = js.native
    @JSName("getProperty")
    def getProperty_palette(property: palette): js.Array[Label] = js.native
    @JSName("getProperty")
    def getProperty_swatchSize(property: swatchSize): xs | sm | lg = js.native
    
    var labelDisplay: auto | off = js.native
    
    var labelledBy: String | Null = js.native
    
    var layout: grid | list = js.native
    
    var onLabelDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onLabelledByChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onLayoutChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    @JSName("onOjAnimateEnd")
    var onOjAnimateEnd_ojColorPalette: (js.Function1[CustomEvent, _]) | Null = js.native
    
    @JSName("onOjAnimateStart")
    var onOjAnimateStart_ojColorPalette: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onPaletteChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onSwatchSizeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var palette: js.Array[Label] = js.native
    
    def setProperties(properties: ojColorPaletteSettablePropertiesLenient): Unit = js.native
    
    def setProperty(property: labelDisplay, value: auto): Unit = js.native
    def setProperty(property: labelDisplay, value: off): Unit = js.native
    def setProperty(property: layout, value: grid): Unit = js.native
    def setProperty(property: layout, value: list): Unit = js.native
    def setProperty(property: swatchSize, value: lg): Unit = js.native
    def setProperty(property: swatchSize, value: sm): Unit = js.native
    def setProperty(property: swatchSize, value: xs): Unit = js.native
    @JSName("setProperty")
    def setProperty_labelledBy(property: labelledBy): Unit = js.native
    @JSName("setProperty")
    def setProperty_labelledBy(property: labelledBy, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_palette(property: palette, value: js.Array[Label]): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: LabelNone): Unit = js.native
    
    var swatchSize: xs | sm | lg = js.native
    
    @JSName("translations")
    var translations_ojColorPalette: LabelNone = js.native
  }
  object ojColorPalette {
    
    type ojAnimateEnd = CustomEvent
    
    type ojAnimateStart = CustomEvent
  }
  
  @js.native
  trait ojColorPaletteEventMap extends editableValueEventMap[^, ojColorPaletteSettableProperties, ^, ^] {
    
    var labelDisplayChanged: CustomEvent = js.native
    
    var labelledByChanged: CustomEvent = js.native
    
    var layoutChanged: CustomEvent = js.native
    
    @JSName("ojAnimateEnd")
    var ojAnimateEnd_ojColorPaletteEventMap: CustomEvent = js.native
    
    @JSName("ojAnimateStart")
    var ojAnimateStart_ojColorPaletteEventMap: CustomEvent = js.native
    
    var paletteChanged: CustomEvent = js.native
    
    var swatchSizeChanged: CustomEvent = js.native
  }
  object ojColorPaletteEventMap {
    
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
      labelDisplayChanged: CustomEvent,
      labelHintChanged: CustomEvent,
      labelledByChanged: CustomEvent,
      layoutChanged: CustomEvent,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      messagesCustomChanged: CustomEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      ojAnimateEnd: CustomEvent,
      ojAnimateStart: CustomEvent,
      paletteChanged: CustomEvent,
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
      swatchSizeChanged: CustomEvent,
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
      validChanged: CustomEvent,
      valueChanged: CustomEvent,
      volumechange: Event,
      waiting: Event,
      wheel: WheelEvent
    ): ojColorPaletteEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], describedByChanged = describedByChanged.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], displayOptionsChanged = displayOptionsChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], helpChanged = helpChanged.asInstanceOf[js.Any], helpHintsChanged = helpHintsChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelDisplayChanged = labelDisplayChanged.asInstanceOf[js.Any], labelHintChanged = labelHintChanged.asInstanceOf[js.Any], labelledByChanged = labelledByChanged.asInstanceOf[js.Any], layoutChanged = layoutChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], messagesCustomChanged = messagesCustomChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], paletteChanged = paletteChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], swatchSizeChanged = swatchSizeChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], validChanged = validChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojColorPaletteEventMap]
    }
    
    @scala.inline
    implicit class ojColorPaletteEventMapMutableBuilder[Self <: ojColorPaletteEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabelDisplayChanged(value: CustomEvent): Self = StObject.set(x, "labelDisplayChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelledByChanged(value: CustomEvent): Self = StObject.set(x, "labelledByChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutChanged(value: CustomEvent): Self = StObject.set(x, "layoutChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateEnd(value: CustomEvent): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateStart(value: CustomEvent): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteChanged(value: CustomEvent): Self = StObject.set(x, "paletteChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwatchSizeChanged(value: CustomEvent): Self = StObject.set(x, "swatchSizeChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ojColorPaletteSettableProperties extends editableValueSettableProperties[^, ^, ^] {
    
    var labelDisplay: auto | off = js.native
    
    var labelledBy: String | Null = js.native
    
    var layout: grid | list = js.native
    
    var palette: js.Array[Label] = js.native
    
    var swatchSize: xs | sm | lg = js.native
    
    @JSName("translations")
    var translations_ojColorPaletteSettableProperties: LabelNone = js.native
  }
  object ojColorPaletteSettableProperties {
    
    @scala.inline
    def apply(
      disabled: Boolean,
      displayOptions: ConverterHint,
      help: Instruction,
      helpHints: Definition,
      labelDisplay: auto | off,
      labelHint: String,
      layout: grid | list,
      messagesCustom: js.Array[typingsSlinky.oracleOraclejet.ojmessagingMod.^],
      palette: js.Array[Label],
      swatchSize: xs | sm | lg,
      translations: LabelNone,
      valid: valid | pending | invalidHidden | invalidShown,
      value: ^
    ): ojColorPaletteSettableProperties = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], swatchSize = swatchSize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojColorPaletteSettableProperties]
    }
    
    @scala.inline
    implicit class ojColorPaletteSettablePropertiesMutableBuilder[Self <: ojColorPaletteSettableProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabelDisplay(value: auto | off): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelledBy(value: String): Self = StObject.set(x, "labelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelledByNull: Self = StObject.set(x, "labelledBy", null)
      
      @scala.inline
      def setLayout(value: grid | list): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPalette(value: js.Array[Label]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteVarargs(value: Label*): Self = StObject.set(x, "palette", js.Array(value :_*))
      
      @scala.inline
      def setSwatchSize(value: xs | sm | lg): Self = StObject.set(x, "swatchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslations(value: LabelNone): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojcolorpalette.ojColorPaletteSettableProperties> */
  @js.native
  trait ojColorPaletteSettablePropertiesLenient
    extends /* key */ StringDictionary[js.Any] {
    
    var describedBy: js.UndefOr[String | Null] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var displayOptions: js.UndefOr[ConverterHint] = js.native
    
    var help: js.UndefOr[Instruction] = js.native
    
    var helpHints: js.UndefOr[Definition] = js.native
    
    var labelDisplay: js.UndefOr[auto | off] = js.native
    
    var labelHint: js.UndefOr[String] = js.native
    
    var labelledBy: js.UndefOr[String | Null] = js.native
    
    var layout: js.UndefOr[grid | list] = js.native
    
    var messagesCustom: js.UndefOr[js.Array[typingsSlinky.oracleOraclejet.ojmessagingMod.^]] = js.native
    
    var palette: js.UndefOr[js.Array[Label]] = js.native
    
    var swatchSize: js.UndefOr[xs | sm | lg] = js.native
    
    var translations: js.UndefOr[LabelNone] = js.native
    
    var valid: js.UndefOr[
        typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
      ] = js.native
    
    var value: js.UndefOr[^] = js.native
  }
  object ojColorPaletteSettablePropertiesLenient {
    
    @scala.inline
    def apply(): ojColorPaletteSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojColorPaletteSettablePropertiesLenient]
    }
    
    @scala.inline
    implicit class ojColorPaletteSettablePropertiesLenientMutableBuilder[Self <: ojColorPaletteSettablePropertiesLenient] (val x: Self) extends AnyVal {
      
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
      def setLabelDisplay(value: auto | off): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelDisplayUndefined: Self = StObject.set(x, "labelDisplay", js.undefined)
      
      @scala.inline
      def setLabelHint(value: String): Self = StObject.set(x, "labelHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHintUndefined: Self = StObject.set(x, "labelHint", js.undefined)
      
      @scala.inline
      def setLabelledBy(value: String): Self = StObject.set(x, "labelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelledByNull: Self = StObject.set(x, "labelledBy", null)
      
      @scala.inline
      def setLabelledByUndefined: Self = StObject.set(x, "labelledBy", js.undefined)
      
      @scala.inline
      def setLayout(value: grid | list): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setMessagesCustom(value: js.Array[typingsSlinky.oracleOraclejet.ojmessagingMod.^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesCustomUndefined: Self = StObject.set(x, "messagesCustom", js.undefined)
      
      @scala.inline
      def setMessagesCustomVarargs(value: typingsSlinky.oracleOraclejet.ojmessagingMod.^ *): Self = StObject.set(x, "messagesCustom", js.Array(value :_*))
      
      @scala.inline
      def setPalette(value: js.Array[Label]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      @scala.inline
      def setPaletteVarargs(value: Label*): Self = StObject.set(x, "palette", js.Array(value :_*))
      
      @scala.inline
      def setSwatchSize(value: xs | sm | lg): Self = StObject.set(x, "swatchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwatchSizeUndefined: Self = StObject.set(x, "swatchSize", js.undefined)
      
      @scala.inline
      def setTranslations(value: LabelNone): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
      
      @scala.inline
      def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      @scala.inline
      def setValue(value: ^): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

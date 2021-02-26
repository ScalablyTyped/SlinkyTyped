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
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.mod.baseComponentEventMap
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.describedBy
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.describedByChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabledChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.displayOptions
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.displayOptionsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.help
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.helpChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.helpHints
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.helpHintsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelHint
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelHintChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.messagesCustom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.messagesCustomChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.validChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.value
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typingsSlinky.std.SecurityPolicyViolationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojeditablevalueMod {
  
  @js.native
  trait editableValue[V, SP /* <: editableValueSettableProperties[V, SV, RV] */, SV, RV] extends baseComponent[SP] {
    
    def addEventListener(`type`: validChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    def addEventListener(
      `type`: validChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_describedByChanged(`type`: describedByChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_describedByChanged(
      `type`: describedByChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_disabledChanged(`type`: disabledChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_disabledChanged(
      `type`: disabledChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_displayOptionsChanged(`type`: displayOptionsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_displayOptionsChanged(
      `type`: displayOptionsChanged,
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
    def addEventListener_helpHintsChanged(`type`: helpHintsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_helpHintsChanged(
      `type`: helpHintsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_labelHintChanged(`type`: labelHintChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_labelHintChanged(
      `type`: labelHintChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_messagesCustomChanged(`type`: messagesCustomChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_messagesCustomChanged(
      `type`: messagesCustomChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
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
    def addEventListener_valueChanged(`type`: valueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_valueChanged(
      `type`: valueChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
      useCapture: Boolean
    ): Unit = js.native
    
    var describedBy: String | Null = js.native
    
    var disabled: Boolean = js.native
    
    var displayOptions: ConverterHint = js.native
    
    @JSName("getProperty")
    def getProperty_describedBy(property: describedBy): String | Null = js.native
    @JSName("getProperty")
    def getProperty_disabled(property: disabled): Boolean = js.native
    @JSName("getProperty")
    def getProperty_displayOptions(property: displayOptions): ConverterHint = js.native
    @JSName("getProperty")
    def getProperty_help(property: help): Instruction = js.native
    @JSName("getProperty")
    def getProperty_helpHints(property: helpHints): Definition = js.native
    @JSName("getProperty")
    def getProperty_labelHint(property: labelHint): String = js.native
    @JSName("getProperty")
    def getProperty_messagesCustom(property: messagesCustom): js.Array[^] = js.native
    @JSName("getProperty")
    def getProperty_valid(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid): typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
    @JSName("getProperty")
    def getProperty_value(property: value): V = js.native
    
    var help: Instruction = js.native
    
    var helpHints: Definition = js.native
    
    var labelHint: String = js.native
    
    var messagesCustom: js.Array[^] = js.native
    
    var onDescribedByChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onDisabledChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onDisplayOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onHelpChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onHelpHintsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onLabelHintChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onMessagesCustomChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onValidChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    var onValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
    
    def reset(): Unit = js.native
    
    def setProperties(properties: editableValueSettablePropertiesLenient[V, SV, RV]): Unit = js.native
    
    def setProperty(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid, value: invalidHidden): Unit = js.native
    def setProperty(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid, value: invalidShown): Unit = js.native
    def setProperty(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid, value: pending): Unit = js.native
    @JSName("setProperty")
    def setProperty_describedBy(property: describedBy): Unit = js.native
    @JSName("setProperty")
    def setProperty_describedBy(property: describedBy, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_displayOptions(property: displayOptions, value: ConverterHint): Unit = js.native
    @JSName("setProperty")
    def setProperty_help(property: help, value: Instruction): Unit = js.native
    @JSName("setProperty")
    def setProperty_helpHints(property: helpHints, value: Definition): Unit = js.native
    @JSName("setProperty")
    def setProperty_labelHint(property: labelHint, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_messagesCustom(property: messagesCustom, value: js.Array[^]): Unit = js.native
    @JSName("setProperty")
    def setProperty_valid(
      property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid,
      value: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
    ): Unit = js.native
    @JSName("setProperty")
    def setProperty_value(property: value, value: SV): Unit = js.native
    
    def showMessages(): Unit = js.native
    
    val valid: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
    
    var value: V = js.native
  }
  object editableValue {
    
    type ojAnimateEnd = CustomEvent
    
    type ojAnimateStart = CustomEvent
  }
  
  @js.native
  trait editableValueEventMap[V, SP /* <: editableValueSettableProperties[V, SV, RV] */, SV, RV] extends baseComponentEventMap[SP] {
    
    var describedByChanged: CustomEvent = js.native
    
    var disabledChanged: CustomEvent = js.native
    
    var displayOptionsChanged: CustomEvent = js.native
    
    var helpChanged: CustomEvent = js.native
    
    var helpHintsChanged: CustomEvent = js.native
    
    var labelHintChanged: CustomEvent = js.native
    
    var messagesCustomChanged: CustomEvent = js.native
    
    var ojAnimateEnd: CustomEvent = js.native
    
    var ojAnimateStart: CustomEvent = js.native
    
    var validChanged: CustomEvent = js.native
    
    var valueChanged: CustomEvent = js.native
  }
  object editableValueEventMap {
    
    @scala.inline
    def apply[V, SP /* <: editableValueSettableProperties[V, SV, RV] */, SV, RV](
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
      validChanged: CustomEvent,
      valueChanged: CustomEvent,
      volumechange: Event,
      waiting: Event,
      wheel: WheelEvent
    ): editableValueEventMap[V, SP, SV, RV] = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], describedByChanged = describedByChanged.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], displayOptionsChanged = displayOptionsChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], helpChanged = helpChanged.asInstanceOf[js.Any], helpHintsChanged = helpHintsChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelHintChanged = labelHintChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], messagesCustomChanged = messagesCustomChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], validChanged = validChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[editableValueEventMap[V, SP, SV, RV]]
    }
    
    @scala.inline
    implicit class editableValueEventMapMutableBuilder[Self <: editableValueEventMap[_, _, _, _], V, SP /* <: editableValueSettableProperties[V, SV, RV] */, SV, RV] (val x: Self with (editableValueEventMap[V, SP, SV, RV])) extends AnyVal {
      
      @scala.inline
      def setDescribedByChanged(value: CustomEvent): Self = StObject.set(x, "describedByChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledChanged(value: CustomEvent): Self = StObject.set(x, "disabledChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayOptionsChanged(value: CustomEvent): Self = StObject.set(x, "displayOptionsChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpChanged(value: CustomEvent): Self = StObject.set(x, "helpChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpHintsChanged(value: CustomEvent): Self = StObject.set(x, "helpHintsChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHintChanged(value: CustomEvent): Self = StObject.set(x, "labelHintChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesCustomChanged(value: CustomEvent): Self = StObject.set(x, "messagesCustomChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateEnd(value: CustomEvent): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateStart(value: CustomEvent): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidChanged(value: CustomEvent): Self = StObject.set(x, "validChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueChanged(value: CustomEvent): Self = StObject.set(x, "valueChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait editableValueSettableProperties[V, SV, RV] extends baseComponentSettableProperties {
    
    var describedBy: String | Null = js.native
    
    var disabled: Boolean = js.native
    
    var displayOptions: ConverterHint = js.native
    
    var help: Instruction = js.native
    
    var helpHints: Definition = js.native
    
    var labelHint: String = js.native
    
    var messagesCustom: js.Array[^] = js.native
    
    val valid: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
    
    var value: SV = js.native
  }
  object editableValueSettableProperties {
    
    @scala.inline
    def apply[V, SV, RV](
      disabled: Boolean,
      displayOptions: ConverterHint,
      help: Instruction,
      helpHints: Definition,
      labelHint: String,
      messagesCustom: js.Array[^],
      valid: valid | pending | invalidHidden | invalidShown,
      value: SV
    ): editableValueSettableProperties[V, SV, RV] = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[editableValueSettableProperties[V, SV, RV]]
    }
    
    @scala.inline
    implicit class editableValueSettablePropertiesMutableBuilder[Self <: editableValueSettableProperties[_, _, _], V, SV, RV] (val x: Self with (editableValueSettableProperties[V, SV, RV])) extends AnyVal {
      
      @scala.inline
      def setDescribedBy(value: String): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescribedByNull: Self = StObject.set(x, "describedBy", null)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayOptions(value: ConverterHint): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelp(value: Instruction): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpHints(value: Definition): Self = StObject.set(x, "helpHints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHint(value: String): Self = StObject.set(x, "labelHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesCustom(value: js.Array[^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesCustomVarargs(value: ^ *): Self = StObject.set(x, "messagesCustom", js.Array(value :_*))
      
      @scala.inline
      def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: SV): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojeditablevalue.editableValueSettableProperties<V, SV, RV>> */
  @js.native
  trait editableValueSettablePropertiesLenient[V, SV, RV]
    extends /* key */ StringDictionary[js.Any] {
    
    var describedBy: js.UndefOr[String | Null] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var displayOptions: js.UndefOr[ConverterHint] = js.native
    
    var help: js.UndefOr[Instruction] = js.native
    
    var helpHints: js.UndefOr[Definition] = js.native
    
    var labelHint: js.UndefOr[String] = js.native
    
    var messagesCustom: js.UndefOr[js.Array[^]] = js.native
    
    var translations: js.UndefOr[js.Object | Null] = js.native
    
    var valid: js.UndefOr[
        typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
      ] = js.native
    
    var value: js.UndefOr[SV] = js.native
  }
  object editableValueSettablePropertiesLenient {
    
    @scala.inline
    def apply[V, SV, RV](): editableValueSettablePropertiesLenient[V, SV, RV] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[editableValueSettablePropertiesLenient[V, SV, RV]]
    }
    
    @scala.inline
    implicit class editableValueSettablePropertiesLenientMutableBuilder[Self <: editableValueSettablePropertiesLenient[_, _, _], V, SV, RV] (val x: Self with (editableValueSettablePropertiesLenient[V, SV, RV])) extends AnyVal {
      
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
      def setMessagesCustom(value: js.Array[^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesCustomUndefined: Self = StObject.set(x, "messagesCustom", js.undefined)
      
      @scala.inline
      def setMessagesCustomVarargs(value: ^ *): Self = StObject.set(x, "messagesCustom", js.Array(value :_*))
      
      @scala.inline
      def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsNull: Self = StObject.set(x, "translations", null)
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
      
      @scala.inline
      def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      @scala.inline
      def setValue(value: SV): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

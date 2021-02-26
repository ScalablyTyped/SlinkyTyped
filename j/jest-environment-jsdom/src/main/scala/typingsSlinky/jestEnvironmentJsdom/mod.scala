package typingsSlinky.jestEnvironmentJsdom

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.crypto.Crypto
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent
import org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
import org.scalajs.dom.experimental.serviceworkers.CacheStorage
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ApplicationCache
import org.scalajs.dom.raw.BeforeUnloadEvent
import org.scalajs.dom.raw.CSSRuleList
import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.External
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HashChangeEvent
import org.scalajs.dom.raw.History
import org.scalajs.dom.raw.IDBFactory
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.Location
import org.scalajs.dom.raw.MediaQueryList
import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Navigator
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.Performance
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.PopStateEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.Screen
import org.scalajs.dom.raw.Selection
import org.scalajs.dom.raw.Storage
import org.scalajs.dom.raw.StorageEvent
import org.scalajs.dom.raw.StyleMedia
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.istanbulLibCoverage.mod.CoverageMapData
import typingsSlinky.jestEnvironment.mod.EnvironmentContext
import typingsSlinky.jestEnvironment.mod.JestEnvironment
import typingsSlinky.jestEnvironmentJsdom.anon.EventerrorError
import typingsSlinky.jestEnvironmentJsdom.anon.StackTraceLimit
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSGestureChange
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSGestureDoubleTap
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSGestureEnd
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSGestureHold
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSGestureStart
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSGestureTap
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSInertiaStart
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerCancel
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerDown
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerEnter
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerLeave
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerMove
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerOut
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerOver
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerUp
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.abort
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.afterprint
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.animationcancel
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.animationend
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.animationiteration
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.animationstart
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.auxclick
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.beforeprint
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.beforeunload
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.blur
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.cancel
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.canplay
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.canplaythrough
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.change
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.click
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.close
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.compassneedscalibration
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.contextmenu
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.cuechange
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.dblclick
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.devicelight
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.devicemotion
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.deviceorientation
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.deviceorientationabsolute
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.drag
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.dragend
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.dragenter
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.dragexit
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.dragleave
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.dragover
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.dragstart
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.drop
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.durationchange
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.emptied
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.ended
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.error
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.focus
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.focusin
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.focusout
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.gotpointercapture
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.hashchange
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.input
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.invalid
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.keydown
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.keypress
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.keyup
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.languagechange
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.load
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.loadeddata
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.loadedmetadata
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.loadstart
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.lostpointercapture
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.message
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.messageerror
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mousedown
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mouseenter
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mouseleave
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mousemove
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mouseout
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mouseover
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mouseup
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mousewheel
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.offline
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.online
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.orientationchange
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pagehide
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pageshow
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pause
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.play
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.playing
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointercancel
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointerdown
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointerenter
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointerleave
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointermove
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointerout
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointerover
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointerup
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.popstate
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.progress
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.ratechange
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.readystatechange
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.rejectionhandled
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.reset
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.resize
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.scroll
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.securitypolicyviolation
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.seeked
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.seeking
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.select
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.selectionchange
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.selectstart
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.stalled
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.storage
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.submit
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.suspend
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.timeupdate
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.toggle
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.touchcancel
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.touchend
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.touchmove
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.touchstart
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.transitioncancel
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.transitionend
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.transitionrun
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.transitionstart
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.unhandledrejection
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.unload
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.volumechange
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplayactivate
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplayblur
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplayconnect
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplaydeactivate
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplaydisconnect
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplayfocus
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplaypointerrestricted
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplaypointerunrestricted
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplaypresentchange
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.waiting
import typingsSlinky.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.wheel
import typingsSlinky.jestTypes.anon.ItBaseconcurrentItConcurr
import typingsSlinky.jestTypes.configMod.ProjectConfig
import typingsSlinky.jestTypes.globalMod.BlockFn
import typingsSlinky.jestTypes.globalMod.BlockName
import typingsSlinky.jestTypes.globalMod.Describe
import typingsSlinky.jestTypes.globalMod.DescribeBase
import typingsSlinky.jestTypes.globalMod.HookBase
import typingsSlinky.jestTypes.globalMod.HookFn
import typingsSlinky.jestTypes.globalMod.ItBase
import typingsSlinky.jestTypes.globalMod.ItConcurrent
import typingsSlinky.jestTypes.globalMod.Jasmine
import typingsSlinky.jestTypes.globalMod.TestFn
import typingsSlinky.jestTypes.globalMod.TestName
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.Global
import typingsSlinky.node.NodeJS.Immediate
import typingsSlinky.node.NodeJS.Timeout
import typingsSlinky.node.anon.TypeofBuffer
import typingsSlinky.node.vmMod.Context
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.ArrayBufferConstructor
import typingsSlinky.std.BarProp
import typingsSlinky.std.CustomElementRegistry
import typingsSlinky.std.DataViewConstructor
import typingsSlinky.std.DeviceLightEvent
import typingsSlinky.std.EventListenerOrEventListenerObject
import typingsSlinky.std.ExtensionScriptApis
import typingsSlinky.std.Float32ArrayConstructor
import typingsSlinky.std.Float64ArrayConstructor
import typingsSlinky.std.FocusNavigationOrigin
import typingsSlinky.std.FrameRequestCallback
import typingsSlinky.std.ImageBitmap
import typingsSlinky.std.ImageBitmapOptions
import typingsSlinky.std.ImageBitmapSource
import typingsSlinky.std.Int16ArrayConstructor
import typingsSlinky.std.Int32ArrayConstructor
import typingsSlinky.std.Int8ArrayConstructor
import typingsSlinky.std.MapConstructor
import typingsSlinky.std.NavigationReason
import typingsSlinky.std.OnErrorEventHandler
import typingsSlinky.std.PageTransitionEvent
import typingsSlinky.std.PromiseConstructor
import typingsSlinky.std.PromiseRejectionEvent
import typingsSlinky.std.RequestInfo
import typingsSlinky.std.ScrollToOptions
import typingsSlinky.std.SecurityPolicyViolationEvent
import typingsSlinky.std.SetConstructor
import typingsSlinky.std.SpeechSynthesis
import typingsSlinky.std.TimerHandler
import typingsSlinky.std.Transferable
import typingsSlinky.std.Uint16ArrayConstructor
import typingsSlinky.std.Uint32ArrayConstructor
import typingsSlinky.std.Uint8ArrayConstructor
import typingsSlinky.std.Uint8ClampedArrayConstructor
import typingsSlinky.std.VisualViewport
import typingsSlinky.std.VoidFunction
import typingsSlinky.std.WeakMapConstructor
import typingsSlinky.std.WeakSetConstructor
import typingsSlinky.std.WebKitPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-environment-jsdom", JSImport.Namespace)
  @js.native
  class ^ protected () extends JSDOMEnvironment {
    def this(config: ProjectConfig) = this()
    def this(config: ProjectConfig, options: EnvironmentContext) = this()
  }
  
  @js.native
  trait JSDOMEnvironment extends JestEnvironment {
    
    var dom: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSDOM */ js.Any) | Null = js.native
    
    var errorEventListener: (js.Function1[/* event */ EventerrorError, Unit]) | Null = js.native
    
    @JSName("getVmContext")
    def getVmContext_MJSDOMEnvironment(): Context | Null = js.native
    
    @JSName("global")
    var global_JSDOMEnvironment: Win = js.native
  }
  
  /* Inlined std.Window & @jest/types.@jest/types.Global.Global & {  Error :{  stackTraceLimit :number}} */
  @js.native
  trait Win
    extends /* extras */ StringDictionary[js.Any]
       with /* index */ NumberDictionary[Window] {
    
    def Array(): js.Array[_] = js.native
    
    var ArrayBuffer: ArrayBufferConstructor = js.native
    
    @JSName("Array")
    var Array_Original: js.Function0[js.Array[_]] = js.native
    
    def Boolean[T](): scala.Boolean = js.native
    @JSName("Boolean")
    var Boolean_Original: js.Function0[Boolean] = js.native
    
    var Buffer: TypeofBuffer with (Instantiable2[
        /* str */ String, 
        /* encoding */ js.UndefOr[BufferEncoding], 
        typingsSlinky.node.Buffer
      ]) = js.native
    
    var DataView: DataViewConstructor = js.native
    
    def Date(): String = js.native
    @JSName("Date")
    var Date_Original: js.Function0[String] = js.native
    
    def Error(): js.Error = js.native
    @JSName("Error")
    var Error_Original: js.Function0[js.Error] with StackTraceLimit = js.native
    
    def EvalError(): js.EvalError = js.native
    @JSName("EvalError")
    var EvalError_Original: js.Function0[js.EvalError] = js.native
    
    var Float32Array: Float32ArrayConstructor = js.native
    
    var Float64Array: Float64ArrayConstructor = js.native
    
    def Function(args: String*): js.Function = js.native
    @JSName("Function")
    var Function_Original: js.Function1[/* repeated */ String, js.Function] = js.native
    
    var Infinity: Double = js.native
    
    var Int16Array: Int16ArrayConstructor = js.native
    
    var Int32Array: Int32ArrayConstructor = js.native
    
    var Int8Array: Int8ArrayConstructor = js.native
    
    var Intl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any = js.native
    
    var JSON: typingsSlinky.std.JSON = js.native
    
    var Map: MapConstructor = js.native
    
    var Math: typingsSlinky.std.Math = js.native
    
    var NaN: Double = js.native
    
    def Number(): Double = js.native
    @JSName("Number")
    var Number_Original: js.Function0[Double] = js.native
    
    def Object(): js.Any = js.native
    @JSName("Object")
    var Object_Original: js.Function0[_] = js.native
    
    var Promise: PromiseConstructor = js.native
    
    def RangeError(): js.RangeError = js.native
    @JSName("RangeError")
    var RangeError_Original: js.Function0[js.RangeError] = js.native
    
    def ReferenceError(): js.ReferenceError = js.native
    @JSName("ReferenceError")
    var ReferenceError_Original: js.Function0[js.ReferenceError] = js.native
    
    def RegExp(pattern: js.RegExp): js.RegExp = js.native
    @JSName("RegExp")
    var RegExp_Original: js.Function1[/* pattern */ js.RegExp, js.RegExp] = js.native
    
    var Set: SetConstructor = js.native
    
    def String(): java.lang.String = js.native
    @JSName("String")
    var String_Original: js.Function0[String] = js.native
    
    var Symbol: js.Function = js.native
    
    def SyntaxError(): js.SyntaxError = js.native
    @JSName("SyntaxError")
    var SyntaxError_Original: js.Function0[js.SyntaxError] = js.native
    
    def TypeError(): js.TypeError = js.native
    @JSName("TypeError")
    var TypeError_Original: js.Function0[js.TypeError] = js.native
    
    def URIError(): js.URIError = js.native
    @JSName("URIError")
    var URIError_Original: js.Function0[js.URIError] = js.native
    
    var Uint16Array: Uint16ArrayConstructor = js.native
    
    var Uint32Array: Uint32ArrayConstructor = js.native
    
    var Uint8Array: Uint8ArrayConstructor = js.native
    
    var Uint8ClampedArray: Uint8ClampedArrayConstructor = js.native
    
    var WeakMap: WeakMapConstructor = js.native
    
    var WeakSet: WeakSetConstructor = js.native
    
    var __coverage__ : CoverageMapData = js.native
    
    /**
      * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
      * 
      * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
      * 
      * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
      * 
      * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
      * 
      * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
      * 
      * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
      */
    def addEventListener(`type`: String): Unit = js.native
    def addEventListener(`type`: String, listener: Null, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureChange(`type`: MSGestureChange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureChange(
      `type`: MSGestureChange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureChange(
      `type`: MSGestureChange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureDoubleTap(`type`: MSGestureDoubleTap, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureDoubleTap(
      `type`: MSGestureDoubleTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureDoubleTap(
      `type`: MSGestureDoubleTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureEnd(`type`: MSGestureEnd, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureEnd(
      `type`: MSGestureEnd,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureEnd(
      `type`: MSGestureEnd,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureHold(`type`: MSGestureHold, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureHold(
      `type`: MSGestureHold,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureHold(
      `type`: MSGestureHold,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureStart(`type`: MSGestureStart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureStart(
      `type`: MSGestureStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureStart(
      `type`: MSGestureStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureTap(`type`: MSGestureTap, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureTap(
      `type`: MSGestureTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSGestureTap(
      `type`: MSGestureTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSInertiaStart(`type`: MSInertiaStart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSInertiaStart(
      `type`: MSInertiaStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSInertiaStart(
      `type`: MSInertiaStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerCancel(`type`: MSPointerCancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerCancel(
      `type`: MSPointerCancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerCancel(
      `type`: MSPointerCancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerDown(`type`: MSPointerDown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerDown(
      `type`: MSPointerDown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerDown(
      `type`: MSPointerDown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerEnter(`type`: MSPointerEnter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerEnter(
      `type`: MSPointerEnter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerEnter(
      `type`: MSPointerEnter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerLeave(`type`: MSPointerLeave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerLeave(
      `type`: MSPointerLeave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerLeave(
      `type`: MSPointerLeave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerMove(`type`: MSPointerMove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerMove(
      `type`: MSPointerMove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerMove(
      `type`: MSPointerMove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerOut(`type`: MSPointerOut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerOut(
      `type`: MSPointerOut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerOut(
      `type`: MSPointerOut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerOver(`type`: MSPointerOver, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerOver(
      `type`: MSPointerOver,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerOver(
      `type`: MSPointerOver,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerUp(`type`: MSPointerUp, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerUp(
      `type`: MSPointerUp,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_MSPointerUp(
      `type`: MSPointerUp,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_afterprint(`type`: afterprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_afterprint(
      `type`: afterprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_afterprint(
      `type`: afterprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(`type`: animationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeprint(`type`: beforeprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeprint(
      `type`: beforeprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeprint(
      `type`: beforeprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeunload(
      `type`: beforeunload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeunload(
      `type`: beforeunload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeunload(
      `type`: beforeunload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compassneedscalibration(
      `type`: compassneedscalibration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compassneedscalibration(
      `type`: compassneedscalibration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compassneedscalibration(
      `type`: compassneedscalibration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_devicelight(
      `type`: devicelight,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_devicelight(
      `type`: devicelight,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_devicelight(
      `type`: devicelight,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_devicemotion(
      `type`: devicemotion,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_devicemotion(
      `type`: devicemotion,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_devicemotion(
      `type`: devicemotion,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_deviceorientation(
      `type`: deviceorientation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_deviceorientation(
      `type`: deviceorientation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_deviceorientation(
      `type`: deviceorientation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_deviceorientationabsolute(
      `type`: deviceorientationabsolute,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_deviceorientationabsolute(
      `type`: deviceorientationabsolute,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_deviceorientationabsolute(
      `type`: deviceorientationabsolute,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragexit(`type`: dragexit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_hashchange(`type`: hashchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_hashchange(
      `type`: hashchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_hashchange(
      `type`: hashchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_languagechange(`type`: languagechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_languagechange(
      `type`: languagechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_languagechange(
      `type`: languagechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_messageerror(`type`: messageerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousewheel(`type`: mousewheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousewheel(
      `type`: mousewheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousewheel(
      `type`: mousewheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_offline(`type`: offline, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_offline(
      `type`: offline,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_offline(
      `type`: offline,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_online(`type`: online, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_online(
      `type`: online,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_online(
      `type`: online,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_orientationchange(`type`: orientationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_orientationchange(
      `type`: orientationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_orientationchange(
      `type`: orientationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pagehide(
      `type`: pagehide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pagehide(
      `type`: pagehide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pagehide(
      `type`: pagehide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pageshow(
      `type`: pageshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pageshow(
      `type`: pageshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pageshow(
      `type`: pageshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(`type`: pointercancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_popstate(`type`: popstate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_popstate(
      `type`: popstate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_popstate(
      `type`: popstate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_rejectionhandled(
      `type`: rejectionhandled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_rejectionhandled(
      `type`: rejectionhandled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_rejectionhandled(
      `type`: rejectionhandled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_storage(`type`: storage, listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_storage(
      `type`: storage,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_storage(
      `type`: storage,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unhandledrejection(
      `type`: unhandledrejection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unhandledrejection(
      `type`: unhandledrejection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unhandledrejection(
      `type`: unhandledrejection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unload(`type`: unload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unload(
      `type`: unload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unload(
      `type`: unload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayactivate(`type`: vrdisplayactivate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayactivate(
      `type`: vrdisplayactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayactivate(
      `type`: vrdisplayactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayblur(`type`: vrdisplayblur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayblur(
      `type`: vrdisplayblur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayblur(
      `type`: vrdisplayblur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayconnect(`type`: vrdisplayconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayconnect(
      `type`: vrdisplayconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayconnect(
      `type`: vrdisplayconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaydeactivate(`type`: vrdisplaydeactivate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaydeactivate(
      `type`: vrdisplaydeactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaydeactivate(
      `type`: vrdisplaydeactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaydisconnect(`type`: vrdisplaydisconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaydisconnect(
      `type`: vrdisplaydisconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaydisconnect(
      `type`: vrdisplaydisconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayfocus(`type`: vrdisplayfocus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayfocus(
      `type`: vrdisplayfocus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplayfocus(
      `type`: vrdisplayfocus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypointerrestricted(
      `type`: vrdisplaypointerrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypointerrestricted(
      `type`: vrdisplaypointerrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypointerrestricted(
      `type`: vrdisplaypointerrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypointerunrestricted(
      `type`: vrdisplaypointerunrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypointerunrestricted(
      `type`: vrdisplaypointerunrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypointerunrestricted(
      `type`: vrdisplaypointerunrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypresentchange(
      `type`: vrdisplaypresentchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypresentchange(
      `type`: vrdisplaypresentchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_vrdisplaypresentchange(
      `type`: vrdisplaypresentchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    def afterAll(fn: HookFn): Unit = js.native
    def afterAll(fn: HookFn, timeout: Double): Unit = js.native
    @JSName("afterAll")
    var afterAll_Original: HookBase = js.native
    
    def afterEach(fn: HookFn): Unit = js.native
    def afterEach(fn: HookFn, timeout: Double): Unit = js.native
    @JSName("afterEach")
    var afterEach_Original: HookBase = js.native
    
    def alert(): Unit = js.native
    def alert(message: js.Any): Unit = js.native
    
    val applicationCache: ApplicationCache = js.native
    
    def atob(data: String): String = js.native
    
    def beforeAll(fn: HookFn): Unit = js.native
    def beforeAll(fn: HookFn, timeout: Double): Unit = js.native
    @JSName("beforeAll")
    var beforeAll_Original: HookBase = js.native
    
    def beforeEach(fn: HookFn): Unit = js.native
    def beforeEach(fn: HookFn, timeout: Double): Unit = js.native
    @JSName("beforeEach")
    var beforeEach_Original: HookBase = js.native
    
    def blur(): Unit = js.native
    
    def btoa(data: String): String = js.native
    
    val caches: CacheStorage = js.native
    
    def cancelAnimationFrame(handle: Double): Unit = js.native
    
    /** @deprecated */
    def captureEvents(): Unit = js.native
    
    def clearImmediate(immediateId: Immediate): Unit = js.native
    @JSName("clearImmediate")
    var clearImmediate_Original: js.Function1[/* immediateId */ Immediate, Unit] = js.native
    
    def clearInterval(): Unit = js.native
    def clearInterval(handle: Double): Unit = js.native
    def clearInterval(intervalId: Timeout): Unit = js.native
    @JSName("clearInterval")
    var clearInterval_Original: js.Function1[/* intervalId */ Timeout, Unit] = js.native
    
    def clearTimeout(): Unit = js.native
    def clearTimeout(handle: Double): Unit = js.native
    def clearTimeout(timeoutId: Timeout): Unit = js.native
    @JSName("clearTimeout")
    var clearTimeout_Original: js.Function1[/* timeoutId */ Timeout, Unit] = js.native
    
    val clientInformation: Navigator = js.native
    
    def close(): Unit = js.native
    
    val closed: Boolean = js.native
    
    def confirm(): Boolean = js.native
    def confirm(message: String): Boolean = js.native
    
    def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
    def createImageBitmap(image: ImageBitmapSource, options: ImageBitmapOptions): js.Promise[ImageBitmap] = js.native
    def createImageBitmap(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = js.native
    def createImageBitmap(
      image: ImageBitmapSource,
      sx: Double,
      sy: Double,
      sw: Double,
      sh: Double,
      options: ImageBitmapOptions
    ): js.Promise[ImageBitmap] = js.native
    
    val crypto: Crypto = js.native
    
    var customElements: CustomElementRegistry = js.native
    
    def decodeURI(encodedURI: String): String = js.native
    
    def decodeURIComponent(encodedURIComponent: String): String = js.native
    @JSName("decodeURIComponent")
    var decodeURIComponent_Original: js.Function1[/* encodedURIComponent */ String, String] = js.native
    
    @JSName("decodeURI")
    var decodeURI_Original: js.Function1[/* encodedURI */ String, String] = js.native
    
    var defaultStatus: String = js.native
    
    def departFocus(navigationReason: NavigationReason, origin: FocusNavigationOrigin): Unit = js.native
    
    def describe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
    @JSName("describe")
    var describe_Original: Describe = js.native
    
    val devicePixelRatio: Double = js.native
    
    /**
      * Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise.
      */
    def dispatchEvent(event: Event): Boolean = js.native
    
    val doNotTrack: String = js.native
    
    val document: Document = js.native
    
    def encodeURI(uri: String): String = js.native
    
    def encodeURIComponent(uriComponent: Boolean): String = js.native
    @JSName("encodeURIComponent")
    var encodeURIComponent_Original: js.Function1[/* uriComponent */ Boolean, String] = js.native
    
    @JSName("encodeURI")
    var encodeURI_Original: js.Function1[/* uri */ String, String] = js.native
    
    def escape(str: String): String = js.native
    @JSName("escape")
    var escape_Original: js.Function1[/* str */ String, String] = js.native
    
    def eval(x: String): js.Any = js.native
    @JSName("eval")
    var eval_Original: js.Function1[/* x */ String, _] = js.native
    
    /** @deprecated */
    val event: js.UndefOr[Event] = js.native
    
    /** @deprecated */
    val external: External = js.native
    
    def fail(): Unit = js.native
    
    def fdescribe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
    @JSName("fdescribe")
    var fdescribe_Original: DescribeBase = js.native
    
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    
    def fit(testName: TestName, fn: TestFn): Unit = js.native
    def fit(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("fit")
    var fit_Original: ItBaseconcurrentItConcurr = js.native
    
    def focus(): Unit = js.native
    
    val frameElement: Element = js.native
    
    val frames: Window = js.native
    
    def gc(): Unit = js.native
    @JSName("gc")
    var gc_Original: js.Function0[Unit] = js.native
    
    def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
    def getComputedStyle(elt: Element, pseudoElt: String): CSSStyleDeclaration = js.native
    
    def getMatchedCSSRules(elt: Element): CSSRuleList = js.native
    def getMatchedCSSRules(elt: Element, pseudoElt: String): CSSRuleList = js.native
    
    def getSelection(): Selection | Null = js.native
    
    var global: Global = js.native
    
    val history: History = js.native
    
    val indexedDB: IDBFactory = js.native
    
    val innerHeight: Double = js.native
    
    val innerWidth: Double = js.native
    
    def isFinite(number: Double): Boolean = js.native
    @JSName("isFinite")
    var isFinite_Original: js.Function1[/* number */ Double, Boolean] = js.native
    
    def isNaN(number: Double): Boolean = js.native
    @JSName("isNaN")
    var isNaN_Original: js.Function1[/* number */ Double, Boolean] = js.native
    
    val isSecureContext: Boolean = js.native
    
    def it(testName: TestName, fn: TestFn): Unit = js.native
    def it(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("it")
    var it_Original: ItConcurrent = js.native
    
    var jasmine: Jasmine = js.native
    
    val length: Double = js.native
    
    val localStorage: Storage = js.native
    
    var location: Location = js.native
    
    val locationbar: BarProp = js.native
    
    def matchMedia(query: String): MediaQueryList = js.native
    
    val menubar: BarProp = js.native
    
    def moveBy(x: Double, y: Double): Unit = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    val msContentScript: ExtensionScriptApis = js.native
    
    def msWriteProfilerMark(profilerMarkName: String): Unit = js.native
    
    var name: String = js.native
    
    val navigator: Navigator = js.native
    
    var offscreenBuffering: String | Boolean = js.native
    
    /**
      * Fires when the user aborts the download.
      * @param ev The event.
      */
    var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null = js.native
    
    var onafterprint: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onanimationcancel: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onanimationend: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onanimationiteration: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onanimationstart: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onauxclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onbeforeprint: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onbeforeunload: (js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]) | Null = js.native
    
    /**
      * Fires when the object loses the input focus.
      * @param ev The focus event.
      */
    var onblur: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null = js.native
    
    var oncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when playback is possible, but would require further buffering.
      * @param ev The event.
      */
    var oncanplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var oncanplaythrough: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the contents of the object or selection have changed.
      * @param ev The event.
      */
    var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user clicks the left mouse button on the object
      * @param ev The mouse event.
      */
    var onclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var oncompassneedscalibration: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user clicks the right mouse button in the client area, opening the context menu.
      * @param ev The mouse event.
      */
    var oncontextmenu: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var oncuechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user double-clicks the object.
      * @param ev The mouse event.
      */
    var ondblclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var ondevicelight: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _]) | Null = js.native
    
    var ondevicemotion: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _]) | Null = js.native
    
    var ondeviceorientation: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]) | Null = js.native
    
    var ondeviceorientationabsolute: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]) | Null = js.native
    
    /**
      * Fires on the source object continuously during a drag operation.
      * @param ev The event.
      */
    var ondrag: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the source object when the user releases the mouse at the close of a drag operation.
      * @param ev The event.
      */
    var ondragend: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the target element when the user drags the object to a valid drop target.
      * @param ev The drag event.
      */
    var ondragenter: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    var ondragexit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
      * @param ev The drag event.
      */
    var ondragleave: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the target element continuously while the user drags the object over a valid drop target.
      * @param ev The event.
      */
    var ondragover: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the source object when the user starts to drag a text selection or selected object.
      * @param ev The event.
      */
    var ondragstart: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    var ondrop: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Occurs when the duration attribute is updated.
      * @param ev The event.
      */
    var ondurationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the media element is reset to its initial state.
      * @param ev The event.
      */
    var onemptied: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the end of playback is reached.
      * @param ev The event
      */
    var onended: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when an error occurs during object loading.
      * @param ev The event.
      */
    var onerror: OnErrorEventHandler = js.native
    
    /**
      * Fires when the object receives focus.
      * @param ev The event.
      */
    var onfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null = js.native
    
    var ongotpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onhashchange: (js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]) | Null = js.native
    
    var oninput: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var oninvalid: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user presses a key.
      * @param ev The keyboard event
      */
    var onkeydown: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null = js.native
    
    /**
      * Fires when the user presses an alphanumeric key.
      * @param ev The event.
      */
    var onkeypress: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null = js.native
    
    /**
      * Fires when the user releases a key.
      * @param ev The keyboard event
      */
    var onkeyup: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null = js.native
    
    var onlanguagechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires immediately after the browser loads the object.
      * @param ev The event.
      */
    var onload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when media data is loaded at the current playback position.
      * @param ev The event.
      */
    var onloadeddata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the duration and dimensions of the media have been determined.
      * @param ev The event.
      */
    var onloadedmetadata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when Internet Explorer begins looking for media data.
      * @param ev The event.
      */
    var onloadstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onlostpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]) | Null = js.native
    
    var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]) | Null = js.native
    
    /**
      * Fires when the user clicks the object with either mouse button.
      * @param ev The mouse event.
      */
    var onmousedown: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onmouseenter: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onmouseleave: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user moves the mouse over the object.
      * @param ev The mouse event.
      */
    var onmousemove: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user moves the mouse pointer outside the boundaries of the object.
      * @param ev The mouse event.
      */
    var onmouseout: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user moves the mouse pointer into the object.
      * @param ev The mouse event.
      */
    var onmouseover: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user releases a mouse button while the mouse is over the object.
      * @param ev The mouse event.
      */
    var onmouseup: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onmousewheel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmsgesturechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmsgesturedoubletap: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmsgestureend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmsgesturehold: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmsgesturestart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmsgesturetap: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmsinertiastart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointercancel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointerdown: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointerenter: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointerleave: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointermove: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointerout: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointerover: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onmspointerup: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onoffline: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var ononline: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /** @deprecated */
    var onorientationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onpagehide: (js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]) | Null = js.native
    
    var onpageshow: (js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]) | Null = js.native
    
    /**
      * Occurs when playback is paused.
      * @param ev The event.
      */
    var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the play method is requested.
      * @param ev The event.
      */
    var onplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the audio or video has started playing.
      * @param ev The event.
      */
    var onplaying: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onpointercancel: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerdown: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerenter: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerleave: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointermove: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerout: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerover: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerup: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpopstate: (js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]) | Null = js.native
    
    /**
      * Occurs to indicate progress while downloading media data.
      * @param ev The event.
      */
    var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | Null = js.native
    
    /**
      * Occurs when the playback rate is increased or decreased.
      * @param ev The event.
      */
    var onratechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | Null = js.native
    
    var onrejectionhandled: (js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]) | Null = js.native
    
    /**
      * Fires when the user resets a form.
      * @param ev The event.
      */
    var onreset: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onresize: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null = js.native
    
    /**
      * Fires when the user repositions the scroll box in the scroll bar on the object.
      * @param ev The event.
      */
    var onscroll: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onsecuritypolicyviolation: (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]) | Null = js.native
    
    /**
      * Occurs when the seek operation ends.
      * @param ev The event.
      */
    var onseeked: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the current playback position is moved.
      * @param ev The event.
      */
    var onseeking: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the current selection changes.
      * @param ev The event.
      */
    var onselect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onselectionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onselectstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the download has stopped.
      * @param ev The event.
      */
    var onstalled: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onstorage: (js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]) | Null = js.native
    
    var onsubmit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs if the load operation has been intentionally halted.
      * @param ev The event.
      */
    var onsuspend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs to indicate the current playback position.
      * @param ev The event.
      */
    var ontimeupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var ontoggle: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var ontouchcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontouchend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontouchmove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontouchstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontransitioncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    var ontransitionend: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    var ontransitionrun: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    var ontransitionstart: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    var onunhandledrejection: (js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]) | Null = js.native
    
    var onunload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the volume is changed, or playback is muted or unmuted.
      * @param ev The event.
      */
    var onvolumechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplayactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplayblur: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplayconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplaydeactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplaydisconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplayfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplaypointerrestricted: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplaypointerunrestricted: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when playback stops because the next frame of a video resource is not available.
      * @param ev The event.
      */
    var onwaiting: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onwheel: (js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]) | Null = js.native
    
    def open(): Window | Null = js.native
    def open(
      url: js.UndefOr[scala.Nothing],
      target: js.UndefOr[scala.Nothing],
      features: js.UndefOr[scala.Nothing],
      replace: Boolean
    ): Window | Null = js.native
    def open(url: js.UndefOr[scala.Nothing], target: js.UndefOr[scala.Nothing], features: String): Window | Null = js.native
    def open(
      url: js.UndefOr[scala.Nothing],
      target: js.UndefOr[scala.Nothing],
      features: String,
      replace: Boolean
    ): Window | Null = js.native
    def open(url: js.UndefOr[scala.Nothing], target: String): Window | Null = js.native
    def open(
      url: js.UndefOr[scala.Nothing],
      target: String,
      features: js.UndefOr[scala.Nothing],
      replace: Boolean
    ): Window | Null = js.native
    def open(url: js.UndefOr[scala.Nothing], target: String, features: String): Window | Null = js.native
    def open(url: js.UndefOr[scala.Nothing], target: String, features: String, replace: Boolean): Window | Null = js.native
    def open(url: String): Window | Null = js.native
    def open(
      url: String,
      target: js.UndefOr[scala.Nothing],
      features: js.UndefOr[scala.Nothing],
      replace: Boolean
    ): Window | Null = js.native
    def open(url: String, target: js.UndefOr[scala.Nothing], features: String): Window | Null = js.native
    def open(url: String, target: js.UndefOr[scala.Nothing], features: String, replace: Boolean): Window | Null = js.native
    def open(url: String, target: String): Window | Null = js.native
    def open(url: String, target: String, features: js.UndefOr[scala.Nothing], replace: Boolean): Window | Null = js.native
    def open(url: String, target: String, features: String): Window | Null = js.native
    def open(url: String, target: String, features: String, replace: Boolean): Window | Null = js.native
    
    var opener: js.Any = js.native
    
    /** @deprecated */
    val orientation: String | Double = js.native
    
    val origin: String = js.native
    
    val outerHeight: Double = js.native
    
    val outerWidth: Double = js.native
    
    val pageXOffset: Double = js.native
    
    val pageYOffset: Double = js.native
    
    val parent: Window = js.native
    
    def parseFloat(string: String): Double = js.native
    @JSName("parseFloat")
    var parseFloat_Original: js.Function1[/* string */ String, Double] = js.native
    
    def parseInt(s: String, radix: Double): Double = js.native
    @JSName("parseInt")
    var parseInt_Original: js.Function2[/* s */ String, /* radix */ Double, Double] = js.native
    
    def pending(): Unit = js.native
    
    val performance: Performance = js.native
    
    val personalbar: BarProp = js.native
    
    def postMessage(message: js.Any, targetOrigin: String): Unit = js.native
    def postMessage(message: js.Any, targetOrigin: String, transfer: js.Array[Transferable]): Unit = js.native
    
    def print(): Unit = js.native
    
    def prompt(): String | Null = js.native
    def prompt(message: js.UndefOr[scala.Nothing], _default: String): String | Null = js.native
    def prompt(message: String): String | Null = js.native
    def prompt(message: String, _default: String): String | Null = js.native
    
    def queueMicrotask(callback: js.Function0[Unit] | VoidFunction): Unit = js.native
    @JSName("queueMicrotask")
    var queueMicrotask_Original: js.Function1[/* callback */ js.Function0[Unit], Unit] = js.native
    
    /** @deprecated */
    def releaseEvents(): Unit = js.native
    
    /**
      * Removes the event listener in target's event listener list with the same type, callback, and options.
      */
    def removeEventListener(`type`: String): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureChange(`type`: MSGestureChange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureChange(
      `type`: MSGestureChange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureChange(
      `type`: MSGestureChange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureDoubleTap(`type`: MSGestureDoubleTap, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureDoubleTap(
      `type`: MSGestureDoubleTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureDoubleTap(
      `type`: MSGestureDoubleTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureEnd(`type`: MSGestureEnd, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureEnd(
      `type`: MSGestureEnd,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureEnd(
      `type`: MSGestureEnd,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureHold(`type`: MSGestureHold, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureHold(
      `type`: MSGestureHold,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureHold(
      `type`: MSGestureHold,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureStart(`type`: MSGestureStart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureStart(
      `type`: MSGestureStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureStart(
      `type`: MSGestureStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureTap(`type`: MSGestureTap, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureTap(
      `type`: MSGestureTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSGestureTap(
      `type`: MSGestureTap,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSInertiaStart(`type`: MSInertiaStart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSInertiaStart(
      `type`: MSInertiaStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSInertiaStart(
      `type`: MSInertiaStart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerCancel(`type`: MSPointerCancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerCancel(
      `type`: MSPointerCancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerCancel(
      `type`: MSPointerCancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerDown(`type`: MSPointerDown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerDown(
      `type`: MSPointerDown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerDown(
      `type`: MSPointerDown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerEnter(`type`: MSPointerEnter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerEnter(
      `type`: MSPointerEnter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerEnter(
      `type`: MSPointerEnter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerLeave(`type`: MSPointerLeave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerLeave(
      `type`: MSPointerLeave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerLeave(
      `type`: MSPointerLeave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerMove(`type`: MSPointerMove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerMove(
      `type`: MSPointerMove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerMove(
      `type`: MSPointerMove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerOut(`type`: MSPointerOut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerOut(
      `type`: MSPointerOut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerOut(
      `type`: MSPointerOut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerOver(`type`: MSPointerOver, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerOver(
      `type`: MSPointerOver,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerOver(
      `type`: MSPointerOver,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerUp(`type`: MSPointerUp, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerUp(
      `type`: MSPointerUp,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_MSPointerUp(
      `type`: MSPointerUp,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_afterprint(`type`: afterprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_afterprint(
      `type`: afterprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_afterprint(
      `type`: afterprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(`type`: animationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeprint(`type`: beforeprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeprint(
      `type`: beforeprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeprint(
      `type`: beforeprint,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeunload(
      `type`: beforeunload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeunload(
      `type`: beforeunload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeunload(
      `type`: beforeunload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compassneedscalibration(
      `type`: compassneedscalibration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compassneedscalibration(
      `type`: compassneedscalibration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compassneedscalibration(
      `type`: compassneedscalibration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_devicelight(
      `type`: devicelight,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_devicelight(
      `type`: devicelight,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_devicelight(
      `type`: devicelight,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_devicemotion(
      `type`: devicemotion,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_devicemotion(
      `type`: devicemotion,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_devicemotion(
      `type`: devicemotion,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_deviceorientation(
      `type`: deviceorientation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_deviceorientation(
      `type`: deviceorientation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_deviceorientation(
      `type`: deviceorientation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_deviceorientationabsolute(
      `type`: deviceorientationabsolute,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_deviceorientationabsolute(
      `type`: deviceorientationabsolute,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_deviceorientationabsolute(
      `type`: deviceorientationabsolute,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragexit(`type`: dragexit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_hashchange(`type`: hashchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_hashchange(
      `type`: hashchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_hashchange(
      `type`: hashchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_languagechange(`type`: languagechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_languagechange(
      `type`: languagechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_languagechange(
      `type`: languagechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_messageerror(`type`: messageerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_messageerror(
      `type`: messageerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousewheel(`type`: mousewheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousewheel(
      `type`: mousewheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousewheel(
      `type`: mousewheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_offline(`type`: offline, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_offline(
      `type`: offline,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_offline(
      `type`: offline,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_online(`type`: online, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_online(
      `type`: online,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_online(
      `type`: online,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_orientationchange(`type`: orientationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_orientationchange(
      `type`: orientationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_orientationchange(
      `type`: orientationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pagehide(
      `type`: pagehide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pagehide(
      `type`: pagehide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pagehide(
      `type`: pagehide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pageshow(
      `type`: pageshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pageshow(
      `type`: pageshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pageshow(
      `type`: pageshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(`type`: pointercancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_popstate(`type`: popstate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_popstate(
      `type`: popstate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_popstate(
      `type`: popstate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_rejectionhandled(
      `type`: rejectionhandled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_rejectionhandled(
      `type`: rejectionhandled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_rejectionhandled(
      `type`: rejectionhandled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_storage(`type`: storage, listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_storage(
      `type`: storage,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_storage(
      `type`: storage,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unhandledrejection(
      `type`: unhandledrejection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unhandledrejection(
      `type`: unhandledrejection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unhandledrejection(
      `type`: unhandledrejection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unload(`type`: unload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unload(
      `type`: unload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unload(
      `type`: unload,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayactivate(`type`: vrdisplayactivate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayactivate(
      `type`: vrdisplayactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayactivate(
      `type`: vrdisplayactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayblur(`type`: vrdisplayblur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayblur(
      `type`: vrdisplayblur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayblur(
      `type`: vrdisplayblur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayconnect(`type`: vrdisplayconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayconnect(
      `type`: vrdisplayconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayconnect(
      `type`: vrdisplayconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaydeactivate(`type`: vrdisplaydeactivate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaydeactivate(
      `type`: vrdisplaydeactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaydeactivate(
      `type`: vrdisplaydeactivate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaydisconnect(`type`: vrdisplaydisconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaydisconnect(
      `type`: vrdisplaydisconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaydisconnect(
      `type`: vrdisplaydisconnect,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayfocus(`type`: vrdisplayfocus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayfocus(
      `type`: vrdisplayfocus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplayfocus(
      `type`: vrdisplayfocus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypointerrestricted(
      `type`: vrdisplaypointerrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypointerrestricted(
      `type`: vrdisplaypointerrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypointerrestricted(
      `type`: vrdisplaypointerrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypointerunrestricted(
      `type`: vrdisplaypointerunrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypointerunrestricted(
      `type`: vrdisplaypointerunrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypointerunrestricted(
      `type`: vrdisplaypointerunrestricted,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypresentchange(
      `type`: vrdisplaypresentchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypresentchange(
      `type`: vrdisplaypresentchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_vrdisplaypresentchange(
      `type`: vrdisplaypresentchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: Boolean
    ): Unit = js.native
    
    def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
    
    def resizeBy(x: Double, y: Double): Unit = js.native
    
    def resizeTo(width: Double, height: Double): Unit = js.native
    
    val screen: Screen = js.native
    
    val screenLeft: Double = js.native
    
    val screenTop: Double = js.native
    
    val screenX: Double = js.native
    
    val screenY: Double = js.native
    
    def scroll(): Unit = js.native
    def scroll(options: ScrollToOptions): Unit = js.native
    def scroll(x: Double, y: Double): Unit = js.native
    
    def scrollBy(): Unit = js.native
    def scrollBy(options: ScrollToOptions): Unit = js.native
    def scrollBy(x: Double, y: Double): Unit = js.native
    
    def scrollTo(): Unit = js.native
    def scrollTo(options: ScrollToOptions): Unit = js.native
    def scrollTo(x: Double, y: Double): Unit = js.native
    
    val scrollX: Double = js.native
    
    val scrollY: Double = js.native
    
    val scrollbars: BarProp = js.native
    
    val self: Window with (/* globalThis */ js.Any) = js.native
    
    val sessionStorage: Storage = js.native
    
    def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
    @JSName("setImmediate")
    var setImmediate_Original: js.Function2[
        /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
        /* repeated */ js.Any, 
        Immediate
      ] = js.native
    
    def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
    def setInterval(handler: TimerHandler, timeout: js.UndefOr[scala.Nothing], arguments: js.Any*): Double = js.native
    def setInterval(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
    @JSName("setInterval")
    var setInterval_Original: js.Function3[
        /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
        /* ms */ Double, 
        /* repeated */ js.Any, 
        Timeout
      ] = js.native
    
    def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
    def setTimeout(handler: TimerHandler, timeout: js.UndefOr[scala.Nothing], arguments: js.Any*): Double = js.native
    def setTimeout(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
    @JSName("setTimeout")
    var setTimeout_Original: js.Function3[
        /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
        /* ms */ Double, 
        /* repeated */ js.Any, 
        Timeout
      ] = js.native
    
    val speechSynthesis: SpeechSynthesis = js.native
    
    def spyOn(): Unit = js.native
    
    def spyOnProperty(): Unit = js.native
    
    var status: String = js.native
    
    val statusbar: BarProp = js.native
    
    def stop(): Unit = js.native
    
    val styleMedia: StyleMedia = js.native
    
    def test(testName: TestName, fn: TestFn): Unit = js.native
    def test(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("test")
    var test_Original: ItConcurrent = js.native
    
    val toolbar: BarProp = js.native
    
    val top: Window = js.native
    
    var undefined: js.UndefOr[scala.Nothing] = js.native
    
    def unescape(str: String): String = js.native
    @JSName("unescape")
    var unescape_Original: js.Function1[/* str */ String, String] = js.native
    
    var v8debug: js.UndefOr[js.Any] = js.native
    
    val visualViewport: VisualViewport = js.native
    
    def webkitCancelAnimationFrame(handle: Double): Unit = js.native
    
    def webkitConvertPointFromNodeToPage(node: Node, pt: WebKitPoint): WebKitPoint = js.native
    
    def webkitConvertPointFromPageToNode(node: Node, pt: WebKitPoint): WebKitPoint = js.native
    
    def webkitRequestAnimationFrame(callback: FrameRequestCallback): Double = js.native
    
    val window: Window with (/* globalThis */ js.Any) = js.native
    
    def xdescribe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
    @JSName("xdescribe")
    var xdescribe_Original: DescribeBase = js.native
    
    def xit(testName: TestName, fn: TestFn): Unit = js.native
    def xit(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("xit")
    var xit_Original: ItBase = js.native
    
    def xtest(testName: TestName, fn: TestFn): Unit = js.native
    def xtest(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("xtest")
    var xtest_Original: ItBase = js.native
  }
}

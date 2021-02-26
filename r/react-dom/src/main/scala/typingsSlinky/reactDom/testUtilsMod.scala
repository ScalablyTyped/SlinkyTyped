package typingsSlinky.reactDom

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.DataTransfer
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TouchList
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.AbstractView
import typingsSlinky.react.mod.CElement
import typingsSlinky.react.mod.ClassType
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.mod.DOMElement
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.react.mod.SFCElement
import typingsSlinky.reactDom.anon.TypeofReactTestUtils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsMod {
  
  object Simulate {
    
    @JSImport("react-dom/test-utils", "Simulate.abort")
    @js.native
    val abort: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.animationEnd")
    @js.native
    val animationEnd: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.animationIteration")
    @js.native
    val animationIteration: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.animationStart")
    @js.native
    val animationStart: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.blur")
    @js.native
    val blur: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.canPlay")
    @js.native
    val canPlay: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.canPlayThrough")
    @js.native
    val canPlayThrough: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.change")
    @js.native
    val change: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.click")
    @js.native
    val click: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.compositionEnd")
    @js.native
    val compositionEnd: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.compositionStart")
    @js.native
    val compositionStart: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.compositionUpdate")
    @js.native
    val compositionUpdate: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.contextMenu")
    @js.native
    val contextMenu: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.copy")
    @js.native
    val copy: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.cut")
    @js.native
    val cut: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.doubleClick")
    @js.native
    val doubleClick: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.drag")
    @js.native
    val drag: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.dragEnd")
    @js.native
    val dragEnd: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.dragEnter")
    @js.native
    val dragEnter: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.dragExit")
    @js.native
    val dragExit: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.dragLeave")
    @js.native
    val dragLeave: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.dragOver")
    @js.native
    val dragOver: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.dragStart")
    @js.native
    val dragStart: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.drop")
    @js.native
    val drop: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.durationChange")
    @js.native
    val durationChange: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.emptied")
    @js.native
    val emptied: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.encrypted")
    @js.native
    val encrypted: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.ended")
    @js.native
    val ended: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.error")
    @js.native
    val error: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.focus")
    @js.native
    val focus: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.input")
    @js.native
    val input: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.invalid")
    @js.native
    val invalid: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.keyDown")
    @js.native
    val keyDown: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.keyPress")
    @js.native
    val keyPress: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.keyUp")
    @js.native
    val keyUp: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.load")
    @js.native
    val load: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.loadStart")
    @js.native
    val loadStart: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.loadedData")
    @js.native
    val loadedData: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.loadedMetadata")
    @js.native
    val loadedMetadata: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.mouseDown")
    @js.native
    val mouseDown: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.mouseEnter")
    @js.native
    val mouseEnter: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.mouseLeave")
    @js.native
    val mouseLeave: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.mouseMove")
    @js.native
    val mouseMove: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.mouseOut")
    @js.native
    val mouseOut: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.mouseOver")
    @js.native
    val mouseOver: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.mouseUp")
    @js.native
    val mouseUp: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.paste")
    @js.native
    val paste: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.pause")
    @js.native
    val pause: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.play")
    @js.native
    val play: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.playing")
    @js.native
    val playing: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.progress")
    @js.native
    val progress: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.rateChange")
    @js.native
    val rateChange: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.scroll")
    @js.native
    val scroll: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.seeked")
    @js.native
    val seeked: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.seeking")
    @js.native
    val seeking: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.select")
    @js.native
    val select: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.stalled")
    @js.native
    val stalled: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.submit")
    @js.native
    val submit: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.suspend")
    @js.native
    val suspend: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.timeUpdate")
    @js.native
    val timeUpdate: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.touchCancel")
    @js.native
    val touchCancel: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.touchEnd")
    @js.native
    val touchEnd: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.touchMove")
    @js.native
    val touchMove: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.touchStart")
    @js.native
    val touchStart: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.transitionEnd")
    @js.native
    val transitionEnd: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.volumeChange")
    @js.native
    val volumeChange: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.waiting")
    @js.native
    val waiting: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.wheel")
    @js.native
    val wheel: EventSimulator = js.native
  }
  
  @JSImport("react-dom/test-utils", "act")
  @js.native
  def act(callback: js.Function0[js.UndefOr[Unit]]): Unit = js.native
  @JSImport("react-dom/test-utils", "act")
  @js.native
  def act_Promise(callback: js.Function0[js.Promise[js.UndefOr[Unit]]]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  
  @JSImport("react-dom/test-utils", "createRenderer")
  @js.native
  def createRenderer(): ShallowRenderer = js.native
  
  @JSImport("react-dom/test-utils", "findAllInRenderedTree")
  @js.native
  def findAllInRenderedTree(root: ReactComponentClass[_], fn: js.Function1[/* i */ ReactInstance, Boolean]): js.Array[ReactInstance] = js.native
  
  @JSImport("react-dom/test-utils", "findRenderedComponentWithType")
  @js.native
  def findRenderedComponentWithType[T /* <: ReactComponentClass[_] */, C /* <: ReactComponentClass[_] */](root: ReactComponentClass[_], `type`: ClassType[_, T, C]): T = js.native
  
  @JSImport("react-dom/test-utils", "findRenderedDOMComponentWithClass")
  @js.native
  def findRenderedDOMComponentWithClass(root: ReactComponentClass[_], className: String): Element = js.native
  
  @JSImport("react-dom/test-utils", "findRenderedDOMComponentWithTag")
  @js.native
  def findRenderedDOMComponentWithTag(root: ReactComponentClass[_], tagName: String): Element = js.native
  
  @JSImport("react-dom/test-utils", "isCompositeComponent")
  @js.native
  def isCompositeComponent(instance: ReactInstance): /* is react.react.Component<any, {}, any> */ Boolean = js.native
  
  @JSImport("react-dom/test-utils", "isCompositeComponentWithType")
  @js.native
  def isCompositeComponentWithType[T /* <: ReactComponentClass[_] */, C /* <: ReactComponentClass[_] */](instance: ReactInstance, `type`: ClassType[_, T, C]): Boolean = js.native
  
  @JSImport("react-dom/test-utils", "isDOMComponent")
  @js.native
  def isDOMComponent(instance: ReactInstance): /* is std.Element */ Boolean = js.native
  
  @JSImport("react-dom/test-utils", "isElement")
  @js.native
  def isElement(element: js.Any): Boolean = js.native
  
  @JSImport("react-dom/test-utils", "isElementOfType")
  @js.native
  def isElementOfType[T /* <: HTMLElement */](element: ReactElement, `type`: String): /* is react.react.ReactHTMLElement<T> */ Boolean = js.native
  @JSImport("react-dom/test-utils", "isElementOfType")
  @js.native
  def isElementOfType[P](element: ReactElement, `type`: ReactComponentClass[P]): /* is react.react.SFCElement<P> */ Boolean = js.native
  @JSImport("react-dom/test-utils", "isElementOfType")
  @js.native
  def isElementOfType[P, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](element: ReactElement, `type`: ClassType[P, T, C]): /* is react.react.CElement<P, T> */ Boolean = js.native
  @JSImport("react-dom/test-utils", "isElementOfType")
  @js.native
  def isElementOfType_P_DOMAttributesObjectT_Element[P /* <: DOMAttributes[js.Object] */, T /* <: Element */](element: ReactElement, `type`: String): /* is react.react.DOMElement<P, T> */ Boolean = js.native
  
  @JSImport("react-dom/test-utils", "mockComponent")
  @js.native
  def mockComponent(mocked: MockedComponentClass): TypeofReactTestUtils = js.native
  @JSImport("react-dom/test-utils", "mockComponent")
  @js.native
  def mockComponent(mocked: MockedComponentClass, mockTagName: String): TypeofReactTestUtils = js.native
  
  @JSImport("react-dom/test-utils", "renderIntoDocument")
  @js.native
  def renderIntoDocument(element: SFCElement[_]): Unit = js.native
  @JSImport("react-dom/test-utils", "renderIntoDocument")
  @js.native
  def renderIntoDocument[T /* <: Element */](element: DOMElement[_, T]): T = js.native
  @JSImport("react-dom/test-utils", "renderIntoDocument")
  @js.native
  def renderIntoDocument[P](element: typingsSlinky.react.mod.ReactElement): ReactComponentClass[P] | Element | Unit = js.native
  @JSImport("react-dom/test-utils", "renderIntoDocument")
  @js.native
  def renderIntoDocument[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T]): T = js.native
  
  @JSImport("react-dom/test-utils", "scryRenderedComponentsWithType")
  @js.native
  def scryRenderedComponentsWithType[T /* <: ReactComponentClass[_] */, C /* <: ReactComponentClass[_] */](root: ReactComponentClass[_], `type`: ClassType[_, T, C]): js.Array[T] = js.native
  
  @JSImport("react-dom/test-utils", "scryRenderedDOMComponentsWithClass")
  @js.native
  def scryRenderedDOMComponentsWithClass(root: ReactComponentClass[_], className: String): js.Array[Element] = js.native
  
  @JSImport("react-dom/test-utils", "scryRenderedDOMComponentsWithTag")
  @js.native
  def scryRenderedDOMComponentsWithTag(root: ReactComponentClass[_], tagName: String): js.Array[Element] = js.native
  
  @js.native
  trait DebugPromiseLike extends StObject {
    
    // the actual then() in here is 0-ary, but that doesn't count as a PromiseLike.
    def `then`(
      onfulfilled: js.Function1[/* value */ scala.Nothing, scala.Nothing],
      onrejected: js.Function1[/* reason */ scala.Nothing, scala.Nothing]
    ): scala.Nothing = js.native
  }
  object DebugPromiseLike {
    
    @scala.inline
    def apply(
      `then`: (js.Function1[/* value */ scala.Nothing, scala.Nothing], js.Function1[/* reason */ scala.Nothing, scala.Nothing]) => scala.Nothing
    ): DebugPromiseLike = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
      __obj.asInstanceOf[DebugPromiseLike]
    }
    
    @scala.inline
    implicit class DebugPromiseLikeMutableBuilder[Self <: DebugPromiseLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThen(
        value: (js.Function1[/* value */ scala.Nothing, scala.Nothing], js.Function1[/* reason */ scala.Nothing, scala.Nothing]) => scala.Nothing
      ): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
    }
  }
  
  type EventSimulator = js.Function2[
    /* element */ Element | ReactComponentClass[js.Any], 
    /* eventData */ js.UndefOr[SyntheticEventData], 
    Unit
  ]
  
  @js.native
  trait MockedComponentClass
    extends Instantiable1[/* props */ js.Any, js.Any]
  
  @js.native
  trait OptionalEventProperties extends StObject {
    
    var bubbles: js.UndefOr[Boolean] = js.native
    
    var cancelable: js.UndefOr[Boolean] = js.native
    
    var currentTarget: js.UndefOr[EventTarget] = js.native
    
    var defaultPrevented: js.UndefOr[Boolean] = js.native
    
    var eventPhase: js.UndefOr[Double] = js.native
    
    var isTrusted: js.UndefOr[Boolean] = js.native
    
    var nativeEvent: js.UndefOr[Event] = js.native
    
    var preventDefault: js.UndefOr[js.Function0[Unit]] = js.native
    
    var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.native
    
    var target: js.UndefOr[EventTarget] = js.native
    
    var timeStamp: js.UndefOr[js.Date] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object OptionalEventProperties {
    
    @scala.inline
    def apply(): OptionalEventProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalEventProperties]
    }
    
    @scala.inline
    implicit class OptionalEventPropertiesMutableBuilder[Self <: OptionalEventProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      @scala.inline
      def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPreventedUndefined: Self = StObject.set(x, "defaultPrevented", js.undefined)
      
      @scala.inline
      def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPhaseUndefined: Self = StObject.set(x, "eventPhase", js.undefined)
      
      @scala.inline
      def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
      
      @scala.inline
      def setNativeEvent(value: Event): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeEventUndefined: Self = StObject.set(x, "nativeEvent", js.undefined)
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      @scala.inline
      def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTimeStamp(value: js.Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ShallowRenderer extends StObject {
    
    /**
      * After `shallowRenderer.render()` has been called, returns shallowly rendered output.
      */
    def getRenderOutput[E /* <: ReactElement */](): E = js.native
    
    /**
      * Similar to `ReactDOM.render` but it doesn't require DOM and only renders a single level deep.
      */
    def render(element: ReactElement): Unit = js.native
    def render(element: ReactElement, context: js.Any): Unit = js.native
    
    def unmount(): Unit = js.native
  }
  
  @js.native
  trait SyntheticEventData extends OptionalEventProperties {
    
    var altKey: js.UndefOr[Boolean] = js.native
    
    var button: js.UndefOr[Double] = js.native
    
    var buttons: js.UndefOr[Double] = js.native
    
    var changedTouches: js.UndefOr[TouchList] = js.native
    
    var charCode: js.UndefOr[Double] = js.native
    
    var clientX: js.UndefOr[Double] = js.native
    
    var clientY: js.UndefOr[Double] = js.native
    
    var clipboardData: js.UndefOr[DataTransfer] = js.native
    
    var ctrlKey: js.UndefOr[Boolean] = js.native
    
    var deltaMode: js.UndefOr[Double] = js.native
    
    var deltaX: js.UndefOr[Double] = js.native
    
    var deltaY: js.UndefOr[Double] = js.native
    
    var deltaZ: js.UndefOr[Double] = js.native
    
    var detail: js.UndefOr[Double] = js.native
    
    var getModifierState: js.UndefOr[js.Function1[/* key */ String, Boolean]] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var keyCode: js.UndefOr[Double] = js.native
    
    var locale: js.UndefOr[String] = js.native
    
    var location: js.UndefOr[Double] = js.native
    
    var metaKey: js.UndefOr[Boolean] = js.native
    
    var pageX: js.UndefOr[Double] = js.native
    
    var pageY: js.UndefOr[Double] = js.native
    
    var relatedTarget: js.UndefOr[EventTarget] = js.native
    
    var repeat: js.UndefOr[Boolean] = js.native
    
    var screenX: js.UndefOr[Double] = js.native
    
    var screenY: js.UndefOr[Double] = js.native
    
    var shiftKey: js.UndefOr[Boolean] = js.native
    
    var targetTouches: js.UndefOr[TouchList] = js.native
    
    var touches: js.UndefOr[TouchList] = js.native
    
    var view: js.UndefOr[AbstractView] = js.native
    
    var which: js.UndefOr[Double] = js.native
  }
  object SyntheticEventData {
    
    @scala.inline
    def apply(): SyntheticEventData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyntheticEventData]
    }
    
    @scala.inline
    implicit class SyntheticEventDataMutableBuilder[Self <: SyntheticEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
      
      @scala.inline
      def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setChangedTouches(value: TouchList): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedTouchesUndefined: Self = StObject.set(x, "changedTouches", js.undefined)
      
      @scala.inline
      def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharCodeUndefined: Self = StObject.set(x, "charCode", js.undefined)
      
      @scala.inline
      def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientXUndefined: Self = StObject.set(x, "clientX", js.undefined)
      
      @scala.inline
      def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientYUndefined: Self = StObject.set(x, "clientY", js.undefined)
      
      @scala.inline
      def setClipboardData(value: DataTransfer): Self = StObject.set(x, "clipboardData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardDataUndefined: Self = StObject.set(x, "clipboardData", js.undefined)
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
      
      @scala.inline
      def setDeltaMode(value: Double): Self = StObject.set(x, "deltaMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaModeUndefined: Self = StObject.set(x, "deltaMode", js.undefined)
      
      @scala.inline
      def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
      
      @scala.inline
      def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
      
      @scala.inline
      def setDeltaZ(value: Double): Self = StObject.set(x, "deltaZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaZUndefined: Self = StObject.set(x, "deltaZ", js.undefined)
      
      @scala.inline
      def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setGetModifierState(value: /* key */ String => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetModifierStateUndefined: Self = StObject.set(x, "getModifierState", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
      
      @scala.inline
      def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
      
      @scala.inline
      def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
      
      @scala.inline
      def setRelatedTarget(value: EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
      
      @scala.inline
      def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenXUndefined: Self = StObject.set(x, "screenX", js.undefined)
      
      @scala.inline
      def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenYUndefined: Self = StObject.set(x, "screenY", js.undefined)
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
      
      @scala.inline
      def setTargetTouches(value: TouchList): Self = StObject.set(x, "targetTouches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTouchesUndefined: Self = StObject.set(x, "targetTouches", js.undefined)
      
      @scala.inline
      def setTouches(value: TouchList): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchesUndefined: Self = StObject.set(x, "touches", js.undefined)
      
      @scala.inline
      def setView(value: AbstractView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      @scala.inline
      def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhichUndefined: Self = StObject.set(x, "which", js.undefined)
    }
  }
}

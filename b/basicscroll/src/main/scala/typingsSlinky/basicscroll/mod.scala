package typingsSlinky.basicscroll

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.basicscroll.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("basicscroll", "create")
  @js.native
  def create(opts: Data): BasicScroll = js.native
  
  type AnimatedType = Double | String | Null
  
  @js.native
  trait BasicScroll extends StObject {
    
    /**
      * Converts the start and stop position of the instance to absolute values. basicScroll relies on those values to start and stop the animation at the right position.
      * It runs the calculation once during the instance creation. .calculate() should be called when elements have altered their position or when the size of the site/viewport has changed.
      */
    def calculate(): Unit = js.native
    
    /**
      * Destroys the instance.
      * Should be called when the instance is no longer needed. All props of the instance will keep their last value
      */
    def destroy(): Unit = js.native
    
    /**
      * Returns calculated data.
      * More or less a parsed version of the data used for the instance creation. The data might change when calling the calculate function.
      */
    def getData(): Data = js.native
    
    /**
      * Returns true when the instance is started and false when the instance is stopped.
      */
    def isActive(): Boolean = js.native
    
    /**
      * Starts to animate the instance. basicScroll will track the scroll position and adjust the props of the instance accordingly.
      * An update will be performed only when the scroll position has changed.
      */
    def start(): Unit = js.native
    
    /**
      * Stops to animate the instance. All props of the instance will keep their last value.
      */
    def stop(): Unit = js.native
    
    /**
      * Triggers an update of an instance, even when the instance is currently stopped.
      */
    def update(): Props = js.native
  }
  object BasicScroll {
    
    @scala.inline
    def apply(
      calculate: () => Unit,
      destroy: () => Unit,
      getData: () => Data,
      isActive: () => Boolean,
      start: () => Unit,
      stop: () => Unit,
      update: () => Props
    ): BasicScroll = {
      val __obj = js.Dynamic.literal(calculate = js.Any.fromFunction0(calculate), destroy = js.Any.fromFunction0(destroy), getData = js.Any.fromFunction0(getData), isActive = js.Any.fromFunction0(isActive), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[BasicScroll]
    }
    
    @scala.inline
    implicit class BasicScrollMutableBuilder[Self <: BasicScroll] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculate(value: () => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetData(value: () => Data): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => Props): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  type CallbackFunction = js.Function3[/* instance */ BasicScroll, /* percentage */ Double, /* props */ Props, Unit]
  
  @js.native
  trait Data extends StObject {
    
    /**
      * Direct mode.
      * @default false
      */
    var direct: js.UndefOr[Boolean | Element] = js.native
    
    /**
      * DOM element/node.
      * @default null
      */
    var elem: js.UndefOr[Element | Null] = js.native
    
    /**
      * Start position.
      * @default null
      */
    var from: AnimatedType = js.native
    
    /**
      * Executes when the user scrolls and the viewport is within the given start and stop position
      */
    var inside: js.UndefOr[CallbackFunction] = js.native
    
    /**
      * Executes when the user scrolls and the viewport is outside the given start and stop position
      */
    var outside: js.UndefOr[CallbackFunction] = js.native
    
    var props: js.UndefOr[Props] = js.native
    
    /**
      * Stop position.
      * @default null
      */
    var to: AnimatedType = js.native
    
    /**
      * Track window size changes.
      * @default true
      */
    var track: js.UndefOr[Boolean] = js.native
  }
  object Data {
    
    @scala.inline
    def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirect(value: Boolean | Element): Self = StObject.set(x, "direct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectElement(value: Element): Self = StObject.set(x, "direct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectUndefined: Self = StObject.set(x, "direct", js.undefined)
      
      @scala.inline
      def setElem(value: Element): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElemNull: Self = StObject.set(x, "elem", null)
      
      @scala.inline
      def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
      
      @scala.inline
      def setFrom(value: AnimatedType): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromNull: Self = StObject.set(x, "from", null)
      
      @scala.inline
      def setInside(value: (/* instance */ BasicScroll, /* percentage */ Double, /* props */ Props) => Unit): Self = StObject.set(x, "inside", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInsideUndefined: Self = StObject.set(x, "inside", js.undefined)
      
      @scala.inline
      def setOutside(value: (/* instance */ BasicScroll, /* percentage */ Double, /* props */ Props) => Unit): Self = StObject.set(x, "outside", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOutsideUndefined: Self = StObject.set(x, "outside", js.undefined)
      
      @scala.inline
      def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setTo(value: AnimatedType): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToNull: Self = StObject.set(x, "to", null)
      
      @scala.inline
      def setTrack(value: Boolean): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.basicscroll.basicscrollStrings.backInOut
    - typingsSlinky.basicscroll.basicscrollStrings.backIn
    - typingsSlinky.basicscroll.basicscrollStrings.backOut
    - typingsSlinky.basicscroll.basicscrollStrings.bounceInOut
    - typingsSlinky.basicscroll.basicscrollStrings.bounceIn
    - typingsSlinky.basicscroll.basicscrollStrings.bounceOut
    - typingsSlinky.basicscroll.basicscrollStrings.circInOut
    - typingsSlinky.basicscroll.basicscrollStrings.circIn
    - typingsSlinky.basicscroll.basicscrollStrings.circOut
    - typingsSlinky.basicscroll.basicscrollStrings.cubicInOut
    - typingsSlinky.basicscroll.basicscrollStrings.cubicIn
    - typingsSlinky.basicscroll.basicscrollStrings.cubicOut
    - typingsSlinky.basicscroll.basicscrollStrings.elasticInOut
    - typingsSlinky.basicscroll.basicscrollStrings.elasticIn
    - typingsSlinky.basicscroll.basicscrollStrings.elasticOut
    - typingsSlinky.basicscroll.basicscrollStrings.expoInOut
    - typingsSlinky.basicscroll.basicscrollStrings.expoIn
    - typingsSlinky.basicscroll.basicscrollStrings.expoOut
    - typingsSlinky.basicscroll.basicscrollStrings.linear
    - typingsSlinky.basicscroll.basicscrollStrings.quadInOut
    - typingsSlinky.basicscroll.basicscrollStrings.quadIn
    - typingsSlinky.basicscroll.basicscrollStrings.quadOut
    - typingsSlinky.basicscroll.basicscrollStrings.quartInOut
    - typingsSlinky.basicscroll.basicscrollStrings.quartIn
    - typingsSlinky.basicscroll.basicscrollStrings.quartOut
    - typingsSlinky.basicscroll.basicscrollStrings.quintInOut
    - typingsSlinky.basicscroll.basicscrollStrings.quintIn
    - typingsSlinky.basicscroll.basicscrollStrings.quintOut
    - typingsSlinky.basicscroll.basicscrollStrings.sineInOut
    - typingsSlinky.basicscroll.basicscrollStrings.sineIn
    - typingsSlinky.basicscroll.basicscrollStrings.sineOut
  */
  trait KnownTimings extends StObject
  object KnownTimings {
    
    @scala.inline
    def backIn: typingsSlinky.basicscroll.basicscrollStrings.backIn = "backIn".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.backIn]
    
    @scala.inline
    def backInOut: typingsSlinky.basicscroll.basicscrollStrings.backInOut = "backInOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.backInOut]
    
    @scala.inline
    def backOut: typingsSlinky.basicscroll.basicscrollStrings.backOut = "backOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.backOut]
    
    @scala.inline
    def bounceIn: typingsSlinky.basicscroll.basicscrollStrings.bounceIn = "bounceIn".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.bounceIn]
    
    @scala.inline
    def bounceInOut: typingsSlinky.basicscroll.basicscrollStrings.bounceInOut = "bounceInOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.bounceInOut]
    
    @scala.inline
    def bounceOut: typingsSlinky.basicscroll.basicscrollStrings.bounceOut = "bounceOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.bounceOut]
    
    @scala.inline
    def circIn: typingsSlinky.basicscroll.basicscrollStrings.circIn = "circIn".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.circIn]
    
    @scala.inline
    def circInOut: typingsSlinky.basicscroll.basicscrollStrings.circInOut = "circInOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.circInOut]
    
    @scala.inline
    def circOut: typingsSlinky.basicscroll.basicscrollStrings.circOut = "circOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.circOut]
    
    @scala.inline
    def cubicIn: typingsSlinky.basicscroll.basicscrollStrings.cubicIn = "cubicIn".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.cubicIn]
    
    @scala.inline
    def cubicInOut: typingsSlinky.basicscroll.basicscrollStrings.cubicInOut = "cubicInOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.cubicInOut]
    
    @scala.inline
    def cubicOut: typingsSlinky.basicscroll.basicscrollStrings.cubicOut = "cubicOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.cubicOut]
    
    @scala.inline
    def elasticIn: typingsSlinky.basicscroll.basicscrollStrings.elasticIn = "elasticIn".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.elasticIn]
    
    @scala.inline
    def elasticInOut: typingsSlinky.basicscroll.basicscrollStrings.elasticInOut = "elasticInOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.elasticInOut]
    
    @scala.inline
    def elasticOut: typingsSlinky.basicscroll.basicscrollStrings.elasticOut = "elasticOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.elasticOut]
    
    @scala.inline
    def expoIn: typingsSlinky.basicscroll.basicscrollStrings.expoIn = "expoIn".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.expoIn]
    
    @scala.inline
    def expoInOut: typingsSlinky.basicscroll.basicscrollStrings.expoInOut = "expoInOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.expoInOut]
    
    @scala.inline
    def expoOut: typingsSlinky.basicscroll.basicscrollStrings.expoOut = "expoOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.expoOut]
    
    @scala.inline
    def linear: typingsSlinky.basicscroll.basicscrollStrings.linear = "linear".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.linear]
    
    @scala.inline
    def quadIn: typingsSlinky.basicscroll.basicscrollStrings.quadIn = "quadIn".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.quadIn]
    
    @scala.inline
    def quadInOut: typingsSlinky.basicscroll.basicscrollStrings.quadInOut = "quadInOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.quadInOut]
    
    @scala.inline
    def quadOut: typingsSlinky.basicscroll.basicscrollStrings.quadOut = "quadOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.quadOut]
    
    @scala.inline
    def quartIn: typingsSlinky.basicscroll.basicscrollStrings.quartIn = "quartIn".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.quartIn]
    
    @scala.inline
    def quartInOut: typingsSlinky.basicscroll.basicscrollStrings.quartInOut = "quartInOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.quartInOut]
    
    @scala.inline
    def quartOut: typingsSlinky.basicscroll.basicscrollStrings.quartOut = "quartOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.quartOut]
    
    @scala.inline
    def quintIn: typingsSlinky.basicscroll.basicscrollStrings.quintIn = "quintIn".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.quintIn]
    
    @scala.inline
    def quintInOut: typingsSlinky.basicscroll.basicscrollStrings.quintInOut = "quintInOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.quintInOut]
    
    @scala.inline
    def quintOut: typingsSlinky.basicscroll.basicscrollStrings.quintOut = "quintOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.quintOut]
    
    @scala.inline
    def sineIn: typingsSlinky.basicscroll.basicscrollStrings.sineIn = "sineIn".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.sineIn]
    
    @scala.inline
    def sineInOut: typingsSlinky.basicscroll.basicscrollStrings.sineInOut = "sineInOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.sineInOut]
    
    @scala.inline
    def sineOut: typingsSlinky.basicscroll.basicscrollStrings.sineOut = "sineOut".asInstanceOf[typingsSlinky.basicscroll.basicscrollStrings.sineOut]
  }
  
  type Props = StringDictionary[From]
  
  type TimingFunction = js.Function1[/* t */ Double, Double]
}

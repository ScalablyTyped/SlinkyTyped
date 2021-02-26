package typingsSlinky.reactNativeSafeArea

import slinky.core.ReactComponentClass
import typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.absolutePosition
import typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.contentInset
import typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.margin
import typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.padding
import typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.safeAreaInsetsForRootViewDidChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-safe-area", JSImport.Default)
  @js.native
  class default () extends SafeArea
  /* static members */
  object default {
    
    @JSImport("react-native-safe-area", "default.addEventListener")
    @js.native
    def addEventListener(eventType: EventType, listener: js.Function1[/* payload */ EventPayload, Unit]): Unit = js.native
    
    @JSImport("react-native-safe-area", "default.getSafeAreaInsetsForRootView")
    @js.native
    def getSafeAreaInsetsForRootView(): js.Promise[EventPayload] = js.native
    
    @JSImport("react-native-safe-area", "default.removeEventListener")
    @js.native
    def removeEventListener(eventType: EventType, listener: js.Function1[/* payload */ EventPayload, Unit]): Unit = js.native
  }
  
  @JSImport("react-native-safe-area", "withSafeArea")
  @js.native
  def withSafeArea_absolutePosition[P](
    WrappedComponent: ReactComponentClass[P],
    /**
    * @default 'margin'
    */
  applyTo: absolutePosition,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ReactComponentClass[P] = js.native
  @JSImport("react-native-safe-area", "withSafeArea")
  @js.native
  def withSafeArea_contentInset[P](
    WrappedComponent: ReactComponentClass[P],
    /**
    * @default 'margin'
    */
  applyTo: contentInset,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ReactComponentClass[P] = js.native
  @JSImport("react-native-safe-area", "withSafeArea")
  @js.native
  def withSafeArea_margin[P](
    WrappedComponent: ReactComponentClass[P],
    /**
    * @default 'margin'
    */
  applyTo: margin,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ReactComponentClass[P] = js.native
  @JSImport("react-native-safe-area", "withSafeArea")
  @js.native
  def withSafeArea_padding[P](
    WrappedComponent: ReactComponentClass[P],
    /**
    * @default 'margin'
    */
  applyTo: padding,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ReactComponentClass[P] = js.native
  
  // from `withSafeArea.js`
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.top
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.bottom
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.left
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.right
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.topLeft
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndLeft
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.topRight
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndRight
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomLeft
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndLeft
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomRight
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndRight
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.vertical
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontal
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndLeft
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndRight
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndTop
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndBottom
    - typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.all
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def all: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.all = "all".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.all]
    
    @scala.inline
    def bottom: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.bottom = "bottom".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.bottom]
    
    @scala.inline
    def bottomAndLeft: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndLeft = "bottomAndLeft".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndLeft]
    
    @scala.inline
    def bottomAndRight: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndRight = "bottomAndRight".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndRight]
    
    @scala.inline
    def bottomLeft: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomLeft]
    
    @scala.inline
    def bottomRight: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomRight = "bottomRight".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomRight]
    
    @scala.inline
    def horizontal: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontal = "horizontal".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontal]
    
    @scala.inline
    def horizontalAndBottom: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndBottom = "horizontalAndBottom".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndBottom]
    
    @scala.inline
    def horizontalAndTop: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndTop = "horizontalAndTop".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndTop]
    
    @scala.inline
    def left: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.left = "left".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.left]
    
    @scala.inline
    def right: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.right = "right".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.right]
    
    @scala.inline
    def top: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.top = "top".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.top]
    
    @scala.inline
    def topAndLeft: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndLeft = "topAndLeft".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndLeft]
    
    @scala.inline
    def topAndRight: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndRight = "topAndRight".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndRight]
    
    @scala.inline
    def topLeft: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.topLeft = "topLeft".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.topLeft]
    
    @scala.inline
    def topRight: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.topRight = "topRight".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.topRight]
    
    @scala.inline
    def vertical: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.vertical = "vertical".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.vertical]
    
    @scala.inline
    def verticalAndLeft: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndLeft = "verticalAndLeft".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndLeft]
    
    @scala.inline
    def verticalAndRight: typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndRight = "verticalAndRight".asInstanceOf[typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndRight]
  }
  
  @js.native
  trait EventPayload extends StObject {
    
    var safeAreaInsets: SafeAreaInsets = js.native
  }
  object EventPayload {
    
    @scala.inline
    def apply(safeAreaInsets: SafeAreaInsets): EventPayload = {
      val __obj = js.Dynamic.literal(safeAreaInsets = safeAreaInsets.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventPayload]
    }
    
    @scala.inline
    implicit class EventPayloadMutableBuilder[Self <: EventPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSafeAreaInsets(value: SafeAreaInsets): Self = StObject.set(x, "safeAreaInsets", value.asInstanceOf[js.Any])
    }
  }
  
  type EventType = safeAreaInsetsForRootViewDidChange
  
  @js.native
  trait SafeArea extends StObject
  
  // from `TypeDefinition.js`
  @js.native
  trait SafeAreaInsets extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object SafeAreaInsets {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): SafeAreaInsets = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafeAreaInsets]
    }
    
    @scala.inline
    implicit class SafeAreaInsetsMutableBuilder[Self <: SafeAreaInsets] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}

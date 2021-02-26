package typingsSlinky.reactNativeSafeAreaContext

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.Metrics
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeAreaContextMod {
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", "SafeAreaConsumer")
  @js.native
  val SafeAreaConsumer: ReactComponentClass[ConsumerProps[EdgeInsets | Null]] = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", "SafeAreaContext")
  @js.native
  val SafeAreaContext: Context[EdgeInsets | Null] = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", "SafeAreaFrameContext")
  @js.native
  val SafeAreaFrameContext: Context[Rect | Null] = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", "SafeAreaInsetsContext")
  @js.native
  val SafeAreaInsetsContext: Context[EdgeInsets | Null] = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", "SafeAreaProvider")
  @js.native
  def SafeAreaProvider(hasChildrenInitialMetricsInitialSafeAreaInsetsStyle: SafeAreaViewProps): ReactElement = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", "useSafeArea")
  @js.native
  def useSafeArea(): EdgeInsets = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", "useSafeAreaFrame")
  @js.native
  def useSafeAreaFrame(): Rect = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", "useSafeAreaInsets")
  @js.native
  def useSafeAreaInsets(): EdgeInsets = js.native
  
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaContext", "withSafeAreaInsets")
  @js.native
  def withSafeAreaInsets[T](WrappedComponent: ReactComponentClass[T]): ForwardRefExoticComponent[PropsWithoutRef[T] with RefAttributes[T]] = js.native
  
  @js.native
  trait SafeAreaViewProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var initialMetrics: js.UndefOr[Metrics | Null] = js.native
    
    /**
      * @deprecated
      */
    var initialSafeAreaInsets: js.UndefOr[EdgeInsets | Null] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object SafeAreaViewProps {
    
    @scala.inline
    def apply(): SafeAreaViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SafeAreaViewProps]
    }
    
    @scala.inline
    implicit class SafeAreaViewPropsMutableBuilder[Self <: SafeAreaViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInitialMetrics(value: Metrics): Self = StObject.set(x, "initialMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialMetricsNull: Self = StObject.set(x, "initialMetrics", null)
      
      @scala.inline
      def setInitialMetricsUndefined: Self = StObject.set(x, "initialMetrics", js.undefined)
      
      @scala.inline
      def setInitialSafeAreaInsets(value: EdgeInsets): Self = StObject.set(x, "initialSafeAreaInsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSafeAreaInsetsNull: Self = StObject.set(x, "initialSafeAreaInsets", null)
      
      @scala.inline
      def setInitialSafeAreaInsetsUndefined: Self = StObject.set(x, "initialSafeAreaInsets", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}

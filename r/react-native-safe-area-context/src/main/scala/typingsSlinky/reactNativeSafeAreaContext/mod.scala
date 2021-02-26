package typingsSlinky.reactNativeSafeAreaContext

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactNativeSafeAreaContext.safeAreaContextMod.SafeAreaViewProps
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.Metrics
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.NativeSafeAreaViewProps
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-safe-area-context", "SafeAreaConsumer")
  @js.native
  val SafeAreaConsumer: ReactComponentClass[ConsumerProps[EdgeInsets | Null]] = js.native
  
  @JSImport("react-native-safe-area-context", "SafeAreaContext")
  @js.native
  val SafeAreaContext: Context[EdgeInsets | Null] = js.native
  
  @JSImport("react-native-safe-area-context", "SafeAreaFrameContext")
  @js.native
  val SafeAreaFrameContext: Context[Rect | Null] = js.native
  
  @JSImport("react-native-safe-area-context", "SafeAreaInsetsContext")
  @js.native
  val SafeAreaInsetsContext: Context[EdgeInsets | Null] = js.native
  
  @JSImport("react-native-safe-area-context", "SafeAreaProvider")
  @js.native
  def SafeAreaProvider(hasChildrenInitialMetricsInitialSafeAreaInsetsStyle: SafeAreaViewProps): ReactElement = js.native
  
  @JSImport("react-native-safe-area-context", "SafeAreaView")
  @js.native
  def SafeAreaView(hasStyleModeEdgesRest: NativeSafeAreaViewProps): ReactElement = js.native
  
  @JSImport("react-native-safe-area-context", "initialWindowMetrics")
  @js.native
  val initialWindowMetrics: Metrics | Null = js.native
  
  @JSImport("react-native-safe-area-context", "initialWindowSafeAreaInsets")
  @js.native
  val initialWindowSafeAreaInsets: EdgeInsets | Null = js.native
  
  @JSImport("react-native-safe-area-context", "useSafeArea")
  @js.native
  def useSafeArea(): EdgeInsets = js.native
  
  @JSImport("react-native-safe-area-context", "useSafeAreaFrame")
  @js.native
  def useSafeAreaFrame(): Rect = js.native
  
  @JSImport("react-native-safe-area-context", "useSafeAreaInsets")
  @js.native
  def useSafeAreaInsets(): EdgeInsets = js.native
  
  @JSImport("react-native-safe-area-context", "withSafeAreaInsets")
  @js.native
  def withSafeAreaInsets[T](WrappedComponent: ReactComponentClass[T]): ForwardRefExoticComponent[PropsWithoutRef[T] with RefAttributes[T]] = js.native
}

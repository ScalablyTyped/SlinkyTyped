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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-safe-area-context", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val SafeAreaConsumer: ReactComponentClass[ConsumerProps[EdgeInsets | Null]] = js.native
  
  val SafeAreaContext: Context[EdgeInsets | Null] = js.native
  
  val SafeAreaFrameContext: Context[Rect | Null] = js.native
  
  val SafeAreaInsetsContext: Context[EdgeInsets | Null] = js.native
  
  def SafeAreaProvider(hasChildrenInitialMetricsInitialSafeAreaInsetsStyle: SafeAreaViewProps): ReactElement = js.native
  
  def SafeAreaView(hasStyleModeEdgesRest: NativeSafeAreaViewProps): ReactElement = js.native
  
  val initialWindowMetrics: Metrics | Null = js.native
  
  val initialWindowSafeAreaInsets: EdgeInsets | Null = js.native
  
  def useSafeArea(): EdgeInsets = js.native
  
  def useSafeAreaFrame(): Rect = js.native
  
  def useSafeAreaInsets(): EdgeInsets = js.native
  
  def withSafeAreaInsets[T](WrappedComponent: ReactComponentClass[T]): ForwardRefExoticComponent[PropsWithoutRef[T] with RefAttributes[T]] = js.native
}

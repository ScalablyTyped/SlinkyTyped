package typingsSlinky.reactNativeSafeAreaView

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeSafeAreaView.anon.Bottom
import typingsSlinky.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.bottom
import typingsSlinky.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.left
import typingsSlinky.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.right
import typingsSlinky.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-safe-area-view", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[SafeAreaViewProps, js.Object, js.Any] {
    def this(props: SafeAreaViewProps) = this()
    def this(props: SafeAreaViewProps, context: js.Any) = this()
  }
  @JSImport("react-native-safe-area-view", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SafeAreaViewProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-safe-area-view", "SafeAreaView")
  @js.native
  class SafeAreaView protected ()
    extends Component[SafeAreaViewProps, js.Object, js.Any] {
    def this(props: SafeAreaViewProps) = this()
    def this(props: SafeAreaViewProps, context: js.Any) = this()
  }
  @JSImport("react-native-safe-area-view", "SafeAreaView")
  @js.native
  val SafeAreaView: ReactComponentClass[SafeAreaViewProps] = js.native
  
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_bottom(key: bottom): Double = js.native
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_bottom(key: bottom, isLandscape: Boolean): Double = js.native
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_left(key: left): Double = js.native
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_left(key: left, isLandscape: Boolean): Double = js.native
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_right(key: right): Double = js.native
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_right(key: right, isLandscape: Boolean): Double = js.native
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_top(key: top): Double = js.native
  @JSImport("react-native-safe-area-view", "getInset")
  @js.native
  def getInset_top(key: top, isLandscape: Boolean): Double = js.native
  
  @JSImport("react-native-safe-area-view", "getStatusBarHeight")
  @js.native
  def getStatusBarHeight(): Double = js.native
  @JSImport("react-native-safe-area-view", "getStatusBarHeight")
  @js.native
  def getStatusBarHeight(isLandscape: Boolean): Double = js.native
  
  @JSImport("react-native-safe-area-view", "withSafeArea")
  @js.native
  def withSafeArea[P /* <: js.Object */](): js.Function1[
    /* Component */ ReactComponentClass[P], 
    ReactComponentClass[P with SafeAreaViewProps]
  ] = js.native
  @JSImport("react-native-safe-area-view", "withSafeArea")
  @js.native
  def withSafeArea[P /* <: js.Object */](safeAreaViewProps: SafeAreaViewProps): js.Function1[
    /* Component */ ReactComponentClass[P], 
    ReactComponentClass[P with SafeAreaViewProps]
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.always
    - typingsSlinky.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.never
  */
  trait SafeAreaViewForceInsetValue extends StObject
  object SafeAreaViewForceInsetValue {
    
    @scala.inline
    def always: typingsSlinky.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.always = "always".asInstanceOf[typingsSlinky.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.always]
    
    @scala.inline
    def never: typingsSlinky.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.never = "never".asInstanceOf[typingsSlinky.reactNativeSafeAreaView.reactNativeSafeAreaViewStrings.never]
  }
  
  @js.native
  trait SafeAreaViewProps extends ViewProps {
    
    var forceInset: js.UndefOr[Bottom] = js.native
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
      def setForceInset(value: Bottom): Self = StObject.set(x, "forceInset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceInsetUndefined: Self = StObject.set(x, "forceInset", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SafeAreaViewProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[SafeAreaViewProps] = default
}

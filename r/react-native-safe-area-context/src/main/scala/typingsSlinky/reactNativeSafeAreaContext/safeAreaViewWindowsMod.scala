package typingsSlinky.reactNativeSafeAreaContext

import typingsSlinky.reactNative.mod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeAreaViewWindowsMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaView.windows", "SafeAreaView")
  @js.native
  class SafeAreaView () extends View
  object SafeAreaView {
    
    @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaView.windows", "SafeAreaView")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
      * @platform ios
      */
    @JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaView.windows", "SafeAreaView.forceTouchAvailable")
    @js.native
    def forceTouchAvailable: Boolean = js.native
    @scala.inline
    def forceTouchAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceTouchAvailable")(x.asInstanceOf[js.Any])
  }
}

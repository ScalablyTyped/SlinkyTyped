package typingsSlinky.expo

import typingsSlinky.fbemitter.mod.EventEmitter
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appLoadingMod {
  
  @JSImport("expo/build/launch/AppLoading", JSImport.Default)
  @js.native
  class default () extends AppLoading
  
  @JSImport("expo/build/launch/AppLoading", "getAppLoadingLifecycleEmitter")
  @js.native
  def getAppLoadingLifecycleEmitter(): EventEmitter = js.native
  
  @js.native
  trait AppLoading
    extends Component[Props, js.Object, js.Any] {
    
    var _isMounted: Boolean = js.native
    
    def _startLoadingAppResourcesAsync(): js.Promise[Unit] = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MAppLoading(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAppLoading(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.expo.anon.AutoHideSplash
    - typingsSlinky.expo.anon.OnError
  */
  trait Props extends StObject
  object Props {
    
    @scala.inline
    def AutoHideSplash(): typingsSlinky.expo.anon.AutoHideSplash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.expo.anon.AutoHideSplash]
    }
    
    @scala.inline
    def OnError(onError: Null, onFinish: Null, startAsync: Null): typingsSlinky.expo.anon.OnError = {
      val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onFinish = onFinish.asInstanceOf[js.Any], startAsync = startAsync.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.expo.anon.OnError]
    }
  }
}

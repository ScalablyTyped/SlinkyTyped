package typingsSlinky.expo

import typingsSlinky.expo.buildLaunchAppLoadingMod.AppLoading
import typingsSlinky.expo.buildLaunchAppLoadingMod.Props
import typingsSlinky.fbemitter.fbemitterMod.EventEmitter
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/launch/AppLoading", JSImport.Namespace)
@js.native
object buildLaunchAppLoadingMod extends js.Object {
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
  
  @js.native
  trait Props extends js.Object {
    var autoHideSplash: js.UndefOr[Boolean] = js.native
    var onError: js.UndefOr[(js.Function1[/* error */ js.Error, Unit]) | Null] = js.native
    var onFinish: js.UndefOr[js.Function0[Unit] | Null] = js.native
    var startAsync: js.UndefOr[js.Function0[js.Promise[Unit]] | Null] = js.native
  }
  
  @js.native
  class default () extends AppLoading
  
  def getAppLoadingLifecycleEmitter(): EventEmitter = js.native
}


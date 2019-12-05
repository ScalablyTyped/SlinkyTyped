package typingsSlinky.reactDashFrontload.reactDashFrontloadMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-frontload", "frontloadConnect")
@js.native
object frontloadConnect extends js.Object {
  def apply(frontload: js.Function1[/* props */ js.Any, js.Promise[Unit]]): js.Function1[/* Component */ ReactComponentClass[js.Object], ReactComponentClass[js.Object]] = js.native
  def apply(frontload: js.Function1[/* props */ js.Any, js.Promise[Unit]], options: FrontloadConnectOptions): js.Function1[/* Component */ ReactComponentClass[js.Object], ReactComponentClass[js.Object]] = js.native
}


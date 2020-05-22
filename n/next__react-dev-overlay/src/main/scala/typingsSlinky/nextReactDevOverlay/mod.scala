package typingsSlinky.nextReactDevOverlay

import slinky.core.facade.ReactElement
import typingsSlinky.nextReactDevOverlay.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@next/react-dev-overlay/lib/client", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def ReactDevOverlay(hasChildren: Children): ReactElement = js.native
  def getNodeError(error: js.Error): js.Error = js.native
  def onBuildError(message: String): Unit = js.native
  def onBuildOk(): Unit = js.native
  def onRefresh(): Unit = js.native
  def register(): Unit = js.native
  def unregister(): Unit = js.native
}


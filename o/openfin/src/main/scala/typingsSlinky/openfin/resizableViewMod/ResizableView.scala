package typingsSlinky.openfin.resizableViewMod

import typingsSlinky.openfin.GoldenLayout.Container
import typingsSlinky.openfin.shapesIdentityMod.Identity
import typingsSlinky.openfin.utilsMod.ViewComponent
import typingsSlinky.openfin.v2MainMod.Fin
import typingsSlinky.openfin.v2MainMod.View
import typingsSlinky.resizeObserverBrowser.ResizeObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/platform/resizable-view", "ResizableView")
@js.native
class ResizableView protected () extends js.Object {
  def this(fin: Fin, hasContainerComponentState: ViewComponent, viewObserver: ResizeObserver) = this()
  var container: Container = js.native
  var fin: js.Any = js.native
  var ofView: View = js.native
  var options: js.Any = js.native
  var resizeObserver: ResizeObserver = js.native
  var windowIdentity: Identity = js.native
  def createOrAttachView(): js.Promise[Unit] = js.native
  def renderIntoComponent(): js.Promise[Unit] = js.native
}


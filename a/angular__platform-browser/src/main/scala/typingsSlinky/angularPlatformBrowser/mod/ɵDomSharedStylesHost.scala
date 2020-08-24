package typingsSlinky.angularPlatformBrowser.mod

import org.scalajs.dom.raw.Node
import typingsSlinky.angularCore.mod.OnDestroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "\u0275DomSharedStylesHost")
@js.native
class ɵDomSharedStylesHost protected ()
  extends ɵSharedStylesHost
     with OnDestroy {
  def this(_doc: js.Any) = this()
  var _addStylesToHost: js.Any = js.native
  var _doc: js.Any = js.native
  var _hostNodes: js.Any = js.native
  var _styleNodes: js.Any = js.native
  def addHost(hostNode: Node): Unit = js.native
  def removeHost(hostNode: Node): Unit = js.native
}


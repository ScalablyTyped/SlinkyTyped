package typingsSlinky.reactDndTestBackend

import typingsSlinky.dndCore.interfacesMod.BackendFactory
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.reactDndTestBackend.testBackendMod.ITestBackend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dnd-test-backend", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val TestBackend: BackendFactory = js.native
  
  def clearInstance(): Unit = js.native
  
  def getInstance(): js.UndefOr[ITestBackend] = js.native
  
  @js.native
  class TestBackendImpl protected ()
    extends typingsSlinky.reactDndTestBackend.testBackendMod.TestBackendImpl {
    def this(manager: DragDropManager) = this()
  }
}

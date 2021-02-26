package typingsSlinky.reactDndTestBackend

import typingsSlinky.dndCore.interfacesMod.BackendFactory
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.reactDndTestBackend.testBackendMod.ITestBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dnd-test-backend", "TestBackend")
  @js.native
  val TestBackend: BackendFactory = js.native
  
  @JSImport("react-dnd-test-backend", "TestBackendImpl")
  @js.native
  class TestBackendImpl protected ()
    extends typingsSlinky.reactDndTestBackend.testBackendMod.TestBackendImpl {
    def this(manager: DragDropManager) = this()
  }
  
  @JSImport("react-dnd-test-backend", "clearInstance")
  @js.native
  def clearInstance(): Unit = js.native
  
  @JSImport("react-dnd-test-backend", "getInstance")
  @js.native
  def getInstance(): js.UndefOr[ITestBackend] = js.native
}

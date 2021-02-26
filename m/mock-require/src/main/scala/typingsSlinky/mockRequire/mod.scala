package typingsSlinky.mockRequire

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mock-require", JSImport.Namespace)
  @js.native
  val ^ : Mock = js.native
  
  @js.native
  trait Mock extends StObject {
    
    def apply(path: String, mockExport: String): Unit = js.native
    def apply(path: String, mockExport: Stub): Unit = js.native
    
    def reRequire(path: String): js.Any = js.native
    
    def stop(path: String): Unit = js.native
    
    def stopAll(): Unit = js.native
  }
  
  type Stub = js.Object | StubFunction
  
  type StubFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type _To = Mock
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Mock = ^
}

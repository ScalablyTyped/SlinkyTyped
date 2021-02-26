package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/http/testing", "MockBackend")
  @js.native
  class MockBackend ()
    extends typingsSlinky.angularHttp.testingTestingMod.MockBackend
  
  @JSImport("@angular/http/testing", "MockConnection")
  @js.native
  class MockConnection protected ()
    extends typingsSlinky.angularHttp.testingTestingMod.MockConnection {
    def this(req: Request) = this()
  }
}

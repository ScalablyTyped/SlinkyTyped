package typingsSlinky.apolloDashLink

import typingsSlinky.apolloDashLink.libTestDashUtilsMockLinkMod.default
import typingsSlinky.apolloDashLink.libTestDashUtilsTestingUtilsMod.TestResultType
import typingsSlinky.apolloDashLink.libTypesMod.RequestHandler
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/test-utils", JSImport.Namespace)
@js.native
object libTestDashUtilsMod extends js.Object {
  @js.native
  class MockLink () extends default {
    def this(handleRequest: RequestHandler) = this()
  }
  
  @js.native
  class SetContextLink ()
    extends typingsSlinky.apolloDashLink.libTestDashUtilsSetContextMod.default {
    def this(setContext: js.Function1[/* context */ Record[String, _], Record[String, _]]) = this()
  }
  
  def checkCalls[T](calls: js.Array[_], results: js.Array[T]): Unit = js.native
  def testLinkResults(params: TestResultType): Unit = js.native
}


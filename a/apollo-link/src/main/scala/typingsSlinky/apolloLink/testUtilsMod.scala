package typingsSlinky.apolloLink

import typingsSlinky.apolloLink.mockLinkMod.default
import typingsSlinky.apolloLink.testingUtilsMod.TestResultType
import typingsSlinky.apolloLink.typesMod.RequestHandler
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-link/lib/test-utils", JSImport.Namespace)
@js.native
object testUtilsMod extends js.Object {
  
  def checkCalls[T](calls: js.Array[_], results: js.Array[T]): Unit = js.native
  
  def testLinkResults(params: TestResultType): Unit = js.native
  
  @js.native
  class MockLink () extends default {
    def this(handleRequest: RequestHandler) = this()
  }
  
  @js.native
  class SetContextLink ()
    extends typingsSlinky.apolloLink.setContextMod.default {
    def this(setContext: js.Function1[/* context */ Record[String, _], Record[String, _]]) = this()
  }
}

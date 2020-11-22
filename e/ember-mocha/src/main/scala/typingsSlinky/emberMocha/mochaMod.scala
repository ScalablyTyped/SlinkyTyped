package typingsSlinky.emberMocha

import typingsSlinky.emberTestHelpers.mod.TestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("mocha", JSImport.Namespace)
@js.native
object mochaMod extends js.Object {
  
  // augment test callback context
  type Context = TestContext
}

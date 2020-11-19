package typingsSlinky.mz.mod.crypto

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "crypto.randomBytes")
@js.native
object randomBytes extends js.Object {
  
  def apply(size: Double): js.Promise[Buffer] = js.native
  def apply(size: Double, callback: js.Function2[/* err */ js.Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
}

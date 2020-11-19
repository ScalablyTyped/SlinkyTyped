package typingsSlinky.node.anon

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.dnsMod.AnyRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofresolveAny extends js.Object {
  
  def apply(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  
  def __promisify__(hostname: String): js.Promise[js.Array[AnyRecord]] = js.native
}

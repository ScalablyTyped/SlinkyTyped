package typingsSlinky.randomBytes.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomBytesStatic extends js.Object {
  
  /**
    * Generates strong pseudo-random bytes.
    * @param size - Number of bytes to generate.
    */
  def apply(size: Double): js.Promise[Buffer] = js.native
  /**
    * Generates strong pseudo-random bytes.
    * @param size - Number of bytes to generate.
    * @param callback - Asynchronous callback function.
    */
  def apply(size: Double, callback: js.Function2[/* error */ js.Error, /* bytes */ Buffer, Unit]): Unit = js.native
  
  /**
    * Synchronously generates strong pseudo-random bytes.
    * @param size - Number of bytes to generate.
    */
  def sync(size: Double): Buffer = js.native
}

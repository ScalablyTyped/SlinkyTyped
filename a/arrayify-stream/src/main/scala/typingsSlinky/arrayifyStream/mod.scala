package typingsSlinky.arrayifyStream

import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("arrayify-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Converts a Node readable stream into an array that is returned as a promise.
    */
  def apply(input: Readable): js.Promise[js.Array[_]] = js.native
}

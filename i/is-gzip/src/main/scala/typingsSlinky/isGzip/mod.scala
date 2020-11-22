package typingsSlinky.isGzip

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("is-gzip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(buf: Buffer): Boolean = js.native
  def apply(buf: js.typedarray.Uint8Array): Boolean = js.native
}

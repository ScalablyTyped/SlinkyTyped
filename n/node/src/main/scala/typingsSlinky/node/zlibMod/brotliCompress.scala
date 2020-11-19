package typingsSlinky.node.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zlib", "brotliCompress")
@js.native
object brotliCompress extends js.Object {
  
  def apply(buf: InputType, callback: CompressCallback): Unit = js.native
  def apply(buf: InputType, options: BrotliOptions, callback: CompressCallback): Unit = js.native
}

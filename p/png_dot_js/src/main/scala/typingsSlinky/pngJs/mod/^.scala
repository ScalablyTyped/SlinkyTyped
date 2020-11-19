package typingsSlinky.pngJs.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("png.js", JSImport.Namespace)
@js.native
class ^ protected () extends PNGReader {
  def this(bytes: String) = this()
  def this(bytes: Buffer) = this()
  def this(bytes: js.typedarray.ArrayBuffer) = this()
  def this(bytes: js.typedarray.Uint8Array) = this()
}

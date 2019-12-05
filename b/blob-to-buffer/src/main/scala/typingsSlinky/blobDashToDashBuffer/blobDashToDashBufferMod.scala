package typingsSlinky.blobDashToDashBuffer

import org.scalajs.dom.raw.Blob
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blob-to-buffer", JSImport.Namespace)
@js.native
object blobDashToDashBufferMod extends js.Object {
  def apply(blob: Blob, callback: js.Function2[/* error */ js.Any, /* buffer */ Buffer, Unit]): Unit = js.native
}


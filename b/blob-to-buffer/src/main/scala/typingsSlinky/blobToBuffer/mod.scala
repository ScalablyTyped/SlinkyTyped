package typingsSlinky.blobToBuffer

import org.scalajs.dom.raw.Blob
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blob-to-buffer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(blob: Blob, callback: js.Function2[/* error */ js.Any, /* buffer */ Buffer, Unit]): Unit = js.native
}

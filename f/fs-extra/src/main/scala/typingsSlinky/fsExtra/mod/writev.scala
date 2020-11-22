package typingsSlinky.fsExtra.mod

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "writev")
@js.native
object writev extends js.Object {
  
  def apply(fd: Double, buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView]): js.Promise[WritevResult] = js.native
  def apply(
    fd: Double,
    buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView],
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[typingsSlinky.node.NodeJS.ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView], position: Double): js.Promise[WritevResult] = js.native
  def apply(
    fd: Double,
    buffers: js.Array[typingsSlinky.node.NodeJS.ArrayBufferView],
    position: Double,
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[typingsSlinky.node.NodeJS.ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
}

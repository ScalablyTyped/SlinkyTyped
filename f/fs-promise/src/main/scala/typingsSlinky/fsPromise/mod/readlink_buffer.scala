package typingsSlinky.fsPromise.mod

import typingsSlinky.fsPromise.fsPromiseStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "readlink")
@js.native
object readlink_buffer extends js.Object {
  
  def apply(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
  def apply(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ Buffer, Unit]
  ): Unit = js.native
}

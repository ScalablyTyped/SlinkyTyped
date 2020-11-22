package typingsSlinky.fsExtra.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.MakeDirectoryOptions
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "mkdir")
@js.native
object mkdir extends js.Object {
  
  def apply(path: PathLike): js.Promise[Unit] = js.native
  def apply(path: PathLike, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: PathLike, options: Null, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: PathLike, options: Mode, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(
    path: PathLike,
    options: MakeDirectoryOptions,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
}

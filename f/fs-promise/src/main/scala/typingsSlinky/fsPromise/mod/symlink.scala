package typingsSlinky.fsPromise.mod

import typingsSlinky.fsExtra.mod.SymlinkType
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.NoParamCallback
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.symlink.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "symlink")
@js.native
object symlink extends js.Object {
  
  def apply(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
  def apply(
    target: PathLike,
    path: PathLike,
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
  def apply(
    target: PathLike,
    path: PathLike,
    `type`: js.UndefOr[scala.Nothing],
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = js.native
  def apply(target: PathLike, path: PathLike, `type`: Null, callback: NoParamCallback): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: SymlinkType): js.Promise[Unit] = js.native
  def apply(
    target: PathLike,
    path: PathLike,
    `type`: SymlinkType,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: Type, callback: NoParamCallback): Unit = js.native
}

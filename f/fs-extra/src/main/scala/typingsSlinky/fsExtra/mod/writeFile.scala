package typingsSlinky.fsExtra.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "writeFile")
@js.native
object writeFile extends js.Object {
  
  def apply(file: Double, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: Double, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(file: Double, data: js.Any, options: String): js.Promise[Unit] = js.native
  def apply(
    file: Double,
    data: js.Any,
    options: String,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(file: Double, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  def apply(
    file: Double,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(file: PathLike, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: PathLike, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(file: PathLike, data: js.Any, options: String): js.Promise[Unit] = js.native
  def apply(
    file: PathLike,
    data: js.Any,
    options: String,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(file: PathLike, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  def apply(
    file: PathLike,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
}

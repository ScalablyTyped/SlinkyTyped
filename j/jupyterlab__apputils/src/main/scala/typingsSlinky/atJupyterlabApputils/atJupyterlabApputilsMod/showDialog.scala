package typingsSlinky.atJupyterlabApputils.atJupyterlabApputilsMod

import typingsSlinky.atJupyterlabApputils.libDialogMod.Dialog.IOptions
import typingsSlinky.atJupyterlabApputils.libDialogMod.Dialog.IResult
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "showDialog")
@js.native
object showDialog extends js.Object {
  def apply[T](): js.Promise[IResult[T]] = js.native
  def apply[T](options: Partial[IOptions[T]]): js.Promise[IResult[T]] = js.native
}


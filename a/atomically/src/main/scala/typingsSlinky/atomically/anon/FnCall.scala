package typingsSlinky.atomically.anon

import typingsSlinky.node.anon.MakeDirectoryOptionsrecur
import typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode
import typingsSlinky.node.fsMod.MakeDirectoryOptions
import typingsSlinky.node.fsMod.Mode
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(path: PathLike): js.Promise[js.UndefOr[String]] = js.native
  def apply(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[String] = js.native
  def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = js.native
  def apply(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = js.native
  def apply(path: PathLike, options: Mode): js.Promise[js.UndefOr[String]] = js.native
}


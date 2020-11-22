package typingsSlinky.fsExtra.mod

import typingsSlinky.node.anon.MakeDirectoryOptionsrecur
import typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode
import typingsSlinky.node.fsMod.MakeDirectoryOptions
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "mkdirSync")
@js.native
object mkdirSync extends js.Object {
  
  def apply(path: PathLike): js.UndefOr[String] = js.native
  def apply(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
  def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
  def apply(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
  def apply(path: PathLike, options: typingsSlinky.node.fsMod.Mode): js.UndefOr[String] = js.native
}

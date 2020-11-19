package typingsSlinky.mkdirp.mod

import typingsSlinky.mkdirp.anon.FnCall
import typingsSlinky.node.anon.MakeDirectoryOptionsrecur
import typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode
import typingsSlinky.node.fsMod.MakeDirectoryOptions
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FsImplementationSync extends js.Object {
  
  def mkdirSync(path: PathLike): js.UndefOr[String] = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
  def mkdirSync(path: PathLike, options: typingsSlinky.node.fsMod.Mode): js.UndefOr[String] = js.native
  @JSName("mkdirSync")
  var mkdirSync_Original: FnCall = js.native
  @JSName("mkdirSync")
  def mkdirSync_Unit(path: PathLike): Unit = js.native
  @JSName("mkdirSync")
  def mkdirSync_Unit(path: PathLike, options: typingsSlinky.node.fsMod.Mode): Unit = js.native
  
  def statSync(path: PathLike): Stats = js.native
  @JSName("statSync")
  var statSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
}

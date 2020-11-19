package typingsSlinky.makeDir.anon

import typingsSlinky.node.fsMod.NoParamCallback
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.symlink.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsymlink extends js.Object {
  
  def apply(target: PathLike, path: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: Null, callback: NoParamCallback): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: Type, callback: NoParamCallback): Unit = js.native
}

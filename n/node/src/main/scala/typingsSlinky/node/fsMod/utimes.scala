package typingsSlinky.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "utimes")
@js.native
object utimes extends js.Object {
  
  def apply(path: PathLike, atime: String, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: js.Date, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: js.Date, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: js.Date, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: js.Date, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: js.Date, mtime: js.Date, callback: NoParamCallback): Unit = js.native
}

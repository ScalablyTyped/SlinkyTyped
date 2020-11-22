package typingsSlinky.hexoFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "listDir")
@js.native
object listDir extends js.Object {
  
  def apply(path: String): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def apply(
    path: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def apply(
    path: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def apply(path: String, options: DirectoryOptions): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def apply(
    path: String,
    options: DirectoryOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
}

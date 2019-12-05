package typingsSlinky.hexoDashFs.hexoDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "listDir")
@js.native
object listDir extends js.Object {
  def apply(path: String): typingsSlinky.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def apply(
    path: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsSlinky.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def apply(path: String, options: DirectoryOptions): typingsSlinky.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def apply(
    path: String,
    options: DirectoryOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsSlinky.bluebird.bluebirdMod.^[js.Array[String]] = js.native
}


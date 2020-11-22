package typingsSlinky.hexoFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "copyDir")
@js.native
object copyDir extends js.Object {
  
  def apply(src: String, dest: String): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def apply(
    src: String,
    dest: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def apply(
    src: String,
    dest: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def apply(src: String, dest: String, options: DirectoryOptions): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def apply(
    src: String,
    dest: String,
    options: DirectoryOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
}

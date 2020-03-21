package typingsSlinky.gulp.mod

import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.vinylFs.mod.SrcOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SrcMethod extends js.Object {
  def apply(globs: String): ReadWriteStream = js.native
  def apply(globs: String, opt: SrcOptions): ReadWriteStream = js.native
  def apply(globs: js.Array[String]): ReadWriteStream = js.native
  def apply(globs: js.Array[String], opt: SrcOptions): ReadWriteStream = js.native
}


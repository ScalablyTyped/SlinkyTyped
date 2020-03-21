package typingsSlinky.runSequence.mod

import typingsSlinky.gulp.mod.Gulp
import typingsSlinky.gulp.mod.TaskCallback
import typingsSlinky.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRunSequence extends js.Object {
  def apply(streams: (String | js.Array[String] | TaskCallback)*): ReadWriteStream = js.native
  def use(gulp: Gulp): IRunSequence = js.native
}


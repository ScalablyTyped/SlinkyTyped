package typingsSlinky.runDashSequence.runDashSequenceMod

import typingsSlinky.gulp.gulpMod.Gulp
import typingsSlinky.gulp.gulpMod.TaskCallback
import typingsSlinky.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRunSequence extends js.Object {
  def apply(streams: (String | js.Array[String] | TaskCallback)*): ReadWriteStream = js.native
  def use(gulp: Gulp): IRunSequence = js.native
}


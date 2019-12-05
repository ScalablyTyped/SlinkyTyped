package typingsSlinky.fsDashExtraDashPromise.fsDashExtraDashPromiseMod

import typingsSlinky.fsDashExtra.fsDashExtraMod.MoveOptions
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "move")
@js.native
object move extends js.Object {
  def apply(src: String, dest: String): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(src: String, dest: String, options: MoveOptions): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, options: MoveOptions, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}


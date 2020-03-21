package typingsSlinky.mongoose.mod

import typingsSlinky.mongodb.mod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "startSession")
@js.native
object startSession extends js.Object {
  def apply(): js.Promise[typingsSlinky.mongodb.mod.ClientSession] = js.native
  def apply(options: SessionOptions): js.Promise[typingsSlinky.mongodb.mod.ClientSession] = js.native
  def apply(
    options: SessionOptions,
    cb: js.Function2[/* err */ js.Any, /* session */ typingsSlinky.mongodb.mod.ClientSession, Unit]
  ): js.Promise[typingsSlinky.mongodb.mod.ClientSession] = js.native
}


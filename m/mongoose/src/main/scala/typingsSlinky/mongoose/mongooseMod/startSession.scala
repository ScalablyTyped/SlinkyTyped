package typingsSlinky.mongoose.mongooseMod

import typingsSlinky.mongodb.mongodbMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "startSession")
@js.native
object startSession extends js.Object {
  def apply(): js.Promise[typingsSlinky.mongodb.mongodbMod.ClientSession] = js.native
  def apply(options: SessionOptions): js.Promise[typingsSlinky.mongodb.mongodbMod.ClientSession] = js.native
  def apply(
    options: SessionOptions,
    cb: js.Function2[/* err */ js.Any, /* session */ typingsSlinky.mongodb.mongodbMod.ClientSession, Unit]
  ): js.Promise[typingsSlinky.mongodb.mongodbMod.ClientSession] = js.native
}


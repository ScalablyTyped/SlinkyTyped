package typingsSlinky.joigoose.joigooseMod

import typingsSlinky.joi.joiMod.ValidationOptions
import typingsSlinky.mongoose.mongooseMod.Mongoose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("joigoose", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(mongoose: Mongoose): Joigoose = js.native
  def apply(mongoose: Mongoose, joiOptions: ValidationOptions): Joigoose = js.native
}


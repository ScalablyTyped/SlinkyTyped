package typingsSlinky.joigoose.joigooseMod

import typingsSlinky.joi.joiMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Joigoose extends js.Object {
  def convert(schema: Schema): typingsSlinky.mongoose.mongooseMod.Schema[_]
}

object Joigoose {
  @scala.inline
  def apply(convert: Schema => typingsSlinky.mongoose.mongooseMod.Schema[_]): Joigoose = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
  
    __obj.asInstanceOf[Joigoose]
  }
}


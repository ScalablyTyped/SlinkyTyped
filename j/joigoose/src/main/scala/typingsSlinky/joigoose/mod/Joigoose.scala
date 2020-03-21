package typingsSlinky.joigoose.mod

import typingsSlinky.joi.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Joigoose extends js.Object {
  def convert(schema: Schema): typingsSlinky.mongoose.mod.Schema[_]
}

object Joigoose {
  @scala.inline
  def apply(convert: Schema => typingsSlinky.mongoose.mod.Schema[_]): Joigoose = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
  
    __obj.asInstanceOf[Joigoose]
  }
}


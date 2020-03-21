package typingsSlinky.pg

import typingsSlinky.pgTypes.AnonParse
import typingsSlinky.pgTypes.mod.TypeParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofarrayParser extends js.Object {
  def create(source: js.Any, transform: TypeParser): AnonParse
}

object TypeofarrayParser {
  @scala.inline
  def apply(create: (js.Any, TypeParser) => AnonParse): TypeofarrayParser = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
  
    __obj.asInstanceOf[TypeofarrayParser]
  }
}


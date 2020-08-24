package typingsSlinky.logkitty.iosParserMod

import typingsSlinky.logkitty.typesMod.Entry
import typingsSlinky.logkitty.typesMod.IParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosParser extends IParser

object IosParser {
  @scala.inline
  def apply(parseMessages: js.Array[String] => js.Array[Entry], splitMessages: String => js.Array[String]): IosParser = {
    val __obj = js.Dynamic.literal(parseMessages = js.Any.fromFunction1(parseMessages), splitMessages = js.Any.fromFunction1(splitMessages))
    __obj.asInstanceOf[IosParser]
  }
}


package typingsSlinky.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptions extends js.Object {
  def atom(): typingsSlinky.jodata.jo
  def custom(value: String): typingsSlinky.jodata.jo
  def json(): typingsSlinky.jodata.jo
  def xml(): typingsSlinky.jodata.jo
}

object FormatOptions {
  @scala.inline
  def apply(
    atom: () => typingsSlinky.jodata.jo,
    custom: String => typingsSlinky.jodata.jo,
    json: () => typingsSlinky.jodata.jo,
    xml: () => typingsSlinky.jodata.jo
  ): FormatOptions = {
    val __obj = js.Dynamic.literal(atom = js.Any.fromFunction0(atom), custom = js.Any.fromFunction1(custom), json = js.Any.fromFunction0(json), xml = js.Any.fromFunction0(xml))
  
    __obj.asInstanceOf[FormatOptions]
  }
}


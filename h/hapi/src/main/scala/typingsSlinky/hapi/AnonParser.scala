package typingsSlinky.hapi

import typingsSlinky.hapi.mod.Util.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParser extends js.Object {
  /**
    * the method must return an object where each key is a parameter and matching value is the parameter value.
    * If the method throws, the error is used as the response or returned when `request.setUrl` is called.
    */
  def parser(raw: Dictionary[String]): Dictionary[_] = js.native
}

object AnonParser {
  @scala.inline
  def apply(parser: Dictionary[String] => Dictionary[_]): AnonParser = {
    val __obj = js.Dynamic.literal(parser = js.Any.fromFunction1(parser))
    __obj.asInstanceOf[AnonParser]
  }
  @scala.inline
  implicit class AnonParserOps[Self <: AnonParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParser(value: Dictionary[String] => Dictionary[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


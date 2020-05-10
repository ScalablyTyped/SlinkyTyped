package typingsSlinky.domParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomParser extends js.Object {
  def parseFromString(html: String): Dom = js.native
}

object DomParser {
  @scala.inline
  def apply(parseFromString: String => Dom): DomParser = {
    val __obj = js.Dynamic.literal(parseFromString = js.Any.fromFunction1(parseFromString))
    __obj.asInstanceOf[DomParser]
  }
  @scala.inline
  implicit class DomParserOps[Self <: DomParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParseFromString(value: String => Dom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseFromString")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


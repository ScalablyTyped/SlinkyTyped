package typingsSlinky.humanparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanparserStatic extends js.Object {
  def getFullestName(name: String): FullerNameOutput = js.native
  def parseAddress(address: String): AddressOutput = js.native
  def parseName(name: String): NameOutput = js.native
}

object HumanparserStatic {
  @scala.inline
  def apply(
    getFullestName: String => FullerNameOutput,
    parseAddress: String => AddressOutput,
    parseName: String => NameOutput
  ): HumanparserStatic = {
    val __obj = js.Dynamic.literal(getFullestName = js.Any.fromFunction1(getFullestName), parseAddress = js.Any.fromFunction1(parseAddress), parseName = js.Any.fromFunction1(parseName))
    __obj.asInstanceOf[HumanparserStatic]
  }
  @scala.inline
  implicit class HumanparserStaticOps[Self <: HumanparserStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFullestName(value: String => FullerNameOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFullestName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseAddress(value: String => AddressOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseAddress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseName(value: String => NameOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


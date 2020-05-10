package typingsSlinky.saxes.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<saxes.saxes.SaxesStartTag> */
@js.native
trait SaxesStartTagNS
  extends StartTagForOptions[js.Any] {
  var attributes: Record[String, SaxesAttributeNS | String] = js.native
  var name: String = js.native
  var ns: Record[String, String] = js.native
}

object SaxesStartTagNS {
  @scala.inline
  def apply(attributes: Record[String, SaxesAttributeNS | String], name: String, ns: Record[String, String]): SaxesStartTagNS = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesStartTagNS]
  }
  @scala.inline
  implicit class SaxesStartTagNSOps[Self <: SaxesStartTagNS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Record[String, SaxesAttributeNS | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNs(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


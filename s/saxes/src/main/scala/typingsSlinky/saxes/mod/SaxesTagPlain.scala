package typingsSlinky.saxes.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<saxes.saxes.SaxesTag, 'name' | 'attributes' | 'isSelfClosing'> & {  attributes  :std.Record<string, string>} */
@js.native
trait SaxesTagPlain
  extends TagForOptions[js.Any] {
  var attributes: (Record[String, SaxesAttributeNS | String]) with (Record[String, String]) = js.native
  var isSelfClosing: Boolean = js.native
  var name: String = js.native
}

object SaxesTagPlain {
  @scala.inline
  def apply(
    attributes: (Record[String, SaxesAttributeNS | String]) with (Record[String, String]),
    isSelfClosing: Boolean,
    name: String
  ): SaxesTagPlain = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesTagPlain]
  }
  @scala.inline
  implicit class SaxesTagPlainOps[Self <: SaxesTagPlain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: (Record[String, SaxesAttributeNS | String]) with (Record[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSelfClosing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelfClosing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


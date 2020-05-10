package typingsSlinky.saxes.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<saxes.saxes.SaxesStartTag, 'name' | 'attributes'> */
@js.native
trait SaxesStartTagPlain
  extends StartTagForOptions[js.Any] {
  var attributes: Record[String, SaxesAttributeNS | String] = js.native
  var name: String = js.native
}

object SaxesStartTagPlain {
  @scala.inline
  def apply(attributes: Record[String, SaxesAttributeNS | String], name: String): SaxesStartTagPlain = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesStartTagPlain]
  }
  @scala.inline
  implicit class SaxesStartTagPlainOps[Self <: SaxesStartTagPlain] (val x: Self) extends AnyVal {
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
  }
  
}


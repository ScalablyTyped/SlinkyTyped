package typingsSlinky.htmlToText.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsAttributeValue extends js.Object {
  var isAttributeValue: Boolean = js.native
  var strict: Boolean = js.native
}

object IsAttributeValue {
  @scala.inline
  def apply(isAttributeValue: Boolean, strict: Boolean): IsAttributeValue = {
    val __obj = js.Dynamic.literal(isAttributeValue = isAttributeValue.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAttributeValue]
  }
  @scala.inline
  implicit class IsAttributeValueOps[Self <: IsAttributeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAttributeValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAttributeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


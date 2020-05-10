package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeValueTarget extends js.Object {
  /**
    * The value of the attribute.
    */
  var AttributeValue: js.UndefOr[String] = js.native
}

object AttributeValueTarget {
  @scala.inline
  def apply(): AttributeValueTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValueTarget]
  }
  @scala.inline
  implicit class AttributeValueTargetOps[Self <: AttributeValueTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValue")(js.undefined)
        ret
    }
  }
  
}


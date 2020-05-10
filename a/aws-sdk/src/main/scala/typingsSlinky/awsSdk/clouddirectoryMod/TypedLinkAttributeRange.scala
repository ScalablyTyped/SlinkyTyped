package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedLinkAttributeRange extends js.Object {
  /**
    * The unique name of the typed link attribute.
    */
  var AttributeName: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.AttributeName] = js.native
  /**
    * The range of attribute values that are being selected.
    */
  var Range: TypedAttributeValueRange = js.native
}

object TypedLinkAttributeRange {
  @scala.inline
  def apply(Range: TypedAttributeValueRange): TypedLinkAttributeRange = {
    val __obj = js.Dynamic.literal(Range = Range.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkAttributeRange]
  }
  @scala.inline
  implicit class TypedLinkAttributeRangeOps[Self <: TypedLinkAttributeRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: TypedAttributeValueRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeName(value: AttributeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(js.undefined)
        ret
    }
  }
  
}


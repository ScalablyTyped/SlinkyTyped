package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectAttributeRange extends js.Object {
  /**
    * The key of the attribute that the attribute range covers.
    */
  var AttributeKey: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.AttributeKey] = js.native
  /**
    * The range of attribute values being selected.
    */
  var Range: js.UndefOr[TypedAttributeValueRange] = js.native
}

object ObjectAttributeRange {
  @scala.inline
  def apply(): ObjectAttributeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectAttributeRange]
  }
  @scala.inline
  implicit class ObjectAttributeRangeOps[Self <: ObjectAttributeRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeKey(value: AttributeKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: TypedAttributeValueRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(js.undefined)
        ret
    }
  }
  
}


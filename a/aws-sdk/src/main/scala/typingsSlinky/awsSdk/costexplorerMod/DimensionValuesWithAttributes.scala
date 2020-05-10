package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionValuesWithAttributes extends js.Object {
  /**
    * The attribute that applies to a specific Dimension.
    */
  var Attributes: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.Attributes] = js.native
  /**
    * The value of a dimension with a specific attribute.
    */
  var Value: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.Value] = js.native
}

object DimensionValuesWithAttributes {
  @scala.inline
  def apply(): DimensionValuesWithAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionValuesWithAttributes]
  }
  @scala.inline
  implicit class DimensionValuesWithAttributesOps[Self <: DimensionValuesWithAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}


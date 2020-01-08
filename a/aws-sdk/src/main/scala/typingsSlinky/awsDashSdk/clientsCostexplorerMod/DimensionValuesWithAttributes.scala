package typingsSlinky.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionValuesWithAttributes extends js.Object {
  /**
    * The attribute that applies to a specific Dimension.
    */
  var Attributes: js.UndefOr[typingsSlinky.awsDashSdk.clientsCostexplorerMod.Attributes] = js.native
  /**
    * The value of a dimension with a specific attribute.
    */
  var Value: js.UndefOr[typingsSlinky.awsDashSdk.clientsCostexplorerMod.Value] = js.native
}

object DimensionValuesWithAttributes {
  @scala.inline
  def apply(Attributes: Attributes = null, Value: Value = null): DimensionValuesWithAttributes = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionValuesWithAttributes]
  }
}


package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dimension extends js.Object {
  var dimensionType: js.UndefOr[String] = js.native
  var dimensionValues: js.UndefOr[js.Array[DimensionDimensionValue]] = js.native
}

object Dimension {
  @scala.inline
  def apply(): Dimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimension]
  }
  @scala.inline
  implicit class DimensionOps[Self <: Dimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionType")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensionValues(value: js.Array[DimensionDimensionValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionValues")(js.undefined)
        ret
    }
  }
  
}


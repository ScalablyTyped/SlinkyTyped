package typingsSlinky.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsMappingHeaderMapping extends js.Object {
  /** Specifies the property and display value of the header.
    * @Default {null}
    */
  var columnStyle: js.UndefOr[js.Any] = js.native
  /** Specifies the value of the column or row.
    */
  var displayName: js.UndefOr[String] = js.native
  /** Specifies the name of the column or row.
    */
  var propertyName: js.UndefOr[String] = js.native
}

object ItemsMappingHeaderMapping {
  @scala.inline
  def apply(): ItemsMappingHeaderMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsMappingHeaderMapping]
  }
  @scala.inline
  implicit class ItemsMappingHeaderMappingOps[Self <: ItemsMappingHeaderMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyName")(js.undefined)
        ret
    }
  }
  
}


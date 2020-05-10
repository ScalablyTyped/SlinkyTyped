package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.asc_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.desc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldColumnConfigProperties extends FieldConfigProperties {
  /**
    * Controls the sort order of the column. This property will only be honored on one fieldColumn in the FeatureTable widget. If direction is specified on more than one FieldColumn in the same FeatureTable, it will only be honored on the column with the highest index.
    *
    * Possible Value | Description
    * ---------------|------------
    * asc | Sorts the column in ascending order.
    * desc | Sorts the column in descending order.
    * null | No sort is applied to the column.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#direction)
    *
    * @default null
    */
  var direction: js.UndefOr[asc_ | desc_ | js.Any] = js.native
  /**
    * Indicates whether the field column is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#visible)
    *
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object FieldColumnConfigProperties {
  @scala.inline
  def apply(): FieldColumnConfigProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldColumnConfigProperties]
  }
  @scala.inline
  implicit class FieldColumnConfigPropertiesOps[Self <: FieldColumnConfigProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: asc_ | desc_ | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}


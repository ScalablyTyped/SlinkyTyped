package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SublayerCreatePopupTemplateOptions extends Object {
  /**
    * Field types to ignore when creating the popup. By default the `geometry`, `blob`, `raster`, `guid` and `xml` field types are ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#createPopupTemplate)
    */
  var ignoreFieldTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The maximum number of fields to include in the popup template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#createPopupTemplate)
    *
    * @default 75
    */
  var maximumFields: js.UndefOr[Double] = js.native
}

object SublayerCreatePopupTemplateOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SublayerCreatePopupTemplateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SublayerCreatePopupTemplateOptions]
  }
  @scala.inline
  implicit class SublayerCreatePopupTemplateOptionsOps[Self <: SublayerCreatePopupTemplateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreFieldTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFieldTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreFieldTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFieldTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumFields(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFields")(js.undefined)
        ret
    }
  }
  
}


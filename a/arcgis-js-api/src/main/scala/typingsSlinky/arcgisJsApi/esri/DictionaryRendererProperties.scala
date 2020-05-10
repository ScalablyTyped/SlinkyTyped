package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.HashMap
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictionaryRendererProperties
  extends RendererProperties
     with VisualVariablesMixinProperties {
  /**
    * This property allows you to set display options that can be configured on the dictionary symbol style. For example, if the dictionary symbol style provides a display option to turn on/off a symbol/text, you could set it here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#config)
    */
  var config: js.UndefOr[js.Any] = js.native
  /**
    * Defines a field mapping that maps input fields from the feature to the dictionary symbol style's expected fields for symbols and text. Each key identifies an expected field (defined in the dictionary's symbol and text properties). The value identifies the corresponding mapped field from the dataset. Field names are case sensitive.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#fieldMap)
    */
  var fieldMap: js.UndefOr[HashMap[String]] = js.native
  /**
    * A scaling expression can be set to increase or decrease the size of the dictionary symbols. The scaling expression can be a constant value for all symbols or an Arcade expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#scaleExpression)
    */
  var scaleExpression: js.UndefOr[String] = js.native
  /**
    * The type of renderer. For this renderer the type is always `dictionary`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#type)
    */
  var `type`: js.UndefOr[dictionary] = js.native
  /**
    * The URL to the dictionary style, e.g. https://jsapi.maps.arcgis.com/sharing/rest/content/items/30cfbf36efd64ccf92136201d9e852af.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#url)
    */
  var url: js.UndefOr[String] = js.native
}

object DictionaryRendererProperties {
  @scala.inline
  def apply(): DictionaryRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictionaryRendererProperties]
  }
  @scala.inline
  implicit class DictionaryRendererPropertiesOps[Self <: DictionaryRendererProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldMap(value: HashMap[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldMap")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: dictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}


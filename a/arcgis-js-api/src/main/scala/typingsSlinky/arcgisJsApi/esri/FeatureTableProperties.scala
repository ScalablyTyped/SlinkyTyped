package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTableProperties extends WidgetProperties {
  /**
    * Indicates whether to display the `Attachments` field in the table. This is only applicable if the feature layer supports attachments. Currently, this field only displays the count of attachments per feature.  ![featuretable attachmentenabled](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/attachments-enabled.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#attachmentsEnabled)
    *
    * @default false
    */
  var attachmentsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * An array of individual configuration objects.  This is where you can specify what fields to display and how you wish to display them.  When not set, all fields except for `CreationDate`, `Creator`, `EditDate`, `Editor`, and `GlobalID` will be included. Otherwise, it is up to the developer to set the right field(s) to override and display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#fieldConfigs)
    *
    * @default null
    */
  var fieldConfigs: js.UndefOr[js.Array[FieldColumnConfigProperties]] = js.native
  /**
    * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) containing the fields and attributes to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#layer)
    */
  var layer: js.UndefOr[FeatureLayerProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [FeatureTableViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#viewModel)
    */
  var viewModel: js.UndefOr[FeatureTableViewModel] = js.native
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#visibleElements)
    */
  var visibleElements: js.UndefOr[FeatureTableVisibleElements] = js.native
}

object FeatureTableProperties {
  @scala.inline
  def apply(): FeatureTableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTableProperties]
  }
  @scala.inline
  implicit class FeatureTablePropertiesOps[Self <: FeatureTableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldConfigs(value: js.Array[FieldColumnConfigProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withLayer(value: FeatureLayerProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(js.undefined)
        ret
    }
    @scala.inline
    def withViewModel(value: FeatureTableViewModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleElements(value: FeatureTableVisibleElements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleElements")(js.undefined)
        ret
    }
  }
  
}


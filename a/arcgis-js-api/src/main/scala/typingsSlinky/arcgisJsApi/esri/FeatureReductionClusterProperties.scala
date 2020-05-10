package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.cluster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureReductionClusterProperties extends js.Object {
  /**
    * Defines the radius in points (or pixels if specified) of each area in which multiple points will be grouped and visualized as a single cluster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterRadius)
    *
    * @default 60
    */
  var clusterRadius: js.UndefOr[Double | String] = js.native
  /**
    * The [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) to apply to clustered graphics. When set, a popupTemplate independent of the [layer.popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate) is used. This popup can display summary information for the cluster, including the count of all features in the cluster and the average or predominant values of fields mapped by the renderer.  The table below describes the aggregate fields used internally by the cluster renderer, which you can reference in the cluster popup.  Aggregate fields:
    *
    * Field Name | Type | Description
    * -----------|------|------------
    * `cluster_count` | number | The number of features in the cluster.
    * `cluster_avg_{fieldName}` | number | For renderers visualizing a number field either with size, opacity, continuous color, or class breaks, this field describes the average of the rendered field among all features in the cluster.
    * `cluster_type_{fieldName}` | string | For layers with a [UniqueValueRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html), this field describes the mode, or predominant string of the rendered field among all features within the cluster.
    *
    * The following `popupTemplate` configurations will display the popups shown in the images below.  **Cluster count**
    * ```js
    * layer.featureReduction = {
    *   type: "cluster",
    *   popupTemplate: {
    *     content: "This cluster represents {cluster_count} earthquakes."
    *   }
    * };
    * ```
    *
    * [![clustering-simple-popup](https://developers.arcgis.com/javascript/assets/img/apiref/layers/clustering/clustering-simple-popup.png)](https://developers.arcgis.com/javascript/latest/sample-code/featurereduction-cluster/index.html)
    *
    * **Clusters by predominant type**
    *
    *
    * The following featureReduction configuration assumes the layer's renderer is a UniqueValueRenderer
    * who's field is named `religion`.
    *
    * ```js
    * layer.featureReduction = {
    *   type: "cluster",
    *   popupTemplate: {
    *     content: [{
    *       type: "text",
    *       text: "This cluster represents <b>{cluster_count}</b> features."
    *     }, {
    *       type: "text",
    *       text: "The predominant place of worship in this cluster is <b>{cluster_type_religion}</b>."
    *     }]
    *   }
    * };
    * ```
    *
    * [![clustering-types-popup](https://developers.arcgis.com/javascript/assets/img/apiref/layers/clustering/clustering-types-popup.png)](https://developers.arcgis.com/javascript/latest/sample-code/featurereduction-cluster-filter/index.html)
    *
    * **Clusters with visual variables**
    *
    * The following featureReduction configuration assumes the layer's renderer contains visual variables
    * referencing fields named `WIND_SPEED`, `WIND_DIRECT`, `TEMP`.
    *
    * ```js
    * layer.featureReduction = {
    *   type: "cluster",
    *   popupTemplate: {
    *     content: [{
    *       type: "text",
    *       text: "This cluster represents <b>{cluster_count}</b> weather stations."
    *     }, {
    *       type: "fields",
    *       fieldInfos: [{
    *         fieldName: "cluster_avg_WIND_SPEED",
    *         label: "Average wind speed (km/h)",
    *         format: {
    *           places: 0
    *         }
    *       }, {
    *         fieldName: "cluster_avg_WIND_DIRECT",
    *         label: "Average wind direction (degrees)",
    *           format: {
    *             places: 0
    *           }
    *       }, {
    *           fieldName: "cluster_avg_TEMP",
    *           label: "Average temperature (°F)",
    *           format: {
    *            places: 0
    *           }
    *        }]
    *     }]
    *   }
    * };
    * ```
    *
    * [![clustering-color-size-popup](https://developers.arcgis.com/javascript/assets/img/apiref/layers/clustering/clustering-color-size-popup.png)](https://developers.arcgis.com/javascript/latest/sample-code/featurereduction-cluster-visualvariables/index.html)
    *
    *
    * > **Known Limitations**  Aggregate fields referring to values in renderers calculated with a `normalizationField` or `valueExpression` are not supported. Support for these scenarios is coming at a future release.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.native
  /**
    * The feature reduction type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#type)
    */
  var `type`: js.UndefOr[cluster] = js.native
}

object FeatureReductionClusterProperties {
  @scala.inline
  def apply(): FeatureReductionClusterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureReductionClusterProperties]
  }
  @scala.inline
  implicit class FeatureReductionClusterPropertiesOps[Self <: FeatureReductionClusterProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterRadius(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupTemplate(value: PopupTemplateProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: cluster): Self = {
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
  }
  
}


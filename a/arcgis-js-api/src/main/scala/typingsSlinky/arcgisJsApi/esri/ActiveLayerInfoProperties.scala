package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveLayerInfoProperties extends js.Object {
  /**
    * A collection of child activeLayerInfos. This only applies to renderers of [Sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) or the children of [GroupLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#children)
    */
  var children: js.UndefOr[CollectionProperties[ActiveLayerInfoProperties]] = js.native
  /**
    * Indicates if the legend's display of the layer's renderer is driven by the scale of the view. This is true of [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) renderers, any renderer that uses a `valueExpression` (Arcade expression), [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html), and layers that have [clustering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureReduction) enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#isScaleDriven)
    */
  var isScaleDriven: js.UndefOr[Boolean] = js.native
  /**
    * The layer represented by the ActiveLayerInfo object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.native
  /**
    * The legendElements is constructed using the layer [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html). It reflects the actual structure of the legend. Each `legendElement` has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#legendElements)
    */
  var legendElements: js.UndefOr[js.Array[LegendElement]] = js.native
  /**
    * The ActiveLayerInfo of the parent [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) or [GroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#parent)
    */
  var parent: js.UndefOr[ActiveLayerInfoProperties] = js.native
  /**
    * Indicates if the activeLayerInfo is ready. It is set to `true` when all its [legendElements](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#legendElements) are computed. It is set to `false` when the layer renderer changes so that the legendElements can recomputed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ready)
    */
  var ready: js.UndefOr[Boolean] = js.native
  /**
    * The scale of the view instance in which the Legend is rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#scale)
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * The text string that represents the legend's title. This value is read from the `layerInfo` of the corresponding layer in the legend. If not provided, this value comes from the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#title) of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#title)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The version of the ActiveLayerInfo. It increases by `1` whenever [ready](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ready) property of ActiveLayerInfo changes. This property should watched in the view for ActiveLayerInfo changes and update the DOM accordingly.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#version)
    */
  var version: js.UndefOr[Double] = js.native
  /**
    * The view in which the Legend is rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#view)
    */
  var view: js.UndefOr[ViewProperties] = js.native
}

object ActiveLayerInfoProperties {
  @scala.inline
  def apply(): ActiveLayerInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveLayerInfoProperties]
  }
  @scala.inline
  implicit class ActiveLayerInfoPropertiesOps[Self <: ActiveLayerInfoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: CollectionProperties[ActiveLayerInfoProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withIsScaleDriven(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScaleDriven")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsScaleDriven: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScaleDriven")(js.undefined)
        ret
    }
    @scala.inline
    def withLayer(value: LayerProperties): Self = {
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
    def withLegendElements(value: js.Array[LegendElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendElements")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: ActiveLayerInfoProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: ViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}


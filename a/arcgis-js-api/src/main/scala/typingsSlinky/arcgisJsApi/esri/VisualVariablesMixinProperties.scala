package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualVariablesMixinProperties extends js.Object {
  
  /**
    * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects. Each object must indicate the type of visual variable to apply (e.g. [ColorVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html), [SizeVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html), [OpacityVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html), [RotationVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html)), the numeric field or expression from which to drive the visualization, and the visual values to map to the data. The following list identifies each visual variable type and provides a link to the specification table of each.
    *
    * Type | Object Specification | Legend Example
    * -----|----------------------|---------------
    * color | [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) | ![legend-color-vv](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/legend-color-vv.png)
    * size | [SizeVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) | ![legend-color-vv](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/legend-size-vv.png)
    * opacity | [OpacityVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html) | ![legend-color-vv](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/legend-opacity-vv.png)
    * rotation | [RotationVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html) | -
    *
    * Visual variables are primarily be used in two ways.  **1**. Thematic mapping  In most cases, visual variables are used to create visualizations based on a thematic attribute (e.g. population, education, rank, money, magnitude, etc.) in either 2D or 3D.
    * ```js
    * renderer.visualVariables = [{
    *   type: "size",
    *   field: "POP_POVERTY",
    *   normalizationField: "TOTPOP_CY",
    *   legendOptions: {
    *     title: "% population in poverty by county"
    *   },
    *   stops: [
    *     { value: 0.15, size: 4, label: "<15%" },
    *     { value: 0.25, size: 12, label: "25%" },
    *     { value: 0.35, size: 24, label: ">35%" }
    *   ]
    * }];
    * ```
    *
    * [![size-image-here](https://developers.arcgis.com/javascript/assets/img/samples/8-vv-size.png)](https://developers.arcgis.com/javascript/latest/sample-code/visualization-vv-size/index.html)
    *
    * You can take the visualization a step further and use multiple visual variables in the same renderer.
    * The sample below uses
    * three visual variables (size, color, and opacity).
    *
    * [![visualization-multivariate-2d](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/renderer-unique-vv.png)](https://developers.arcgis.com/javascript/latest/sample-code/visualization-multivariate-2d/index.html)
    *
    * **2**. Mapping real-world sizes
    *
    * The [size](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) visual variable can be used to
    * visualize the true sizes of features (e.g. tree canopy, road width, building height, etc.)
    * based on their size in the real world. This can be particularly powerful when working in a 3D
    * [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). The image below shows a layer of trees
    * that uses visual variables to size each feature to the true dimensions of each tree
    * based on data stored in multiple attribute fields.
    *
    * [![renderer-vv-rw](https://developers.arcgis.com/javascript/assets/img/samples/3-trees-3d.png)](https://developers.arcgis.com/javascript/latest/sample-code/visualization-trees-realistic/index.html)
    *
    * See the [Thematic visualization with realistic 3D symbols](https://developers.arcgis.com/javascript/latest/sample-code/visualization-trees-realistic/index.html)
    * for an example of using multiple visual variables to visualize your data.
    *
    * > **Known Limitations**  Color and opacity visual variables must not have more than 8 stops and size visual variables must not have more than 6 stops. This does not apply to variables driven by view scale.  For apps where users can interactively change the `field` or `valueExpression` of a visual variable, we suggest you include all potential fields referenced by visual variables in the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#outFields) of the layer. This ensures the best user experience when switching or updating fields in renderers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
    */
  var visualVariables: js.UndefOr[js.Array[VisualVariableProperties]] = js.native
}
object VisualVariablesMixinProperties {
  
  @scala.inline
  def apply(): VisualVariablesMixinProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualVariablesMixinProperties]
  }
  
  @scala.inline
  implicit class VisualVariablesMixinPropertiesOps[Self <: VisualVariablesMixinProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVisualVariablesVarargs(value: VisualVariableProperties*): Self = this.set("visualVariables", js.Array(value :_*))
    
    @scala.inline
    def setVisualVariables(value: js.Array[VisualVariableProperties]): Self = this.set("visualVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisualVariables: Self = this.set("visualVariables", js.undefined)
  }
}

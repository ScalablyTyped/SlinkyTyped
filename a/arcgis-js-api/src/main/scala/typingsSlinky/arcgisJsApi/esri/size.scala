package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains helper methods for generating data-driven visualizations with continuous size or class breaks based on a field value or expression from features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html). The methods in this module generate renderer or visual variable objects that may be applied directly to a supported layer. The renderers specify how features should be visualized based on data values and sizes optimized based on the indicated basemap.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html)
  */
@js.native
trait size extends js.Object {
  
  /**
    * Generates a continuous size [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) representing the age of features based on one or more fields. The age of a feature is calculated based on a given `startTime` and `endTime`, one of which must be a date field in the input `layer`. This method generates an Arcade expression and calculates statistics on the output of the expression to accomplish this. The resulting renderer contains a continuous size visual variable that maps optimal sizes based on the indicated basemap to data values based on the resulting statistics of the expression.  You are required to provide a `layer`, `view`, `startTime`, and `endTime` to generate this renderer. Optionally, you can set a `unit` for the visualization. Other options are provided for convenience for more involved custom visualization authoring applications. For example, if you already generated statistics in another operation, you can pass the statistics object to the `statistics` parameter to avoid making an extra call to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createAgeRenderer)
    *
    * @param params Input parameters for generating a continuous size visualization of age for time data returned from start and/or end date field(s). See the table below for details of each parameter.
    * @param params.layer The layer for which the visualization is generated.
    * @param params.view The view where the input layer is rendered. This method inspects the view's background (i.e. basemap, web map background, or view container) to determine optimal colors for the output renderer.
    * @param params.startTime The name of the field, or a date value representing the start time in the age calculation. If a date value is specified, then the `endTime` parameter must reference a Date field in the layer.
    * @param params.endTime The name of the field, or a date value representing the end time in the age calculation. If a date value is specified, then the `startTime` parameter must reference a Date field in the layer.
    * @param params.unit The time unit used to calculate the difference between `endTime` and `startTime`. If a unit is not specified, then a suggested unit is determined based on the spread and distribution of the data.
    * @param params.maxValue Sets a maximum age for the visualization. Even if data exists above this value, only statistics will be calculated for values between the `minValue` and `maxValue`. Added at version 4.15.
    * @param params.minValue Sets a minimum age for the visualization. Even if data exists below this value, only statistics will be calculated for values between the `minValue` and `maxValue`. Added at version 4.15.
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    * @param params.outlineOptimizationEnabled Only for polygon layers. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.sizeOptimizationEnabled Indicates whether symbol sizes should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.legendOptions Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
    * @param params.statistics A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function. The `createAgeRenderer()` method generates an Arcade expression and executes a statistics query against the layer for the result of the expression. If statistics for the expression have already been generated, then pass the object here to avoid making a second statistics query.
    * @param params.sizeScheme In authoring apps, the user may select a pre-defined size scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    * @param params.symbolType
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. This parameter does not need to be specified for layers with a `mesh` geometry type. Possible values are described below.
    *
    *   | Value | Description |
    *   | ----- | ----------- |
    *   | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    *   | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    *   | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). A SceneView instance must be provided to the `view` parameter if this option is used. |
    *   | 3d-volumetric-uniform | Generates a visualization using uniformly sized 3D symbols with volumetric symbol layers. Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and the symbol should be sizes uniformly, for example with spheres. A SceneView instance must be provided to the `view` parameter if this option is used. |
    * @param params.defaultSymbolEnabled Enables the `defaultSymbol` on the renderer and assigns it to features with no value.
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def createAgeRenderer(params: sizeCreateAgeRendererParams): js.Promise[sizeAgeRendererResult] = js.native
  
  /**
    * Generates a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) that may be applied directly to the layer used to call this method. The resulting renderer defines the symbol size of each feature based on the value of the given `field` value. A default size scheme is determined based on the given `basemap`. Depending on the `classificationMethod`, class breaks (or data ranges) are generated based on the statistics of the data. Each feature is assigned a size based on the class break in which the value of the `field` falls.  In most cases you will provide a `layer`, `basemap`, `field`, and `classificationMethod` to generate this renderer. This is a scenario in which the statistics of the data aren't well known and the user doesn't know what sizes to use in the visualization. You can also use a `valueExpression` instead of a `field` to visualize features based on a value returned from a script executed at runtime.  The other options are provided for convenience for more involved custom visualization authoring applications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    *
    * @param params Input parameters for generating a classed size visualization based on data returned from a given field or expression. See the table below for details of each parameter.
    * @param params.layer The layer for which the visualization is generated.
    * @param params.view The view where the input layer is rendered. This method inspects the view's background (i.e. basemap, web map background, or view container) to determine optimal colors for the output renderer. This parameter should always be set in practice, but if not provided this method will assume the generated renderer will display on a light background. This parameter is required when creating renderers using a `valueExpression` or for renderers intended for display in a SceneView.
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    * @param params.field The name of the field whose data will be queried for statistics and classified. This property is ignored if a `valueExpression` is used.
    * @param params.normalizationField The name of the field to normalize the values of the given `field`. Providing a normalization field helps minimize some visualization errors and standardizes the data so all features are visualized with minimal bias due to area differences or count variation. This option is commonly used when visualizing densities.
    * @param params.normalizationType With the exception of `log` normalization, data normalization creates a ratio by dividing two values. When comparing attribute values between features, normalization minimizes the effect of varying map areas and the number of observations. For example, dividing the 18 to 30 year old population by the area of a polygon feature yields a density value that can be compared evenly with other features, regardless of their size.
    * Indicates how the data is normalized. The data value obtained from the `field` is normalized in one of the following ways before it is compared with the class breaks. See the table below for a list of possible values.
    *
    * Possible Value | Description
    * ---------------|------------
    * field | Divides the `field` value by the value of `normalizationField`. This value is set by default if the `normalizationField` is provided.
    * log | Computes the base 10 logarithm of the data value. This can be a useful approach for some data distributions because it reduces the influence of very large data values.
    * percent-of-total | Divides the data value by the sum of all data values then multiplies by 100. Use `normalizationTotal` to define the total value by which to normalize. This value is set by default if the `normalizationTotal` is provided.
    *
    * @param params.normalizationTotal When `normalizationType` is `percent-of-total`, this property contains the total of all data values.
    * @param params.classificationMethod
    * The classification method used for generating breaks. See the table below for a list of possible values.
    *
    * Possible Value | Description
    * ---------------|------------
    * equal-interval | Divides the range of attribute values into equal-sized subranges. For example, if you specify three classes for a field whose values range from 0 to 300, this method will create three classes with ranges of 0–100, 101–200, and 201–300. Equal interval is best applied to familiar data ranges, such as percentages and temperature. This method emphasizes the amount of an attribute value relative to other values. For example, it could show if a store is part of the group of stores that make up the top one-third of all sales.
    * natural-breaks | Groups similar values that maximize the differences between classes. Features are divided into classes whose boundaries are set where there are relatively big differences in the data values. Natural breaks are data-specific classifications and not useful for comparing multiple maps built from different underlying information.
    * quantile | Assigns the same number of data values to each class. This is well suited to linearly distributed data. Because features are grouped in equal numbers in each class, the resulting map can often be misleading. Similar features can potentially be placed in adjacent classes, or features with widely different values can be put in the same class. You can minimize this distortion by increasing the number of classes.
    * standard-deviation | Creates class breaks with equal value ranges that are a proportion of the standard deviation. This is usually done at intervals of one, one-half, one-third, or one-fourth standard deviations from the mean.
    * @param params.standardDeviationInterval If a `standard-deviation` classification method is used, then this indicates the interval by which to generate class breaks.  **Possible Values:** 1 | 0.5 | 0.33 | 0.25
    * @param params.numClasses The number of class breaks to generate. This is ignored if a `standard-deviation` classification method is specified.
    * @param params.sizeScheme In authoring apps, the user may select a pre-defined size scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    * @param params.valueExpression An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    * @param params.valueExpressionTitle Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    * @param params.sqlExpression A SQL expression evaluating to a number.
    * @param params.sqlWhere A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    * @param params.outlineOptimizationEnabled Only for polygon layers. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.legendOptions Provides options for setting a title to describe a field instead of using the field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    * @param params.minValue A minimum value set by the user. Use this in conjunction with `maxValue` to generate class breaks between lower and upper bounds. This will be the lower bound of the lowest class break.
    * @param params.maxValue A maximum value set by the user. Use this in conjunction with `minValue` to generate class breaks between lower and upper bounds. This will be the upper bound of the highest class break.
    * @param params.defaultSymbolEnabled Enables the `defaultSymbol` on the renderer and assigns it to features with no value and features that do not fall within the configured data range.
    * @param params.symbolType
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. Possible values are described below.
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    * | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    * | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and only the symbol's height should be variable, for example with cylinders. A SceneView instance must be provided to the `view` parameter if this option is used. |
    * | 3d-volumetric-uniform | Generates a visualization using uniformly sized 3D symbols with volumetric symbol layers. Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and the symbol should be sized uniformly, for example with spheres. A SceneView instance must be provided to the `view` parameter if this option is used. |
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def createClassBreaksRenderer(params: sizeCreateClassBreaksRendererParams): js.Promise[sizeClassBreaksRendererResult] = js.native
  
  /**
    * Generates a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) that may be applied directly to the layer used to call this method. The renderer contains a continuous size visual variable that maps marker sizes to specific stop values based on queried statistics from the indicated field or expression.  In most cases you will provide a `layer`, `basemap`, and `field` to generate this renderer. This is a scenario in which the statistics of the data aren't well known and the user doesn't know what sizes to use in the visualization. You can also use a `valueExpression` instead of a `field` to visualize features based on a value returned from a script executed at runtime.  The other options are provided for convenience for more involved custom visualization authoring applications. For example, if you already generated statistics in another operation, you can pass the statistics object to the `statistics` parameter to avoid making an extra call to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    *
    * @param params Input parameters for generating size visual variables based on data returned from a given field or expression. See the table below for details of each parameter.
    * @param params.layer The layer for which the renderer is generated.
    * @param params.view The view where the input layer is rendered. This method inspects the view's background (i.e. basemap, web map background, or view container) to determine optimal colors for the output renderer. This parameter should always be set in practice, but if not provided this method will assume the generated renderer will display on a light background. This parameter is required when creating renderers using a `valueExpression` or for renderers intended for display in a SceneView.
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    * @param params.field The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. This property is ignored if a `valueExpression` is used.
    * @param params.normalizationField The name of the field to normalize the values of the given `field`. Providing a normalization field helps minimize some visualization errors and standardizes the data so all features are visualized with minimal bias due to area differences or count variation. This option is commonly used when visualizing densities.
    * @param params.sizeScheme In authoring apps, the user may select a pre-defined size scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    * @param params.valueExpression An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    * @param params.valueExpressionTitle Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    * @param params.sqlExpression A SQL expression evaluating to a number.
    * @param params.sqlWhere A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    * @param params.outlineOptimizationEnabled Only for polygon layers. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.sizeOptimizationEnabled Indicates whether symbol sizes should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.legendOptions Provides options for setting a title to a field when an expression is provided instead of a field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    * @param params.statistics A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    * @param params.minValue A custom minimum value set by the user. Use this in conjunction with `maxValue` to generate statistics between lower and upper bounds. This will be the lowest stop in the returned size visual variable.
    * @param params.maxValue A custom maximum value set by the user. Use this in conjunction with `minValue` to generate statistics between lower and upper bounds. This will be the uppermost stop in the returned size visual variable.
    * @param params.defaultSymbolEnabled Enables the `defaultSymbol` on the renderer and assigns it to features with no value and features that do not fall within the configured data range.
    * @param params.symbolType
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. Possible values are described below.
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    * | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    * | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and only the symbol's height should be variable, for example with cylinders. A SceneView instance must be provided to the `view` parameter if this option is used. |
    * | 3d-volumetric-uniform | Generates a visualization using uniformly sized 3D symbols with volumetric symbol layers. Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and the symbol should be sized uniformly, for example with spheres. A SceneView instance must be provided to the `view` parameter if this option is used. |
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def createContinuousRenderer(params: sizeCreateContinuousRendererParams): js.Promise[sizeContinuousRendererResult] = js.native
  
  /**
    * This method generates an array of size visual variables with default stops that are optimally chosen based on the statistics queried for the indicated field or expression and mapped to appropriate sizes.  There are two different ways this method may be called. The most common case is by providing a `layer`, `basemap`, and `field`. This is the scenario where the statistics of the data aren't well known and the user doesn't know what sizes to use. You can optionally use a `valueExpression` instead of a field to visualize features based on a numeric value returned from a script executed at runtime.  The other options are provided for convenience for more involved custom visualization authoring applications. For example, if you already generated statistics in another operation, you can pass the object in the `statistics` parameter to avoid making an extra call to the server. You can also provide a `sizeScheme` if you don't want one picked for you. In this case the `basemap` and `theme` options would be ignored.  The resulting array of visual variables will contain exactly one size visual variable unless the `axis` parameter is set to "height".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createVisualVariables)
    *
    * @param params Input parameters for generating size visual variables based on data returned from a given field or expression. See the table below for details of each parameter.
    * @param params.layer The layer for which the visual variables are generated.
    * @param params.view The view where the input layer is rendered. This method inspects the view's background (i.e. basemap, web map background, or view container) to determine optimal colors for the output renderer. This parameter should always be set in practice, but if not provided this method will assume the generated renderer will display on a light background. This parameter is required when creating renderers using a `valueExpression` or for renderers intended for display in a SceneView.
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    * @param params.field The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. This property is ignored if a `valueExpression` is used.
    * @param params.normalizationField The name of the field to normalize the values of the given `field`. Providing a normalization field helps minimize some visualization errors and standardizes the data so all features are visualized with minimal bias due to area differences or count variation. This option is commonly used when visualizing densities.
    * @param params.sizeScheme In authoring apps, the user may select a pre-defined size scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    * @param params.valueExpression An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    * @param params.valueExpressionTitle Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    * @param params.sqlExpression A SQL expression evaluating to a number.
    * @param params.sqlWhere A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    * @param params.sizeOptimizationEnabled Indicates whether symbol sizes should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.legendOptions Provides options for setting a title to a field when an expression is provided instead of a field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    * @param params.statistics A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    * @param params.minValue A custom minimum value set by the user. Use this in conjunction with `maxValue` to generate statistics between lower and upper bounds. This will be the lowest stop in the returned size visual variable.
    * @param params.maxValue A custom maximum value set by the user. Use this in conjunction with `minValue` to generate statistics between lower and upper bounds. This will be the uppermost stop in the returned size visual variable.
    * @param params.worldScale Indicates if the size units of the symbols will be in meters. This should be `true` when generating visualizations with 3D volumetric symbology.
    * @param params.axis When set to `all`, a single size variable that scales uniformly in all dimensions is generated. When set to `height`, the result contains two size visual variables: the first one sizes the height according to the field statistics, while the second defines a constant size for width and depth.
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def createVisualVariables(params: sizeCreateVisualVariablesParams): js.Promise[sizeVisualVariableResult] = js.native
}
object size {
  
  @scala.inline
  def apply(
    createAgeRenderer: sizeCreateAgeRendererParams => js.Promise[sizeAgeRendererResult],
    createClassBreaksRenderer: sizeCreateClassBreaksRendererParams => js.Promise[sizeClassBreaksRendererResult],
    createContinuousRenderer: sizeCreateContinuousRendererParams => js.Promise[sizeContinuousRendererResult],
    createVisualVariables: sizeCreateVisualVariablesParams => js.Promise[sizeVisualVariableResult]
  ): size = {
    val __obj = js.Dynamic.literal(createAgeRenderer = js.Any.fromFunction1(createAgeRenderer), createClassBreaksRenderer = js.Any.fromFunction1(createClassBreaksRenderer), createContinuousRenderer = js.Any.fromFunction1(createContinuousRenderer), createVisualVariables = js.Any.fromFunction1(createVisualVariables))
    __obj.asInstanceOf[size]
  }
  
  @scala.inline
  implicit class sizeOps[Self <: size] (val x: Self) extends AnyVal {
    
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
    def setCreateAgeRenderer(value: sizeCreateAgeRendererParams => js.Promise[sizeAgeRendererResult]): Self = this.set("createAgeRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateClassBreaksRenderer(value: sizeCreateClassBreaksRendererParams => js.Promise[sizeClassBreaksRendererResult]): Self = this.set("createClassBreaksRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateContinuousRenderer(value: sizeCreateContinuousRendererParams => js.Promise[sizeContinuousRendererResult]): Self = this.set("createContinuousRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateVisualVariables(value: sizeCreateVisualVariablesParams => js.Promise[sizeVisualVariableResult]): Self = this.set("createVisualVariables", js.Any.fromFunction1(value))
  }
}

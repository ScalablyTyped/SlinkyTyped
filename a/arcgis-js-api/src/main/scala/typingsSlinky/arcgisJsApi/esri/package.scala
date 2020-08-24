package typingsSlinky.arcgisJsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esri {
  type AfterInterceptorCallback = js.Function1[/* response */ typingsSlinky.arcgisJsApi.esri.RequestResponse, scala.Unit]
  type BarCreatedFunction = js.Function2[/* index */ scala.Double, /* element */ js.Any, scala.Unit]
  type BaseDynamicLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BaseDynamicLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type BaseDynamicLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BaseDynamicLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type BaseDynamicLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BaseDynamicLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type BaseElevationLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BaseElevationLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type BaseElevationLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BaseElevationLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type BaseElevationLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BaseElevationLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type BaseTileLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BaseTileLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type BaseTileLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BaseTileLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type BaseTileLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BaseTileLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type BasemapLayerListTriggerActionEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BasemapLayerListTriggerActionEvent, 
    scala.Unit
  ]
  type BasemapToggleToggleEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.BasemapToggleToggleEvent, scala.Unit]
  type BeforeInterceptorCallback = js.Function1[/* params */ js.Any, js.Any]
  type BingMapsLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BingMapsLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type BingMapsLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BingMapsLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type BingMapsLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BingMapsLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type BookmarksSelectBookmarkEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BookmarksSelectBookmarkEvent, 
    scala.Unit
  ]
  type BuildingSceneLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BuildingSceneLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type BuildingSceneLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BuildingSceneLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type BuildingSceneLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.BuildingSceneLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type ButtonMenuItemClickFunction = js.Function1[/* event */ js.Any, scala.Unit]
  type CSVLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.CSVLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type CSVLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.CSVLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type CSVLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.CSVLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type ClassedColorSliderMaxChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ClassedColorSliderMaxChangeEvent, 
    scala.Unit
  ]
  type ClassedColorSliderMinChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ClassedColorSliderMinChangeEvent, 
    scala.Unit
  ]
  type ClassedColorSliderThumbChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ClassedColorSliderThumbChangeEvent, 
    scala.Unit
  ]
  type ClassedColorSliderThumbDragEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ClassedColorSliderThumbDragEvent, 
    scala.Unit
  ]
  type ClassedColorSliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ClassedColorSliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type ClassedColorSliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ClassedColorSliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type ClassedSizeSliderMaxChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ClassedSizeSliderMaxChangeEvent, 
    scala.Unit
  ]
  type ClassedSizeSliderMinChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ClassedSizeSliderMinChangeEvent, 
    scala.Unit
  ]
  type ClassedSizeSliderThumbChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ClassedSizeSliderThumbChangeEvent, 
    scala.Unit
  ]
  type ClassedSizeSliderThumbDragEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ClassedSizeSliderThumbDragEvent, 
    scala.Unit
  ]
  type ClassedSizeSliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ClassedSizeSliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type ClassedSizeSliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ClassedSizeSliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type ClosestFacilityTaskProperties = typingsSlinky.arcgisJsApi.esri.TaskProperties
  type CollectionAfterAddEventHandler[T] = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.CollectionAfterEvent[T], scala.Unit]
  type CollectionAfterChangesEventHandler[T] = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.CollectionAfterChangesEvent[T], 
    scala.Unit
  ]
  type CollectionAfterRemoveEventHandler[T] = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.CollectionAfterEvent[T], scala.Unit]
  type CollectionBeforeAddEventHandler[T] = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.CollectionBeforeEvent[T], scala.Unit]
  type CollectionBeforeChangesEventHandler[T] = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.CollectionBeforeEvent[T], scala.Unit]
  type CollectionBeforeRemoveEventHandler[T] = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.CollectionBeforeEvent[T], scala.Unit]
  type CollectionChangeEventHandler[T] = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.CollectionChangeEvent[T], scala.Unit]
  type CollectionProperties[T] = js.Array[T] | typingsSlinky.arcgisJsApi.esri.Collection[T]
  type ColorSizeSliderMaxChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ColorSizeSliderMaxChangeEvent, 
    scala.Unit
  ]
  type ColorSizeSliderMinChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ColorSizeSliderMinChangeEvent, 
    scala.Unit
  ]
  type ColorSizeSliderThumbChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ColorSizeSliderThumbChangeEvent, 
    scala.Unit
  ]
  type ColorSizeSliderThumbDragEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ColorSizeSliderThumbDragEvent, 
    scala.Unit
  ]
  type ColorSizeSliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ColorSizeSliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type ColorSizeSliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ColorSizeSliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type ColorSliderMaxChangeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ColorSliderMaxChangeEvent, scala.Unit]
  type ColorSliderMinChangeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ColorSliderMinChangeEvent, scala.Unit]
  type ColorSliderThumbChangeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ColorSliderThumbChangeEvent, scala.Unit]
  type ColorSliderThumbDragEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ColorSliderThumbDragEvent, scala.Unit]
  type ColorSliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ColorSliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type ColorSliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ColorSliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type Constructor[T] = org.scalablytyped.runtime.Instantiable1[/* params (repeated) */ js.Any, T]
  type CreateWorkflowProperties = typingsSlinky.arcgisJsApi.esri.WorkflowProperties
  type CredentialDestroyEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.CredentialDestroyEvent, scala.Unit]
  type CredentialTokenChangeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.CredentialTokenChangeEvent, scala.Unit]
  type DataLineCreatedFunction = js.Function3[
    /* lineElement */ js.Any, 
    /* labelElement */ js.UndefOr[js.Any], 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type DatePickerViewModelProperties = typingsSlinky.arcgisJsApi.esri.MomentElementViewModelProperties
  type DateProperties = scala.Double | java.lang.String | js.Date
  type EasingFunction = js.Function2[/* t */ scala.Double, /* duration */ scala.Double, scala.Double]
  type ElementProperties = typingsSlinky.arcgisJsApi.esri.ElementMixinProperties
  type ElevationLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ElevationLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type ElevationLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ElevationLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type ElevationLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ElevationLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type ElevationSamplerChangedEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ElevationSamplerChangedEvent, 
    scala.Unit
  ]
  type ErrorCallback = js.Function1[/* error */ typingsSlinky.arcgisJsApi.esri.Error, scala.Unit]
  type EventAttachedCallback = js.Function4[
    /* target */ js.UndefOr[js.Any], 
    /* propName */ js.UndefOr[java.lang.String], 
    /* obj */ js.UndefOr[typingsSlinky.arcgisJsApi.esri.Accessor], 
    /* eventName */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type EventHandler = js.Function1[/* event */ js.Any, scala.Unit]
  type Executor = js.Function2[
    /* resolve */ typingsSlinky.arcgisJsApi.esri.ResolveCallback, 
    /* reject */ typingsSlinky.arcgisJsApi.esri.RejectCallback, 
    scala.Unit
  ]
  type FeatureFormSubmitEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.FeatureFormSubmitEvent, scala.Unit]
  type FeatureFormValueChangeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.FeatureFormValueChangeEvent, scala.Unit]
  type FeatureFormViewModelSubmitEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.FeatureFormViewModelSubmitEvent, 
    scala.Unit
  ]
  type FeatureFormViewModelValueChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.FeatureFormViewModelValueChangeEvent, 
    scala.Unit
  ]
  type FeatureLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.FeatureLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type FeatureLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.FeatureLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type FeatureLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.FeatureLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type FeatureTableSelectionChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.FeatureTableSelectionChangeEvent, 
    scala.Unit
  ]
  type FeatureTemplatesSelectEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.FeatureTemplatesSelectEvent, scala.Unit]
  type FeatureTemplatesViewModelSelectEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.FeatureTemplatesViewModelSelectEvent, 
    scala.Unit
  ]
  type FilterFunction = js.Function1[/* filterName */ js.Any, scala.Boolean]
  type FilterPredicateCallback = js.Function2[/* value */ js.Any, /* index */ scala.Double, js.Promise[js.Any]]
  type GeoJSONLayerEditsEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.GeoJSONLayerEditsEvent, scala.Unit]
  type GeoJSONLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.GeoJSONLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type GeoJSONLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.GeoJSONLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type GeoJSONLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.GeoJSONLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type GeoRSSLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.GeoRSSLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type GeoRSSLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.GeoRSSLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type GeoRSSLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.GeoRSSLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type GeoRSSLayerViewProperties = typingsSlinky.arcgisJsApi.esri.LayerViewProperties
  type GeometryServiceProperties = typingsSlinky.arcgisJsApi.esri.TaskProperties
  type GetHeader = js.Function1[/* headerName */ java.lang.String, java.lang.String]
  type GetResultsHandler = js.Function1[
    /* params */ js.Any, 
    js.Promise[js.Array[typingsSlinky.arcgisJsApi.esri.SearchResult]]
  ]
  type GetSuggestionsParameters = js.Function1[
    /* params */ js.Any, 
    js.Promise[js.Array[typingsSlinky.arcgisJsApi.esri.SuggestResult]]
  ]
  type GoToOverride = js.Function2[
    /* view */ typingsSlinky.arcgisJsApi.esri.MapView | typingsSlinky.arcgisJsApi.esri.SceneView, 
    /* goToParameters */ js.Any, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - js.Array[
  scala.Double | typingsSlinky.arcgisJsApi.esri.Geometry_ | typingsSlinky.arcgisJsApi.esri.Graphic]
    - typingsSlinky.arcgisJsApi.esri.Geometry_
    - typingsSlinky.arcgisJsApi.esri.Collection[
  typingsSlinky.arcgisJsApi.esri.Geometry_ | typingsSlinky.arcgisJsApi.esri.Graphic]
    - typingsSlinky.arcgisJsApi.esri.Graphic
    - typingsSlinky.arcgisJsApi.esri.Viewpoint
    - js.Any
  */
  type GoToTarget2D = typingsSlinky.arcgisJsApi.esri._GoToTarget2D | (js.Array[
    scala.Double | typingsSlinky.arcgisJsApi.esri.Geometry_ | typingsSlinky.arcgisJsApi.esri.Graphic
  ]) | (typingsSlinky.arcgisJsApi.esri.Collection[
    typingsSlinky.arcgisJsApi.esri.Geometry_ | typingsSlinky.arcgisJsApi.esri.Graphic
  ]) | js.Any
  /* Rewritten from type alias, can be one of: 
    - js.Array[
  scala.Double | typingsSlinky.arcgisJsApi.esri.Geometry_ | typingsSlinky.arcgisJsApi.esri.Graphic]
    - typingsSlinky.arcgisJsApi.esri.Geometry_
    - typingsSlinky.arcgisJsApi.esri.Collection[
  typingsSlinky.arcgisJsApi.esri.Geometry_ | typingsSlinky.arcgisJsApi.esri.Graphic]
    - typingsSlinky.arcgisJsApi.esri.Graphic
    - typingsSlinky.arcgisJsApi.esri.Camera
    - typingsSlinky.arcgisJsApi.esri.Viewpoint
    - js.Any
  */
  type GoToTarget3D = typingsSlinky.arcgisJsApi.esri._GoToTarget3D | (js.Array[
    scala.Double | typingsSlinky.arcgisJsApi.esri.Geometry_ | typingsSlinky.arcgisJsApi.esri.Graphic
  ]) | (typingsSlinky.arcgisJsApi.esri.Collection[
    typingsSlinky.arcgisJsApi.esri.Geometry_ | typingsSlinky.arcgisJsApi.esri.Graphic
  ]) | js.Any
  type GraphicsLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.GraphicsLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type GraphicsLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.GraphicsLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type GraphicsLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.GraphicsLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type GraphicsLayerViewProperties = typingsSlinky.arcgisJsApi.esri.LayerViewProperties
  type GroupByFunction = js.Function1[/* grouping */ js.Any, java.lang.String | js.Any]
  type GroupLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.GroupLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type GroupLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.GroupLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type GroupLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.GroupLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type HandlerCallback = js.Function5[
    /* authorizeParams */ js.Any, 
    /* authorizeUrl */ java.lang.String, 
    /* oAuthInfo */ typingsSlinky.arcgisJsApi.esri.OAuthInfo, 
    /* resourceUrl */ java.lang.String, 
    /* serverInfo */ typingsSlinky.arcgisJsApi.esri.ServerInfo, 
    scala.Unit
  ]
  type HeatmapSliderThumbChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.HeatmapSliderThumbChangeEvent, 
    scala.Unit
  ]
  type HeatmapSliderThumbDragEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.HeatmapSliderThumbDragEvent, scala.Unit]
  type HeatmapSliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.HeatmapSliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type HeatmapSliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.HeatmapSliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type HistogramRangeSliderMaxChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.HistogramRangeSliderMaxChangeEvent, 
    scala.Unit
  ]
  type HistogramRangeSliderMinChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.HistogramRangeSliderMinChangeEvent, 
    scala.Unit
  ]
  type HistogramRangeSliderSegmentDragEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.HistogramRangeSliderSegmentDragEvent, 
    scala.Unit
  ]
  type HistogramRangeSliderThumbChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.HistogramRangeSliderThumbChangeEvent, 
    scala.Unit
  ]
  type HistogramRangeSliderThumbDragEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.HistogramRangeSliderThumbDragEvent, 
    scala.Unit
  ]
  type HistogramRangeSliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.HistogramRangeSliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type HistogramRangeSliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.HistogramRangeSliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.arcgisJsApi.esri.Layer
    - typingsSlinky.arcgisJsApi.esri.Graphic
    - typingsSlinky.arcgisJsApi.esri.Collection[typingsSlinky.arcgisJsApi.esri.Graphic | typingsSlinky.arcgisJsApi.esri.Layer]
    - js.Array[typingsSlinky.arcgisJsApi.esri.Graphic | typingsSlinky.arcgisJsApi.esri.Layer]
  */
  type HitTestItem = typingsSlinky.arcgisJsApi.esri._HitTestItem | (typingsSlinky.arcgisJsApi.esri.Collection[typingsSlinky.arcgisJsApi.esri.Graphic | typingsSlinky.arcgisJsApi.esri.Layer]) | (js.Array[typingsSlinky.arcgisJsApi.esri.Graphic | typingsSlinky.arcgisJsApi.esri.Layer])
  type HomeGoEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.HomeGoEvent, scala.Unit]
  type HomeViewModelGoEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.HomeViewModelGoEvent, scala.Unit]
  type IdentityManagerCredentialCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.IdentityManagerCredentialCreateEvent, 
    scala.Unit
  ]
  type IdentityManagerDialogCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.IdentityManagerDialogCreateEvent, 
    scala.Unit
  ]
  type ImageServiceIdentifyTask = typingsSlinky.arcgisJsApi.esri.Task
  type ImageServiceIdentifyTaskProperties = typingsSlinky.arcgisJsApi.esri.TaskProperties
  type ImageryLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ImageryLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type ImageryLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ImageryLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type ImageryLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ImageryLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type ImageryTileLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ImageryTileLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type ImageryTileLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ImageryTileLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type ImageryTileLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ImageryTileLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type InheritedDomainProperties = typingsSlinky.arcgisJsApi.esri.DomainProperties
  type InputCreatedFunction = js.Function3[
    /* inputElement */ js.Any, 
    /* type */ typingsSlinky.arcgisJsApi.arcgisJsApiStrings.max | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.min | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.thumb, 
    /* thumbIndex */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type InputParser = js.Function3[
    /* value */ java.lang.String, 
    /* type */ js.UndefOr[
      typingsSlinky.arcgisJsApi.arcgisJsApiStrings.average | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.min | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.max | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tick | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.value
    ], 
    /* index */ js.UndefOr[scala.Double], 
    scala.Double
  ]
  type IntegratedMeshLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.IntegratedMeshLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type IntegratedMeshLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.IntegratedMeshLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type IntegratedMeshLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.IntegratedMeshLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type ItemCallback[T] = js.Function2[/* item */ T, /* index */ scala.Double, scala.Unit]
  type ItemCompareCallback[T] = js.Function2[/* firstItem */ T, /* secondItem */ T, scala.Double]
  type ItemMapCallback[T, R] = js.Function2[/* item */ T, /* index */ scala.Double, R]
  type ItemReduceCallback[T, R] = js.Function3[/* previousValue */ R, /* currentValue */ T, /* index */ scala.Double, R]
  type ItemTestCallback[T] = js.Function2[/* item */ T, /* index */ scala.Double, scala.Boolean]
  type KMLLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.KMLLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type KMLLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.KMLLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type KMLLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.KMLLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type KMLLayerViewProperties = typingsSlinky.arcgisJsApi.esri.LayerViewProperties
  type LabelFormatter = js.Function3[
    /* value */ scala.Double, 
    /* type */ js.UndefOr[java.lang.String], 
    /* index */ js.UndefOr[scala.Double], 
    java.lang.String
  ]
  type LayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.LayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type LayerLayerviewCreateEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.LayerLayerviewCreateEvent, scala.Unit]
  type LayerLayerviewDestroyEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.LayerLayerviewDestroyEvent, scala.Unit]
  type LayerListTriggerActionEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.LayerListTriggerActionEvent, scala.Unit]
  type LayerListViewModelTriggerActionEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.LayerListViewModelTriggerActionEvent, 
    scala.Unit
  ]
  type LineSymbol3DProperties = typingsSlinky.arcgisJsApi.esri.Symbol3DProperties
  type ListItemCreatedHandler = js.Function1[/* event */ js.Any, scala.Unit]
  type LocateLocateErrorEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.LocateLocateErrorEvent, scala.Unit]
  type LocateLocateEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.LocateLocateEvent, scala.Unit]
  type LocateViewModelLocateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.LocateViewModelLocateErrorEvent, 
    scala.Unit
  ]
  type MapImageLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.MapImageLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type MapImageLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.MapImageLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type MapImageLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.MapImageLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type MapNotesLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.MapNotesLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type MapNotesLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.MapNotesLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type MapNotesLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.MapNotesLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type MapViewBlurEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewBlurEvent, scala.Unit]
  type MapViewClickEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewClickEvent, scala.Unit]
  type MapViewDoubleClickEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewDoubleClickEvent, scala.Unit]
  type MapViewDragEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewDragEvent, scala.Unit]
  type MapViewFocusEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewFocusEvent, scala.Unit]
  type MapViewHoldEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewHoldEvent, scala.Unit]
  type MapViewImmediateClickEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewImmediateClickEvent, scala.Unit]
  type MapViewImmediateDoubleClickEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.MapViewImmediateDoubleClickEvent, 
    scala.Unit
  ]
  type MapViewKeyDownEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewKeyDownEvent, scala.Unit]
  type MapViewKeyUpEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewKeyUpEvent, scala.Unit]
  type MapViewLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.MapViewLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type MapViewLayerviewCreateEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewLayerviewCreateEvent, scala.Unit]
  type MapViewLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.MapViewLayerviewDestroyEvent, 
    scala.Unit
  ]
  type MapViewMouseWheelEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewMouseWheelEvent, scala.Unit]
  type MapViewPointerDownEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewPointerDownEvent, scala.Unit]
  type MapViewPointerEnterEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewPointerEnterEvent, scala.Unit]
  type MapViewPointerLeaveEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewPointerLeaveEvent, scala.Unit]
  type MapViewPointerMoveEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewPointerMoveEvent, scala.Unit]
  type MapViewPointerUpEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewPointerUpEvent, scala.Unit]
  type MapViewResizeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.MapViewResizeEvent, scala.Unit]
  type MeshSymbol3DProperties = typingsSlinky.arcgisJsApi.esri.Symbol3DProperties
  type MultipointDrawActionCursorUpdateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.MultipointDrawActionCursorUpdateEvent, 
    scala.Unit
  ]
  type MultipointDrawActionDrawCompleteEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.MultipointDrawActionDrawCompleteEvent, 
    scala.Unit
  ]
  type MultipointDrawActionProperties = typingsSlinky.arcgisJsApi.esri.DrawActionProperties
  type MultipointDrawActionRedoEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.MultipointDrawActionRedoEvent, 
    scala.Unit
  ]
  type MultipointDrawActionUndoEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.MultipointDrawActionUndoEvent, 
    scala.Unit
  ]
  type MultipointDrawActionVertexAddEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.MultipointDrawActionVertexAddEvent, 
    scala.Unit
  ]
  type MultipointDrawActionVertexRemoveEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.MultipointDrawActionVertexRemoveEvent, 
    scala.Unit
  ]
  type OGCFeatureLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.OGCFeatureLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type OGCFeatureLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.OGCFeatureLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type OGCFeatureLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.OGCFeatureLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type OpacitySliderMaxChangeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.OpacitySliderMaxChangeEvent, scala.Unit]
  type OpacitySliderMinChangeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.OpacitySliderMinChangeEvent, scala.Unit]
  type OpacitySliderThumbChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.OpacitySliderThumbChangeEvent, 
    scala.Unit
  ]
  type OpacitySliderThumbDragEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.OpacitySliderThumbDragEvent, scala.Unit]
  type OpacitySliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.OpacitySliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type OpacitySliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.OpacitySliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type OpenStreetMapLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.OpenStreetMapLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type OpenStreetMapLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.OpenStreetMapLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type OpenStreetMapLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.OpenStreetMapLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type OpenStreetMapLayerProperties = typingsSlinky.arcgisJsApi.esri.WebTileLayerProperties
  type PhaseCallback = js.Function1[/* event */ js.UndefOr[typingsSlinky.arcgisJsApi.esri.PhaseEvent], scala.Unit]
  type PointCloudLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.PointCloudLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type PointCloudLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.PointCloudLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type PointCloudLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.PointCloudLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type PointCloudLayerViewProperties = typingsSlinky.arcgisJsApi.esri.LayerViewProperties
  type PointDrawActionCursorUpdateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.PointDrawActionCursorUpdateEvent, 
    scala.Unit
  ]
  type PointDrawActionDrawCompleteEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.PointDrawActionDrawCompleteEvent, 
    scala.Unit
  ]
  type PointDrawActionProperties = typingsSlinky.arcgisJsApi.esri.DrawActionProperties
  type PolygonDrawActionCursorUpdateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.PolygonDrawActionCursorUpdateEvent, 
    scala.Unit
  ]
  type PolygonDrawActionDrawCompleteEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.PolygonDrawActionDrawCompleteEvent, 
    scala.Unit
  ]
  type PolygonDrawActionRedoEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.PolygonDrawActionRedoEvent, scala.Unit]
  type PolygonDrawActionUndoEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.PolygonDrawActionUndoEvent, scala.Unit]
  type PolygonDrawActionVertexAddEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.PolygonDrawActionVertexAddEvent, 
    scala.Unit
  ]
  type PolygonDrawActionVertexRemoveEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.PolygonDrawActionVertexRemoveEvent, 
    scala.Unit
  ]
  type PolygonSymbol3DProperties = typingsSlinky.arcgisJsApi.esri.Symbol3DProperties
  type PolylineDrawActionCursorUpdateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.PolylineDrawActionCursorUpdateEvent, 
    scala.Unit
  ]
  type PolylineDrawActionDrawCompleteEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.PolylineDrawActionDrawCompleteEvent, 
    scala.Unit
  ]
  type PolylineDrawActionRedoEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.PolylineDrawActionRedoEvent, scala.Unit]
  type PolylineDrawActionUndoEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.PolylineDrawActionUndoEvent, scala.Unit]
  type PolylineDrawActionVertexAddEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.PolylineDrawActionVertexAddEvent, 
    scala.Unit
  ]
  type PolylineDrawActionVertexRemoveEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.PolylineDrawActionVertexRemoveEvent, 
    scala.Unit
  ]
  type PopupTemplateContentCreator = js.Function1[
    /* graphic */ typingsSlinky.arcgisJsApi.esri.Graphic, 
    java.lang.String | org.scalajs.dom.raw.HTMLElement | typingsSlinky.arcgisJsApi.esri.Widget_ | js.Promise[js.Any]
  ]
  type PopupTemplateContentDestroyer = js.Function1[/* graphic */ typingsSlinky.arcgisJsApi.esri.Graphic, scala.Unit]
  type PopupTriggerActionEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.PopupTriggerActionEvent, scala.Unit]
  type PopupViewModelTriggerActionEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.PopupViewModelTriggerActionEvent, 
    scala.Unit
  ]
  type RejectCallback = js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]
  type RenderContextCallback = js.Function1[/* context */ js.UndefOr[typingsSlinky.arcgisJsApi.esri.RenderContext], scala.Unit]
  type ResolveCallback = js.Function1[/* value */ js.UndefOr[js.Any | js.Promise[js.Any]], scala.Unit]
  type RouteTaskProperties = typingsSlinky.arcgisJsApi.esri.TaskProperties
  type SceneLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SceneLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type SceneLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SceneLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type SceneLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SceneLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type SceneModificationsProperties = typingsSlinky.arcgisJsApi.esri.CollectionPropertiesBase[typingsSlinky.arcgisJsApi.esri.SceneModificationProperties]
  type SceneViewBlurEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SceneViewBlurEvent, scala.Unit]
  type SceneViewClickEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SceneViewClickEvent, scala.Unit]
  type SceneViewDoubleClickEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SceneViewDoubleClickEvent, scala.Unit]
  type SceneViewDragEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SceneViewDragEvent, scala.Unit]
  type SceneViewFocusEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SceneViewFocusEvent, scala.Unit]
  type SceneViewHoldEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SceneViewHoldEvent, scala.Unit]
  type SceneViewImmediateClickEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SceneViewImmediateClickEvent, 
    scala.Unit
  ]
  type SceneViewImmediateDoubleClickEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SceneViewImmediateDoubleClickEvent, 
    scala.Unit
  ]
  type SceneViewKeyDownEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SceneViewKeyDownEvent, scala.Unit]
  type SceneViewKeyUpEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SceneViewKeyUpEvent, scala.Unit]
  type SceneViewLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SceneViewLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type SceneViewLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SceneViewLayerviewCreateEvent, 
    scala.Unit
  ]
  type SceneViewLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SceneViewLayerviewDestroyEvent, 
    scala.Unit
  ]
  type SceneViewMouseWheelEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SceneViewMouseWheelEvent, scala.Unit]
  type SceneViewPointerDownEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SceneViewPointerDownEvent, scala.Unit]
  type SceneViewPointerEnterEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SceneViewPointerEnterEvent, scala.Unit]
  type SceneViewPointerLeaveEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SceneViewPointerLeaveEvent, scala.Unit]
  type SceneViewPointerMoveEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SceneViewPointerMoveEvent, scala.Unit]
  type SceneViewPointerUpEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SceneViewPointerUpEvent, scala.Unit]
  type SceneViewResizeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SceneViewResizeEvent, scala.Unit]
  type SearchSearchBlurEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SearchSearchBlurEvent, scala.Unit]
  type SearchSearchClearEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SearchSearchClearEvent, scala.Unit]
  type SearchSearchCompleteEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SearchSearchCompleteEvent, scala.Unit]
  type SearchSearchFocusEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SearchSearchFocusEvent, scala.Unit]
  type SearchSearchStartEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SearchSearchStartEvent, scala.Unit]
  type SearchSelectResultEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SearchSelectResultEvent, scala.Unit]
  type SearchSuggestCompleteEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SearchSuggestCompleteEvent, scala.Unit]
  type SearchSuggestStartEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SearchSuggestStartEvent, scala.Unit]
  type SearchViewModelSearchClearEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SearchViewModelSearchClearEvent, 
    scala.Unit
  ]
  type SearchViewModelSearchCompleteEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SearchViewModelSearchCompleteEvent, 
    scala.Unit
  ]
  type SearchViewModelSearchStartEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SearchViewModelSearchStartEvent, 
    scala.Unit
  ]
  type SearchViewModelSelectResultEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SearchViewModelSelectResultEvent, 
    scala.Unit
  ]
  type SearchViewModelSuggestCompleteEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SearchViewModelSuggestCompleteEvent, 
    scala.Unit
  ]
  type SearchViewModelSuggestStartEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SearchViewModelSuggestStartEvent, 
    scala.Unit
  ]
  type SegmentDrawActionCursorUpdateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SegmentDrawActionCursorUpdateEvent, 
    scala.Unit
  ]
  type SegmentDrawActionDrawCompleteEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SegmentDrawActionDrawCompleteEvent, 
    scala.Unit
  ]
  type SegmentDrawActionVertexAddEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SegmentDrawActionVertexAddEvent, 
    scala.Unit
  ]
  type ServiceAreaTaskProperties = typingsSlinky.arcgisJsApi.esri.TaskProperties
  type SizeSliderMaxChangeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SizeSliderMaxChangeEvent, scala.Unit]
  type SizeSliderMinChangeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SizeSliderMinChangeEvent, scala.Unit]
  type SizeSliderThumbChangeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SizeSliderThumbChangeEvent, scala.Unit]
  type SizeSliderThumbDragEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SizeSliderThumbDragEvent, scala.Unit]
  type SizeSliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SizeSliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type SizeSliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SizeSliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type SketchCreateEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SketchCreateEvent, scala.Unit]
  type SketchDeleteEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SketchDeleteEvent, scala.Unit]
  type SketchRedoEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SketchRedoEvent, scala.Unit]
  type SketchUndoEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SketchUndoEvent, scala.Unit]
  type SketchUpdateEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SketchUpdateEvent, scala.Unit]
  type SketchViewModelCreateEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SketchViewModelCreateEvent, scala.Unit]
  type SketchViewModelDeleteEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SketchViewModelDeleteEvent, scala.Unit]
  type SketchViewModelRedoEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SketchViewModelRedoEvent, scala.Unit]
  type SketchViewModelUndoEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SketchViewModelUndoEvent, scala.Unit]
  type SketchViewModelUpdateEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SketchViewModelUpdateEvent, scala.Unit]
  type SliderLabelFormatter = js.Function3[
    /* value */ scala.Double, 
    /* type */ js.UndefOr[
      typingsSlinky.arcgisJsApi.arcgisJsApiStrings.average | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.min | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.max | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tick | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.value
    ], 
    /* index */ js.UndefOr[scala.Double], 
    java.lang.String
  ]
  type SliderMaxChangeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SliderMaxChangeEvent, scala.Unit]
  type SliderMinChangeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SliderMinChangeEvent, scala.Unit]
  type SliderSegmentDragEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SliderSegmentDragEvent, scala.Unit]
  type SliderThumbChangeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SliderThumbChangeEvent, scala.Unit]
  type SliderThumbDragEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.SliderThumbDragEvent, scala.Unit]
  type SliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type SliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type SmartMappingSliderBaseLabelFormatter = js.Function3[
    /* value */ scala.Double, 
    /* type */ js.UndefOr[
      typingsSlinky.arcgisJsApi.arcgisJsApiStrings.average | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.min | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.max | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.value
    ], 
    /* index */ js.UndefOr[scala.Double], 
    java.lang.String
  ]
  type SmartMappingSliderBaseMaxChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SmartMappingSliderBaseMaxChangeEvent, 
    scala.Unit
  ]
  type SmartMappingSliderBaseMinChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SmartMappingSliderBaseMinChangeEvent, 
    scala.Unit
  ]
  type SmartMappingSliderBaseThumbChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SmartMappingSliderBaseThumbChangeEvent, 
    scala.Unit
  ]
  type SmartMappingSliderBaseThumbDragEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SmartMappingSliderBaseThumbDragEvent, 
    scala.Unit
  ]
  type SmartMappingSliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SmartMappingSliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type SmartMappingSliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.SmartMappingSliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type SpinnerViewModel = typingsSlinky.arcgisJsApi.esri.Accessor
  type StreamLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.StreamLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type StreamLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.StreamLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type StreamLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.StreamLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type StreamLayerViewDataReceivedEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.StreamLayerViewDataReceivedEvent, 
    scala.Unit
  ]
  type ThumbCreatedFunction = js.Function4[
    /* index */ scala.Double, 
    /* value */ scala.Double, 
    /* thumbElement */ org.scalajs.dom.raw.HTMLElement, 
    /* labelElement */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  type TickCreatedFunction = js.Function3[
    /* value */ scala.Double, 
    /* tickElement */ org.scalajs.dom.raw.HTMLElement, 
    /* labelElement */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  type TileLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.TileLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type TileLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.TileLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type TileLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.TileLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type TimePickerViewModelProperties = typingsSlinky.arcgisJsApi.esri.MomentElementViewModelProperties
  type TrackTrackErrorEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.TrackTrackErrorEvent, scala.Unit]
  type TrackTrackEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.TrackTrackEvent, scala.Unit]
  type TrackViewModelTrackErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.TrackViewModelTrackErrorEvent, 
    scala.Unit
  ]
  type TrackViewModelTrackEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.TrackViewModelTrackEvent, scala.Unit]
  type UnknownLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.UnknownLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type UnknownLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.UnknownLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type UnknownLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.UnknownLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type UnknownLayerProperties = typingsSlinky.arcgisJsApi.esri.LayerProperties
  type UnsupportedLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.UnsupportedLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type UnsupportedLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.UnsupportedLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type UnsupportedLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.UnsupportedLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type UnsupportedLayerProperties = typingsSlinky.arcgisJsApi.esri.LayerProperties
  type UpdateWorkflowProperties = typingsSlinky.arcgisJsApi.esri.WorkflowProperties
  type VectorTileLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.VectorTileLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type VectorTileLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.VectorTileLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type VectorTileLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.VectorTileLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type ViewBlurEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewBlurEvent, scala.Unit]
  type ViewClickEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewClickEvent, scala.Unit]
  type ViewDoubleClickEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewDoubleClickEvent, scala.Unit]
  type ViewDragEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewDragEvent, scala.Unit]
  type ViewFocusEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewFocusEvent, scala.Unit]
  type ViewHoldEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewHoldEvent, scala.Unit]
  type ViewImmediateClickEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewImmediateClickEvent, scala.Unit]
  type ViewImmediateDoubleClickEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ViewImmediateDoubleClickEvent, 
    scala.Unit
  ]
  type ViewKeyDownEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewKeyDownEvent, scala.Unit]
  type ViewKeyUpEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewKeyUpEvent, scala.Unit]
  type ViewLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.ViewLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type ViewLayerviewCreateEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewLayerviewCreateEvent, scala.Unit]
  type ViewLayerviewDestroyEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewLayerviewDestroyEvent, scala.Unit]
  type ViewMouseWheelEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewMouseWheelEvent, scala.Unit]
  type ViewPointerDownEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewPointerDownEvent, scala.Unit]
  type ViewPointerEnterEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewPointerEnterEvent, scala.Unit]
  type ViewPointerLeaveEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewPointerLeaveEvent, scala.Unit]
  type ViewPointerMoveEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewPointerMoveEvent, scala.Unit]
  type ViewPointerUpEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewPointerUpEvent, scala.Unit]
  type ViewResizeEventHandler = js.Function1[/* event */ typingsSlinky.arcgisJsApi.esri.ViewResizeEvent, scala.Unit]
  type WMSLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.WMSLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type WMSLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.WMSLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type WMSLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.WMSLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type WMTSLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.WMTSLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type WMTSLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.WMTSLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type WMTSLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.WMTSLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type WatchCallback = js.Function4[
    /* newValue */ js.Any, 
    /* oldValue */ js.Any, 
    /* propertyName */ java.lang.String, 
    /* target */ typingsSlinky.arcgisJsApi.esri.Accessor, 
    scala.Unit
  ]
  type WebTileLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.WebTileLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type WebTileLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.WebTileLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type WebTileLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typingsSlinky.arcgisJsApi.esri.WebTileLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type contentAttachmentsContent = typingsSlinky.arcgisJsApi.esri.AttachmentsContent
  type contentCustomContent = typingsSlinky.arcgisJsApi.esri.CustomContent
  type contentFieldsContent = typingsSlinky.arcgisJsApi.esri.FieldsContent
  type contentMediaContent = typingsSlinky.arcgisJsApi.esri.MediaContent
  type contentTextContent = typingsSlinky.arcgisJsApi.esri.TextContent
  type elementsFieldElement = typingsSlinky.arcgisJsApi.esri.FieldElement
  type elementsGroupElement = typingsSlinky.arcgisJsApi.esri.GroupElement
  type geometryExtent = typingsSlinky.arcgisJsApi.esri.Extent
  type geometryMesh = typingsSlinky.arcgisJsApi.esri.Mesh
  type geometryMultipoint = typingsSlinky.arcgisJsApi.esri.Multipoint
  type geometryPoint = typingsSlinky.arcgisJsApi.esri.Point
  type geometryPolygon = typingsSlinky.arcgisJsApi.esri.Polygon
  type geometryPolyline = typingsSlinky.arcgisJsApi.esri.Polyline
  type geometrySpatialReference = typingsSlinky.arcgisJsApi.esri.SpatialReference
  type inputsTextAreaInput = typingsSlinky.arcgisJsApi.esri.TextAreaInput
  type inputsTextBoxInput = typingsSlinky.arcgisJsApi.esri.TextBoxInput
  type pointCloudRenderersPointCloudClassBreaksRenderer = typingsSlinky.arcgisJsApi.esri.PointCloudClassBreaksRenderer
  type pointCloudRenderersPointCloudRGBRenderer = typingsSlinky.arcgisJsApi.esri.PointCloudRGBRenderer
  type pointCloudRenderersPointCloudStretchRenderer = typingsSlinky.arcgisJsApi.esri.PointCloudStretchRenderer
  type pointCloudRenderersPointCloudUniqueValueRenderer = typingsSlinky.arcgisJsApi.esri.PointCloudUniqueValueRenderer
  type rasterRenderersClassBreaksRenderer = typingsSlinky.arcgisJsApi.esri.ClassBreaksRenderer
  type rasterRenderersRasterColormapRenderer = typingsSlinky.arcgisJsApi.esri.RasterColormapRenderer
  type rasterRenderersRasterShadedReliefRenderer = typingsSlinky.arcgisJsApi.esri.RasterShadedReliefRenderer
  type rasterRenderersRasterStretchRenderer = typingsSlinky.arcgisJsApi.esri.RasterStretchRenderer
  type rasterRenderersUniqueValueRenderer = typingsSlinky.arcgisJsApi.esri.UniqueValueRenderer
  type renderersClassBreaksRenderer = typingsSlinky.arcgisJsApi.esri.ClassBreaksRenderer
  type renderersDotDensityRenderer = typingsSlinky.arcgisJsApi.esri.DotDensityRenderer
  type renderersHeatmapRenderer = typingsSlinky.arcgisJsApi.esri.HeatmapRenderer
  type renderersSimpleRenderer = typingsSlinky.arcgisJsApi.esri.SimpleRenderer
  type renderersUniqueValueRenderer = typingsSlinky.arcgisJsApi.esri.UniqueValueRenderer
  type symbolsCIMSymbol = typingsSlinky.arcgisJsApi.esri.CIMSymbol
  type symbolsExtrudeSymbol3DLayer = typingsSlinky.arcgisJsApi.esri.ExtrudeSymbol3DLayer
  type symbolsFillSymbol3DLayer = typingsSlinky.arcgisJsApi.esri.FillSymbol3DLayer
  type symbolsFont = typingsSlinky.arcgisJsApi.esri.Font
  type symbolsIconSymbol3DLayer = typingsSlinky.arcgisJsApi.esri.IconSymbol3DLayer
  type symbolsLabelSymbol3D = typingsSlinky.arcgisJsApi.esri.LabelSymbol3D
  type symbolsLineSymbol3D = typingsSlinky.arcgisJsApi.esri.LineSymbol3D
  type symbolsLineSymbol3DLayer = typingsSlinky.arcgisJsApi.esri.LineSymbol3DLayer
  type symbolsMeshSymbol3D = typingsSlinky.arcgisJsApi.esri.MeshSymbol3D
  type symbolsObjectSymbol3DLayer = typingsSlinky.arcgisJsApi.esri.ObjectSymbol3DLayer
  type symbolsPathSymbol3DLayer = typingsSlinky.arcgisJsApi.esri.PathSymbol3DLayer
  type symbolsPictureFillSymbol = typingsSlinky.arcgisJsApi.esri.PictureFillSymbol
  type symbolsPictureMarkerSymbol = typingsSlinky.arcgisJsApi.esri.PictureMarkerSymbol
  type symbolsPointSymbol3D = typingsSlinky.arcgisJsApi.esri.PointSymbol3D
  type symbolsPolygonSymbol3D = typingsSlinky.arcgisJsApi.esri.PolygonSymbol3D
  type symbolsSimpleFillSymbol = typingsSlinky.arcgisJsApi.esri.SimpleFillSymbol
  type symbolsSimpleLineSymbol = typingsSlinky.arcgisJsApi.esri.SimpleLineSymbol
  type symbolsSimpleMarkerSymbol = typingsSlinky.arcgisJsApi.esri.SimpleMarkerSymbol
  type symbolsTextSymbol = typingsSlinky.arcgisJsApi.esri.TextSymbol
  type symbolsTextSymbol3DLayer = typingsSlinky.arcgisJsApi.esri.TextSymbol3DLayer
  type symbolsWaterSymbol3DLayer = typingsSlinky.arcgisJsApi.esri.WaterSymbol3DLayer
  type symbolsWebStyleSymbol = typingsSlinky.arcgisJsApi.esri.WebStyleSymbol
}

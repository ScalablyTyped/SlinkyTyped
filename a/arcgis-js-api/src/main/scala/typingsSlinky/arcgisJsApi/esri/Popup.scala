package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.arcgisJsApi.IHandle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bottom-center`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`top-center`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`trigger-action`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popup
  extends Widget_
     with GoTo {
  
  /**
    * Defines actions that may be executed by clicking the icon or image symbolizing them in the popup. By default, every popup has a `zoom-to` action styled with a magnifying glass icon ![popupTemplate-zoom-action](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popuptemplate-zoom-action.png). When this icon is clicked, the view zooms in four LODs and centers on the selected feature.  You may override this action by removing it from the `actions` array or by setting the [overwriteActions](esri-PopupTemplate.html#overwriteActions) property to `true` in a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html). The order of each action in the popup is the order in which they appear in the array.  The [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#event-trigger-action) event fires each time an action in the popup is clicked. This event should be used to execute custom code for each action clicked. For example, if you would like to add a `zoom-out` action to the popup that zooms the view out several LODs, you would define the zoom-out code in a separate function. Then you would call the custom `zoom-out` function in the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#event-trigger-action) event handler. See the sample code snippet below for more details on how this works.  Actions are defined with the properties listed in the [ActionButton](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [ActionToggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) classes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions)
    */
  var actions: Collection[ActionButton | ActionToggle] = js.native
  
  /**
    * Position of the popup in relation to the selected feature. The default behavior is to display above the feature and adjust if not enough room. If needing to explicitly control where the popup displays in relation to the feature, choose an option besides `auto`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#alignment)
    *
    * @default auto
    */
  var alignment: auto | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right` | js.Function = js.native
  
  /**
    * This closes the popup when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) camera or [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoCloseEnabled)
    *
    * @default false
    */
  var autoCloseEnabled: Boolean = js.native
  
  /**
    * This property indicates to the `Popup` that it needs to allow or disallow the click event propagation.  Use `view.popup.autoOpenEnabled = false;` when needing to stop the click event propagation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#autoOpenEnabled)
    *
    * @default true
    */
  var autoOpenEnabled: Boolean = js.native
  
  /**
    * Use this method to remove focus from the Widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#blur)
    *
    *
    */
  def blur(): Unit = js.native
  
  /**
    * Removes [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises), [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features), [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content), [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title) and [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) from the Popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#clear)
    *
    *
    */
  def clear(): Unit = js.native
  
  /**
    * Closes the popup by setting its [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible) property to `false`. Users can alternatively close the popup by directly setting the [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible) property to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#close)
    *
    *
    */
  def close(): Unit = js.native
  
  /**
    * Indicates whether to enable collapse functionality for the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#collapseEnabled)
    *
    * @default true
    */
  var collapseEnabled: Boolean = js.native
  
  /**
    * Indicates whether the popup displays its content. If `true`, only the header displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#collapsed)
    *
    * @default false
    */
  var collapsed: Boolean = js.native
  
  /**
    * The content of the popup. When set directly on the Popup, this content is static and cannot use fields to set content templates. To set a template for the content based on field or attribute names, see [PopupTemplate.content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content)
    */
  var content: String | HTMLElement | Widget_ = js.native
  
  /**
    * Dock position in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#currentDockPosition)
    */
  val currentDockPosition: auto | `top-center` | `top-right` | `top-left` | `bottom-left` | `bottom-center` | `bottom-right` = js.native
  
  /**
    * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined. Automatic popup templates are supported for layers that support the `createPopupTemplate` method. (Supported for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [OGCFeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html), [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html), and [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html)).
    *   * Starting with version 4.12, [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content can no longer be set using a wildcard, e.g. `*`. Instead, set the `defaultPopupTemplateEnabled` property to `true`.
    *   * Starting with 4.16, the default popup has been improved to no longer display system [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) that do not hold significant value, e.g. `Shape__Area` and `Shape__Length` are two fields that no longer display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled)
    *
    * @default false
    */
  var defaultPopupTemplateEnabled: Boolean = js.native
  
  /**
    * Indicates whether the placement of the popup is docked to the side of the view.  Docking the popup allows for a better user experience, particularly when opening popups in apps on mobile devices. When a popup is "dockEnabled" it means the popup no longer points to the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) or the [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) assigned to it. Rather it is attached to a side, the top, or the bottom of the view.  See [dockOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions) to override default options related to docking the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockEnabled)
    *
    * @default false
    */
  var dockEnabled: Boolean = js.native
  
  /**
    * Docking the popup allows for a better user experience, particularly when opening popups in apps on mobile devices. When a popup is "dockEnabled" it means the popup no longer points to the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) or the [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) assigned to it. Rather it is placed in one of the corners of the view or to the top or bottom of it. This property allows the developer to set various options for docking the popup.  See the object specification table below to override default docking properties on the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    */
  var dockOptions: PopupDockOptions = js.native
  
  /**
    * The number of selected [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features) available to the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#featureCount)
    *
    * @default 0
    */
  val featureCount: Double = js.native
  
  /**
    * Shows pagination for the popup if available. This allows the user to scroll through various [selected features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features) using either arrows  ![popup-pagination-arrows](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popup-pagination-arrows.png)  or a menu.  ![popup-feature-menu](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/popup-pagination-menu.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#featureNavigationEnabled)
    */
  var featureNavigationEnabled: Boolean = js.native
  
  /**
    * An array of features associated with the popup. Each graphic in this array must have a valid [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) set. They may share the same [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) or have unique [PopupTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) depending on their attributes. The [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content) and [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title) of the popup is set based on the `content` and `title` properties of each graphic's respective [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).  When more than one graphic exists in this array, the current content of the Popup is set based on the value of the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature).  This value is `null` if no features are associated with the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features)
    */
  var features: js.Array[Graphic] = js.native
  
  /**
    * Use this method to return feature(s) at a given screen location. These features are fetched from all of the [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) in the [view](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). In order to use this, a layer must already have an associated [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) and have its [popupEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupEnabled). These features can then be used within a custom [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) or [Feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html) widget experience. One example could be a custom side panel that displays feature-specific information based on an end user's click location. This method allows a developer the ability to control how the input location is handled, and then subsequently, what to do with the results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#fetchFeatures)
    *
    * @param screenPoint An object representing a point on the screen. This point can be in either the MapView or SceneView.
    * @param screenPoint.x The x coordinate.
    * @param screenPoint.y The y coordinate.
    * @param options The [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchFeaturesOptions) to pass into the `fetchFeatures` method.
    *
    */
  def fetchFeatures(screenPoint: PopupFetchFeaturesScreenPoint): js.Promise[FetchPopupFeaturesResult] = js.native
  def fetchFeatures(screenPoint: PopupFetchFeaturesScreenPoint, options: FetchFeaturesOptions): js.Promise[FetchPopupFeaturesResult] = js.native
  
  /**
    * Use this method to give focus to the Widget if the widget is able to be focused.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#focus)
    *
    *
    */
  def focus(): Unit = js.native
  
  /**
    * Highlight the selected popup feature using the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions) set on the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or the [highlightOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions) set on the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#highlightEnabled)
    *
    * @default true
    */
  var highlightEnabled: Boolean = js.native
  
  /**
    * Point used to position the popup. This is automatically set when viewing the popup by selecting a feature. If using the Popup to display content not related to features in the map, such as the results from a task, then you must set this property before making the popup [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible) to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location)
    */
  var location: Point = js.native
  
  /**
    * Defines the maximum icons displayed at one time in the action area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#maxInlineActions)
    *
    * @default 3
    */
  var maxInlineActions: Double | js.Any = js.native
  
  /**
    * Selects the feature at the next index in relation to the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#next)
    *
    *
    */
  def next(): PopupViewModel = js.native
  
  @JSName("on")
  def on_triggeraction(name: `trigger-action`, eventHandler: PopupTriggerActionEventHandler): IHandle = js.native
  
  /**
    * Opens the popup at the given location with content defined either explicitly with `content` or driven from the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) of input features. This method sets the popup's [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible) property to `true`. Users can alternatively open the popup by directly setting the [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible) property to `true`. The popup will only display if the view's size constraints in [dockOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions) are met or the [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) property is set to a geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    *
    * @param options Defines the location and content of the popup when opened.
    * @param options.title Sets the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title) of the popup.
    * @param options.content Sets the the [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content) of the popup.
    * @param options.location Sets the popup's [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location), which is the geometry used to position the popup.
    * @param options.fetchFeatures When `true`, indicates the popup should fetch the content of this feature and display it. If no [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) exists, a default template is created for the layer if [defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) = `true`. In order for this option to work, there must be a valid `view` and `location` set.
    * @param options.features Sets the popup's [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features), which populate the title and content of the popup based on each graphic's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    * @param options.promises Sets pending [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises) on the popup. The popup will display once the promises resolve. Each promise must resolve to an array of [Graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    * @param options.featureMenuOpen **Since:** 4.5    This property enables multiple features in a popup to display in a list rather than displaying the first selected feature. Setting this to `true` allows the user to scroll through the list of features returned from the query and choose the selection they want to display within the popup.
    * @param options.updateLocationEnabled When `true` indicates the popup should update its [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) for each paginated feature based on the [selected feature's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) geometry.
    * @param options.collapsed **Since:** 4.5    When `true`, indicates that only the popup header will display.
    *
    */
  def open(): Unit = js.native
  def open(options: PopupOpenOptions): Unit = js.native
  
  /**
    * Selects the feature at the previous index in relation to the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#previous)
    *
    *
    */
  def previous(): PopupViewModel = js.native
  
  /**
    * An array of pending Promises that have not yet been fulfilled. If there are no pending promises, the value is `null`. When the pending promises are resolved they are removed from this array and the features they return are pushed into the [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features) array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises)
    */
  var promises: js.Array[js.Promise[_]] = js.native
  
  /**
    * Positions the popup on the view. Moves the popup into the view's extent if the popup is partially or fully outside the view's extent.  If the popup is partially out of view, the view will move to fully show the popup. If the popup is fully out of view, the view will move to the popup's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#reposition)
    *
    *
    */
  def reposition(): Unit = js.native
  
  /**
    * The selected feature accessed by the popup. The content of the Popup is determined based on the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) assigned to this feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature)
    */
  val selectedFeature: Graphic = js.native
  
  /**
    * Index of the feature that is [selected](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature). When [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features) are set, the first index is automatically selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeatureIndex)
    */
  var selectedFeatureIndex: Double = js.native
  
  /**
    * Returns a reference to the current [Feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html) that the Popup is using. This is useful if needing to get a reference to the widget in order to make any changes to it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeatureWidget)
    */
  val selectedFeatureWidget: Feature = js.native
  
  /**
    * Indicates whether to display a spinner at the popup location prior to its display when it has pending promises.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#spinnerEnabled)
    */
  var spinnerEnabled: Boolean = js.native
  
  /**
    * The title of the popup. This can be set generically on the popup no matter the features that are selected. If the [selected feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) has a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html), then the title set in the corresponding template is used here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title)
    */
  var title: String = js.native
  
  /**
    * Triggers the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#event-trigger-action) event and executes the [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions) at the specified index in the [actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions) array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#triggerAction)
    *
    * @param actionIndex The index of the [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions) to execute.
    *
    */
  def triggerAction(actionIndex: Double): Unit = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [PopupViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup-PopupViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#viewModel)
    */
  var viewModel: PopupViewModel = js.native
  
  /**
    * Indicates whether the popup is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visible)
    */
  var visible: Boolean = js.native
  
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#visibleElements)
    */
  var visibleElements: PopupVisibleElements = js.native
}

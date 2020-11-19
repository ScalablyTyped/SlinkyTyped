package typingsSlinky.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GEOptions extends js.Object {
  
  /**
    * Show or hide the blue atmosphere that appears around the perimeter of the Earth.
    * On by default.
    */
  def getAtmosphereVisibility(): Boolean = js.native
  
  /**
    * Whether automatic ground level view is enabled.
    */
  def getAutoGroundLevelViewEnabled(): Boolean = js.native
  
  /**
    * Returns true if building highlighting is enabled.
    */
  def getBuildingHighlightingEnabled(): Boolean = js.native
  
  /**
    * Whether or not building selection is enabled.
    */
  def getBuildingSelectionEnabled(): Boolean = js.native
  
  /**
    * Returns true if the animation of features as they are added or removed from the globe has been enabled.
    */
  def getFadeInOutEnabled(): Boolean = js.native
  
  /**
    * Specifies the speed at which the camera moves (0 to 5.0).
    * Set to SPEED_TELEPORT to immediately appear at selected destination.
    *
    * See also:
    *
    * * GEPlugin.SPEED_TELEPORT
    */
  def getFlyToSpeed(): Double = js.native
  
  /**
    * Show or hide the grid. Disabled by default.
    */
  def getGridVisibility(): Boolean = js.native
  
  /**
    * Enable or disable user panning and zooming of the map. Enabled by default.
    *
    * Note: This also enables and disables keyboard navigation (arrow keys, page-up/page-down, etc).
    */
  def getMouseNavigationEnabled(): Boolean = js.native
  
  /**
    * Show or hide the overview map. Disabled by default.
    */
  def getOverviewMapVisibility(): Boolean = js.native
  
  /**
    * Show or hide the scale legend. Disabled by default.
    */
  def getScaleLegendVisibility(): Boolean = js.native
  
  /**
    * Speed of zoom when user rolls the mouse wheel. Default is 1.
    * Set to a negative number to reverse the zoom direction.
    */
  def getScrollWheelZoomSpeed(): Double = js.native
  
  /**
    * Show or hide the status bar. Disabled by default.
    */
  def getStatusBarVisibility(): Boolean = js.native
  
  /**
    * Returns the terrain exaggeration value. Valid values are in the range of 1.0 through 3.0.
    */
  def getTerrainExaggeration(): Double = js.native
  
  /**
    * Returns true if display units are set to imperial units (feet and miles).
    * False denotes metric units (meters and kilometers).
    */
  def getUnitsFeetMiles(): Boolean = js.native
  
  /**
    * Show or hide the blue atmosphere that appears around the perimeter of the Earth.
    * On by default.
    */
  def setAtmosphereVisibility(atmosphereVisibility: Boolean): Unit = js.native
  
  /**
    * When enabled, the view will change to 'ground level view' when the camera reaches ground level.
    * This view provides pan and lookAt controls, but no zoom slider.
    * The tilt will be set to 90, or parallel with level ground.
    */
  def setAutoGroundLevelViewEnabled(autoGroundLevelViewEnabled: Boolean): Unit = js.native
  
  /**
    * Enables or disables building highlighting.
    * When enabled, buildings will be highlighted when they are moused over.
    */
  def setBuildingHighlightingEnabled(buildingHighlightingEnabled: Boolean): Unit = js.native
  
  /**
    * Enables or disables building selection.
    * If enabled, clicking a building will pop a feature balloon containing information from the Google 3D Warehouse database.
    */
  def setBuildingSelectionEnabled(buildingSelectionEnabled: Boolean): Unit = js.native
  
  /**
    * Enable or disable the animation of a feature when it is added or removed from the Google Earth plugin.
    * The animation consists of a slight change of scale. Default is true.
    */
  def setFadeInOutEnabled(fadeInOutEnabled: Boolean): Unit = js.native
  
  /**
    * Specifies the speed at which the camera moves (0 to 5.0).
    * Set to SPEED_TELEPORT to immediately appear at selected destination.
    *
    * See also:
    *
    * * GEPlugin.SPEED_TELEPORT
    */
  def setFlyToSpeed(flyToSpeed: Double): Unit = js.native
  
  /**
    * Show or hide the grid. Disabled by default.
    */
  def setGridVisibility(gridVisibility: Boolean): Unit = js.native
  
  /**
    * Sets the map type to Earth or sky mode.
    */
  def setMapType(`type`: GEMapTypeEnum): Unit = js.native
  
  /**
    * Enable or disable user panning and zooming of the map. Enabled by default.
    *
    * Note: This also enables and disables keyboard navigation (arrow keys, page-up/page-down, etc).
    */
  def setMouseNavigationEnabled(mouseNavigationEnabled: Boolean): Unit = js.native
  
  /**
    * Show or hide the overview map. Disabled by default.
    */
  def setOverviewMapVisibility(overviewMapVisibility: Boolean): Unit = js.native
  
  /**
    * Show or hide the scale legend. Disabled by default.
    */
  def setScaleLegendVisibility(scaleLegendVisibility: Boolean): Unit = js.native
  
  /**
    * Speed of zoom when user rolls the mouse wheel. Default is 1.
    * Set to a negative number to reverse the zoom direction.
    */
  def setScrollWheelZoomSpeed(scrollWheelZoomSpeed: Double): Unit = js.native
  
  /**
    * Show or hide the status bar. Disabled by default.
    */
  def setStatusBarVisibility(statusBarVisibility: Boolean): Unit = js.native
  
  /**
    * Set the terrain exaggeration value. Valid values are in the range of 1.0 through 3.0.
    * Attempting to set outside of this range will result in the value being clamped.
    */
  def setTerrainExaggeration(terrainExaggeration: Double): Unit = js.native
  
  /**
    * Set display units to imperial (feet and miles) or metric (meters and kilometers).
    * This setting affects only the values displayed in the status bar and the scale bar.
    * The values passed and returned with an object's getters and setters are always metric.
    */
  def setUnitsFeetMiles(unitsFeetMiles: Boolean): Unit = js.native
}
object GEOptions {
  
  @scala.inline
  def apply(
    getAtmosphereVisibility: () => Boolean,
    getAutoGroundLevelViewEnabled: () => Boolean,
    getBuildingHighlightingEnabled: () => Boolean,
    getBuildingSelectionEnabled: () => Boolean,
    getFadeInOutEnabled: () => Boolean,
    getFlyToSpeed: () => Double,
    getGridVisibility: () => Boolean,
    getMouseNavigationEnabled: () => Boolean,
    getOverviewMapVisibility: () => Boolean,
    getScaleLegendVisibility: () => Boolean,
    getScrollWheelZoomSpeed: () => Double,
    getStatusBarVisibility: () => Boolean,
    getTerrainExaggeration: () => Double,
    getUnitsFeetMiles: () => Boolean,
    setAtmosphereVisibility: Boolean => Unit,
    setAutoGroundLevelViewEnabled: Boolean => Unit,
    setBuildingHighlightingEnabled: Boolean => Unit,
    setBuildingSelectionEnabled: Boolean => Unit,
    setFadeInOutEnabled: Boolean => Unit,
    setFlyToSpeed: Double => Unit,
    setGridVisibility: Boolean => Unit,
    setMapType: GEMapTypeEnum => Unit,
    setMouseNavigationEnabled: Boolean => Unit,
    setOverviewMapVisibility: Boolean => Unit,
    setScaleLegendVisibility: Boolean => Unit,
    setScrollWheelZoomSpeed: Double => Unit,
    setStatusBarVisibility: Boolean => Unit,
    setTerrainExaggeration: Double => Unit,
    setUnitsFeetMiles: Boolean => Unit
  ): GEOptions = {
    val __obj = js.Dynamic.literal(getAtmosphereVisibility = js.Any.fromFunction0(getAtmosphereVisibility), getAutoGroundLevelViewEnabled = js.Any.fromFunction0(getAutoGroundLevelViewEnabled), getBuildingHighlightingEnabled = js.Any.fromFunction0(getBuildingHighlightingEnabled), getBuildingSelectionEnabled = js.Any.fromFunction0(getBuildingSelectionEnabled), getFadeInOutEnabled = js.Any.fromFunction0(getFadeInOutEnabled), getFlyToSpeed = js.Any.fromFunction0(getFlyToSpeed), getGridVisibility = js.Any.fromFunction0(getGridVisibility), getMouseNavigationEnabled = js.Any.fromFunction0(getMouseNavigationEnabled), getOverviewMapVisibility = js.Any.fromFunction0(getOverviewMapVisibility), getScaleLegendVisibility = js.Any.fromFunction0(getScaleLegendVisibility), getScrollWheelZoomSpeed = js.Any.fromFunction0(getScrollWheelZoomSpeed), getStatusBarVisibility = js.Any.fromFunction0(getStatusBarVisibility), getTerrainExaggeration = js.Any.fromFunction0(getTerrainExaggeration), getUnitsFeetMiles = js.Any.fromFunction0(getUnitsFeetMiles), setAtmosphereVisibility = js.Any.fromFunction1(setAtmosphereVisibility), setAutoGroundLevelViewEnabled = js.Any.fromFunction1(setAutoGroundLevelViewEnabled), setBuildingHighlightingEnabled = js.Any.fromFunction1(setBuildingHighlightingEnabled), setBuildingSelectionEnabled = js.Any.fromFunction1(setBuildingSelectionEnabled), setFadeInOutEnabled = js.Any.fromFunction1(setFadeInOutEnabled), setFlyToSpeed = js.Any.fromFunction1(setFlyToSpeed), setGridVisibility = js.Any.fromFunction1(setGridVisibility), setMapType = js.Any.fromFunction1(setMapType), setMouseNavigationEnabled = js.Any.fromFunction1(setMouseNavigationEnabled), setOverviewMapVisibility = js.Any.fromFunction1(setOverviewMapVisibility), setScaleLegendVisibility = js.Any.fromFunction1(setScaleLegendVisibility), setScrollWheelZoomSpeed = js.Any.fromFunction1(setScrollWheelZoomSpeed), setStatusBarVisibility = js.Any.fromFunction1(setStatusBarVisibility), setTerrainExaggeration = js.Any.fromFunction1(setTerrainExaggeration), setUnitsFeetMiles = js.Any.fromFunction1(setUnitsFeetMiles))
    __obj.asInstanceOf[GEOptions]
  }
  
  @scala.inline
  implicit class GEOptionsOps[Self <: GEOptions] (val x: Self) extends AnyVal {
    
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
    def setGetAtmosphereVisibility(value: () => Boolean): Self = this.set("getAtmosphereVisibility", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoGroundLevelViewEnabled(value: () => Boolean): Self = this.set("getAutoGroundLevelViewEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBuildingHighlightingEnabled(value: () => Boolean): Self = this.set("getBuildingHighlightingEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBuildingSelectionEnabled(value: () => Boolean): Self = this.set("getBuildingSelectionEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFadeInOutEnabled(value: () => Boolean): Self = this.set("getFadeInOutEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFlyToSpeed(value: () => Double): Self = this.set("getFlyToSpeed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGridVisibility(value: () => Boolean): Self = this.set("getGridVisibility", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMouseNavigationEnabled(value: () => Boolean): Self = this.set("getMouseNavigationEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOverviewMapVisibility(value: () => Boolean): Self = this.set("getOverviewMapVisibility", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaleLegendVisibility(value: () => Boolean): Self = this.set("getScaleLegendVisibility", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScrollWheelZoomSpeed(value: () => Double): Self = this.set("getScrollWheelZoomSpeed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStatusBarVisibility(value: () => Boolean): Self = this.set("getStatusBarVisibility", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTerrainExaggeration(value: () => Double): Self = this.set("getTerrainExaggeration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUnitsFeetMiles(value: () => Boolean): Self = this.set("getUnitsFeetMiles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAtmosphereVisibility(value: Boolean => Unit): Self = this.set("setAtmosphereVisibility", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoGroundLevelViewEnabled(value: Boolean => Unit): Self = this.set("setAutoGroundLevelViewEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBuildingHighlightingEnabled(value: Boolean => Unit): Self = this.set("setBuildingHighlightingEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBuildingSelectionEnabled(value: Boolean => Unit): Self = this.set("setBuildingSelectionEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFadeInOutEnabled(value: Boolean => Unit): Self = this.set("setFadeInOutEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFlyToSpeed(value: Double => Unit): Self = this.set("setFlyToSpeed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGridVisibility(value: Boolean => Unit): Self = this.set("setGridVisibility", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMapType(value: GEMapTypeEnum => Unit): Self = this.set("setMapType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMouseNavigationEnabled(value: Boolean => Unit): Self = this.set("setMouseNavigationEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOverviewMapVisibility(value: Boolean => Unit): Self = this.set("setOverviewMapVisibility", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScaleLegendVisibility(value: Boolean => Unit): Self = this.set("setScaleLegendVisibility", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScrollWheelZoomSpeed(value: Double => Unit): Self = this.set("setScrollWheelZoomSpeed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStatusBarVisibility(value: Boolean => Unit): Self = this.set("setStatusBarVisibility", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTerrainExaggeration(value: Double => Unit): Self = this.set("setTerrainExaggeration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUnitsFeetMiles(value: Boolean => Unit): Self = this.set("setUnitsFeetMiles", js.Any.fromFunction1(value))
  }
}

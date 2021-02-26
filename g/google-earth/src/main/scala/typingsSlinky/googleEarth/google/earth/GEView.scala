package typingsSlinky.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GEView extends StObject {
  
  /**
    * Creates and returns a new KmlCamera object, initialized to the current camera position and orientation.
    * Use 'altitudeMode' to specify the altitude mode of the new camera.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_RELATIVE_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_RELATIVE_TO_SEA_FLOOR
    */
  def copyAsCamera(altitudeMode: KmlAltitudeModeEnum): KmlCamera = js.native
  
  /**
    * Creates and returns a new KmlLookAt object, initialized to the current camera position and orientation.
    * Use 'altitudeMode' to specify the altitude mode of the looked-at point.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_RELATIVE_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_RELATIVE_TO_SEA_FLOOR
    */
  def copyAsLookAt(altitudeMode: KmlAltitudeModeEnum): KmlLookAt = js.native
  
  /**
    * Returns a bounding box that completely contains the region of the globe that is currently visible.
    * The returned box will be larger than what is strictly visible, if that is necessary to include everything that is visible.
    */
  def getViewportGlobeBounds(): KmlLatLonBox = js.native
  
  /**
    * Given a point on the screen in pixel coordinates, returns a GEHitTestResult with information about the geographic location corresponding to the point on the screen. 
    * Tip: hitTest() is the inverse of project().
    *
    * See also:
    *
    * * GEPlugin.UNITS_PIXELS
    * * GEPlugin.UNITS_INSET_PIXELS
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.HIT_TEST_GLOBE
    * * GEPlugin.HIT_TEST_TERRAIN
    * * GEPlugin.HIT_TEST_BUILDINGS
    */
  def hitTest(x: Double, xUnits: KmlUnitsEnum, y: Double, yUnits: KmlUnitsEnum, mode: GEHitTestModeEnum): GEHitTestResult = js.native
  
  /**
    * Returns the screen x,y coordinates of a given point on the globe.
    *
    * Tip: project() is the inverse of hitTest().
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_RELATIVE_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_RELATIVE_TO_SEA_FLOOR
    */
  def project(lat: Double, lng: Double, alt: Double, altitudeMode: KmlAltitudeModeEnum): KmlVec2 = js.native
  
  /**
    * Sets the camera that views the scene in Google Earth.
    */
  def setAbstractView(view: KmlAbstractView): Unit = js.native
}
object GEView {
  
  @scala.inline
  def apply(
    copyAsCamera: KmlAltitudeModeEnum => KmlCamera,
    copyAsLookAt: KmlAltitudeModeEnum => KmlLookAt,
    getViewportGlobeBounds: () => KmlLatLonBox,
    hitTest: (Double, KmlUnitsEnum, Double, KmlUnitsEnum, GEHitTestModeEnum) => GEHitTestResult,
    project: (Double, Double, Double, KmlAltitudeModeEnum) => KmlVec2,
    setAbstractView: KmlAbstractView => Unit
  ): GEView = {
    val __obj = js.Dynamic.literal(copyAsCamera = js.Any.fromFunction1(copyAsCamera), copyAsLookAt = js.Any.fromFunction1(copyAsLookAt), getViewportGlobeBounds = js.Any.fromFunction0(getViewportGlobeBounds), hitTest = js.Any.fromFunction5(hitTest), project = js.Any.fromFunction4(project), setAbstractView = js.Any.fromFunction1(setAbstractView))
    __obj.asInstanceOf[GEView]
  }
  
  @scala.inline
  implicit class GEViewMutableBuilder[Self <: GEView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyAsCamera(value: KmlAltitudeModeEnum => KmlCamera): Self = StObject.set(x, "copyAsCamera", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyAsLookAt(value: KmlAltitudeModeEnum => KmlLookAt): Self = StObject.set(x, "copyAsLookAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetViewportGlobeBounds(value: () => KmlLatLonBox): Self = StObject.set(x, "getViewportGlobeBounds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHitTest(value: (Double, KmlUnitsEnum, Double, KmlUnitsEnum, GEHitTestModeEnum) => GEHitTestResult): Self = StObject.set(x, "hitTest", js.Any.fromFunction5(value))
    
    @scala.inline
    def setProject(value: (Double, Double, Double, KmlAltitudeModeEnum) => KmlVec2): Self = StObject.set(x, "project", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetAbstractView(value: KmlAbstractView => Unit): Self = StObject.set(x, "setAbstractView", js.Any.fromFunction1(value))
  }
}

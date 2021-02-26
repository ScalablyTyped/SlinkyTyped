package typingsSlinky.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlExtrudableGeometry extends KmlAltitudeGeometry {
  
  /**
    * Specifies whether to connect the geometry to the ground.
    */
  def getExtrude(): Boolean = js.native
  
  /**
    * Specifies whether to allow the geometry to follow the terrain elevation.
    */
  def getTessellate(): Boolean = js.native
  
  /**
    * Specifies whether to connect the geometry to the ground.
    */
  def setExtrude(extrude: Boolean): Unit = js.native
  
  /**
    * Specifies whether to allow the geometry to follow the terrain elevation.
    */
  def setTessellate(tessellate: Boolean): Unit = js.native
}
object KmlExtrudableGeometry {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getAltitudeMode: () => KmlAltitudeModeEnum,
    getExtrude: () => Boolean,
    getId: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getTessellate: () => Boolean,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setAltitudeMode: KmlAltitudeModeEnum => Unit,
    setExtrude: Boolean => Unit,
    setTessellate: Boolean => Unit
  ): KmlExtrudableGeometry = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getAltitudeMode = js.Any.fromFunction0(getAltitudeMode), getExtrude = js.Any.fromFunction0(getExtrude), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getTessellate = js.Any.fromFunction0(getTessellate), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAltitudeMode = js.Any.fromFunction1(setAltitudeMode), setExtrude = js.Any.fromFunction1(setExtrude), setTessellate = js.Any.fromFunction1(setTessellate))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlExtrudableGeometry]
  }
  
  @scala.inline
  implicit class KmlExtrudableGeometryMutableBuilder[Self <: KmlExtrudableGeometry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetExtrude(value: () => Boolean): Self = StObject.set(x, "getExtrude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTessellate(value: () => Boolean): Self = StObject.set(x, "getTessellate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetExtrude(value: Boolean => Unit): Self = StObject.set(x, "setExtrude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTessellate(value: Boolean => Unit): Self = StObject.set(x, "setTessellate", js.Any.fromFunction1(value))
  }
}

package typingsSlinky.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlScale extends KmlObject {
  
  /**
    * Indicates the x coordinate.
    */
  def getX(): Double = js.native
  
  /**
    * Indicates the y coordinate.
    */
  def getY(): Double = js.native
  
  /**
    * Indicates the z coordinate.
    */
  def getZ(): Double = js.native
  
  /**
    * Sets the x, y, and z coordinates for a model.
    */
  def set(x: Double, y: Double, z: Double): Unit = js.native
  
  /**
    * Indicates the x coordinate.
    */
  def setX(x: Double): Unit = js.native
  
  /**
    * Indicates the y coordinate.
    */
  def setY(y: Double): Unit = js.native
  
  /**
    * Indicates the z coordinate.
    */
  def setZ(z: Double): Unit = js.native
}
object KmlScale {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getId: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getType: () => String,
    getUrl: () => String,
    getX: () => Double,
    getY: () => Double,
    getZ: () => Double,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    set: (Double, Double, Double) => Unit,
    setX: Double => Unit,
    setY: Double => Unit,
    setZ: Double => Unit
  ): KmlScale = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY), getZ = js.Any.fromFunction0(getZ), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), set = js.Any.fromFunction3(set), setX = js.Any.fromFunction1(setX), setY = js.Any.fromFunction1(setY), setZ = js.Any.fromFunction1(setZ))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlScale]
  }
  
  @scala.inline
  implicit class KmlScaleMutableBuilder[Self <: KmlScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetX(value: () => Double): Self = StObject.set(x, "getX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetY(value: () => Double): Self = StObject.set(x, "getY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetZ(value: () => Double): Self = StObject.set(x, "getZ", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetX(value: Double => Unit): Self = StObject.set(x, "setX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetY(value: Double => Unit): Self = StObject.set(x, "setY", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetZ(value: Double => Unit): Self = StObject.set(x, "setZ", js.Any.fromFunction1(value))
  }
}

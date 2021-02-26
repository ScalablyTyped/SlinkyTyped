package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XCoordinateSystem extends XInterface {
  
  /** identifies the type of coordinate system (e.g. Cartesian, polar ...) */
  val CoordinateSystemType: String = js.native
  
  /** the dimension of the coordinate-system. */
  val Dimension: Double = js.native
  
  /** return a service name from which the view component for this coordinate system can be created */
  val ViewServiceName: String = js.native
  
  /**
    * The dimension says whether it is a x, y or z axis. The index indicates whether it is a primary or a secondary axis or maybe more in future. Use nIndex
    * == 0 for a primary axis. An empty Reference will be returned if the given nDimension and nIndex are in the valid range but no axis is set for those
    * values. An IndexOutOfBoundsException will be thrown if nDimension is lower than 0 or greater than the value returned by {@link getDimension()} and/or
    * if nIndex is lower 0 or greater than the value returned by getMaxAxisIndexByDimension(nDimension).
    */
  def getAxisByDimension(nDimension: Double, nIndex: Double): XAxis = js.native
  
  /** identifies the type of coordinate system (e.g. Cartesian, polar ...) */
  def getCoordinateSystemType(): String = js.native
  
  /** the dimension of the coordinate-system. */
  def getDimension(): Double = js.native
  
  /**
    * In one dimension there could be several axes to enable main and secondary axis and maybe more in future. This method returns the maximum index at
    * which an axis exists for the given dimension. It is allowed that some indexes in between do not have an axis.
    */
  def getMaximumAxisIndexByDimension(nDimension: Double): Double = js.native
  
  /** return a service name from which the view component for this coordinate system can be created */
  def getViewServiceName(): String = js.native
  
  /** The dimension says whether it is a x, y or z axis. The index says whether it is a primary or a secondary axis. Use nIndex == 0 for a primary axis. */
  def setAxisByDimension(nDimension: Double, xAxis: XAxis, nIndex: Double): Unit = js.native
}
object XCoordinateSystem {
  
  @scala.inline
  def apply(
    CoordinateSystemType: String,
    Dimension: Double,
    ViewServiceName: String,
    acquire: () => Unit,
    getAxisByDimension: (Double, Double) => XAxis,
    getCoordinateSystemType: () => String,
    getDimension: () => Double,
    getMaximumAxisIndexByDimension: Double => Double,
    getViewServiceName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setAxisByDimension: (Double, XAxis, Double) => Unit
  ): XCoordinateSystem = {
    val __obj = js.Dynamic.literal(CoordinateSystemType = CoordinateSystemType.asInstanceOf[js.Any], Dimension = Dimension.asInstanceOf[js.Any], ViewServiceName = ViewServiceName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAxisByDimension = js.Any.fromFunction2(getAxisByDimension), getCoordinateSystemType = js.Any.fromFunction0(getCoordinateSystemType), getDimension = js.Any.fromFunction0(getDimension), getMaximumAxisIndexByDimension = js.Any.fromFunction1(getMaximumAxisIndexByDimension), getViewServiceName = js.Any.fromFunction0(getViewServiceName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAxisByDimension = js.Any.fromFunction3(setAxisByDimension))
    __obj.asInstanceOf[XCoordinateSystem]
  }
  
  @scala.inline
  implicit class XCoordinateSystemMutableBuilder[Self <: XCoordinateSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinateSystemType(value: String): Self = StObject.set(x, "CoordinateSystemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimension(value: Double): Self = StObject.set(x, "Dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAxisByDimension(value: (Double, Double) => XAxis): Self = StObject.set(x, "getAxisByDimension", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCoordinateSystemType(value: () => String): Self = StObject.set(x, "getCoordinateSystemType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDimension(value: () => Double): Self = StObject.set(x, "getDimension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaximumAxisIndexByDimension(value: Double => Double): Self = StObject.set(x, "getMaximumAxisIndexByDimension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetViewServiceName(value: () => String): Self = StObject.set(x, "getViewServiceName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAxisByDimension(value: (Double, XAxis, Double) => Unit): Self = StObject.set(x, "setAxisByDimension", js.Any.fromFunction3(value))
    
    @scala.inline
    def setViewServiceName(value: String): Self = StObject.set(x, "ViewServiceName", value.asInstanceOf[js.Any])
  }
}

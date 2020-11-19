package typingsSlinky.openlayers.mod.geom

import typingsSlinky.openlayers.mod.Coordinate_
import typingsSlinky.openlayers.mod.Extent_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Circle geometry.
  *
  * @param center Center.
  * @param opt_radius Radius.
  * @param opt_layout Layout.
  * @api
  */
@JSImport("openlayers", "geom.Circle")
@js.native
class Circle protected () extends SimpleGeometry {
  /**
    * @classdesc
    * Circle geometry.
    *
    * @param center Center.
    * @param opt_radius Radius.
    * @param opt_layout Layout.
    * @api
    */
  def this(center: Coordinate_) = this()
  def this(center: Coordinate_, opt_radius: Double) = this()
  def this(center: Coordinate_, opt_radius: js.UndefOr[scala.Nothing], opt_layout: GeometryLayout) = this()
  def this(center: Coordinate_, opt_radius: Double, opt_layout: GeometryLayout) = this()
  
  /**
    * Return the center of the circle as {@link ol.Coordinate coordinate}.
    * @return Center.
    * @api
    */
  def getCenter(): Coordinate_ = js.native
  
  /**
    * Return the radius of the circle.
    * @return Radius.
    * @api
    */
  def getRadius(): Double = js.native
  
  /**
    * @inheritDoc
    * @api stable
    */
  def intersectsExtent(extent: Extent_): Boolean = js.native
  
  /**
    * Set the center of the circle as {@link ol.Coordinate coordinate}.
    * @param center Center.
    * @api
    */
  def setCenter(center: Coordinate_): Unit = js.native
  
  /**
    * Set the center (as {@link ol.Coordinate coordinate}) and the radius (as
    * number) of the circle.
    * @param center Center.
    * @param radius Radius.
    * @param opt_layout Layout.
    * @api
    */
  def setCenterAndRadius(center: Coordinate_, radius: Double): Unit = js.native
  def setCenterAndRadius(center: Coordinate_, radius: Double, opt_layout: GeometryLayout): Unit = js.native
  
  /**
    * Set the radius of the circle. The radius is in the units of the projection.
    * @param radius Radius.
    * @api
    */
  def setRadius(radius: Double): Unit = js.native
}

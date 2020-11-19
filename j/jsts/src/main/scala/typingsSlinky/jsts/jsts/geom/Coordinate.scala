package typingsSlinky.jsts.jsts.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coordinate extends js.Object {
  
  /**
    * Compares this {@link Coordinate} with the specified {@link Coordinate} for
    * order. This method ignores the z value when making the comparison. Returns:
    * <UL>
    * <LI> -1 : this.x < other.x || ((this.x == other.x) && (this.y < other.y))
    * <LI> 0 : this.x == other.x && this.y = other.y
    * <LI> 1 : this.x > other.x || ((this.x == other.x) && (this.y > other.y))
    *
    * </UL>
    * Note: This method assumes that ordinate values are valid numbers. NaN
    * values are not handled correctly.
    *
    * @param {Coordinate}
    *          other the <code>Coordinate</code> with which this
    *          <code>Coordinate</code> is being compared.
    * @return {number} -1, zero, or 1 as explained above.
    */
  def compareTo(other: Coordinate): Double = js.native
  
  /**
    * Computes the 2-dimensional Euclidean distance to another location. The
    * Z-ordinate is ignored.
    *
    * @param {Coordinate}
    *          p a point.
    * @return {number} the 2-dimensional Euclidean distance between the
    *         locations.
    */
  def distance(p: Coordinate): Double = js.native
  
  /**
    * Returns <code>true</code> if <code>other</code> has the same values for
    * the x and y ordinates. Since Coordinates are 2.5D, this routine ignores the
    * z value when making the comparison.
    *
    * @param {Coordinate}
    *          other a <code>Coordinate</code> with which to do the comparison.
    * @return {boolean} <code>true</code> if <code>other</code> is a
    *         <code>Coordinate</code> with the same values for the x and y
    *         ordinates.
    */
  def equals(other: Coordinate): Boolean = js.native
  
  /**
    * Returns whether the planar projections of the two <code>Coordinate</code>s
    * are equal.
    *
    * @param {Coordinate}
    *          other a <code>Coordinate</code> with which to do the 2D
    *          comparison.
    * @return {boolean} <code>true</code> if the x- and y-coordinates are
    *         equal; the z-coordinates do not have to be equal.
    */
  def equals2D(other: Coordinate): Boolean = js.native
  
  /**
    * Sets this <code>Coordinate</code>s (x,y,z) values to that of
    * <code>other</code>.
    *
    * @param {Coordinate}
    *          other the <code>Coordinate</code> to copy.
    */
  def setCoordinate(other: Coordinate): Unit = js.native
  
  /**
    * Gets or sets the x value.
    */
  var x: Double = js.native
  
  /**
    * Gets or sets the y value.
    */
  var y: Double = js.native
  
  /**
    * Gets or sets the z value.
    */
  var z: Double = js.native
}
object Coordinate {
  
  @scala.inline
  def apply(
    compareTo: Coordinate => Double,
    distance: Coordinate => Double,
    equals: Coordinate => Boolean,
    equals2D: Coordinate => Boolean,
    setCoordinate: Coordinate => Unit,
    x: Double,
    y: Double,
    z: Double
  ): Coordinate = {
    val __obj = js.Dynamic.literal(compareTo = js.Any.fromFunction1(compareTo), distance = js.Any.fromFunction1(distance), equals = js.Any.fromFunction1(equals), equals2D = js.Any.fromFunction1(equals2D), setCoordinate = js.Any.fromFunction1(setCoordinate), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinate]
  }
  
  @scala.inline
  implicit class CoordinateOps[Self <: Coordinate] (val x: Self) extends AnyVal {
    
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
    def setCompareTo(value: Coordinate => Double): Self = this.set("compareTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDistance(value: Coordinate => Double): Self = this.set("distance", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals(value: Coordinate => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals2D(value: Coordinate => Boolean): Self = this.set("equals2D", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCoordinate(value: Coordinate => Unit): Self = this.set("setCoordinate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
}

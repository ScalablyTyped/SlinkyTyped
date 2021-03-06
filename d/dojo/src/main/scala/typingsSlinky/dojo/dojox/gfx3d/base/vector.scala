package typingsSlinky.dojo.dojox.gfx3d.base

import typingsSlinky.dojo.dojox.geo.openlayers.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.vector.html
  *
  *
  */
@js.native
trait vector extends js.Object {
  /**
    * center of the vectors
    *
    */
  def center(): Object = js.native
  /**
    * applies a matrix to a point
    *
    * @param a x coordinate of first point, or the whole first point
    * @param b y coordinate of first point, or the whole second point
    * @param c z coordinate of first point
    * @param d x coordinate of second point
    * @param e y coordinate of second point
    * @param f z coordinate of second point
    */
  def crossProduct(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): js.Any = js.native
  /**
    * applies a matrix to a point
    *
    * @param a x coordinate of first point, or the whole first point
    * @param b y coordinate of first point, or the whole second point
    * @param c z coordinate of first point
    * @param d x coordinate of second point
    * @param e y coordinate of second point
    * @param f z coordinate of second point
    */
  def crossProduct(a: Double, b: Point, c: Double, d: Double, e: Double, f: Double): js.Any = js.native
  /**
    * applies a matrix to a point
    *
    * @param a x coordinate of first point, or the whole first point
    * @param b y coordinate of first point, or the whole second point
    * @param c z coordinate of first point
    * @param d x coordinate of second point
    * @param e y coordinate of second point
    * @param f z coordinate of second point
    */
  def crossProduct(a: Point, b: Double, c: Double, d: Double, e: Double, f: Double): js.Any = js.native
  /**
    * applies a matrix to a point
    *
    * @param a x coordinate of first point, or the whole first point
    * @param b y coordinate of first point, or the whole second point
    * @param c z coordinate of first point
    * @param d x coordinate of second point
    * @param e y coordinate of second point
    * @param f z coordinate of second point
    */
  def crossProduct(a: Point, b: Point, c: Double, d: Double, e: Double, f: Double): js.Any = js.native
  /**
    * applies a matrix to a point
    *
    * @param a x coordinate of first point, or the whole first Point
    * @param b y coordinate of first Point, or the whole second Point
    * @param c               Optionalz coordinate of first point
    * @param d               Optionalx coordinate of second point
    * @param e               Optionaly coordinate of second point
    * @param f               Optionalz coordinate of second point
    */
  def dotProduct(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): js.Any = js.native
  /**
    * applies a matrix to a point
    *
    * @param a x coordinate of first point, or the whole first Point
    * @param b y coordinate of first Point, or the whole second Point
    * @param c               Optionalz coordinate of first point
    * @param d               Optionalx coordinate of second point
    * @param e               Optionaly coordinate of second point
    * @param f               Optionalz coordinate of second point
    */
  def dotProduct(a: Double, b: Point, c: Double, d: Double, e: Double, f: Double): js.Any = js.native
  /**
    * applies a matrix to a point
    *
    * @param a x coordinate of first point, or the whole first Point
    * @param b y coordinate of first Point, or the whole second Point
    * @param c               Optionalz coordinate of first point
    * @param d               Optionalx coordinate of second point
    * @param e               Optionaly coordinate of second point
    * @param f               Optionalz coordinate of second point
    */
  def dotProduct(a: Point, b: Double, c: Double, d: Double, e: Double, f: Double): js.Any = js.native
  /**
    * applies a matrix to a point
    *
    * @param a x coordinate of first point, or the whole first Point
    * @param b y coordinate of first Point, or the whole second Point
    * @param c               Optionalz coordinate of first point
    * @param d               Optionalx coordinate of second point
    * @param e               Optionaly coordinate of second point
    * @param f               Optionalz coordinate of second point
    */
  def dotProduct(a: Point, b: Point, c: Double, d: Double, e: Double, f: Double): js.Any = js.native
  /**
    * find the normal of the implicit surface
    *
    * @param a a point
    * @param b a point
    * @param c a point
    */
  def normalize(a: Object, b: Object, c: Object): js.Any = js.native
  /**
    *
    * @param a
    * @param b
    */
  def substract(a: Object, b: Object): Object = js.native
  /**
    * sum of the vectors
    *
    */
  def sum(): Object = js.native
}


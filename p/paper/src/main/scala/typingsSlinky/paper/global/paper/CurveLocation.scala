package typingsSlinky.paper.global.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * CurveLocation objects describe a location on {@link Curve} objects, as
  *     defined by the curve-time {@link #time}, a value between `0` (beginning
  *     of the curve) and `1` (end of the curve). If the curve is part of a
  *     {@link Path} item, its {@link #index} inside the {@link Path#curves}
  *     array is also provided.
  * 
  * The class is in use in many places, such as
  * {@link Path#getLocationAt},
  * {@link Path#getLocationOf},
  * {@link PathItem#getNearestLocation},
  * {@link PathItem#getIntersections},
  * etc.
  */
@JSGlobal("paper.CurveLocation")
@js.native
class CurveLocation protected ()
  extends typingsSlinky.paper.paper.CurveLocation {
  /** 
    * Creates a new CurveLocation object.
    */
  def this(curve: typingsSlinky.paper.paper.Curve, time: Double) = this()
  def this(curve: typingsSlinky.paper.paper.Curve, time: Double, point: typingsSlinky.paper.paper.Point) = this()
}

package typingsSlinky.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The path item represents a path in a Paper.js project.
  */
@js.native
trait Path extends PathItem {
  
  /** 
    * Adds one or more segments to the end of the {@link #segments} array of
    * this path.
    * 
    * @param segment - the segment or point to be
    * added.
    * 
    * @return the added segment(s). This is not necessarily
    * the same object, e.g. if the segment to be added already belongs to
    * another path.
    */
  def add(segment: (Segment | Point | js.Array[Double])*): Segment | js.Array[Segment] = js.native
  
  /** 
    * Adds an array of segments (or types that can be converted to segments)
    * to the end of the {@link #segments} array.
    * 
    * @return an array of the added segments. These segments are
    * not necessarily the same objects, e.g. if the segment to be added already
    * belongs to another path
    */
  def addSegments(segments: js.Array[Segment]): js.Array[Segment] = js.native
  
  /** 
    * The area that the path's geometry is covering. Self-intersecting paths
    * can contain sub-areas that cancel each other out.
    */
  val area: Double = js.native
  
  /** 
    * Clears the path's handles by setting their coordinates to zero,
    * turning the path into a polygon (or a polyline if it isn't closed).
    */
  def clearHandles(): Unit = js.native
  
  /** 
    * Specifies whether the path is closed. If it is closed, Paper.js connects
    * the first and last segments.
    */
  var closed: Boolean = js.native
  
  /** 
    * The curves contained within the path.
    */
  val curves: js.Array[Curve] = js.native
  
  /** 
    * Divides the path on the curve at the given offset or location into two
    * curves, by inserting a new segment at the given location.
    * 
    * @see Curve#divideAt(location)
    * 
    * @param location - the offset or location on the
    *     path at which to divide the existing curve by inserting a new segment
    * 
    * @return the newly inserted segment if the location is valid,
    *     `null` otherwise
    */
  def divideAt(location: Double): Segment = js.native
  def divideAt(location: CurveLocation): Segment = js.native
  
  /** 
    * The first Curve contained within the path.
    */
  val firstCurve: Curve = js.native
  
  /** 
    * The first Segment contained within the path.
    */
  val firstSegment: Segment = js.native
  
  /** 
    * Specifies whether the path and all its segments are selected. Cannot be
    * `true` on an empty path.
    */
  var fullySelected: Boolean = js.native
  
  /** 
    * Calculates the curvature of the path at the given offset. Curvatures
    * indicate how sharply a path changes direction. A straight line has zero
    * curvature, where as a circle has a constant curvature. The path's radius
    * at the given offset is the reciprocal value of its curvature.
    * 
    * @param offset - the offset on the path, where `0` is at
    * the beginning of the path and {@link Path#length} at the end
    * 
    * @return the normal vector at the given offset
    */
  def getCurvatureAt(offset: Double): Double = js.native
  
  /** 
    * Returns the curve location of the specified offset on the path.
    * 
    * @param offset - the offset on the path, where `0` is at
    * the beginning of the path and {@link Path#length} at the end
    * 
    * @return the curve location at the specified offset
    */
  def getLocationAt(offset: Double): CurveLocation = js.native
  
  /** 
    * Returns the curve location of the specified point if it lies on the
    * path, `null` otherwise.
    * 
    * @param point - the point on the path
    * 
    * @return the curve location of the specified point
    */
  def getLocationOf(point: Point): CurveLocation = js.native
  
  /** 
    * Calculates the normal vector of the path at the given offset.
    * 
    * @param offset - the offset on the path, where `0` is at
    * the beginning of the path and {@link Path#length} at the end
    * 
    * @return the normal vector at the given offset
    */
  def getNormalAt(offset: Double): Point = js.native
  
  /** 
    * Returns the length of the path from its beginning up to up to the
    * specified point if it lies on the path, `null` otherwise.
    * 
    * @param point - the point on the path
    * 
    * @return the length of the path up to the specified point
    */
  def getOffsetOf(point: Point): Double = js.native
  
  /** 
    * Calculates path offsets where the path is tangential to the provided
    * tangent. Note that tangents at the start or end are included. Tangents at
    * segment points are returned even if only one of their handles is
    * collinear with the provided tangent.
    * 
    * @param tangent - the tangent to which the path must be tangential
    * 
    * @return path offsets where the path is tangential to the
    * provided tangent
    */
  def getOffsetsWithTangent(tangent: Point): js.Array[Double] = js.native
  
  /** 
    * Calculates the point on the path at the given offset.
    * 
    * @param offset - the offset on the path, where `0` is at
    * the beginning of the path and {@link Path#length} at the end
    * 
    * @return the point at the given offset
    */
  def getPointAt(offset: Double): Point = js.native
  
  /** 
    * Calculates the normalized tangent vector of the path at the given offset.
    * 
    * @param offset - the offset on the path, where `0` is at
    * the beginning of the path and {@link Path#length} at the end
    * 
    * @return the normalized tangent vector at the given offset
    */
  def getTangentAt(offset: Double): Point = js.native
  
  /** 
    * Calculates the weighted normal vector of the path at the given offset.
    * 
    * @param offset - the offset on the path, where `0` is at
    * the beginning of the path and {@link Path#length} at the end
    * 
    * @return the weighted normal vector at the given offset
    */
  def getWeightedNormalAt(offset: Double): Point = js.native
  
  /** 
    * Calculates the weighted tangent vector of the path at the given offset.
    * 
    * @param offset - the offset on the path, where `0` is at
    * the beginning of the path and {@link Path#length} at the end
    * 
    * @return the weighted tangent vector at the given offset
    */
  def getWeightedTangentAt(offset: Double): Point = js.native
  
  /** 
    * Checks if any of the curves in the path have curve handles set.
    * 
    * @see Segment#hasHandles()
    * @see Curve#hasHandles()
    * 
    * @return true if the path has curve handles set
    */
  def hasHandles(): Boolean = js.native
  
  def insert(index: Double, segment: Point): Segment = js.native
  /** 
    * Inserts one or more segments at a given index in the list of this path's
    * segments.
    * 
    * @param index - the index at which to insert the segment
    * @param segment - the segment or point to be inserted.
    * 
    * @return the added segment. This is not necessarily the same
    * object, e.g. if the segment to be added already belongs to another path
    */
  def insert(index: Double, segment: Segment): Segment = js.native
  
  /** 
    * Inserts an array of segments at a given index in the path's
    * {@link #segments} array.
    * 
    * @param index - the index at which to insert the segments
    * @param segments - the segments to be inserted
    * 
    * @return an array of the added segments. These segments are
    * not necessarily the same objects, e.g. if the segment to be added already
    * belongs to another path
    */
  def insertSegments(index: Double, segments: js.Array[Segment]): js.Array[Segment] = js.native
  
  /** 
    * Joins the path with the other specified path, which will be removed in
    * the process. They can be joined if the first or last segments of either
    * path lie in the same location. Locations are optionally compare with a
    * provide `tolerance` value.
    * 
    * If `null` or `this` is passed as the other path, the path will be joined
    * with itself if the first and last segment are in the same location.
    * 
    * @param path - the path to join this path with; `null` or `this` to
    *     join the path with itself
    * @param tolerance - the tolerance with which to decide if two
    *     segments are to be considered the same location when joining
    */
  def join(path: Path): Unit = js.native
  def join(path: Path, tolerance: Double): Unit = js.native
  
  /** 
    * The last Curve contained within the path.
    */
  val lastCurve: Curve = js.native
  
  /** 
    * The last Segment contained within the path.
    */
  val lastSegment: Segment = js.native
  
  /** 
    * The approximate length of the path.
    */
  val length: Double = js.native
  
  /** 
    * Removes the segment at the specified index of the path's
    * {@link #segments} array.
    * 
    * @param index - the index of the segment to be removed
    * 
    * @return the removed segment
    */
  def removeSegment(index: Double): Segment = js.native
  
  /** 
    * Removes all segments from the path's {@link #segments} array.
    * 
    * @return an array containing the removed segments
    */
  def removeSegments(): js.Array[Segment] = js.native
  /** 
    * Removes the segments from the specified `from` index to the `to` index
    * from the path's {@link #segments} array.
    * 
    * @param from - the beginning index, inclusive
    * @param to - the ending index, exclusive
    * 
    * @return an array containing the removed segments
    */
  def removeSegments(from: Double): js.Array[Segment] = js.native
  def removeSegments(from: Double, to: Double): js.Array[Segment] = js.native
  
  /** 
    * The segments contained within the path.
    */
  var segments: js.Array[Segment] = js.native
  
  /** 
    * Splits the path at the given offset or location. After splitting, the
    * path will be open. If the path was open already, splitting will result in
    * two paths.
    * 
    * @param location - the offset or location at which to
    *     split the path
    * 
    * @return the newly created path after splitting, if any
    */
  def splitAt(location: Double): Path = js.native
  def splitAt(location: CurveLocation): Path = js.native
  
  /** 
    * Attempts to create a new shape item with same geometry as this path item,
    * and inherits all settings from it, similar to {@link Item#clone}.
    * 
    * @see Shape#toPath(insert)
    * 
    * @param insert - specifies whether the new shape should be
    * inserted into the scene graph. When set to `true`, it is inserted above
    * the path item
    * 
    * @return the newly created shape item with the same geometry as
    * this path item if it can be matched, `null` otherwise
    */
  def toShape(): Shape = js.native
  def toShape(insert: Boolean): Shape = js.native
}
@JSGlobal("paper.Path")
@js.native
object Path extends js.Object {
  
  type Arc = Path
  
  type Circle = Path
  
  type Ellipse = Path
  
  type Line = Path
  
  type Rectangle = Path
  
  type RegularPolygon = Path
  
  type Star = Path
}

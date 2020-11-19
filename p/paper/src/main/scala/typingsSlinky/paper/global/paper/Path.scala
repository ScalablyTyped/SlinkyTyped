package typingsSlinky.paper.global.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The path item represents a path in a Paper.js project.
  */
@JSGlobal("paper.Path")
@js.native
/** 
  * Creates a new path item and places it at the top of the active layer.
  * 
  * @param segments - An array of segments (or points to be
  * converted to segments) that will be added to the path
  */
class Path ()
  extends typingsSlinky.paper.paper.Path {
  /** 
    * Creates a new path item from an object description and places it at the
    * top of the active layer.
    * 
    * @param object - an object containing properties to be set on the
    *     path
    */
  def this(`object`: js.Object) = this()
  /** 
    * Creates a new path item from SVG path-data and places it at the top of
    * the active layer.
    * 
    * @param pathData - the SVG path-data that describes the geometry
    * of this path
    */
  def this(pathData: String) = this()
  def this(segments: js.Array[typingsSlinky.paper.paper.Segment]) = this()
}
@JSGlobal("paper.Path")
@js.native
object Path extends js.Object {
  
  @js.native
  class Arc protected ()
    extends typingsSlinky.paper.paper.Path {
    /** 
      * Creates an circular arc path item from the properties described by an
      * object literal.
      * 
      * @param object - an object containing properties describing the
      *     path's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates a circular arc path item.
      * 
      * @param from - the starting point of the circular arc
      * @param through - the point the arc passes through
      * @param to - the end point of the arc
      */
    def this(
      from: typingsSlinky.paper.paper.Point,
      through: typingsSlinky.paper.paper.Point,
      to: typingsSlinky.paper.paper.Point
    ) = this()
  }
  
  @js.native
  class Circle protected ()
    extends typingsSlinky.paper.paper.Path {
    /** 
      * Creates a circular path item from the properties described by an
      * object literal.
      * 
      * @param object - an object containing properties describing the
      *     path's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates a circular path item.
      * 
      * @param center - the center point of the circle
      * @param radius - the radius of the circle
      */
    def this(center: typingsSlinky.paper.paper.Point, radius: Double) = this()
  }
  
  @js.native
  class Ellipse protected ()
    extends typingsSlinky.paper.paper.Path {
    /** 
      * Creates an elliptical path item from the properties described by an
      * object literal.
      * 
      * @param object - an object containing properties describing the
      *     path's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates an elliptical path item.
      * 
      * @param rectangle - the rectangle circumscribing the ellipse
      */
    def this(rectangle: typingsSlinky.paper.paper.Rectangle) = this()
  }
  
  @js.native
  class Line protected ()
    extends typingsSlinky.paper.paper.Path {
    /** 
      * Creates a linear path item from the properties described by an object
      * literal.
      * 
      * @param object - an object containing properties describing the
      *     path's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates a linear path item from two points describing a line.
      * 
      * @param from - the line's starting point
      * @param to - the line's ending point
      */
    def this(from: typingsSlinky.paper.paper.Point, to: typingsSlinky.paper.paper.Point) = this()
  }
  
  @js.native
  class Rectangle protected ()
    extends typingsSlinky.paper.paper.Path {
    /** 
      * Creates a rectangular path item from the properties described by an
      * object literal.
      * 
      * @param object - an object containing properties describing the
      *     path's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates a rectangular path item, with optionally rounded corners.
      * 
      * @param rectangle - the rectangle object describing the
      * geometry of the rectangular path to be created
      * @param radius - the size of the rounded corners
      */
    def this(rectangle: typingsSlinky.paper.paper.Rectangle) = this()
    /** 
      * Creates a rectangular path item from the passed points. These do not
      * necessarily need to be the top left and bottom right corners, the
      * constructor figures out how to fit a rectangle between them.
      * 
      * @param from - the first point defining the rectangle
      * @param to - the second point defining the rectangle
      */
    def this(from: typingsSlinky.paper.paper.Point, to: typingsSlinky.paper.paper.Point) = this()
    /** 
      * Creates a rectangular path item from a point and a size object.
      * 
      * @param point - the rectangle's top-left corner.
      * @param size - the rectangle's size.
      */
    def this(point: typingsSlinky.paper.paper.Point, size: typingsSlinky.paper.paper.Size) = this()
    def this(rectangle: typingsSlinky.paper.paper.Rectangle, radius: typingsSlinky.paper.paper.Size) = this()
  }
  
  @js.native
  class RegularPolygon protected ()
    extends typingsSlinky.paper.paper.Path {
    /** 
      * Creates a regular polygon shaped path item from the properties
      * described by an object literal.
      * 
      * @param object - an object containing properties describing the
      *     path's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates a regular polygon shaped path item.
      * 
      * @param center - the center point of the polygon
      * @param sides - the number of sides of the polygon
      * @param radius - the radius of the polygon
      */
    def this(center: typingsSlinky.paper.paper.Point, sides: Double, radius: Double) = this()
  }
  
  @js.native
  class Star protected ()
    extends typingsSlinky.paper.paper.Path {
    /** 
      * Creates a star shaped path item from the properties described by an
      * object literal.
      * 
      * @param object - an object containing properties describing the
      *     path's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates a star shaped path item.
      * 
      * The largest of `radius1` and `radius2` will be the outer radius of
      * the star. The smallest of radius1 and radius2 will be the inner
      * radius.
      * 
      * @param center - the center point of the star
      * @param points - the number of points of the star
      */
    def this(center: typingsSlinky.paper.paper.Point, points: Double, radius1: Double, radius2: Double) = this()
  }
}

package typingsSlinky.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("paper.Shape")
@js.native
class Shape ()
  extends typingsSlinky.paper.paper.Shape
object Shape {
  
  @JSGlobal("paper.Shape.Circle")
  @js.native
  class Circle protected ()
    extends typingsSlinky.paper.paper.Shape {
    /** 
      * Creates a circular shape item from the properties described by an
      * object literal.
      * 
      * @param object - an object containing properties describing the
      *     shape's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates a circular shape item.
      * 
      * @param center - the center point of the circle
      * @param radius - the radius of the circle
      */
    def this(center: typingsSlinky.paper.paper.Point, radius: Double) = this()
  }
  
  @JSGlobal("paper.Shape.Ellipse")
  @js.native
  class Ellipse protected ()
    extends typingsSlinky.paper.paper.Shape {
    /** 
      * Creates an elliptical shape item from the properties described by an
      * object literal.
      * 
      * @param object - an object containing properties describing the
      *     shape's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates an elliptical shape item.
      * 
      * @param rectangle - the rectangle circumscribing the ellipse
      */
    def this(rectangle: typingsSlinky.paper.paper.Rectangle) = this()
  }
  
  @JSGlobal("paper.Shape.Rectangle")
  @js.native
  class Rectangle protected ()
    extends typingsSlinky.paper.paper.Shape {
    /** 
      * Creates a rectangular shape item from the properties described by an
      * object literal.
      * 
      * @param object - an object containing properties describing the
      *     shape's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates a rectangular shape item, with optionally rounded corners.
      * 
      * @param rectangle - the rectangle object describing the
      * geometry of the rectangular shape to be created
      * @param radius - the size of the rounded corners
      */
    def this(rectangle: typingsSlinky.paper.paper.Rectangle) = this()
    /** 
      * Creates a rectangular shape item from the passed points. These do not
      * necessarily need to be the top left and bottom right corners, the
      * constructor figures out how to fit a rectangle between them.
      * 
      * @param from - the first point defining the rectangle
      * @param to - the second point defining the rectangle
      */
    def this(from: typingsSlinky.paper.paper.Point, to: typingsSlinky.paper.paper.Point) = this()
    /** 
      * Creates a rectangular shape item from a point and a size object.
      * 
      * @param point - the rectangle's top-left corner.
      * @param size - the rectangle's size.
      */
    def this(point: typingsSlinky.paper.paper.Point, size: typingsSlinky.paper.paper.Size) = this()
    def this(rectangle: typingsSlinky.paper.paper.Rectangle, radius: typingsSlinky.paper.paper.Size) = this()
  }
}

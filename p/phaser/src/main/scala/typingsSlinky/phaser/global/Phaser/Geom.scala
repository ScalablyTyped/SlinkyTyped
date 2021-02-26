package typingsSlinky.phaser.global.Phaser

import typingsSlinky.phaser.CenterFunction
import typingsSlinky.phaser.Phaser.Math.Vector2
import typingsSlinky.phaser.Phaser.Types.Math.Vector2Like
import typingsSlinky.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Geom {
  
  @JSGlobal("Phaser.Geom")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A Circle Geometry object type.
    */
  @JSGlobal("Phaser.Geom.CIRCLE")
  @js.native
  def CIRCLE_ : integer = js.native
  
  @scala.inline
  def CIRCLE__=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CIRCLE")(x.asInstanceOf[js.Any])
  
  /**
    * A Circle object.
    * 
    * This is a geometry object, containing numerical values and related methods to inspect and modify them.
    * It is not a Game Object, in that you cannot add it to the display list, and it has no texture.
    * To render a Circle you should look at the capabilities of the Graphics class.
    */
  @JSGlobal("Phaser.Geom.Circle")
  @js.native
  /**
    * 
    * @param x The x position of the center of the circle. Default 0.
    * @param y The y position of the center of the circle. Default 0.
    * @param radius The radius of the circle. Default 0.
    */
  class Circle ()
    extends typingsSlinky.phaser.Phaser.Geom.Circle {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], radius: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, radius: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], radius: Double) = this()
    def this(x: Double, y: Double, radius: Double) = this()
  }
  object Circle {
    
    /**
      * Calculates the area of the circle.
      * @param circle The Circle to get the area of.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Circle.Area")
    @js.native
    def Area(circle: typingsSlinky.phaser.Phaser.Geom.Circle): Double = js.native
    
    /**
      * Returns the circumference of the given Circle.
      * @param circle The Circle to get the circumference of.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Circle.Circumference")
    @js.native
    def Circumference(circle: typingsSlinky.phaser.Phaser.Geom.Circle): Double = js.native
    
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Circle based on the given angle.
      * @param circle The Circle to get the circumference point on.
      * @param angle The angle from the center of the Circle to the circumference to return the point from. Given in radians.
      * @param out A Point, or point-like object, to store the results in. If not given a Point will be created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Circle.CircumferencePoint")
    @js.native
    def CircumferencePoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](circle: typingsSlinky.phaser.Phaser.Geom.Circle, angle: Double): O = js.native
    @JSGlobal("Phaser.Geom.Circle.CircumferencePoint")
    @js.native
    def CircumferencePoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](circle: typingsSlinky.phaser.Phaser.Geom.Circle, angle: Double, out: O): O = js.native
    
    @JSGlobal("Phaser.Geom.Circle.Clone")
    @js.native
    def Clone(source: js.Object): typingsSlinky.phaser.Phaser.Geom.Circle = js.native
    /**
      * Creates a new Circle instance based on the values contained in the given source.
      * @param source The Circle to be cloned. Can be an instance of a Circle or a circle-like object, with x, y and radius properties.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Circle.Clone")
    @js.native
    def Clone(source: typingsSlinky.phaser.Phaser.Geom.Circle): typingsSlinky.phaser.Phaser.Geom.Circle = js.native
    
    /**
      * Check to see if the Circle contains the given x / y coordinates.
      * @param circle The Circle to check.
      * @param x The x coordinate to check within the circle.
      * @param y The y coordinate to check within the circle.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Circle.Contains")
    @js.native
    def Contains(circle: typingsSlinky.phaser.Phaser.Geom.Circle, x: Double, y: Double): Boolean = js.native
    
    @JSGlobal("Phaser.Geom.Circle.ContainsPoint")
    @js.native
    def ContainsPoint(circle: typingsSlinky.phaser.Phaser.Geom.Circle, point: js.Object): Boolean = js.native
    /**
      * Check to see if the Circle contains the given Point object.
      * @param circle The Circle to check.
      * @param point The Point object to check if it's within the Circle or not.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Circle.ContainsPoint")
    @js.native
    def ContainsPoint(circle: typingsSlinky.phaser.Phaser.Geom.Circle, point: typingsSlinky.phaser.Phaser.Geom.Point): Boolean = js.native
    
    @JSGlobal("Phaser.Geom.Circle.ContainsRect")
    @js.native
    def ContainsRect(circle: typingsSlinky.phaser.Phaser.Geom.Circle, rect: js.Object): Boolean = js.native
    /**
      * Check to see if the Circle contains all four points of the given Rectangle object.
      * @param circle The Circle to check.
      * @param rect The Rectangle object to check if it's within the Circle or not.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Circle.ContainsRect")
    @js.native
    def ContainsRect(circle: typingsSlinky.phaser.Phaser.Geom.Circle, rect: typingsSlinky.phaser.Phaser.Geom.Rectangle): Boolean = js.native
    
    /**
      * Copies the `x`, `y` and `radius` properties from the `source` Circle
      * into the given `dest` Circle, then returns the `dest` Circle.
      * @param source The source Circle to copy the values from.
      * @param dest The destination Circle to copy the values to.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Circle.CopyFrom")
    @js.native
    def CopyFrom[O /* <: typingsSlinky.phaser.Phaser.Geom.Circle */](source: typingsSlinky.phaser.Phaser.Geom.Circle, dest: O): O = js.native
    
    /**
      * Compares the `x`, `y` and `radius` properties of the two given Circles.
      * Returns `true` if they all match, otherwise returns `false`.
      * @param circle The first Circle to compare.
      * @param toCompare The second Circle to compare.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Circle.Equals")
    @js.native
    def Equals(
      circle: typingsSlinky.phaser.Phaser.Geom.Circle,
      toCompare: typingsSlinky.phaser.Phaser.Geom.Circle
    ): Boolean = js.native
    
    /**
      * Returns the bounds of the Circle object.
      * @param circle The Circle to get the bounds from.
      * @param out A Rectangle, or rectangle-like object, to store the circle bounds in. If not given a new Rectangle will be created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Circle.GetBounds")
    @js.native
    def GetBounds[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](circle: typingsSlinky.phaser.Phaser.Geom.Circle): O = js.native
    @JSGlobal("Phaser.Geom.Circle.GetBounds")
    @js.native
    def GetBounds[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](circle: typingsSlinky.phaser.Phaser.Geom.Circle, out: O): O = js.native
    
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Circle
      * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
      * at 180 degrees around the circle.
      * @param circle The Circle to get the circumference point on.
      * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the circle.
      * @param out An object to store the return values in. If not given a Point object will be created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Circle.GetPoint")
    @js.native
    def GetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](circle: typingsSlinky.phaser.Phaser.Geom.Circle, position: Double): O = js.native
    @JSGlobal("Phaser.Geom.Circle.GetPoint")
    @js.native
    def GetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](circle: typingsSlinky.phaser.Phaser.Geom.Circle, position: Double, out: O): O = js.native
    
    /**
      * Returns an array of Point objects containing the coordinates of the points around the circumference of the Circle,
      * based on the given quantity or stepRate values.
      * @param circle The Circle to get the points from.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the circumference of the circle and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Circle.GetPoints")
    @js.native
    def GetPoints(circle: typingsSlinky.phaser.Phaser.Geom.Circle, quantity: integer): js.Array[typingsSlinky.phaser.Phaser.Geom.Point] = js.native
    @JSGlobal("Phaser.Geom.Circle.GetPoints")
    @js.native
    def GetPoints(
      circle: typingsSlinky.phaser.Phaser.Geom.Circle,
      quantity: integer,
      stepRate: js.UndefOr[scala.Nothing],
      output: js.Array[_]
    ): js.Array[typingsSlinky.phaser.Phaser.Geom.Point] = js.native
    @JSGlobal("Phaser.Geom.Circle.GetPoints")
    @js.native
    def GetPoints(circle: typingsSlinky.phaser.Phaser.Geom.Circle, quantity: integer, stepRate: Double): js.Array[typingsSlinky.phaser.Phaser.Geom.Point] = js.native
    @JSGlobal("Phaser.Geom.Circle.GetPoints")
    @js.native
    def GetPoints(
      circle: typingsSlinky.phaser.Phaser.Geom.Circle,
      quantity: integer,
      stepRate: Double,
      output: js.Array[_]
    ): js.Array[typingsSlinky.phaser.Phaser.Geom.Point] = js.native
    
    /**
      * Offsets the Circle by the values given.
      * @param circle The Circle to be offset (translated.)
      * @param x The amount to horizontally offset the Circle by.
      * @param y The amount to vertically offset the Circle by.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Circle.Offset")
    @js.native
    def Offset[O /* <: typingsSlinky.phaser.Phaser.Geom.Circle */](circle: O, x: Double, y: Double): O = js.native
    
    @JSGlobal("Phaser.Geom.Circle.OffsetPoint")
    @js.native
    def OffsetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Circle */](circle: O, point: js.Object): O = js.native
    /**
      * Offsets the Circle by the values given in the `x` and `y` properties of the Point object.
      * @param circle The Circle to be offset (translated.)
      * @param point The Point object containing the values to offset the Circle by.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Circle.OffsetPoint")
    @js.native
    def OffsetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Circle */](circle: O, point: typingsSlinky.phaser.Phaser.Geom.Point): O = js.native
    
    /**
      * Returns a uniformly distributed random point from anywhere within the given Circle.
      * @param circle The Circle to get a random point from.
      * @param out A Point or point-like object to set the random `x` and `y` values in.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Circle.Random")
    @js.native
    def Random[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](circle: typingsSlinky.phaser.Phaser.Geom.Circle): O = js.native
    @JSGlobal("Phaser.Geom.Circle.Random")
    @js.native
    def Random[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](circle: typingsSlinky.phaser.Phaser.Geom.Circle, out: O): O = js.native
  }
  
  /**
    * An Ellipse Geometry object type.
    */
  @JSGlobal("Phaser.Geom.ELLIPSE")
  @js.native
  def ELLIPSE_ : integer = js.native
  
  @scala.inline
  def ELLIPSE__=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELLIPSE")(x.asInstanceOf[js.Any])
  
  /**
    * An Ellipse object.
    * 
    * This is a geometry object, containing numerical values and related methods to inspect and modify them.
    * It is not a Game Object, in that you cannot add it to the display list, and it has no texture.
    * To render an Ellipse you should look at the capabilities of the Graphics class.
    */
  @JSGlobal("Phaser.Geom.Ellipse")
  @js.native
  /**
    * 
    * @param x The x position of the center of the ellipse. Default 0.
    * @param y The y position of the center of the ellipse. Default 0.
    * @param width The width of the ellipse. Default 0.
    * @param height The height of the ellipse. Default 0.
    */
  class Ellipse ()
    extends typingsSlinky.phaser.Phaser.Geom.Ellipse {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      width: js.UndefOr[scala.Nothing],
      height: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
  }
  object Ellipse {
    
    /**
      * Calculates the area of the Ellipse.
      * @param ellipse The Ellipse to get the area of.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Ellipse.Area")
    @js.native
    def Area(ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse): Double = js.native
    
    /**
      * Returns the circumference of the given Ellipse.
      * @param ellipse The Ellipse to get the circumference of.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Ellipse.Circumference")
    @js.native
    def Circumference(ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse): Double = js.native
    
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Ellipse based on the given angle.
      * @param ellipse The Ellipse to get the circumference point on.
      * @param angle The angle from the center of the Ellipse to the circumference to return the point from. Given in radians.
      * @param out A Point, or point-like object, to store the results in. If not given a Point will be created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Ellipse.CircumferencePoint")
    @js.native
    def CircumferencePoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse, angle: Double): O = js.native
    @JSGlobal("Phaser.Geom.Ellipse.CircumferencePoint")
    @js.native
    def CircumferencePoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse, angle: Double, out: O): O = js.native
    
    /**
      * Creates a new Ellipse instance based on the values contained in the given source.
      * @param source The Ellipse to be cloned. Can be an instance of an Ellipse or a ellipse-like object, with x, y, width and height properties.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Ellipse.Clone")
    @js.native
    def Clone(source: typingsSlinky.phaser.Phaser.Geom.Ellipse): typingsSlinky.phaser.Phaser.Geom.Ellipse = js.native
    
    /**
      * Check to see if the Ellipse contains the given x / y coordinates.
      * @param ellipse The Ellipse to check.
      * @param x The x coordinate to check within the ellipse.
      * @param y The y coordinate to check within the ellipse.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Ellipse.Contains")
    @js.native
    def Contains(ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse, x: Double, y: Double): Boolean = js.native
    
    @JSGlobal("Phaser.Geom.Ellipse.ContainsPoint")
    @js.native
    def ContainsPoint(ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse, point: js.Object): Boolean = js.native
    /**
      * Check to see if the Ellipse contains the given Point object.
      * @param ellipse The Ellipse to check.
      * @param point The Point object to check if it's within the Circle or not.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Ellipse.ContainsPoint")
    @js.native
    def ContainsPoint(ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse, point: typingsSlinky.phaser.Phaser.Geom.Point): Boolean = js.native
    
    @JSGlobal("Phaser.Geom.Ellipse.ContainsRect")
    @js.native
    def ContainsRect(ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse, rect: js.Object): Boolean = js.native
    /**
      * Check to see if the Ellipse contains all four points of the given Rectangle object.
      * @param ellipse The Ellipse to check.
      * @param rect The Rectangle object to check if it's within the Ellipse or not.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Ellipse.ContainsRect")
    @js.native
    def ContainsRect(
      ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse,
      rect: typingsSlinky.phaser.Phaser.Geom.Rectangle
    ): Boolean = js.native
    
    /**
      * Copies the `x`, `y`, `width` and `height` properties from the `source` Ellipse
      * into the given `dest` Ellipse, then returns the `dest` Ellipse.
      * @param source The source Ellipse to copy the values from.
      * @param dest The destination Ellipse to copy the values to.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Ellipse.CopyFrom")
    @js.native
    def CopyFrom[O /* <: typingsSlinky.phaser.Phaser.Geom.Ellipse */](source: typingsSlinky.phaser.Phaser.Geom.Ellipse, dest: O): O = js.native
    
    /**
      * Compares the `x`, `y`, `width` and `height` properties of the two given Ellipses.
      * Returns `true` if they all match, otherwise returns `false`.
      * @param ellipse The first Ellipse to compare.
      * @param toCompare The second Ellipse to compare.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Ellipse.Equals")
    @js.native
    def Equals(
      ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse,
      toCompare: typingsSlinky.phaser.Phaser.Geom.Ellipse
    ): Boolean = js.native
    
    /**
      * Returns the bounds of the Ellipse object.
      * @param ellipse The Ellipse to get the bounds from.
      * @param out A Rectangle, or rectangle-like object, to store the ellipse bounds in. If not given a new Rectangle will be created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Ellipse.GetBounds")
    @js.native
    def GetBounds[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse): O = js.native
    @JSGlobal("Phaser.Geom.Ellipse.GetBounds")
    @js.native
    def GetBounds[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse, out: O): O = js.native
    
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Ellipse
      * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
      * at 180 degrees around the circle.
      * @param ellipse The Ellipse to get the circumference point on.
      * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the ellipse.
      * @param out An object to store the return values in. If not given a Point object will be created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Ellipse.GetPoint")
    @js.native
    def GetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse, position: Double): O = js.native
    @JSGlobal("Phaser.Geom.Ellipse.GetPoint")
    @js.native
    def GetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse, position: Double, out: O): O = js.native
    
    /**
      * Returns an array of Point objects containing the coordinates of the points around the circumference of the Ellipse,
      * based on the given quantity or stepRate values.
      * @param ellipse The Ellipse to get the points from.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the circumference of the ellipse and dividing it by the stepRate.
      * @param out An array to insert the points in to. If not provided a new array will be created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Ellipse.GetPoints")
    @js.native
    def GetPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse, quantity: integer): O = js.native
    @JSGlobal("Phaser.Geom.Ellipse.GetPoints")
    @js.native
    def GetPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](
      ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse,
      quantity: integer,
      stepRate: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    @JSGlobal("Phaser.Geom.Ellipse.GetPoints")
    @js.native
    def GetPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse, quantity: integer, stepRate: Double): O = js.native
    @JSGlobal("Phaser.Geom.Ellipse.GetPoints")
    @js.native
    def GetPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse, quantity: integer, stepRate: Double, out: O): O = js.native
    
    /**
      * Offsets the Ellipse by the values given.
      * @param ellipse The Ellipse to be offset (translated.)
      * @param x The amount to horizontally offset the Ellipse by.
      * @param y The amount to vertically offset the Ellipse by.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Ellipse.Offset")
    @js.native
    def Offset[O /* <: typingsSlinky.phaser.Phaser.Geom.Ellipse */](ellipse: O, x: Double, y: Double): O = js.native
    
    @JSGlobal("Phaser.Geom.Ellipse.OffsetPoint")
    @js.native
    def OffsetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Ellipse */](ellipse: O, point: js.Object): O = js.native
    /**
      * Offsets the Ellipse by the values given in the `x` and `y` properties of the Point object.
      * @param ellipse The Ellipse to be offset (translated.)
      * @param point The Point object containing the values to offset the Ellipse by.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Ellipse.OffsetPoint")
    @js.native
    def OffsetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Ellipse */](ellipse: O, point: typingsSlinky.phaser.Phaser.Geom.Point): O = js.native
    
    /**
      * Returns a uniformly distributed random point from anywhere within the given Ellipse.
      * @param ellipse The Ellipse to get a random point from.
      * @param out A Point or point-like object to set the random `x` and `y` values in.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Ellipse.Random")
    @js.native
    def Random[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse): O = js.native
    @JSGlobal("Phaser.Geom.Ellipse.Random")
    @js.native
    def Random[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](ellipse: typingsSlinky.phaser.Phaser.Geom.Ellipse, out: O): O = js.native
  }
  
  object Intersects {
    
    /**
      * Checks if two Circles intersect.
      * @param circleA The first Circle to check for intersection.
      * @param circleB The second Circle to check for intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.CircleToCircle")
    @js.native
    def CircleToCircle(circleA: typingsSlinky.phaser.Phaser.Geom.Circle, circleB: typingsSlinky.phaser.Phaser.Geom.Circle): Boolean = js.native
    
    /**
      * Checks for intersection between a circle and a rectangle.
      * @param circle The circle to be checked.
      * @param rect The rectangle to be checked.
      */
    @JSGlobal("Phaser.Geom.Intersects.CircleToRectangle")
    @js.native
    def CircleToRectangle(circle: typingsSlinky.phaser.Phaser.Geom.Circle, rect: typingsSlinky.phaser.Phaser.Geom.Rectangle): Boolean = js.native
    
    /**
      * Checks if two Circles intersect and returns the intersection points as a Point object array.
      * @param circleA The first Circle to check for intersection.
      * @param circleB The second Circle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.GetCircleToCircle")
    @js.native
    def GetCircleToCircle(circleA: typingsSlinky.phaser.Phaser.Geom.Circle, circleB: typingsSlinky.phaser.Phaser.Geom.Circle): js.Array[_] = js.native
    @JSGlobal("Phaser.Geom.Intersects.GetCircleToCircle")
    @js.native
    def GetCircleToCircle(
      circleA: typingsSlinky.phaser.Phaser.Geom.Circle,
      circleB: typingsSlinky.phaser.Phaser.Geom.Circle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    
    /**
      * Checks for intersection between a circle and a rectangle,
      * and returns the intersection points as a Point object array.
      * @param circle The circle to be checked.
      * @param rect The rectangle to be checked.
      * @param out An optional array in which to store the points of intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.GetCircleToRectangle")
    @js.native
    def GetCircleToRectangle(circle: typingsSlinky.phaser.Phaser.Geom.Circle, rect: typingsSlinky.phaser.Phaser.Geom.Rectangle): js.Array[_] = js.native
    @JSGlobal("Phaser.Geom.Intersects.GetCircleToRectangle")
    @js.native
    def GetCircleToRectangle(
      circle: typingsSlinky.phaser.Phaser.Geom.Circle,
      rect: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    
    /**
      * Checks for intersection between the line segment and circle,
      * and returns the intersection points as a Point object array.
      * @param line The line segment to check.
      * @param circle The circle to check against the line.
      * @param out An optional array in which to store the points of intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.GetLineToCircle")
    @js.native
    def GetLineToCircle(line: typingsSlinky.phaser.Phaser.Geom.Line, circle: typingsSlinky.phaser.Phaser.Geom.Circle): js.Array[_] = js.native
    @JSGlobal("Phaser.Geom.Intersects.GetLineToCircle")
    @js.native
    def GetLineToCircle(
      line: typingsSlinky.phaser.Phaser.Geom.Line,
      circle: typingsSlinky.phaser.Phaser.Geom.Circle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    
    @JSGlobal("Phaser.Geom.Intersects.GetLineToRectangle")
    @js.native
    def GetLineToRectangle(line: typingsSlinky.phaser.Phaser.Geom.Line, rect: js.Object): js.Array[_] = js.native
    @JSGlobal("Phaser.Geom.Intersects.GetLineToRectangle")
    @js.native
    def GetLineToRectangle(line: typingsSlinky.phaser.Phaser.Geom.Line, rect: js.Object, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Checks for intersection between the Line and a Rectangle shape,
      * and returns the intersection points as a Point object array.
      * @param line The Line to check for intersection.
      * @param rect The Rectangle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.GetLineToRectangle")
    @js.native
    def GetLineToRectangle(line: typingsSlinky.phaser.Phaser.Geom.Line, rect: typingsSlinky.phaser.Phaser.Geom.Rectangle): js.Array[_] = js.native
    @JSGlobal("Phaser.Geom.Intersects.GetLineToRectangle")
    @js.native
    def GetLineToRectangle(
      line: typingsSlinky.phaser.Phaser.Geom.Line,
      rect: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    
    /**
      * Checks if two Rectangle shapes intersect and returns the area of this intersection as Rectangle object.
      * 
      * If optional `output` parameter is omitted, new Rectangle object is created and returned. If there is intersection, it will contain intersection area. If there is no intersection, it wil be empty Rectangle (all values set to zero).
      * 
      * If Rectangle object is passed as `output` and there is intersection, then intersection area data will be loaded into it and it will be returned. If there is no intersection, it will be returned without any change.
      * @param rectA The first Rectangle object.
      * @param rectB The second Rectangle object.
      * @param output Optional Rectangle object. If given, the intersection data will be loaded into it (in case of no intersection, it will be left unchanged). Otherwise, new Rectangle object will be created and returned with either intersection data or empty (all values set to zero), if there is no intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.GetRectangleIntersection")
    @js.native
    def GetRectangleIntersection[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](
      rectA: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      rectB: typingsSlinky.phaser.Phaser.Geom.Rectangle
    ): O = js.native
    @JSGlobal("Phaser.Geom.Intersects.GetRectangleIntersection")
    @js.native
    def GetRectangleIntersection[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](
      rectA: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      rectB: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      output: O
    ): O = js.native
    
    /**
      * Checks if two Rectangles intersect and returns the intersection points as a Point object array.
      * 
      * A Rectangle intersects another Rectangle if any part of its bounds is within the other Rectangle's bounds. As such, the two Rectangles are considered "solid". A Rectangle with no width or no height will never intersect another Rectangle.
      * @param rectA The first Rectangle to check for intersection.
      * @param rectB The second Rectangle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.GetRectangleToRectangle")
    @js.native
    def GetRectangleToRectangle(
      rectA: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      rectB: typingsSlinky.phaser.Phaser.Geom.Rectangle
    ): js.Array[_] = js.native
    @JSGlobal("Phaser.Geom.Intersects.GetRectangleToRectangle")
    @js.native
    def GetRectangleToRectangle(
      rectA: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      rectB: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    
    /**
      * Checks for intersection between Rectangle shape and Triangle shape,
      * and returns the intersection points as a Point object array.
      * @param rect Rectangle object to test.
      * @param triangle Triangle object to test.
      * @param out An optional array in which to store the points of intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.GetRectangleToTriangle")
    @js.native
    def GetRectangleToTriangle(
      rect: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      triangle: typingsSlinky.phaser.Phaser.Geom.Triangle
    ): js.Array[_] = js.native
    @JSGlobal("Phaser.Geom.Intersects.GetRectangleToTriangle")
    @js.native
    def GetRectangleToTriangle(
      rect: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      triangle: typingsSlinky.phaser.Phaser.Geom.Triangle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    
    /**
      * Checks if a Triangle and a Circle intersect, and returns the intersection points as a Point object array.
      * 
      * A Circle intersects a Triangle if its center is located within it or if any of the Triangle's sides intersect the Circle. As such, the Triangle and the Circle are considered "solid" for the intersection.
      * @param triangle The Triangle to check for intersection.
      * @param circle The Circle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.GetTriangleToCircle")
    @js.native
    def GetTriangleToCircle(
      triangle: typingsSlinky.phaser.Phaser.Geom.Triangle,
      circle: typingsSlinky.phaser.Phaser.Geom.Circle
    ): js.Array[_] = js.native
    @JSGlobal("Phaser.Geom.Intersects.GetTriangleToCircle")
    @js.native
    def GetTriangleToCircle(
      triangle: typingsSlinky.phaser.Phaser.Geom.Triangle,
      circle: typingsSlinky.phaser.Phaser.Geom.Circle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    
    /**
      * Checks if a Triangle and a Line intersect, and returns the intersection points as a Point object array.
      * 
      * The Line intersects the Triangle if it starts inside of it, ends inside of it, or crosses any of the Triangle's sides. Thus, the Triangle is considered "solid".
      * @param triangle The Triangle to check with.
      * @param line The Line to check with.
      * @param out An optional array in which to store the points of intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.GetTriangleToLine")
    @js.native
    def GetTriangleToLine(triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, line: typingsSlinky.phaser.Phaser.Geom.Line): js.Array[_] = js.native
    @JSGlobal("Phaser.Geom.Intersects.GetTriangleToLine")
    @js.native
    def GetTriangleToLine(
      triangle: typingsSlinky.phaser.Phaser.Geom.Triangle,
      line: typingsSlinky.phaser.Phaser.Geom.Line,
      out: js.Array[_]
    ): js.Array[_] = js.native
    
    /**
      * Checks if two Triangles intersect, and returns the intersection points as a Point object array.
      * 
      * A Triangle intersects another Triangle if any pair of their lines intersects or if any point of one Triangle is within the other Triangle. Thus, the Triangles are considered "solid".
      * @param triangleA The first Triangle to check for intersection.
      * @param triangleB The second Triangle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.GetTriangleToTriangle")
    @js.native
    def GetTriangleToTriangle(
      triangleA: typingsSlinky.phaser.Phaser.Geom.Triangle,
      triangleB: typingsSlinky.phaser.Phaser.Geom.Triangle
    ): js.Array[_] = js.native
    @JSGlobal("Phaser.Geom.Intersects.GetTriangleToTriangle")
    @js.native
    def GetTriangleToTriangle(
      triangleA: typingsSlinky.phaser.Phaser.Geom.Triangle,
      triangleB: typingsSlinky.phaser.Phaser.Geom.Triangle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    
    /**
      * Checks for intersection between the line segment and circle.
      * 
      * Based on code by [Matt DesLauriers](https://github.com/mattdesl/line-circle-collision/blob/master/LICENSE.md).
      * @param line The line segment to check.
      * @param circle The circle to check against the line.
      * @param nearest An optional Point-like object. If given the closest point on the Line where the circle intersects will be stored in this object.
      */
    @JSGlobal("Phaser.Geom.Intersects.LineToCircle")
    @js.native
    def LineToCircle(line: typingsSlinky.phaser.Phaser.Geom.Line, circle: typingsSlinky.phaser.Phaser.Geom.Circle): Boolean = js.native
    @JSGlobal("Phaser.Geom.Intersects.LineToCircle")
    @js.native
    def LineToCircle(
      line: typingsSlinky.phaser.Phaser.Geom.Line,
      circle: typingsSlinky.phaser.Phaser.Geom.Circle,
      nearest: js.Any
    ): Boolean = js.native
    @JSGlobal("Phaser.Geom.Intersects.LineToCircle")
    @js.native
    def LineToCircle(
      line: typingsSlinky.phaser.Phaser.Geom.Line,
      circle: typingsSlinky.phaser.Phaser.Geom.Circle,
      nearest: typingsSlinky.phaser.Phaser.Geom.Point
    ): Boolean = js.native
    
    /**
      * Checks if two Lines intersect. If the Lines are identical, they will be treated as parallel and thus non-intersecting.
      * @param line1 The first Line to check.
      * @param line2 The second Line to check.
      * @param out A Point in which to optionally store the point of intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.LineToLine")
    @js.native
    def LineToLine(line1: typingsSlinky.phaser.Phaser.Geom.Line, line2: typingsSlinky.phaser.Phaser.Geom.Line): Boolean = js.native
    @JSGlobal("Phaser.Geom.Intersects.LineToLine")
    @js.native
    def LineToLine(
      line1: typingsSlinky.phaser.Phaser.Geom.Line,
      line2: typingsSlinky.phaser.Phaser.Geom.Line,
      out: typingsSlinky.phaser.Phaser.Geom.Point
    ): Boolean = js.native
    
    @JSGlobal("Phaser.Geom.Intersects.LineToRectangle")
    @js.native
    def LineToRectangle(line: typingsSlinky.phaser.Phaser.Geom.Line, rect: js.Object): Boolean = js.native
    /**
      * Checks for intersection between the Line and a Rectangle shape, or a rectangle-like
      * object, with public `x`, `y`, `right` and `bottom` properties, such as a Sprite or Body.
      * 
      * An intersection is considered valid if:
      * 
      * The line starts within, or ends within, the Rectangle.
      * The line segment intersects one of the 4 rectangle edges.
      * 
      * The for the purposes of this function rectangles are considered 'solid'.
      * @param line The Line to check for intersection.
      * @param rect The Rectangle to check for intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.LineToRectangle")
    @js.native
    def LineToRectangle(line: typingsSlinky.phaser.Phaser.Geom.Line, rect: typingsSlinky.phaser.Phaser.Geom.Rectangle): Boolean = js.native
    
    @JSGlobal("Phaser.Geom.Intersects.PointToLine")
    @js.native
    def PointToLine(point: js.Any, line: typingsSlinky.phaser.Phaser.Geom.Line): Boolean = js.native
    @JSGlobal("Phaser.Geom.Intersects.PointToLine")
    @js.native
    def PointToLine(point: js.Any, line: typingsSlinky.phaser.Phaser.Geom.Line, lineThickness: Double): Boolean = js.native
    /**
      * Checks if the a Point falls between the two end-points of a Line, based on the given line thickness.
      * 
      * Assumes that the line end points are circular, not square.
      * @param point The point, or point-like object to check.
      * @param line The line segment to test for intersection on.
      * @param lineThickness The line thickness. Assumes that the line end points are circular. Default 1.
      */
    @JSGlobal("Phaser.Geom.Intersects.PointToLine")
    @js.native
    def PointToLine(point: typingsSlinky.phaser.Phaser.Geom.Point, line: typingsSlinky.phaser.Phaser.Geom.Line): Boolean = js.native
    @JSGlobal("Phaser.Geom.Intersects.PointToLine")
    @js.native
    def PointToLine(
      point: typingsSlinky.phaser.Phaser.Geom.Point,
      line: typingsSlinky.phaser.Phaser.Geom.Line,
      lineThickness: Double
    ): Boolean = js.native
    
    /**
      * Checks if a Point is located on the given line segment.
      * @param point The Point to check for intersection.
      * @param line The line segment to check for intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.PointToLineSegment")
    @js.native
    def PointToLineSegment(point: typingsSlinky.phaser.Phaser.Geom.Point, line: typingsSlinky.phaser.Phaser.Geom.Line): Boolean = js.native
    
    /**
      * Checks if two Rectangles intersect.
      * 
      * A Rectangle intersects another Rectangle if any part of its bounds is within the other Rectangle's bounds.
      * As such, the two Rectangles are considered "solid".
      * A Rectangle with no width or no height will never intersect another Rectangle.
      * @param rectA The first Rectangle to check for intersection.
      * @param rectB The second Rectangle to check for intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.RectangleToRectangle")
    @js.native
    def RectangleToRectangle(
      rectA: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      rectB: typingsSlinky.phaser.Phaser.Geom.Rectangle
    ): Boolean = js.native
    
    /**
      * Checks for intersection between Rectangle shape and Triangle shape.
      * @param rect Rectangle object to test.
      * @param triangle Triangle object to test.
      */
    @JSGlobal("Phaser.Geom.Intersects.RectangleToTriangle")
    @js.native
    def RectangleToTriangle(
      rect: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      triangle: typingsSlinky.phaser.Phaser.Geom.Triangle
    ): Boolean = js.native
    
    /**
      * Check if rectangle intersects with values.
      * @param rect The rectangle object
      * @param left The x coordinate of the left of the Rectangle.
      * @param right The x coordinate of the right of the Rectangle.
      * @param top The y coordinate of the top of the Rectangle.
      * @param bottom The y coordinate of the bottom of the Rectangle.
      * @param tolerance Tolerance allowed in the calculation, expressed in pixels. Default 0.
      */
    @JSGlobal("Phaser.Geom.Intersects.RectangleToValues")
    @js.native
    def RectangleToValues(
      rect: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      left: Double,
      right: Double,
      top: Double,
      bottom: Double
    ): Boolean = js.native
    @JSGlobal("Phaser.Geom.Intersects.RectangleToValues")
    @js.native
    def RectangleToValues(
      rect: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      left: Double,
      right: Double,
      top: Double,
      bottom: Double,
      tolerance: Double
    ): Boolean = js.native
    
    /**
      * Checks if a Triangle and a Circle intersect.
      * 
      * A Circle intersects a Triangle if its center is located within it or if any of the Triangle's sides intersect the Circle. As such, the Triangle and the Circle are considered "solid" for the intersection.
      * @param triangle The Triangle to check for intersection.
      * @param circle The Circle to check for intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.TriangleToCircle")
    @js.native
    def TriangleToCircle(
      triangle: typingsSlinky.phaser.Phaser.Geom.Triangle,
      circle: typingsSlinky.phaser.Phaser.Geom.Circle
    ): Boolean = js.native
    
    /**
      * Checks if a Triangle and a Line intersect.
      * 
      * The Line intersects the Triangle if it starts inside of it, ends inside of it, or crosses any of the Triangle's sides. Thus, the Triangle is considered "solid".
      * @param triangle The Triangle to check with.
      * @param line The Line to check with.
      */
    @JSGlobal("Phaser.Geom.Intersects.TriangleToLine")
    @js.native
    def TriangleToLine(triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, line: typingsSlinky.phaser.Phaser.Geom.Line): Boolean = js.native
    
    /**
      * Checks if two Triangles intersect.
      * 
      * A Triangle intersects another Triangle if any pair of their lines intersects or if any point of one Triangle is within the other Triangle. Thus, the Triangles are considered "solid".
      * @param triangleA The first Triangle to check for intersection.
      * @param triangleB The second Triangle to check for intersection.
      */
    @JSGlobal("Phaser.Geom.Intersects.TriangleToTriangle")
    @js.native
    def TriangleToTriangle(
      triangleA: typingsSlinky.phaser.Phaser.Geom.Triangle,
      triangleB: typingsSlinky.phaser.Phaser.Geom.Triangle
    ): Boolean = js.native
  }
  
  /**
    * A Line Geometry object type.
    */
  @JSGlobal("Phaser.Geom.LINE")
  @js.native
  def LINE_ : integer = js.native
  
  @scala.inline
  def LINE__=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINE")(x.asInstanceOf[js.Any])
  
  /**
    * Defines a Line segment, a part of a line between two endpoints.
    */
  @JSGlobal("Phaser.Geom.Line")
  @js.native
  /**
    * 
    * @param x1 The x coordinate of the lines starting point. Default 0.
    * @param y1 The y coordinate of the lines starting point. Default 0.
    * @param x2 The x coordinate of the lines ending point. Default 0.
    * @param y2 The y coordinate of the lines ending point. Default 0.
    */
  class Line ()
    extends typingsSlinky.phaser.Phaser.Geom.Line {
    def this(x1: Double) = this()
    def this(x1: js.UndefOr[scala.Nothing], y1: Double) = this()
    def this(x1: Double, y1: Double) = this()
    def this(x1: js.UndefOr[scala.Nothing], y1: js.UndefOr[scala.Nothing], x2: Double) = this()
    def this(x1: js.UndefOr[scala.Nothing], y1: Double, x2: Double) = this()
    def this(x1: Double, y1: js.UndefOr[scala.Nothing], x2: Double) = this()
    def this(x1: Double, y1: Double, x2: Double) = this()
    def this(
      x1: js.UndefOr[scala.Nothing],
      y1: js.UndefOr[scala.Nothing],
      x2: js.UndefOr[scala.Nothing],
      y2: Double
    ) = this()
    def this(x1: js.UndefOr[scala.Nothing], y1: js.UndefOr[scala.Nothing], x2: Double, y2: Double) = this()
    def this(x1: js.UndefOr[scala.Nothing], y1: Double, x2: js.UndefOr[scala.Nothing], y2: Double) = this()
    def this(x1: js.UndefOr[scala.Nothing], y1: Double, x2: Double, y2: Double) = this()
    def this(x1: Double, y1: js.UndefOr[scala.Nothing], x2: js.UndefOr[scala.Nothing], y2: Double) = this()
    def this(x1: Double, y1: js.UndefOr[scala.Nothing], x2: Double, y2: Double) = this()
    def this(x1: Double, y1: Double, x2: js.UndefOr[scala.Nothing], y2: Double) = this()
    def this(x1: Double, y1: Double, x2: Double, y2: Double) = this()
  }
  object Line {
    
    /**
      * Calculate the angle of the line in radians.
      * @param line The line to calculate the angle of.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.Angle")
    @js.native
    def Angle(line: typingsSlinky.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Using Bresenham's line algorithm this will return an array of all coordinates on this line.
      * 
      * The `start` and `end` points are rounded before this runs as the algorithm works on integers.
      * @param line The line.
      * @param stepRate The optional step rate for the points on the line. Default 1.
      * @param results An optional array to push the resulting coordinates into.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.BresenhamPoints")
    @js.native
    def BresenhamPoints(line: typingsSlinky.phaser.Phaser.Geom.Line): js.Array[Vector2Like] = js.native
    @JSGlobal("Phaser.Geom.Line.BresenhamPoints")
    @js.native
    def BresenhamPoints(
      line: typingsSlinky.phaser.Phaser.Geom.Line,
      stepRate: js.UndefOr[scala.Nothing],
      results: js.Array[Vector2Like]
    ): js.Array[Vector2Like] = js.native
    @JSGlobal("Phaser.Geom.Line.BresenhamPoints")
    @js.native
    def BresenhamPoints(line: typingsSlinky.phaser.Phaser.Geom.Line, stepRate: integer): js.Array[Vector2Like] = js.native
    @JSGlobal("Phaser.Geom.Line.BresenhamPoints")
    @js.native
    def BresenhamPoints(line: typingsSlinky.phaser.Phaser.Geom.Line, stepRate: integer, results: js.Array[Vector2Like]): js.Array[Vector2Like] = js.native
    
    /**
      * Center a line on the given coordinates.
      * @param line The line to center.
      * @param x The horizontal coordinate to center the line on.
      * @param y The vertical coordinate to center the line on.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.CenterOn")
    @js.native
    def CenterOn(line: typingsSlinky.phaser.Phaser.Geom.Line, x: Double, y: Double): typingsSlinky.phaser.Phaser.Geom.Line = js.native
    
    /**
      * Clone the given line.
      * @param source The source line to clone.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.Clone")
    @js.native
    def Clone(source: typingsSlinky.phaser.Phaser.Geom.Line): typingsSlinky.phaser.Phaser.Geom.Line = js.native
    
    /**
      * Copy the values of one line to a destination line.
      * @param source The source line to copy the values from.
      * @param dest The destination line to copy the values to.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.CopyFrom")
    @js.native
    def CopyFrom[O /* <: typingsSlinky.phaser.Phaser.Geom.Line */](source: typingsSlinky.phaser.Phaser.Geom.Line, dest: O): O = js.native
    
    /**
      * Compare two lines for strict equality.
      * @param line The first line to compare.
      * @param toCompare The second line to compare.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.Equals")
    @js.native
    def Equals(line: typingsSlinky.phaser.Phaser.Geom.Line, toCompare: typingsSlinky.phaser.Phaser.Geom.Line): Boolean = js.native
    
    /**
      * Extends the start and end points of a Line by the given amounts.
      * 
      * The amounts can be positive or negative. Positive points will increase the length of the line,
      * while negative ones will decrease it.
      * 
      * If no `right` value is provided it will extend the length of the line equally in both directions.
      * 
      * Pass a value of zero to leave the start or end point unchanged.
      * @param line The line instance to extend.
      * @param left The amount to extend the start of the line by.
      * @param right The amount to extend the end of the line by. If not given it will be set to the `left` value.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.Extend")
    @js.native
    def Extend(line: typingsSlinky.phaser.Phaser.Geom.Line, left: Double): typingsSlinky.phaser.Phaser.Geom.Line = js.native
    @JSGlobal("Phaser.Geom.Line.Extend")
    @js.native
    def Extend(line: typingsSlinky.phaser.Phaser.Geom.Line, left: Double, right: Double): typingsSlinky.phaser.Phaser.Geom.Line = js.native
    
    /**
      * Returns an array of `quantity` Points where each point is taken from the given Line,
      * spaced out according to the ease function specified.
      * 
      * ```javascript
      * const line = new Phaser.Geom.Line(100, 300, 700, 300);
      * const points = Phaser.Geom.Line.GetEasedPoints(line, 'sine.out', 32)
      * ```
      * 
      * In the above example, the `points` array will contain 32 points spread-out across
      * the length of `line`, where the position of each point is determined by the `Sine.out`
      * ease function.
      * 
      * You can optionally provide a collinear threshold. In this case, the resulting points
      * are checked against each other, and if they are `< collinearThreshold` distance apart,
      * they are dropped from the results. This can help avoid lots of clustered points at
      * far ends of the line with tightly-packed eases such as Quartic. Leave the value set
      * to zero to skip this check.
      * 
      * Note that if you provide a collinear threshold, the resulting array may not always
      * contain `quantity` points.
      * @param line The Line object.
      * @param ease The ease to use. This can be either a string from the EaseMap, or a custom function.
      * @param quantity The number of points to return. Note that if you provide a `collinearThreshold`, the resulting array may not always contain this number of points.
      * @param collinearThreshold An optional threshold. The final array is reduced so that each point is spaced out at least this distance apart. This helps reduce clustering in noisey eases. Default 0.
      * @param easeParams An optional array of ease parameters to go with the ease.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.GetEasedPoints")
    @js.native
    def GetEasedPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](line: typingsSlinky.phaser.Phaser.Geom.Line, ease: String, quantity: integer): O = js.native
    @JSGlobal("Phaser.Geom.Line.GetEasedPoints")
    @js.native
    def GetEasedPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](
      line: typingsSlinky.phaser.Phaser.Geom.Line,
      ease: String,
      quantity: integer,
      collinearThreshold: js.UndefOr[scala.Nothing],
      easeParams: js.Array[Double]
    ): O = js.native
    @JSGlobal("Phaser.Geom.Line.GetEasedPoints")
    @js.native
    def GetEasedPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](
      line: typingsSlinky.phaser.Phaser.Geom.Line,
      ease: String,
      quantity: integer,
      collinearThreshold: Double
    ): O = js.native
    @JSGlobal("Phaser.Geom.Line.GetEasedPoints")
    @js.native
    def GetEasedPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](
      line: typingsSlinky.phaser.Phaser.Geom.Line,
      ease: String,
      quantity: integer,
      collinearThreshold: Double,
      easeParams: js.Array[Double]
    ): O = js.native
    @JSGlobal("Phaser.Geom.Line.GetEasedPoints")
    @js.native
    def GetEasedPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](line: typingsSlinky.phaser.Phaser.Geom.Line, ease: js.Function, quantity: integer): O = js.native
    @JSGlobal("Phaser.Geom.Line.GetEasedPoints")
    @js.native
    def GetEasedPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](
      line: typingsSlinky.phaser.Phaser.Geom.Line,
      ease: js.Function,
      quantity: integer,
      collinearThreshold: js.UndefOr[scala.Nothing],
      easeParams: js.Array[Double]
    ): O = js.native
    @JSGlobal("Phaser.Geom.Line.GetEasedPoints")
    @js.native
    def GetEasedPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](
      line: typingsSlinky.phaser.Phaser.Geom.Line,
      ease: js.Function,
      quantity: integer,
      collinearThreshold: Double
    ): O = js.native
    @JSGlobal("Phaser.Geom.Line.GetEasedPoints")
    @js.native
    def GetEasedPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](
      line: typingsSlinky.phaser.Phaser.Geom.Line,
      ease: js.Function,
      quantity: integer,
      collinearThreshold: Double,
      easeParams: js.Array[Double]
    ): O = js.native
    
    /**
      * Get the midpoint of the given line.
      * @param line The line to get the midpoint of.
      * @param out An optional point object to store the midpoint in.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.GetMidPoint")
    @js.native
    def GetMidPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](line: typingsSlinky.phaser.Phaser.Geom.Line): O = js.native
    @JSGlobal("Phaser.Geom.Line.GetMidPoint")
    @js.native
    def GetMidPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](line: typingsSlinky.phaser.Phaser.Geom.Line, out: O): O = js.native
    
    @JSGlobal("Phaser.Geom.Line.GetNearestPoint")
    @js.native
    def GetNearestPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](line: typingsSlinky.phaser.Phaser.Geom.Line, point: js.Object): O = js.native
    @JSGlobal("Phaser.Geom.Line.GetNearestPoint")
    @js.native
    def GetNearestPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](line: typingsSlinky.phaser.Phaser.Geom.Line, point: js.Object, out: O): O = js.native
    /**
      * Get the nearest point on a line perpendicular to the given point.
      * @param line The line to get the nearest point on.
      * @param point The point to get the nearest point to.
      * @param out An optional point, or point-like object, to store the coordinates of the nearest point on the line.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.GetNearestPoint")
    @js.native
    def GetNearestPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](line: typingsSlinky.phaser.Phaser.Geom.Line, point: typingsSlinky.phaser.Phaser.Geom.Point): O = js.native
    @JSGlobal("Phaser.Geom.Line.GetNearestPoint")
    @js.native
    def GetNearestPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](line: typingsSlinky.phaser.Phaser.Geom.Line, point: typingsSlinky.phaser.Phaser.Geom.Point, out: O): O = js.native
    
    /**
      * Calculate the normal of the given line.
      * 
      * The normal of a line is a vector that points perpendicular from it.
      * @param line The line to calculate the normal of.
      * @param out An optional point object to store the normal in.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.GetNormal")
    @js.native
    def GetNormal[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](line: typingsSlinky.phaser.Phaser.Geom.Line): O = js.native
    @JSGlobal("Phaser.Geom.Line.GetNormal")
    @js.native
    def GetNormal[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](line: typingsSlinky.phaser.Phaser.Geom.Line, out: O): O = js.native
    
    /**
      * Get a point on a line that's a given percentage along its length.
      * @param line The line.
      * @param position A value between 0 and 1, where 0 is the start, 0.5 is the middle and 1 is the end of the line.
      * @param out An optional point, or point-like object, to store the coordinates of the point on the line.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.GetPoint")
    @js.native
    def GetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](line: typingsSlinky.phaser.Phaser.Geom.Line, position: Double): O = js.native
    @JSGlobal("Phaser.Geom.Line.GetPoint")
    @js.native
    def GetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](line: typingsSlinky.phaser.Phaser.Geom.Line, position: Double, out: O): O = js.native
    
    /**
      * Get a number of points along a line's length.
      * 
      * Provide a `quantity` to get an exact number of points along the line.
      * 
      * Provide a `stepRate` to ensure a specific distance between each point on the line. Set `quantity` to `0` when
      * providing a `stepRate`.
      * @param line The line.
      * @param quantity The number of points to place on the line. Set to `0` to use `stepRate` instead.
      * @param stepRate The distance between each point on the line. When set, `quantity` is implied and should be set to `0`.
      * @param out An optional array of Points, or point-like objects, to store the coordinates of the points on the line.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.GetPoints")
    @js.native
    def GetPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](line: typingsSlinky.phaser.Phaser.Geom.Line, quantity: integer): O = js.native
    @JSGlobal("Phaser.Geom.Line.GetPoints")
    @js.native
    def GetPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](
      line: typingsSlinky.phaser.Phaser.Geom.Line,
      quantity: integer,
      stepRate: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    @JSGlobal("Phaser.Geom.Line.GetPoints")
    @js.native
    def GetPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](line: typingsSlinky.phaser.Phaser.Geom.Line, quantity: integer, stepRate: Double): O = js.native
    @JSGlobal("Phaser.Geom.Line.GetPoints")
    @js.native
    def GetPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](line: typingsSlinky.phaser.Phaser.Geom.Line, quantity: integer, stepRate: Double, out: O): O = js.native
    
    @JSGlobal("Phaser.Geom.Line.GetShortestDistance")
    @js.native
    def GetShortestDistance[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](line: typingsSlinky.phaser.Phaser.Geom.Line, point: js.Object): O = js.native
    /**
      * Get the shortest distance from a Line to the given Point.
      * @param line The line to get the distance from.
      * @param point The point to get the shortest distance to.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.GetShortestDistance")
    @js.native
    def GetShortestDistance[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](line: typingsSlinky.phaser.Phaser.Geom.Line, point: typingsSlinky.phaser.Phaser.Geom.Point): O = js.native
    
    /**
      * Calculate the height of the given line.
      * @param line The line to calculate the height of.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.Height")
    @js.native
    def Height(line: typingsSlinky.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Calculate the length of the given line.
      * @param line The line to calculate the length of.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.Length")
    @js.native
    def Length(line: typingsSlinky.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Get the angle of the normal of the given line in radians.
      * @param line The line to calculate the angle of the normal of.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.NormalAngle")
    @js.native
    def NormalAngle(line: typingsSlinky.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Returns the x component of the normal vector of the given line.
      * @param line The Line object to get the normal value from.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.NormalX")
    @js.native
    def NormalX(line: typingsSlinky.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * The Y value of the normal of the given line.
      * The normal of a line is a vector that points perpendicular from it.
      * @param line The line to calculate the normal of.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.NormalY")
    @js.native
    def NormalY(line: typingsSlinky.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Offset a line by the given amount.
      * @param line The line to offset.
      * @param x The horizontal offset to add to the line.
      * @param y The vertical offset to add to the line.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.Offset")
    @js.native
    def Offset[O /* <: typingsSlinky.phaser.Phaser.Geom.Line */](line: O, x: Double, y: Double): O = js.native
    
    /**
      * Calculate the perpendicular slope of the given line.
      * @param line The line to calculate the perpendicular slope of.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.PerpSlope")
    @js.native
    def PerpSlope(line: typingsSlinky.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Returns a random point on a given Line.
      * @param line The Line to calculate the random Point on.
      * @param out An instance of a Point to be modified.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.Random")
    @js.native
    def Random[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](line: typingsSlinky.phaser.Phaser.Geom.Line): O = js.native
    @JSGlobal("Phaser.Geom.Line.Random")
    @js.native
    def Random[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](line: typingsSlinky.phaser.Phaser.Geom.Line, out: O): O = js.native
    
    /**
      * Calculate the reflected angle between two lines.
      * 
      * This is the outgoing angle based on the angle of Line 1 and the normalAngle of Line 2.
      * @param lineA The first line.
      * @param lineB The second line.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.ReflectAngle")
    @js.native
    def ReflectAngle(lineA: typingsSlinky.phaser.Phaser.Geom.Line, lineB: typingsSlinky.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Rotate a line around its midpoint by the given angle in radians.
      * @param line The line to rotate.
      * @param angle The angle of rotation in radians.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.Rotate")
    @js.native
    def Rotate[O /* <: typingsSlinky.phaser.Phaser.Geom.Line */](line: O, angle: Double): O = js.native
    
    @JSGlobal("Phaser.Geom.Line.RotateAroundPoint")
    @js.native
    def RotateAroundPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Line */](line: O, point: js.Object, angle: Double): O = js.native
    /**
      * Rotate a line around a point by the given angle in radians.
      * @param line The line to rotate.
      * @param point The point to rotate the line around.
      * @param angle The angle of rotation in radians.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.RotateAroundPoint")
    @js.native
    def RotateAroundPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Line */](line: O, point: typingsSlinky.phaser.Phaser.Geom.Point, angle: Double): O = js.native
    
    /**
      * Rotate a line around the given coordinates by the given angle in radians.
      * @param line The line to rotate.
      * @param x The horizontal coordinate to rotate the line around.
      * @param y The vertical coordinate to rotate the line around.
      * @param angle The angle of rotation in radians.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.RotateAroundXY")
    @js.native
    def RotateAroundXY[O /* <: typingsSlinky.phaser.Phaser.Geom.Line */](line: O, x: Double, y: Double, angle: Double): O = js.native
    
    /**
      * Set a line to a given position, angle and length.
      * @param line The line to set.
      * @param x The horizontal start position of the line.
      * @param y The vertical start position of the line.
      * @param angle The angle of the line in radians.
      * @param length The length of the line.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.SetToAngle")
    @js.native
    def SetToAngle[O /* <: typingsSlinky.phaser.Phaser.Geom.Line */](line: O, x: Double, y: Double, angle: Double, length: Double): O = js.native
    
    /**
      * Calculate the slope of the given line.
      * @param line The line to calculate the slope of.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.Slope")
    @js.native
    def Slope(line: typingsSlinky.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Calculate the width of the given line.
      * @param line The line to calculate the width of.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Line.Width")
    @js.native
    def Width(line: typingsSlinky.phaser.Phaser.Geom.Line): Double = js.native
  }
  
  /**
    * A Point Geometry object type.
    */
  @JSGlobal("Phaser.Geom.POINT")
  @js.native
  def POINT_ : integer = js.native
  
  @scala.inline
  def POINT__=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POINT")(x.asInstanceOf[js.Any])
  
  /**
    * A Polygon Geometry object type.
    */
  @JSGlobal("Phaser.Geom.POLYGON")
  @js.native
  def POLYGON_ : integer = js.native
  
  @scala.inline
  def POLYGON__=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POLYGON")(x.asInstanceOf[js.Any])
  
  /**
    * Defines a Point in 2D space, with an x and y component.
    */
  @JSGlobal("Phaser.Geom.Point")
  @js.native
  /**
    * 
    * @param x The x coordinate of this Point. Default 0.
    * @param y The y coordinate of this Point. Default x.
    */
  class Point ()
    extends typingsSlinky.phaser.Phaser.Geom.Point {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
  }
  object Point {
    
    /**
      * Apply `Math.ceil()` to each coordinate of the given Point.
      * @param point The Point to ceil.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Point.Ceil")
    @js.native
    def Ceil[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](point: O): O = js.native
    
    /**
      * Clone the given Point.
      * @param source The source Point to clone.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Point.Clone")
    @js.native
    def Clone(source: typingsSlinky.phaser.Phaser.Geom.Point): typingsSlinky.phaser.Phaser.Geom.Point = js.native
    
    /**
      * Copy the values of one Point to a destination Point.
      * @param source The source Point to copy the values from.
      * @param dest The destination Point to copy the values to.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Point.CopyFrom")
    @js.native
    def CopyFrom[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](source: typingsSlinky.phaser.Phaser.Geom.Point, dest: O): O = js.native
    
    /**
      * A comparison of two `Point` objects to see if they are equal.
      * @param point The original `Point` to compare against.
      * @param toCompare The second `Point` to compare.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Point.Equals")
    @js.native
    def Equals(point: typingsSlinky.phaser.Phaser.Geom.Point, toCompare: typingsSlinky.phaser.Phaser.Geom.Point): Boolean = js.native
    
    /**
      * Apply `Math.ceil()` to each coordinate of the given Point.
      * @param point The Point to floor.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Point.Floor")
    @js.native
    def Floor[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](point: O): O = js.native
    
    /**
      * Get the centroid or geometric center of a plane figure (the arithmetic mean position of all the points in the figure).
      * Informally, it is the point at which a cutout of the shape could be perfectly balanced on the tip of a pin.
      * @param points An array of Vector2Like objects to get the geometric center of.
      * @param out A Point object to store the output coordinates in. If not given, a new Point instance is created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Point.GetCentroid")
    @js.native
    def GetCentroid[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](points: js.Array[Vector2Like]): O = js.native
    @JSGlobal("Phaser.Geom.Point.GetCentroid")
    @js.native
    def GetCentroid[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](points: js.Array[Vector2Like], out: O): O = js.native
    
    /**
      * Calculate the magnitude of the point, which equivalent to the length of the line from the origin to this point.
      * @param point The point to calculate the magnitude for
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Point.GetMagnitude")
    @js.native
    def GetMagnitude(point: typingsSlinky.phaser.Phaser.Geom.Point): Double = js.native
    
    /**
      * Calculates the square of magnitude of given point.(Can be used for fast magnitude calculation of point)
      * @param point Returns square of the magnitude/length of given point.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Point.GetMagnitudeSq")
    @js.native
    def GetMagnitudeSq(point: typingsSlinky.phaser.Phaser.Geom.Point): Double = js.native
    
    /**
      * Calculates the Axis Aligned Bounding Box (or aabb) from an array of points.
      * @param points An array of Vector2Like objects to get the AABB from.
      * @param out A Rectangle object to store the results in. If not given, a new Rectangle instance is created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Point.GetRectangleFromPoints")
    @js.native
    def GetRectangleFromPoints[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](points: js.Array[Vector2Like]): O = js.native
    @JSGlobal("Phaser.Geom.Point.GetRectangleFromPoints")
    @js.native
    def GetRectangleFromPoints[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](points: js.Array[Vector2Like], out: O): O = js.native
    
    /**
      * Returns the linear interpolation point between the two given points, based on `t`.
      * @param pointA The starting `Point` for the interpolation.
      * @param pointB The target `Point` for the interpolation.
      * @param t The amount to interpolate between the two points. Generally, a value between 0 (returns the starting `Point`) and 1 (returns the target `Point`). If omitted, 0 is used. Default 0.
      * @param out An optional `Point` object whose `x` and `y` values will be set to the result of the interpolation (can also be any object with `x` and `y` properties). If omitted, a new `Point` created and returned.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Point.Interpolate")
    @js.native
    def Interpolate[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](pointA: typingsSlinky.phaser.Phaser.Geom.Point, pointB: typingsSlinky.phaser.Phaser.Geom.Point): O = js.native
    @JSGlobal("Phaser.Geom.Point.Interpolate")
    @js.native
    def Interpolate[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](
      pointA: typingsSlinky.phaser.Phaser.Geom.Point,
      pointB: typingsSlinky.phaser.Phaser.Geom.Point,
      t: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    @JSGlobal("Phaser.Geom.Point.Interpolate")
    @js.native
    def Interpolate[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](
      pointA: typingsSlinky.phaser.Phaser.Geom.Point,
      pointB: typingsSlinky.phaser.Phaser.Geom.Point,
      t: Double
    ): O = js.native
    @JSGlobal("Phaser.Geom.Point.Interpolate")
    @js.native
    def Interpolate[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](
      pointA: typingsSlinky.phaser.Phaser.Geom.Point,
      pointB: typingsSlinky.phaser.Phaser.Geom.Point,
      t: Double,
      out: O
    ): O = js.native
    
    /**
      * Swaps the X and the Y coordinate of a point.
      * @param point The Point to modify.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Point.Invert")
    @js.native
    def Invert[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](point: O): O = js.native
    
    /**
      * Inverts a Point's coordinates.
      * @param point The Point to invert.
      * @param out The Point to return the inverted coordinates in.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Point.Negative")
    @js.native
    def Negative[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](point: typingsSlinky.phaser.Phaser.Geom.Point): O = js.native
    @JSGlobal("Phaser.Geom.Point.Negative")
    @js.native
    def Negative[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](point: typingsSlinky.phaser.Phaser.Geom.Point, out: O): O = js.native
    
    /**
      * Calculates the vector projection of `pointA` onto the nonzero `pointB`. This is the
      * orthogonal projection of `pointA` onto a straight line paralle to `pointB`.
      * @param pointA Point A, to be projected onto Point B.
      * @param pointB Point B, to have Point A projected upon it.
      * @param out The Point object to store the position in. If not given, a new Point instance is created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Point.Project")
    @js.native
    def Project[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](pointA: typingsSlinky.phaser.Phaser.Geom.Point, pointB: typingsSlinky.phaser.Phaser.Geom.Point): O = js.native
    @JSGlobal("Phaser.Geom.Point.Project")
    @js.native
    def Project[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](
      pointA: typingsSlinky.phaser.Phaser.Geom.Point,
      pointB: typingsSlinky.phaser.Phaser.Geom.Point,
      out: O
    ): O = js.native
    
    /**
      * Calculates the vector projection of `pointA` onto the nonzero `pointB`. This is the
      * orthogonal projection of `pointA` onto a straight line paralle to `pointB`.
      * @param pointA Point A, to be projected onto Point B. Must be a normalized point with a magnitude of 1.
      * @param pointB Point B, to have Point A projected upon it.
      * @param out The Point object to store the position in. If not given, a new Point instance is created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Point.ProjectUnit")
    @js.native
    def ProjectUnit[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](pointA: typingsSlinky.phaser.Phaser.Geom.Point, pointB: typingsSlinky.phaser.Phaser.Geom.Point): O = js.native
    @JSGlobal("Phaser.Geom.Point.ProjectUnit")
    @js.native
    def ProjectUnit[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](
      pointA: typingsSlinky.phaser.Phaser.Geom.Point,
      pointB: typingsSlinky.phaser.Phaser.Geom.Point,
      out: O
    ): O = js.native
    
    /**
      * Changes the magnitude (length) of a two-dimensional vector without changing its direction.
      * @param point The Point to treat as the end point of the vector.
      * @param magnitude The new magnitude of the vector.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Point.SetMagnitude")
    @js.native
    def SetMagnitude[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](point: O, magnitude: Double): O = js.native
  }
  
  /**
    * A Polygon object
    * 
    * The polygon is a closed shape consists of a series of connected straight lines defined by list of ordered points.
    * Several formats are supported to define the list of points, check the setTo method for details. 
    * This is a geometry object allowing you to define and inspect the shape.
    * It is not a Game Object, in that you cannot add it to the display list, and it has no texture.
    * To render a Polygon you should look at the capabilities of the Graphics class.
    */
  @JSGlobal("Phaser.Geom.Polygon")
  @js.native
  /**
    * 
    * @param points List of points defining the perimeter of this Polygon. Several formats are supported: 
    * - A string containing paired x y values separated by a single space: `'40 0 40 20 100 20 100 80 40 80 40 100 0 50'`
    * - An array of Point objects: `[new Phaser.Point(x1, y1), ...]`
    * - An array of objects with public x y properties: `[obj1, obj2, ...]`
    * - An array of paired numbers that represent point coordinates: `[x1,y1, x2,y2, ...]`
    * - An array of arrays with two elements representing x/y coordinates: `[[x1, y1], [x2, y2], ...]`
    */
  class Polygon ()
    extends typingsSlinky.phaser.Phaser.Geom.Polygon {
    def this(points: js.Array[typingsSlinky.phaser.Phaser.Geom.Point]) = this()
  }
  object Polygon {
    
    /**
      * Create a new polygon which is a copy of the specified polygon
      * @param polygon The polygon to create a clone of
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Polygon.Clone")
    @js.native
    def Clone(polygon: typingsSlinky.phaser.Phaser.Geom.Polygon): typingsSlinky.phaser.Phaser.Geom.Polygon = js.native
    
    /**
      * Checks if a point is within the bounds of a Polygon.
      * @param polygon The Polygon to check against.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Polygon.Contains")
    @js.native
    def Contains(polygon: typingsSlinky.phaser.Phaser.Geom.Polygon, x: Double, y: Double): Boolean = js.native
    
    /**
      * Checks the given Point again the Polygon to see if the Point lays within its vertices.
      * @param polygon The Polygon to check.
      * @param point The Point to check if it's within the Polygon.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Polygon.ContainsPoint")
    @js.native
    def ContainsPoint(polygon: typingsSlinky.phaser.Phaser.Geom.Polygon, point: typingsSlinky.phaser.Phaser.Geom.Point): Boolean = js.native
    
    /**
      * Calculates the bounding AABB rectangle of a polygon.
      * @param polygon The polygon that should be calculated.
      * @param out The rectangle or object that has x, y, width, and height properties to store the result. Optional.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Polygon.GetAABB")
    @js.native
    def GetAABB[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](polygon: typingsSlinky.phaser.Phaser.Geom.Polygon): O = js.native
    @JSGlobal("Phaser.Geom.Polygon.GetAABB")
    @js.native
    def GetAABB[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](polygon: typingsSlinky.phaser.Phaser.Geom.Polygon, out: O): O = js.native
    
    /**
      * Stores all of the points of a Polygon into a flat array of numbers following the sequence [ x,y, x,y, x,y ],
      * i.e. each point of the Polygon, in the order it's defined, corresponds to two elements of the resultant
      * array for the point's X and Y coordinate.
      * @param polygon The Polygon whose points to export.
      * @param output An array to which the points' coordinates should be appended.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Polygon.GetNumberArray")
    @js.native
    def GetNumberArray[O /* <: js.Array[Double] */](polygon: typingsSlinky.phaser.Phaser.Geom.Polygon): O = js.native
    @JSGlobal("Phaser.Geom.Polygon.GetNumberArray")
    @js.native
    def GetNumberArray[O /* <: js.Array[Double] */](polygon: typingsSlinky.phaser.Phaser.Geom.Polygon, output: O): O = js.native
    
    /**
      * Returns an array of Point objects containing the coordinates of the points around the perimeter of the Polygon,
      * based on the given quantity or stepRate values.
      * @param polygon The Polygon to get the points from.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the perimeter of the Polygon and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Polygon.GetPoints")
    @js.native
    def GetPoints(polygon: typingsSlinky.phaser.Phaser.Geom.Polygon, quantity: integer): js.Array[typingsSlinky.phaser.Phaser.Geom.Point] = js.native
    @JSGlobal("Phaser.Geom.Polygon.GetPoints")
    @js.native
    def GetPoints(
      polygon: typingsSlinky.phaser.Phaser.Geom.Polygon,
      quantity: integer,
      stepRate: js.UndefOr[scala.Nothing],
      output: js.Array[_]
    ): js.Array[typingsSlinky.phaser.Phaser.Geom.Point] = js.native
    @JSGlobal("Phaser.Geom.Polygon.GetPoints")
    @js.native
    def GetPoints(polygon: typingsSlinky.phaser.Phaser.Geom.Polygon, quantity: integer, stepRate: Double): js.Array[typingsSlinky.phaser.Phaser.Geom.Point] = js.native
    @JSGlobal("Phaser.Geom.Polygon.GetPoints")
    @js.native
    def GetPoints(
      polygon: typingsSlinky.phaser.Phaser.Geom.Polygon,
      quantity: integer,
      stepRate: Double,
      output: js.Array[_]
    ): js.Array[typingsSlinky.phaser.Phaser.Geom.Point] = js.native
    
    /**
      * Returns the perimeter of the given Polygon.
      * @param polygon The Polygon to get the perimeter of.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Polygon.Perimeter")
    @js.native
    def Perimeter(polygon: typingsSlinky.phaser.Phaser.Geom.Polygon): Double = js.native
    
    /**
      * Reverses the order of the points of a Polygon.
      * @param polygon The Polygon to modify.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Polygon.Reverse")
    @js.native
    def Reverse[O /* <: typingsSlinky.phaser.Phaser.Geom.Polygon */](polygon: O): O = js.native
    
    /**
      * Takes a Polygon object and applies Chaikin's smoothing algorithm on its points.
      * @param polygon The polygon to be smoothed. The polygon will be modified in-place and returned.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Polygon.Smooth")
    @js.native
    def Smooth[O /* <: typingsSlinky.phaser.Phaser.Geom.Polygon */](polygon: O): O = js.native
  }
  
  /**
    * A Rectangle Geometry object type.
    */
  @JSGlobal("Phaser.Geom.RECTANGLE")
  @js.native
  def RECTANGLE_ : integer = js.native
  
  @scala.inline
  def RECTANGLE__=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RECTANGLE")(x.asInstanceOf[js.Any])
  
  /**
    * Encapsulates a 2D rectangle defined by its corner point in the top-left and its extends in x (width) and y (height)
    */
  @JSGlobal("Phaser.Geom.Rectangle")
  @js.native
  /**
    * 
    * @param x The X coordinate of the top left corner of the Rectangle. Default 0.
    * @param y The Y coordinate of the top left corner of the Rectangle. Default 0.
    * @param width The width of the Rectangle. Default 0.
    * @param height The height of the Rectangle. Default 0.
    */
  class Rectangle ()
    extends typingsSlinky.phaser.Phaser.Geom.Rectangle {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      width: js.UndefOr[scala.Nothing],
      height: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
  }
  object Rectangle {
    
    /**
      * Calculates the area of the given Rectangle object.
      * @param rect The rectangle to calculate the area of.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.Area")
    @js.native
    def Area(rect: typingsSlinky.phaser.Phaser.Geom.Rectangle): Double = js.native
    
    /**
      * Rounds a Rectangle's position up to the smallest integer greater than or equal to each current coordinate.
      * @param rect The Rectangle to adjust.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.Ceil")
    @js.native
    def Ceil[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](rect: O): O = js.native
    
    /**
      * Rounds a Rectangle's position and size up to the smallest integer greater than or equal to each respective value.
      * @param rect The Rectangle to modify.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.CeilAll")
    @js.native
    def CeilAll[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](rect: O): O = js.native
    
    /**
      * Moves the top-left corner of a Rectangle so that its center is at the given coordinates.
      * @param rect The Rectangle to be centered.
      * @param x The X coordinate of the Rectangle's center.
      * @param y The Y coordinate of the Rectangle's center.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.CenterOn")
    @js.native
    def CenterOn[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](rect: O, x: Double, y: Double): O = js.native
    
    /**
      * Creates a new Rectangle which is identical to the given one.
      * @param source The Rectangle to clone.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.Clone")
    @js.native
    def Clone(source: typingsSlinky.phaser.Phaser.Geom.Rectangle): typingsSlinky.phaser.Phaser.Geom.Rectangle = js.native
    
    /**
      * Checks if a given point is inside a Rectangle's bounds.
      * @param rect The Rectangle to check.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.Contains")
    @js.native
    def Contains(rect: typingsSlinky.phaser.Phaser.Geom.Rectangle, x: Double, y: Double): Boolean = js.native
    
    /**
      * Determines whether the specified point is contained within the rectangular region defined by this Rectangle object.
      * @param rect The Rectangle object.
      * @param point The point object to be checked. Can be a Phaser Point object or any object with x and y values.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.ContainsPoint")
    @js.native
    def ContainsPoint(rect: typingsSlinky.phaser.Phaser.Geom.Rectangle, point: typingsSlinky.phaser.Phaser.Geom.Point): Boolean = js.native
    
    /**
      * Tests if one rectangle fully contains another.
      * @param rectA The first rectangle.
      * @param rectB The second rectangle.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.ContainsRect")
    @js.native
    def ContainsRect(
      rectA: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      rectB: typingsSlinky.phaser.Phaser.Geom.Rectangle
    ): Boolean = js.native
    
    /**
      * Copy the values of one Rectangle to a destination Rectangle.
      * @param source The source Rectangle to copy the values from.
      * @param dest The destination Rectangle to copy the values to.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.CopyFrom")
    @js.native
    def CopyFrom[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](source: typingsSlinky.phaser.Phaser.Geom.Rectangle, dest: O): O = js.native
    
    /**
      * Create an array of points for each corner of a Rectangle
      * If an array is specified, each point object will be added to the end of the array, otherwise a new array will be created.
      * @param rect The Rectangle object to be decomposed.
      * @param out If provided, each point will be added to this array.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.Decompose")
    @js.native
    def Decompose(rect: typingsSlinky.phaser.Phaser.Geom.Rectangle): js.Array[_] = js.native
    @JSGlobal("Phaser.Geom.Rectangle.Decompose")
    @js.native
    def Decompose(rect: typingsSlinky.phaser.Phaser.Geom.Rectangle, out: js.Array[_]): js.Array[_] = js.native
    
    /**
      * Compares the `x`, `y`, `width` and `height` properties of two rectangles.
      * @param rect Rectangle A
      * @param toCompare Rectangle B
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.Equals")
    @js.native
    def Equals(
      rect: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      toCompare: typingsSlinky.phaser.Phaser.Geom.Rectangle
    ): Boolean = js.native
    
    /**
      * Adjusts the target rectangle, changing its width, height and position,
      * so that it fits inside the area of the source rectangle, while maintaining its original
      * aspect ratio.
      * 
      * Unlike the `FitOutside` function, there may be some space inside the source area not covered.
      * @param target The target rectangle to adjust.
      * @param source The source rectangle to envelop the target in.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.FitInside")
    @js.native
    def FitInside[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](target: O, source: typingsSlinky.phaser.Phaser.Geom.Rectangle): O = js.native
    
    /**
      * Adjusts the target rectangle, changing its width, height and position,
      * so that it fully covers the area of the source rectangle, while maintaining its original
      * aspect ratio.
      * 
      * Unlike the `FitInside` function, the target rectangle may extend further out than the source.
      * @param target The target rectangle to adjust.
      * @param source The source rectangle to envelope the target in.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.FitOutside")
    @js.native
    def FitOutside[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](target: O, source: typingsSlinky.phaser.Phaser.Geom.Rectangle): O = js.native
    
    /**
      * Rounds down (floors) the top left X and Y coordinates of the given Rectangle to the largest integer less than or equal to them
      * @param rect The rectangle to floor the top left X and Y coordinates of
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.Floor")
    @js.native
    def Floor[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](rect: O): O = js.native
    
    /**
      * Rounds a Rectangle's position and size down to the largest integer less than or equal to each current coordinate or dimension.
      * @param rect The Rectangle to adjust.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.FloorAll")
    @js.native
    def FloorAll[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](rect: O): O = js.native
    
    /**
      * Constructs new Rectangle or repositions and resizes an existing Rectangle so that all of the given points are on or within its bounds.
      * @param points An array of points (either arrays with two elements corresponding to the X and Y coordinate or an object with public `x` and `y` properties) which should be surrounded by the Rectangle.
      * @param out Optional Rectangle to adjust.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.FromPoints")
    @js.native
    def FromPoints[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](points: js.Array[_]): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.FromPoints")
    @js.native
    def FromPoints[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](points: js.Array[_], out: O): O = js.native
    
    /**
      * Create the smallest Rectangle containing two coordinate pairs.
      * @param x1 The X coordinate of the first point.
      * @param y1 The Y coordinate of the first point.
      * @param x2 The X coordinate of the second point.
      * @param y2 The Y coordinate of the second point.
      * @param out Optional Rectangle to adjust.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.FromXY")
    @js.native
    def FromXY[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](x1: Double, y1: Double, x2: Double, y2: Double): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.FromXY")
    @js.native
    def FromXY[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](x1: Double, y1: Double, x2: Double, y2: Double, out: O): O = js.native
    
    /**
      * Calculates the width/height ratio of a rectangle.
      * @param rect The rectangle.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.GetAspectRatio")
    @js.native
    def GetAspectRatio(rect: typingsSlinky.phaser.Phaser.Geom.Rectangle): Double = js.native
    
    /**
      * Returns the center of a Rectangle as a Point.
      * @param rect The Rectangle to get the center of.
      * @param out Optional point-like object to update with the center coordinates.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.GetCenter")
    @js.native
    def GetCenter[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](rect: typingsSlinky.phaser.Phaser.Geom.Rectangle): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.GetCenter")
    @js.native
    def GetCenter[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](rect: typingsSlinky.phaser.Phaser.Geom.Rectangle, out: O): O = js.native
    
    /**
      * Calculates the coordinates of a point at a certain `position` on the Rectangle's perimeter.
      * 
      * The `position` is a fraction between 0 and 1 which defines how far into the perimeter the point is.
      * 
      * A value of 0 or 1 returns the point at the top left corner of the rectangle, while a value of 0.5 returns the point at the bottom right corner of the rectangle. Values between 0 and 0.5 are on the top or the right side and values between 0.5 and 1 are on the bottom or the left side.
      * @param rectangle The Rectangle to get the perimeter point from.
      * @param position The normalized distance into the Rectangle's perimeter to return.
      * @param out An object to update with the `x` and `y` coordinates of the point.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.GetPoint")
    @js.native
    def GetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](rectangle: typingsSlinky.phaser.Phaser.Geom.Rectangle, position: Double): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.GetPoint")
    @js.native
    def GetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](rectangle: typingsSlinky.phaser.Phaser.Geom.Rectangle, position: Double, out: O): O = js.native
    
    /**
      * Return an array of points from the perimeter of the rectangle, each spaced out based on the quantity or step required.
      * @param rectangle The Rectangle object to get the points from.
      * @param step Step between points. Used to calculate the number of points to return when quantity is falsey. Ignored if quantity is positive.
      * @param quantity The number of evenly spaced points from the rectangles perimeter to return. If falsey, step param will be used to calculate the number of points.
      * @param out An optional array to store the points in.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.GetPoints")
    @js.native
    def GetPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](rectangle: typingsSlinky.phaser.Phaser.Geom.Rectangle, step: Double, quantity: integer): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.GetPoints")
    @js.native
    def GetPoints[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](rectangle: typingsSlinky.phaser.Phaser.Geom.Rectangle, step: Double, quantity: integer, out: O): O = js.native
    
    /**
      * Returns the size of the Rectangle, expressed as a Point object.
      * With the value of the `width` as the `x` property and the `height` as the `y` property.
      * @param rect The Rectangle to get the size from.
      * @param out The Point object to store the size in. If not given, a new Point instance is created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.GetSize")
    @js.native
    def GetSize[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](rect: typingsSlinky.phaser.Phaser.Geom.Rectangle): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.GetSize")
    @js.native
    def GetSize[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](rect: typingsSlinky.phaser.Phaser.Geom.Rectangle, out: O): O = js.native
    
    /**
      * Increases the size of a Rectangle by a specified amount.
      * 
      * The center of the Rectangle stays the same. The amounts are added to each side, so the actual increase in width or height is two times bigger than the respective argument.
      * @param rect The Rectangle to inflate.
      * @param x How many pixels the left and the right side should be moved by horizontally.
      * @param y How many pixels the top and the bottom side should be moved by vertically.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.Inflate")
    @js.native
    def Inflate[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](rect: O, x: Double, y: Double): O = js.native
    
    /**
      * Takes two Rectangles and first checks to see if they intersect.
      * If they intersect it will return the area of intersection in the `out` Rectangle.
      * If they do not intersect, the `out` Rectangle will have a width and height of zero.
      * @param rectA The first Rectangle to get the intersection from.
      * @param rectB The second Rectangle to get the intersection from.
      * @param out A Rectangle to store the intersection results in.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.Intersection")
    @js.native
    def Intersection[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](
      rectA: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      rectB: typingsSlinky.phaser.Phaser.Geom.Rectangle
    ): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.Intersection")
    @js.native
    def Intersection[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](
      rectA: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      rectB: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      out: typingsSlinky.phaser.Phaser.Geom.Rectangle
    ): O = js.native
    
    /**
      * Returns an array of points from the perimeter of the Rectangle, where each point is spaced out based
      * on either the `step` value, or the `quantity`.
      * @param rect The Rectangle to get the perimeter points from.
      * @param step The distance between each point of the perimeter. Set to `null` if you wish to use the `quantity` parameter instead.
      * @param quantity The total number of points to return. The step is then calculated based on the length of the Rectangle, divided by this value.
      * @param out An array in which the perimeter points will be stored. If not given, a new array instance is created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.MarchingAnts")
    @js.native
    def MarchingAnts[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](rect: typingsSlinky.phaser.Phaser.Geom.Rectangle): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.MarchingAnts")
    @js.native
    def MarchingAnts[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](
      rect: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      step: js.UndefOr[scala.Nothing],
      quantity: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.MarchingAnts")
    @js.native
    def MarchingAnts[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](
      rect: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      step: js.UndefOr[scala.Nothing],
      quantity: integer
    ): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.MarchingAnts")
    @js.native
    def MarchingAnts[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](
      rect: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      step: js.UndefOr[scala.Nothing],
      quantity: integer,
      out: O
    ): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.MarchingAnts")
    @js.native
    def MarchingAnts[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](rect: typingsSlinky.phaser.Phaser.Geom.Rectangle, step: Double): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.MarchingAnts")
    @js.native
    def MarchingAnts[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](
      rect: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      step: Double,
      quantity: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.MarchingAnts")
    @js.native
    def MarchingAnts[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](rect: typingsSlinky.phaser.Phaser.Geom.Rectangle, step: Double, quantity: integer): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.MarchingAnts")
    @js.native
    def MarchingAnts[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Point] */](rect: typingsSlinky.phaser.Phaser.Geom.Rectangle, step: Double, quantity: integer, out: O): O = js.native
    
    /**
      * Merges a Rectangle with a list of points by repositioning and/or resizing it such that all points are located on or within its bounds.
      * @param target The Rectangle which should be merged.
      * @param points An array of Points (or any object with public `x` and `y` properties) which should be merged with the Rectangle.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.MergePoints")
    @js.native
    def MergePoints[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](target: O, points: js.Array[typingsSlinky.phaser.Phaser.Geom.Point]): O = js.native
    
    /**
      * Merges the source rectangle into the target rectangle and returns the target.
      * Neither rectangle should have a negative width or height.
      * @param target Target rectangle. Will be modified to include source rectangle.
      * @param source Rectangle that will be merged into target rectangle.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.MergeRect")
    @js.native
    def MergeRect[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](target: O, source: typingsSlinky.phaser.Phaser.Geom.Rectangle): O = js.native
    
    /**
      * Merges a Rectangle with a point by repositioning and/or resizing it so that the point is on or within its bounds.
      * @param target The Rectangle which should be merged and modified.
      * @param x The X coordinate of the point which should be merged.
      * @param y The Y coordinate of the point which should be merged.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.MergeXY")
    @js.native
    def MergeXY[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](target: O, x: Double, y: Double): O = js.native
    
    /**
      * Nudges (translates) the top left corner of a Rectangle by a given offset.
      * @param rect The Rectangle to adjust.
      * @param x The distance to move the Rectangle horizontally.
      * @param y The distance to move the Rectangle vertically.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.Offset")
    @js.native
    def Offset[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](rect: O, x: Double, y: Double): O = js.native
    
    /**
      * Nudges (translates) the top-left corner of a Rectangle by the coordinates of a point (translation vector).
      * @param rect The Rectangle to adjust.
      * @param point The point whose coordinates should be used as an offset.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.OffsetPoint")
    @js.native
    def OffsetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](rect: O, point: typingsSlinky.phaser.Phaser.Geom.Point): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.OffsetPoint")
    @js.native
    def OffsetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](rect: O, point: Vector2): O = js.native
    
    /**
      * Checks if two Rectangles overlap. If a Rectangle is within another Rectangle, the two will be considered overlapping. Thus, the Rectangles are treated as "solid".
      * @param rectA The first Rectangle to check.
      * @param rectB The second Rectangle to check.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.Overlaps")
    @js.native
    def Overlaps(
      rectA: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      rectB: typingsSlinky.phaser.Phaser.Geom.Rectangle
    ): Boolean = js.native
    
    /**
      * Calculates the perimeter of a Rectangle.
      * @param rect The Rectangle to use.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.Perimeter")
    @js.native
    def Perimeter(rect: typingsSlinky.phaser.Phaser.Geom.Rectangle): Double = js.native
    
    /**
      * Returns a Point from the perimeter of a Rectangle based on the given angle.
      * @param rectangle The Rectangle to get the perimeter point from.
      * @param angle The angle of the point, in degrees.
      * @param out The Point object to store the position in. If not given, a new Point instance is created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.PerimeterPoint")
    @js.native
    def PerimeterPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](rectangle: typingsSlinky.phaser.Phaser.Geom.Rectangle, angle: integer): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.PerimeterPoint")
    @js.native
    def PerimeterPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](rectangle: typingsSlinky.phaser.Phaser.Geom.Rectangle, angle: integer, out: O): O = js.native
    
    /**
      * Returns a random point within a Rectangle.
      * @param rect The Rectangle to return a point from.
      * @param out The object to update with the point's coordinates.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.Random")
    @js.native
    def Random[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](rect: typingsSlinky.phaser.Phaser.Geom.Rectangle, out: O): O = js.native
    
    /**
      * Calculates a random point that lies within the `outer` Rectangle, but outside of the `inner` Rectangle.
      * The inner Rectangle must be fully contained within the outer rectangle.
      * @param outer The outer Rectangle to get the random point within.
      * @param inner The inner Rectangle to exclude from the returned point.
      * @param out A Point, or Point-like object to store the result in. If not specified, a new Point will be created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.RandomOutside")
    @js.native
    def RandomOutside[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](
      outer: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      inner: typingsSlinky.phaser.Phaser.Geom.Rectangle
    ): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.RandomOutside")
    @js.native
    def RandomOutside[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](
      outer: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      inner: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      out: O
    ): O = js.native
    
    /**
      * Determines if the two objects (either Rectangles or Rectangle-like) have the same width and height values under strict equality.
      * @param rect The first Rectangle object.
      * @param toCompare The second Rectangle object.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.SameDimensions")
    @js.native
    def SameDimensions(
      rect: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      toCompare: typingsSlinky.phaser.Phaser.Geom.Rectangle
    ): Boolean = js.native
    
    /**
      * Scales the width and height of this Rectangle by the given amounts.
      * @param rect The `Rectangle` object that will be scaled by the specified amount(s).
      * @param x The factor by which to scale the rectangle horizontally.
      * @param y The amount by which to scale the rectangle vertically. If this is not specified, the rectangle will be scaled by the factor `x` in both directions.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.Scale")
    @js.native
    def Scale[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](rect: O, x: Double, y: Double): O = js.native
    
    /**
      * Creates a new Rectangle or repositions and/or resizes an existing Rectangle so that it encompasses the two given Rectangles, i.e. calculates their union.
      * @param rectA The first Rectangle to use.
      * @param rectB The second Rectangle to use.
      * @param out The Rectangle to store the union in.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Rectangle.Union")
    @js.native
    def Union[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](
      rectA: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      rectB: typingsSlinky.phaser.Phaser.Geom.Rectangle
    ): O = js.native
    @JSGlobal("Phaser.Geom.Rectangle.Union")
    @js.native
    def Union[O /* <: typingsSlinky.phaser.Phaser.Geom.Rectangle */](
      rectA: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      rectB: typingsSlinky.phaser.Phaser.Geom.Rectangle,
      out: O
    ): O = js.native
  }
  
  /**
    * A Triangle Geometry object type.
    */
  @JSGlobal("Phaser.Geom.TRIANGLE")
  @js.native
  def TRIANGLE_ : integer = js.native
  
  @scala.inline
  def TRIANGLE__=(x: integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRIANGLE")(x.asInstanceOf[js.Any])
  
  /**
    * A triangle is a plane created by connecting three points.
    * The first two arguments specify the first point, the middle two arguments
    * specify the second point, and the last two arguments specify the third point.
    */
  @JSGlobal("Phaser.Geom.Triangle")
  @js.native
  class Triangle protected ()
    extends typingsSlinky.phaser.Phaser.Geom.Triangle {
    /**
      * 
      * @param x1 `x` coordinate of the first point. Default 0.
      * @param y1 `y` coordinate of the first point. Default 0.
      * @param x2 `x` coordinate of the second point. Default 0.
      * @param y2 `y` coordinate of the second point. Default 0.
      * @param x3 `x` coordinate of the third point. Default 0.
      * @param y3 `y` coordinate of the third point. Default 0.
      */
    def this(
      x1: js.UndefOr[Double],
      y1: js.UndefOr[Double],
      x2: js.UndefOr[Double],
      y2: js.UndefOr[Double],
      x3: js.UndefOr[Double],
      y3: js.UndefOr[Double]
    ) = this()
  }
  object Triangle {
    
    /**
      * Returns the area of a Triangle.
      * @param triangle The Triangle to use.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.Area")
    @js.native
    def Area(triangle: typingsSlinky.phaser.Phaser.Geom.Triangle): Double = js.native
    
    /**
      * Builds an equilateral triangle. In the equilateral triangle, all the sides are the same length (congruent) and all the angles are the same size (congruent).
      * The x/y specifies the top-middle of the triangle (x1/y1) and length is the length of each side.
      * @param x x coordinate of the top point of the triangle.
      * @param y y coordinate of the top point of the triangle.
      * @param length Length of each side of the triangle.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.BuildEquilateral")
    @js.native
    def BuildEquilateral(x: Double, y: Double, length: Double): typingsSlinky.phaser.Phaser.Geom.Triangle = js.native
    
    /**
      * Takes an array of vertex coordinates, and optionally an array of hole indices, then returns an array
      * of Triangle instances, where the given vertices have been decomposed into a series of triangles.
      * @param data A flat array of vertex coordinates like [x0,y0, x1,y1, x2,y2, ...]
      * @param holes An array of hole indices if any (e.g. [5, 8] for a 12-vertex input would mean one hole with vertices 5–7 and another with 8–11). Default null.
      * @param scaleX Horizontal scale factor to multiply the resulting points by. Default 1.
      * @param scaleY Vertical scale factor to multiply the resulting points by. Default 1.
      * @param out An array to store the resulting Triangle instances in. If not provided, a new array is created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](data: js.Array[_]): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](
      data: js.Array[_],
      holes: js.UndefOr[scala.Nothing],
      scaleX: js.UndefOr[scala.Nothing],
      scaleY: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](
      data: js.Array[_],
      holes: js.UndefOr[scala.Nothing],
      scaleX: js.UndefOr[scala.Nothing],
      scaleY: Double
    ): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](
      data: js.Array[_],
      holes: js.UndefOr[scala.Nothing],
      scaleX: js.UndefOr[scala.Nothing],
      scaleY: Double,
      out: O
    ): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.UndefOr[scala.Nothing], scaleX: Double): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](
      data: js.Array[_],
      holes: js.UndefOr[scala.Nothing],
      scaleX: Double,
      scaleY: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.UndefOr[scala.Nothing], scaleX: Double, scaleY: Double): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.UndefOr[scala.Nothing], scaleX: Double, scaleY: Double, out: O): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.Array[_]): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](
      data: js.Array[_],
      holes: js.Array[_],
      scaleX: js.UndefOr[scala.Nothing],
      scaleY: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: js.UndefOr[scala.Nothing], scaleY: Double): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: js.UndefOr[scala.Nothing], scaleY: Double, out: O): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: Double): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: Double, scaleY: js.UndefOr[scala.Nothing], out: O): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: Double, scaleY: Double): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.BuildFromPolygon")
    @js.native
    def BuildFromPolygon[O /* <: js.Array[typingsSlinky.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: Double, scaleY: Double, out: O): O = js.native
    
    /**
      * Builds a right triangle, i.e. one which has a 90-degree angle and two acute angles.
      * @param x The X coordinate of the right angle, which will also be the first X coordinate of the constructed Triangle.
      * @param y The Y coordinate of the right angle, which will also be the first Y coordinate of the constructed Triangle.
      * @param width The length of the side which is to the left or to the right of the right angle.
      * @param height The length of the side which is above or below the right angle.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.BuildRight")
    @js.native
    def BuildRight(x: Double, y: Double, width: Double, height: Double): typingsSlinky.phaser.Phaser.Geom.Triangle = js.native
    
    /**
      * Positions the Triangle so that it is centered on the given coordinates.
      * @param triangle The triangle to be positioned.
      * @param x The horizontal coordinate to center on.
      * @param y The vertical coordinate to center on.
      * @param centerFunc The function used to center the triangle. Defaults to Centroid centering.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.CenterOn")
    @js.native
    def CenterOn[O /* <: typingsSlinky.phaser.Phaser.Geom.Triangle */](triangle: O, x: Double, y: Double): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.CenterOn")
    @js.native
    def CenterOn[O /* <: typingsSlinky.phaser.Phaser.Geom.Triangle */](triangle: O, x: Double, y: Double, centerFunc: CenterFunction): O = js.native
    
    /**
      * Calculates the position of a Triangle's centroid, which is also its center of mass (center of gravity).
      * 
      * The centroid is the point in a Triangle at which its three medians (the lines drawn from the vertices to the bisectors of the opposite sides) meet. It divides each one in a 2:1 ratio.
      * @param triangle The Triangle to use.
      * @param out An object to store the coordinates in.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.Centroid")
    @js.native
    def Centroid[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](triangle: typingsSlinky.phaser.Phaser.Geom.Triangle): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.Centroid")
    @js.native
    def Centroid[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, out: O): O = js.native
    
    /**
      * Computes the circumcentre of a triangle. The circumcentre is the centre of
      * the circumcircle, the smallest circle which encloses the triangle. It is also
      * the common intersection point of the perpendicular bisectors of the sides of
      * the triangle, and is the only point which has equal distance to all three
      * vertices of the triangle.
      * @param triangle The Triangle to get the circumcenter of.
      * @param out The Vector2 object to store the position in. If not given, a new Vector2 instance is created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.CircumCenter")
    @js.native
    def CircumCenter[O /* <: Vector2 */](triangle: typingsSlinky.phaser.Phaser.Geom.Triangle): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.CircumCenter")
    @js.native
    def CircumCenter[O /* <: Vector2 */](triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, out: O): O = js.native
    
    /**
      * Finds the circumscribed circle (circumcircle) of a Triangle object. The circumcircle is the circle which touches all of the triangle's vertices.
      * @param triangle The Triangle to use as input.
      * @param out An optional Circle to store the result in.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.CircumCircle")
    @js.native
    def CircumCircle[O /* <: typingsSlinky.phaser.Phaser.Geom.Circle */](triangle: typingsSlinky.phaser.Phaser.Geom.Triangle): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.CircumCircle")
    @js.native
    def CircumCircle[O /* <: typingsSlinky.phaser.Phaser.Geom.Circle */](triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, out: O): O = js.native
    
    /**
      * Clones a Triangle object.
      * @param source The Triangle to clone.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.Clone")
    @js.native
    def Clone(source: typingsSlinky.phaser.Phaser.Geom.Triangle): typingsSlinky.phaser.Phaser.Geom.Triangle = js.native
    
    /**
      * Checks if a point (as a pair of coordinates) is inside a Triangle's bounds.
      * @param triangle The Triangle to check.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.Contains")
    @js.native
    def Contains(triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, x: Double, y: Double): Boolean = js.native
    
    /**
      * Filters an array of point-like objects to only those contained within a triangle.
      * If `returnFirst` is true, will return an array containing only the first point in the provided array that is within the triangle (or an empty array if there are no such points).
      * @param triangle The triangle that the points are being checked in.
      * @param points An array of point-like objects (objects that have an `x` and `y` property)
      * @param returnFirst If `true`, return an array containing only the first point found that is within the triangle. Default false.
      * @param out If provided, the points that are within the triangle will be appended to this array instead of being added to a new array. If `returnFirst` is true, only the first point found within the triangle will be appended. This array will also be returned by this function.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.ContainsArray")
    @js.native
    def ContainsArray(
      triangle: typingsSlinky.phaser.Phaser.Geom.Triangle,
      points: js.Array[typingsSlinky.phaser.Phaser.Geom.Point]
    ): js.Array[typingsSlinky.phaser.Phaser.Geom.Point] = js.native
    @JSGlobal("Phaser.Geom.Triangle.ContainsArray")
    @js.native
    def ContainsArray(
      triangle: typingsSlinky.phaser.Phaser.Geom.Triangle,
      points: js.Array[typingsSlinky.phaser.Phaser.Geom.Point],
      returnFirst: js.UndefOr[scala.Nothing],
      out: js.Array[_]
    ): js.Array[typingsSlinky.phaser.Phaser.Geom.Point] = js.native
    @JSGlobal("Phaser.Geom.Triangle.ContainsArray")
    @js.native
    def ContainsArray(
      triangle: typingsSlinky.phaser.Phaser.Geom.Triangle,
      points: js.Array[typingsSlinky.phaser.Phaser.Geom.Point],
      returnFirst: Boolean
    ): js.Array[typingsSlinky.phaser.Phaser.Geom.Point] = js.native
    @JSGlobal("Phaser.Geom.Triangle.ContainsArray")
    @js.native
    def ContainsArray(
      triangle: typingsSlinky.phaser.Phaser.Geom.Triangle,
      points: js.Array[typingsSlinky.phaser.Phaser.Geom.Point],
      returnFirst: Boolean,
      out: js.Array[_]
    ): js.Array[typingsSlinky.phaser.Phaser.Geom.Point] = js.native
    
    @JSGlobal("Phaser.Geom.Triangle.ContainsPoint")
    @js.native
    def ContainsPoint(triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, point: js.Any): Boolean = js.native
    /**
      * Tests if a triangle contains a point.
      * @param triangle The triangle.
      * @param point The point to test, or any point-like object with public `x` and `y` properties.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.ContainsPoint")
    @js.native
    def ContainsPoint(triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, point: typingsSlinky.phaser.Phaser.Geom.Point): Boolean = js.native
    @JSGlobal("Phaser.Geom.Triangle.ContainsPoint")
    @js.native
    def ContainsPoint(triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, point: Vector2): Boolean = js.native
    
    /**
      * Copy the values of one Triangle to a destination Triangle.
      * @param source The source Triangle to copy the values from.
      * @param dest The destination Triangle to copy the values to.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.CopyFrom")
    @js.native
    def CopyFrom[O /* <: typingsSlinky.phaser.Phaser.Geom.Triangle */](source: typingsSlinky.phaser.Phaser.Geom.Triangle, dest: O): O = js.native
    
    /**
      * Decomposes a Triangle into an array of its points.
      * @param triangle The Triangle to decompose.
      * @param out An array to store the points into.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.Decompose")
    @js.native
    def Decompose(triangle: typingsSlinky.phaser.Phaser.Geom.Triangle): js.Array[_] = js.native
    @JSGlobal("Phaser.Geom.Triangle.Decompose")
    @js.native
    def Decompose(triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, out: js.Array[_]): js.Array[_] = js.native
    
    /**
      * Returns true if two triangles have the same coordinates.
      * @param triangle The first triangle to check.
      * @param toCompare The second triangle to check.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.Equals")
    @js.native
    def Equals(
      triangle: typingsSlinky.phaser.Phaser.Geom.Triangle,
      toCompare: typingsSlinky.phaser.Phaser.Geom.Triangle
    ): Boolean = js.native
    
    /**
      * Returns a Point from around the perimeter of a Triangle.
      * @param triangle The Triangle to get the point on its perimeter from.
      * @param position The position along the perimeter of the triangle. A value between 0 and 1.
      * @param out An option Point, or Point-like object to store the value in. If not given a new Point will be created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.GetPoint")
    @js.native
    def GetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, position: Double): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.GetPoint")
    @js.native
    def GetPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, position: Double, out: O): O = js.native
    
    /**
      * Returns an array of evenly spaced points on the perimeter of a Triangle.
      * @param triangle The Triangle to get the points from.
      * @param quantity The number of evenly spaced points to return. Set to 0 to return an arbitrary number of points based on the `stepRate`.
      * @param stepRate If `quantity` is 0, the distance between each returned point.
      * @param out An array to which the points should be appended.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.GetPoints")
    @js.native
    def GetPoints[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, quantity: integer, stepRate: Double): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.GetPoints")
    @js.native
    def GetPoints[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, quantity: integer, stepRate: Double, out: O): O = js.native
    
    /**
      * Calculates the position of the incenter of a Triangle object. This is the point where its three angle bisectors meet and it's also the center of the incircle, which is the circle inscribed in the triangle.
      * @param triangle The Triangle to find the incenter of.
      * @param out An optional Point in which to store the coordinates.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.InCenter")
    @js.native
    def InCenter[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](triangle: typingsSlinky.phaser.Phaser.Geom.Triangle): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.InCenter")
    @js.native
    def InCenter[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, out: O): O = js.native
    
    /**
      * Moves each point (vertex) of a Triangle by a given offset, thus moving the entire Triangle by that offset.
      * @param triangle The Triangle to move.
      * @param x The horizontal offset (distance) by which to move each point. Can be positive or negative.
      * @param y The vertical offset (distance) by which to move each point. Can be positive or negative.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.Offset")
    @js.native
    def Offset[O /* <: typingsSlinky.phaser.Phaser.Geom.Triangle */](triangle: O, x: Double, y: Double): O = js.native
    
    /**
      * Gets the length of the perimeter of the given triangle.
      * Calculated by adding together the length of each of the three sides.
      * @param triangle The Triangle to get the length from.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.Perimeter")
    @js.native
    def Perimeter(triangle: typingsSlinky.phaser.Phaser.Geom.Triangle): Double = js.native
    
    /**
      * Returns a random Point from within the area of the given Triangle.
      * @param triangle The Triangle to get a random point from.
      * @param out The Point object to store the position in. If not given, a new Point instance is created.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.Random")
    @js.native
    def Random[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](triangle: typingsSlinky.phaser.Phaser.Geom.Triangle): O = js.native
    @JSGlobal("Phaser.Geom.Triangle.Random")
    @js.native
    def Random[O /* <: typingsSlinky.phaser.Phaser.Geom.Point */](triangle: typingsSlinky.phaser.Phaser.Geom.Triangle, out: O): O = js.native
    
    /**
      * Rotates a Triangle about its incenter, which is the point at which its three angle bisectors meet.
      * @param triangle The Triangle to rotate.
      * @param angle The angle by which to rotate the Triangle, in radians.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.Rotate")
    @js.native
    def Rotate[O /* <: typingsSlinky.phaser.Phaser.Geom.Triangle */](triangle: O, angle: Double): O = js.native
    
    /**
      * Rotates a Triangle at a certain angle about a given Point or object with public `x` and `y` properties.
      * @param triangle The Triangle to rotate.
      * @param point The Point to rotate the Triangle about.
      * @param angle The angle by which to rotate the Triangle, in radians.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.RotateAroundPoint")
    @js.native
    def RotateAroundPoint[O /* <: typingsSlinky.phaser.Phaser.Geom.Triangle */](triangle: O, point: typingsSlinky.phaser.Phaser.Geom.Point, angle: Double): O = js.native
    
    /**
      * Rotates an entire Triangle at a given angle about a specific point.
      * @param triangle The Triangle to rotate.
      * @param x The X coordinate of the point to rotate the Triangle about.
      * @param y The Y coordinate of the point to rotate the Triangle about.
      * @param angle The angle by which to rotate the Triangle, in radians.
      */
    /* static member */
    @JSGlobal("Phaser.Geom.Triangle.RotateAroundXY")
    @js.native
    def RotateAroundXY[O /* <: typingsSlinky.phaser.Phaser.Geom.Triangle */](triangle: O, x: Double, y: Double, angle: Double): O = js.native
  }
}

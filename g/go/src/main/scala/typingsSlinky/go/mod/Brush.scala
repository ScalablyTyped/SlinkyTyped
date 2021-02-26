package typingsSlinky.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Brush holds color information and describes how to draw the inside
  * of a Shape or the stroke of a shape or a TextBlock or the
  * background of any GraphObject.
  * A Brush must not be modified once it has been assigned to a GraphObject,
  * such as the Shape.fill or TextBlock.stroke
  * or GraphObject.background.
  * However, a Brush may be shared by multiple GraphObjects.
  */
@JSImport("go", "Brush")
@js.native
/**
  * Construct a solid color Brush that holds the given color information.
  * @param {string=} color a well-formed CSS string describing a solid color brush; if not supplied uses 'black'.
  */
class Brush () extends StObject {
  def this(color: String) = this()
  /**
    * Construct a Brush class of a given type.
    * @param {EnumValue} type one of the values  Brush.Solid, Brush.Linear, Brush.Radial, Brush.Pattern.
    */
  def this(`type`: EnumValue) = this()
  
  /**
    * Specify a particular color at a particular fraction of the distance.
    * If the  .type is Brush.Solid, change the type to Brush.Linear.
    * You should have a color stop at zero and a color stop at one.
    * You should not have duplicate color stop values at the same fractional distance.
    * @param {number} loc between zero and one, inclusive.
    * @param {string} color a CSS color string
    */
  def addColorStop(loc: Double, color: String): Unit = js.native
  
  /**Gets or sets the color of a solid Brush.*/
  var color: String = js.native
  
  /**Gets or sets a Map holding all of the color stops used in this gradient, where the key is a number, the fractional distance between zero and one (inclusive), and where the corresponding value is a color string.*/
  var colorStops: Map[Double, String] = js.native
  
  /**
    * Create a copy of this Brush, with the same values.
    */
  def copy(): Brush = js.native
  
  /**Gets or sets the ending location for a linear or radial gradient.*/
  var end: Spot = js.native
  
  /**Gets or sets the radius of a radial brush at the end location.*/
  var endRadius: Double = js.native
  
  /**Gets or sets the pattern of a brush of type Brush.Pattern, an HTMLImageElement or HTMLCanvasElement or HTMLVideoElement.*/
  var pattern: js.Any = js.native
  
  /**Gets or sets the starting location for a linear or radial gradient.*/
  var start: Spot = js.native
  
  /**Gets or sets the radius of a radial brush at the start location.*/
  var startRadius: Double = js.native
  
  /**Gets or sets the type of brush.*/
  var `type`: EnumValue = js.native
}
object Brush {
  
  @JSImport("go", "Brush")
  @js.native
  val ^ : js.Any = js.native
  
  /**For linear gradient brushes, used as the value for Brush.type.*/
  /* static member */
  @JSImport("go", "Brush.Linear")
  @js.native
  def Linear: EnumValue = js.native
  @scala.inline
  def Linear_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Linear")(x.asInstanceOf[js.Any])
  
  /**For pattern brushes, used as the value for Brush.type.*/
  /* static member */
  @JSImport("go", "Brush.Pattern")
  @js.native
  def Pattern: EnumValue = js.native
  @scala.inline
  def Pattern_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(x.asInstanceOf[js.Any])
  
  /**For radial gradient brushes, used as the value for Brush.type.*/
  /* static member */
  @JSImport("go", "Brush.Radial")
  @js.native
  def Radial: EnumValue = js.native
  @scala.inline
  def Radial_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Radial")(x.asInstanceOf[js.Any])
  
  /**For simple, solid color brushes, used as the value for Brush.type.*/
  /* static member */
  @JSImport("go", "Brush.Solid")
  @js.native
  def Solid: EnumValue = js.native
  @scala.inline
  def Solid_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Solid")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("go", "Brush.isValidColor")
  @js.native
  def isValidColor(color: String): Boolean = js.native
  
  /**
    * This static function can be used to generate a random color string.
    * @param {number=} min a number between zero and 255, defaults to 128.
    * @param {number=} max a number between zero and 255, defaults to 255.
    */
  /* static member */
  @JSImport("go", "Brush.randomColor")
  @js.native
  def randomColor(): String = js.native
  @JSImport("go", "Brush.randomColor")
  @js.native
  def randomColor(min: js.UndefOr[scala.Nothing], max: Double): String = js.native
  @JSImport("go", "Brush.randomColor")
  @js.native
  def randomColor(min: Double): String = js.native
  @JSImport("go", "Brush.randomColor")
  @js.native
  def randomColor(min: Double, max: Double): String = js.native
}

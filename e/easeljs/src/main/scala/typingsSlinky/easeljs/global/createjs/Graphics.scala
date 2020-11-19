package typingsSlinky.easeljs.global.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.Graphics")
@js.native
class Graphics ()
  extends typingsSlinky.easeljs.createjs.Graphics
/* static members */
@JSGlobal("createjs.Graphics")
@js.native
object Graphics extends js.Object {
  
  // properties
  var BASE_64: js.Object = js.native
  
   // array of graphics command objects (Graphics.Fill, etc)
  var STROKE_CAPS_MAP: js.Array[String] = js.native
  
  var STROKE_JOINTS_MAP: js.Array[String] = js.native
  
  var beginCmd: typingsSlinky.easeljs.createjs.Graphics.BeginPath = js.native
  
  def getHSL(hue: Double, saturation: Double, lightness: Double): String = js.native
  def getHSL(hue: Double, saturation: Double, lightness: Double, alpha: Double): String = js.native
  
  def getRGB(r: Double, g: Double, b: Double): String = js.native
  def getRGB(r: Double, g: Double, b: Double, alpha: Double): String = js.native
  
  @js.native
  class Arc protected ()
    extends typingsSlinky.easeljs.createjs.Graphics.Arc {
    def this(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Double) = this()
  }
  
  @js.native
  class ArcTo protected ()
    extends typingsSlinky.easeljs.createjs.Graphics.ArcTo {
    def this(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double) = this()
  }
  
  @js.native
  class BeginPath ()
    extends typingsSlinky.easeljs.createjs.Graphics.BeginPath
  
  @js.native
  class BezierCurveTo protected ()
    extends typingsSlinky.easeljs.createjs.Graphics.BezierCurveTo {
    def this(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double) = this()
  }
  
  @js.native
  class Circle protected ()
    extends typingsSlinky.easeljs.createjs.Graphics.Circle {
    def this(x: Double, y: Double, radius: Double) = this()
  }
  
  @js.native
  class ClosePath ()
    extends typingsSlinky.easeljs.createjs.Graphics.ClosePath
  
  @js.native
  class Fill protected ()
    extends typingsSlinky.easeljs.createjs.Graphics.Fill {
    def this(style: js.Object) = this()
    def this(style: js.Object, matrix: typingsSlinky.easeljs.createjs.Matrix2D) = this()
  }
  
  @js.native
  class LineTo protected ()
    extends typingsSlinky.easeljs.createjs.Graphics.LineTo {
    def this(x: Double, y: Double) = this()
  }
  
  @js.native
  class MoveTo protected ()
    extends typingsSlinky.easeljs.createjs.Graphics.MoveTo {
    def this(x: Double, y: Double) = this()
  }
  
  @js.native
  class PolyStar protected ()
    extends typingsSlinky.easeljs.createjs.Graphics.PolyStar {
    def this(x: Double, y: Double, radius: Double, sides: Double, pointSize: Double, angle: Double) = this()
  }
  
  @js.native
  class QuadraticCurveTo protected ()
    extends typingsSlinky.easeljs.createjs.Graphics.QuadraticCurveTo {
    def this(cpx: Double, cpy: Double, x: Double, y: Double) = this()
  }
  
  @js.native
  class Rect protected ()
    extends typingsSlinky.easeljs.createjs.Graphics.Rect {
    def this(x: Double, y: Double, w: Double, h: Double) = this()
  }
  
  @js.native
  class RoundRect protected ()
    extends typingsSlinky.easeljs.createjs.Graphics.RoundRect {
    def this(
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      radiusTL: Double,
      radiusTR: Double,
      radiusBR: Double,
      radiusBL: Double
    ) = this()
  }
  
  @js.native
  class Stroke protected ()
    extends typingsSlinky.easeljs.createjs.Graphics.Stroke {
    def this(style: js.Object, ignoreScale: Boolean) = this()
  }
  
  @js.native
  class StrokeStyle protected ()
    extends typingsSlinky.easeljs.createjs.Graphics.StrokeStyle {
    def this(width: Double, caps: String, joints: Double, miterLimit: Double) = this()
  }
}

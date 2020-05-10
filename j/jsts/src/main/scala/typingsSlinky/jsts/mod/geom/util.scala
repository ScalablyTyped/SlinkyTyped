package typingsSlinky.jsts.mod.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsts", "geom.util")
@js.native
object util extends js.Object {
  @js.native
  class AffineTransformation ()
    extends typingsSlinky.jsts.jsts.geom.util.AffineTransformation {
    def this(trans: typingsSlinky.jsts.jsts.geom.util.AffineTransformation) = this()
    def this(m00: Double, m01: Double, m02: Double, m10: Double, m11: Double, m12: Double) = this()
    def this(
      src0: typingsSlinky.jsts.jsts.geom.Coordinate,
      src1: typingsSlinky.jsts.jsts.geom.Coordinate,
      src2: typingsSlinky.jsts.jsts.geom.Coordinate,
      dest0: typingsSlinky.jsts.jsts.geom.Coordinate,
      dest1: typingsSlinky.jsts.jsts.geom.Coordinate,
      dest2: typingsSlinky.jsts.jsts.geom.Coordinate
    ) = this()
  }
  
  /* static members */
  @js.native
  object AffineTransformation extends js.Object {
    def reflectionInstance(x0: Double, y0: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
    def reflectionInstance(x0: Double, y0: Double, x1: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
    def reflectionInstance(x0: Double, y0: Double, x1: Double, y1: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
    def rotationInstance(sinTheta: Double, cosTheta: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
    def rotationInstance(sinTheta: Double, cosTheta: Double, x: Double, y: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
    def rotationInstance(theta: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
    def rotationInstance(theta: Double, x: Double, y: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
    def scaleInstance(xScale: Double, yScale: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
    def scaleInstance(xScale: Double, yScale: Double, x: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
    def scaleInstance(xScale: Double, yScale: Double, x: Double, y: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
    def shearInstance(xShear: Double, yShear: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
    def translationInstance(x: Double, y: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
  }
  
}


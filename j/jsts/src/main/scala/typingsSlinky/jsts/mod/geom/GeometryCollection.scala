package typingsSlinky.jsts.mod.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsts", "geom.GeometryCollection")
@js.native
class GeometryCollection ()
  extends typingsSlinky.jsts.jsts.geom.Geometry {
  def this(geometries: js.Array[typingsSlinky.jsts.jsts.geom.Geometry]) = this()
  def this(
    geometries: js.Array[typingsSlinky.jsts.jsts.geom.Geometry],
    factory: typingsSlinky.jsts.jsts.geom.GeometryFactory
  ) = this()
}


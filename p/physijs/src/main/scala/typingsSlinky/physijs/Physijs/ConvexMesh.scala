package typingsSlinky.physijs.Physijs

import typingsSlinky.three.mod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.ConvexMesh")
@js.native
class ConvexMesh protected () extends Mesh {
  def this(geometry: Geometry, material: typingsSlinky.three.mod.Material) = this()
  def this(geometry: Geometry, material: typingsSlinky.three.mod.Material, mass: Double) = this()
}


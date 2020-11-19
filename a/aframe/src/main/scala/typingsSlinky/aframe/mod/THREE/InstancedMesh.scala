package typingsSlinky.aframe.mod.THREE

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aframe", "THREE.InstancedMesh")
@js.native
class InstancedMesh[TGeometry /* <: Geometry | BufferGeometry */, TMaterial /* <: typingsSlinky.three.materialMod.Material | js.Array[typingsSlinky.three.materialMod.Material] */] protected ()
  extends typingsSlinky.three.mod.InstancedMesh[TGeometry, TMaterial] {
  def this(
    geometry: /* import warning: RewrittenClass.unapply cls was tparam TGeometry */ js.Any,
    material: /* import warning: RewrittenClass.unapply cls was tparam TMaterial */ js.Any,
    count: Double
  ) = this()
}

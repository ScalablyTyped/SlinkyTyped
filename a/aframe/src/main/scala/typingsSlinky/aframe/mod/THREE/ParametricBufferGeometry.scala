package typingsSlinky.aframe.mod.THREE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aframe", "THREE.ParametricBufferGeometry")
@js.native
class ParametricBufferGeometry protected ()
  extends typingsSlinky.three.mod.ParametricBufferGeometry {
  def this(
    func: js.Function3[
        /* u */ Double, 
        /* v */ Double, 
        /* dest */ typingsSlinky.three.vector3Mod.Vector3, 
        Unit
      ],
    slices: Double,
    stacks: Double
  ) = this()
}

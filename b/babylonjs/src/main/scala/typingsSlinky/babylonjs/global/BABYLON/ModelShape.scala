package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ModelShape")
@js.native
class ModelShape protected ()
  extends typingsSlinky.babylonjs.BABYLON.ModelShape {
  /**
    * Creates a ModelShape object. This is an internal simplified reference to a mesh used as for a model to replicate particles from by the SPS.
    * SPS internal tool, don't use it manually.
    * @hidden
    */
  def this(
    id: Double,
    shape: js.Array[typingsSlinky.babylonjs.BABYLON.Vector3],
    indices: js.Array[Double],
    normals: js.Array[Double],
    colors: js.Array[Double],
    shapeUV: js.Array[Double],
    posFunction: Nullable[
        js.Function3[
          /* particle */ typingsSlinky.babylonjs.BABYLON.SolidParticle, 
          /* i */ Double, 
          /* s */ Double, 
          Unit
        ]
      ],
    vtxFunction: Nullable[
        js.Function3[
          /* particle */ typingsSlinky.babylonjs.BABYLON.SolidParticle, 
          /* vertex */ typingsSlinky.babylonjs.BABYLON.Vector3, 
          /* i */ Double, 
          Unit
        ]
      ],
    material: Nullable[typingsSlinky.babylonjs.BABYLON.Material]
  ) = this()
}

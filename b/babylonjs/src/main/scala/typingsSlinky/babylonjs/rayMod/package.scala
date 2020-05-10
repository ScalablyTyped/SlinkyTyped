package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rayMod {
  type TrianglePickingPredicate = js.Function4[
    /* p0 */ typingsSlinky.babylonjs.mathVectorMod.Vector3, 
    /* p1 */ typingsSlinky.babylonjs.mathVectorMod.Vector3, 
    /* p2 */ typingsSlinky.babylonjs.mathVectorMod.Vector3, 
    /* ray */ typingsSlinky.babylonjs.rayMod.Ray, 
    scala.Boolean
  ]
}

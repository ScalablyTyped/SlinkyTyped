package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IOctreeContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.OctreeBlock")
@js.native
class OctreeBlock[T] protected ()
  extends typingsSlinky.babylonjs.BABYLON.OctreeBlock[T] {
  /**
    * Creates a new block
    * @param minPoint defines the minimum vector (in world space) of the block's bounding box
    * @param maxPoint defines the maximum vector (in world space) of the block's bounding box
    * @param capacity defines the maximum capacity of this block (if capacity is reached the block will be split into sub blocks)
    * @param depth defines the current depth of this block in the octree
    * @param maxDepth defines the maximal depth allowed (beyond this value, the capacity is ignored)
    * @param creationFunc defines a callback to call when an element is added to the block
    */
  def this(
    minPoint: typingsSlinky.babylonjs.BABYLON.Vector3,
    maxPoint: typingsSlinky.babylonjs.BABYLON.Vector3,
    capacity: Double,
    depth: Double,
    maxDepth: Double,
    creationFunc: js.Function2[/* entry */ T, /* block */ typingsSlinky.babylonjs.BABYLON.OctreeBlock[T], Unit]
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.OctreeBlock")
@js.native
object OctreeBlock extends js.Object {
  
  /**
    * @hidden
    */
  def _CreateBlocks[T](
    worldMin: typingsSlinky.babylonjs.BABYLON.Vector3,
    worldMax: typingsSlinky.babylonjs.BABYLON.Vector3,
    entries: js.Array[T],
    maxBlockCapacity: Double,
    currentDepth: Double,
    maxDepth: Double,
    target: IOctreeContainer[T],
    creationFunc: js.Function2[/* entry */ T, /* block */ typingsSlinky.babylonjs.BABYLON.OctreeBlock[T], Unit]
  ): Unit = js.native
}

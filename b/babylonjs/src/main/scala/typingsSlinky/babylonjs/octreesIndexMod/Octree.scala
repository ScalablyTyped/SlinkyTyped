package typingsSlinky.babylonjs.octreesIndexMod

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.subMeshMod.SubMesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Culling/Octrees/index", "Octree")
@js.native
class Octree[T] protected ()
  extends typingsSlinky.babylonjs.octreeMod.Octree[T] {
  /**
    * Creates a octree
    * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
    * @param creationFunc function to be used to instatiate the octree
    * @param maxBlockCapacity defines the maximum number of meshes you want on your octree's leaves (default: 64)
    * @param maxDepth defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.)
    */
  def this(creationFunc: js.Function2[
        /* entry */ T, 
        /* block */ typingsSlinky.babylonjs.octreeBlockMod.OctreeBlock[T], 
        Unit
      ]) = this()
  def this(
    creationFunc: js.Function2[
        /* entry */ T, 
        /* block */ typingsSlinky.babylonjs.octreeBlockMod.OctreeBlock[T], 
        Unit
      ],
    maxBlockCapacity: Double
  ) = this()
  def this(
    creationFunc: js.Function2[
        /* entry */ T, 
        /* block */ typingsSlinky.babylonjs.octreeBlockMod.OctreeBlock[T], 
        Unit
      ],
    maxBlockCapacity: Double,
    /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
  maxDepth: Double
  ) = this()
}

/* static members */
@JSImport("babylonjs/Culling/Octrees/index", "Octree")
@js.native
object Octree extends js.Object {
  /**
    * Adds a mesh into the octree block if it intersects the block
    */
  def CreationFuncForMeshes(entry: AbstractMesh, block: typingsSlinky.babylonjs.octreeBlockMod.OctreeBlock[AbstractMesh]): Unit = js.native
  /**
    * Adds a submesh into the octree block if it intersects the block
    */
  def CreationFuncForSubMeshes(entry: SubMesh, block: typingsSlinky.babylonjs.octreeBlockMod.OctreeBlock[SubMesh]): Unit = js.native
}


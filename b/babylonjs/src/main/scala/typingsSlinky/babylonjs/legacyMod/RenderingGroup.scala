package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "RenderingGroup")
@js.native
class RenderingGroup protected ()
  extends typingsSlinky.babylonjs.indexMod.RenderingGroup {
  /**
    * Creates a new rendering group.
    * @param index The rendering group index
    * @param opaqueSortCompareFn The opaque sort comparison function. If null no order is applied
    * @param alphaTestSortCompareFn The alpha test sort comparison function. If null no order is applied
    * @param transparentSortCompareFn The transparent sort comparison function. If null back to front + alpha index sort is applied
    */
  def this(index: Double, scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
  def this(
    index: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    opaqueSortCompareFn: Nullable[
        js.Function2[
          /* a */ typingsSlinky.babylonjs.subMeshMod.SubMesh, 
          /* b */ typingsSlinky.babylonjs.subMeshMod.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    opaqueSortCompareFn: js.UndefOr[
        Nullable[
          js.Function2[
            /* a */ typingsSlinky.babylonjs.subMeshMod.SubMesh, 
            /* b */ typingsSlinky.babylonjs.subMeshMod.SubMesh, 
            Double
          ]
        ]
      ],
    alphaTestSortCompareFn: Nullable[
        js.Function2[
          /* a */ typingsSlinky.babylonjs.subMeshMod.SubMesh, 
          /* b */ typingsSlinky.babylonjs.subMeshMod.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    opaqueSortCompareFn: js.UndefOr[
        Nullable[
          js.Function2[
            /* a */ typingsSlinky.babylonjs.subMeshMod.SubMesh, 
            /* b */ typingsSlinky.babylonjs.subMeshMod.SubMesh, 
            Double
          ]
        ]
      ],
    alphaTestSortCompareFn: js.UndefOr[
        Nullable[
          js.Function2[
            /* a */ typingsSlinky.babylonjs.subMeshMod.SubMesh, 
            /* b */ typingsSlinky.babylonjs.subMeshMod.SubMesh, 
            Double
          ]
        ]
      ],
    transparentSortCompareFn: Nullable[
        js.Function2[
          /* a */ typingsSlinky.babylonjs.subMeshMod.SubMesh, 
          /* b */ typingsSlinky.babylonjs.subMeshMod.SubMesh, 
          Double
        ]
      ]
  ) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "RenderingGroup")
@js.native
object RenderingGroup extends js.Object {
  
  var _zeroVector: js.Any = js.native
  
  /**
    * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
    * are rendered back to front.
    *
    * @param a The first submesh
    * @param b The second submesh
    * @returns The result of the comparison
    */
  def backToFrontSortCompare(a: typingsSlinky.babylonjs.subMeshMod.SubMesh, b: typingsSlinky.babylonjs.subMeshMod.SubMesh): Double = js.native
  
  /**
    * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
    * are rendered back to front if in the same alpha index.
    *
    * @param a The first submesh
    * @param b The second submesh
    * @returns The result of the comparison
    */
  def defaultTransparentSortCompare(a: typingsSlinky.babylonjs.subMeshMod.SubMesh, b: typingsSlinky.babylonjs.subMeshMod.SubMesh): Double = js.native
  
  /**
    * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
    * are rendered front to back (prevent overdraw).
    *
    * @param a The first submesh
    * @param b The second submesh
    * @returns The result of the comparison
    */
  def frontToBackSortCompare(a: typingsSlinky.babylonjs.subMeshMod.SubMesh, b: typingsSlinky.babylonjs.subMeshMod.SubMesh): Double = js.native
  
  /**
    * Renders the submeshes in a specified order.
    * @param subMeshes The submeshes to sort before render
    * @param sortCompareFn The comparison function use to sort
    * @param cameraPosition The camera position use to preprocess the submeshes to help sorting
    * @param transparent Specifies to activate blending if true
    */
  var renderSorted: js.Any = js.native
  
  /**
    * Renders the submeshes in the order they were dispatched (no sort applied).
    * @param subMeshes The submeshes to render
    */
  var renderUnsorted: js.Any = js.native
}

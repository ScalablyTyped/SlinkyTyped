package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.edgesRendererMod.IEdgesRenderer
import typingsSlinky.babylonjs.iparticlesystemMod.IParticleSystem
import typingsSlinky.babylonjs.materialMod.Material
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.smartArrayMod.SmartArray
import typingsSlinky.babylonjs.smartArrayMod.SmartArrayNoDuplicate
import typingsSlinky.babylonjs.spriteManagerMod.ISpriteManager
import typingsSlinky.babylonjs.subMeshMod.SubMesh
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingGroupMod {
  
  @JSImport("babylonjs/Rendering/renderingGroup", "RenderingGroup")
  @js.native
  class RenderingGroup protected () extends StObject {
    /**
      * Creates a new rendering group.
      * @param index The rendering group index
      * @param opaqueSortCompareFn The opaque sort comparison function. If null no order is applied
      * @param alphaTestSortCompareFn The alpha test sort comparison function. If null no order is applied
      * @param transparentSortCompareFn The transparent sort comparison function. If null back to front + alpha index sort is applied
      */
    def this(index: Double, scene: Scene) = this()
    def this(
      index: Double,
      scene: Scene,
      opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ) = this()
    def this(
      index: Double,
      scene: Scene,
      opaqueSortCompareFn: js.UndefOr[Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]],
      alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ) = this()
    def this(
      index: Double,
      scene: Scene,
      opaqueSortCompareFn: js.UndefOr[Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]],
      alphaTestSortCompareFn: js.UndefOr[Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]],
      transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ) = this()
    
    var _alphaTestSortCompareFn: js.Any = js.native
    
    var _alphaTestSubMeshes: js.Any = js.native
    
    var _depthOnlySubMeshes: js.Any = js.native
    
    /** @hidden */
    var _edgesRenderers: SmartArrayNoDuplicate[IEdgesRenderer] = js.native
    
    var _opaqueSortCompareFn: js.Any = js.native
    
    var _opaqueSubMeshes: js.Any = js.native
    
    var _particleSystems: js.Any = js.native
    
    var _renderAlphaTest: js.Any = js.native
    
    var _renderOpaque: js.Any = js.native
    
    var _renderParticles: js.Any = js.native
    
    var _renderSprites: js.Any = js.native
    
    var _renderTransparent: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _spriteManagers: js.Any = js.native
    
    var _transparentSortCompareFn: js.Any = js.native
    
    var _transparentSubMeshes: js.Any = js.native
    
    /**
      * Set the alpha test sort comparison function.
      * If null the sub meshes will be render in the order they were created
      */
    def alphaTestSortCompareFn_=(value: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]): Unit = js.native
    
    /**
      * Inserts the submesh in its correct queue depending on its material.
      * @param subMesh The submesh to dispatch
      * @param [mesh] Optional reference to the submeshes's mesh. Provide if you have an exiting reference to improve performance.
      * @param [material] Optional reference to the submeshes's material. Provide if you have an exiting reference to improve performance.
      */
    def dispatch(subMesh: SubMesh): Unit = js.native
    def dispatch(subMesh: SubMesh, mesh: js.UndefOr[scala.Nothing], material: Nullable[Material]): Unit = js.native
    def dispatch(subMesh: SubMesh, mesh: AbstractMesh): Unit = js.native
    def dispatch(subMesh: SubMesh, mesh: AbstractMesh, material: Nullable[Material]): Unit = js.native
    
    def dispatchParticles(particleSystem: IParticleSystem): Unit = js.native
    
    def dispatchSprites(spriteManager: ISpriteManager): Unit = js.native
    
    def dispose(): Unit = js.native
    
    var index: Double = js.native
    
    def onBeforeTransparentRendering(): Unit = js.native
    
    /**
      * Set the opaque sort comparison function.
      * If null the sub meshes will be render in the order they were created
      */
    def opaqueSortCompareFn_=(value: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]): Unit = js.native
    
    /**
      * Resets the different lists of submeshes to prepare a new frame.
      */
    def prepare(): Unit = js.native
    
    /**
      * Render all the sub meshes contained in the group.
      * @param customRenderFunction Used to override the default render behaviour of the group.
      * @returns true if rendered some submeshes.
      */
    def render(
      customRenderFunction: Nullable[
          js.Function4[
            /* opaqueSubMeshes */ SmartArray[SubMesh], 
            /* transparentSubMeshes */ SmartArray[SubMesh], 
            /* alphaTestSubMeshes */ SmartArray[SubMesh], 
            /* depthOnlySubMeshes */ SmartArray[SubMesh], 
            Unit
          ]
        ],
      renderSprites: Boolean,
      renderParticles: Boolean,
      activeMeshes: Nullable[js.Array[AbstractMesh]]
    ): Unit = js.native
    
    /**
      * Renders the opaque submeshes in the order from the alphatestSortCompareFn.
      * @param subMeshes The submeshes to render
      */
    var renderAlphaTestSorted: js.Any = js.native
    
    /**
      * Renders the opaque submeshes in the order from the opaqueSortCompareFn.
      * @param subMeshes The submeshes to render
      */
    var renderOpaqueSorted: js.Any = js.native
    
    /**
      * Renders the opaque submeshes in the order from the transparentSortCompareFn.
      * @param subMeshes The submeshes to render
      */
    var renderTransparentSorted: js.Any = js.native
    
    /**
      * Set the transparent sort comparison function.
      * If null the sub meshes will be render in the order they were created
      */
    def transparentSortCompareFn_=(value: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]): Unit = js.native
  }
  /* static members */
  object RenderingGroup {
    
    @JSImport("babylonjs/Rendering/renderingGroup", "RenderingGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Rendering/renderingGroup", "RenderingGroup._zeroVector")
    @js.native
    def _zeroVector: js.Any = js.native
    @scala.inline
    def _zeroVector_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_zeroVector")(x.asInstanceOf[js.Any])
    
    /**
      * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
      * are rendered back to front.
      *
      * @param a The first submesh
      * @param b The second submesh
      * @returns The result of the comparison
      */
    @JSImport("babylonjs/Rendering/renderingGroup", "RenderingGroup.backToFrontSortCompare")
    @js.native
    def backToFrontSortCompare(a: SubMesh, b: SubMesh): Double = js.native
    
    /**
      * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
      * are rendered back to front if in the same alpha index.
      *
      * @param a The first submesh
      * @param b The second submesh
      * @returns The result of the comparison
      */
    @JSImport("babylonjs/Rendering/renderingGroup", "RenderingGroup.defaultTransparentSortCompare")
    @js.native
    def defaultTransparentSortCompare(a: SubMesh, b: SubMesh): Double = js.native
    
    /**
      * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
      * are rendered front to back (prevent overdraw).
      *
      * @param a The first submesh
      * @param b The second submesh
      * @returns The result of the comparison
      */
    @JSImport("babylonjs/Rendering/renderingGroup", "RenderingGroup.frontToBackSortCompare")
    @js.native
    def frontToBackSortCompare(a: SubMesh, b: SubMesh): Double = js.native
    
    /**
      * Renders the submeshes in a specified order.
      * @param subMeshes The submeshes to sort before render
      * @param sortCompareFn The comparison function use to sort
      * @param cameraPosition The camera position use to preprocess the submeshes to help sorting
      * @param transparent Specifies to activate blending if true
      */
    @JSImport("babylonjs/Rendering/renderingGroup", "RenderingGroup.renderSorted")
    @js.native
    def renderSorted: js.Any = js.native
    @scala.inline
    def renderSorted_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderSorted")(x.asInstanceOf[js.Any])
    
    /**
      * Renders the submeshes in the order they were dispatched (no sort applied).
      * @param subMeshes The submeshes to render
      */
    @JSImport("babylonjs/Rendering/renderingGroup", "RenderingGroup.renderUnsorted")
    @js.native
    def renderUnsorted: js.Any = js.native
    @scala.inline
    def renderUnsorted_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderUnsorted")(x.asInstanceOf[js.Any])
  }
}

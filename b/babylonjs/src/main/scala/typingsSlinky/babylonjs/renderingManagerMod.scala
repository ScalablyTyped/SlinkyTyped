package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.iparticlesystemMod.IParticleSystem
import typingsSlinky.babylonjs.materialMod.Material
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.smartArrayMod.SmartArray
import typingsSlinky.babylonjs.spriteManagerMod.ISpriteManager
import typingsSlinky.babylonjs.subMeshMod.SubMesh
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingManagerMod {
  
  @JSImport("babylonjs/Rendering/renderingManager", "RenderingGroupInfo")
  @js.native
  class RenderingGroupInfo () extends StObject {
    
    /**
      * The camera currently used for the rendering pass
      */
    var camera: Nullable[Camera] = js.native
    
    /**
      * The ID of the renderingGroup being processed
      */
    var renderingGroupId: Double = js.native
    
    /**
      * The Scene that being rendered
      */
    var scene: Scene = js.native
  }
  
  @JSImport("babylonjs/Rendering/renderingManager", "RenderingManager")
  @js.native
  class RenderingManager protected () extends StObject {
    /**
      * Instantiates a new rendering group for a particular scene
      * @param scene Defines the scene the groups belongs to
      */
    def this(scene: Scene) = this()
    
    var _autoClearDepthStencil: js.Any = js.native
    
    var _clearDepthStencilBuffer: js.Any = js.native
    
    var _customAlphaTestSortCompareFn: js.Any = js.native
    
    var _customOpaqueSortCompareFn: js.Any = js.native
    
    var _customTransparentSortCompareFn: js.Any = js.native
    
    var _depthStencilBufferAlreadyCleaned: js.Any = js.native
    
    var _prepareRenderingGroup: js.Any = js.native
    
    var _renderingGroupInfo: js.Any = js.native
    
    var _renderingGroups: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    /**
      * @hidden
      */
    var _useSceneAutoClearSetup: Boolean = js.native
    
    /**
      * Add a submesh to the manager in order to render it this frame
      * @param subMesh The submesh to dispatch
      * @param mesh Optional reference to the submeshes's mesh. Provide if you have an exiting reference to improve performance.
      * @param material Optional reference to the submeshes's material. Provide if you have an exiting reference to improve performance.
      */
    def dispatch(subMesh: SubMesh): Unit = js.native
    def dispatch(subMesh: SubMesh, mesh: js.UndefOr[scala.Nothing], material: Nullable[Material]): Unit = js.native
    def dispatch(subMesh: SubMesh, mesh: AbstractMesh): Unit = js.native
    def dispatch(subMesh: SubMesh, mesh: AbstractMesh, material: Nullable[Material]): Unit = js.native
    
    /**
      * Add a particle system to the rendering manager in order to render it this frame.
      * @param particleSystem Define the particle system to render
      */
    def dispatchParticles(particleSystem: IParticleSystem): Unit = js.native
    
    /**
      * Add a sprite manager to the rendering manager in order to render it this frame.
      * @param spriteManager Define the sprite manager to render
      */
    def dispatchSprites(spriteManager: ISpriteManager): Unit = js.native
    
    /**
      * Dispose and release the group and its associated resources.
      * @hidden
      */
    def dispose(): Unit = js.native
    
    /**
      * Clear the info related to rendering groups preventing retention points during dispose.
      */
    def freeRenderingGroups(): Unit = js.native
    
    /**
      * Gets the current auto clear configuration for one rendering group of the rendering
      * manager.
      * @param index the rendering group index to get the information for
      * @returns The auto clear setup for the requested rendering group
      */
    def getAutoClearDepthStencilSetup(index: Double): IRenderingManagerAutoClearSetup = js.native
    
    /**
      * Renders the entire managed groups. This is used by the scene or the different rennder targets.
      * @hidden
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
      activeMeshes: Nullable[js.Array[AbstractMesh]],
      renderParticles: Boolean,
      renderSprites: Boolean
    ): Unit = js.native
    
    /**
      * Resets the different information of the group to prepare a new frame
      * @hidden
      */
    def reset(): Unit = js.native
    
    /**
      * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups.
      *
      * @param renderingGroupId The rendering group id corresponding to its index
      * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
      * @param depth Automatically clears depth between groups if true and autoClear is true.
      * @param stencil Automatically clears stencil between groups if true and autoClear is true.
      */
    def setRenderingAutoClearDepthStencil(renderingGroupId: Double, autoClearDepthStencil: Boolean): Unit = js.native
    def setRenderingAutoClearDepthStencil(
      renderingGroupId: Double,
      autoClearDepthStencil: Boolean,
      depth: js.UndefOr[scala.Nothing],
      stencil: Boolean
    ): Unit = js.native
    def setRenderingAutoClearDepthStencil(renderingGroupId: Double, autoClearDepthStencil: Boolean, depth: Boolean): Unit = js.native
    def setRenderingAutoClearDepthStencil(renderingGroupId: Double, autoClearDepthStencil: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
    
    /**
      * Overrides the default sort function applied in the renderging group to prepare the meshes.
      * This allowed control for front to back rendering or reversly depending of the special needs.
      *
      * @param renderingGroupId The rendering group id corresponding to its index
      * @param opaqueSortCompareFn The opaque queue comparison function use to sort.
      * @param alphaTestSortCompareFn The alpha test queue comparison function use to sort.
      * @param transparentSortCompareFn The transparent queue comparison function use to sort.
      */
    def setRenderingOrder(renderingGroupId: Double): Unit = js.native
    def setRenderingOrder(
      renderingGroupId: Double,
      opaqueSortCompareFn: js.UndefOr[Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]],
      alphaTestSortCompareFn: js.UndefOr[Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]],
      transparentSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ): Unit = js.native
    def setRenderingOrder(
      renderingGroupId: Double,
      opaqueSortCompareFn: js.UndefOr[Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]],
      alphaTestSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ): Unit = js.native
    def setRenderingOrder(
      renderingGroupId: Double,
      opaqueSortCompareFn: Nullable[js.Function2[/* a */ SubMesh, /* b */ SubMesh, Double]]
    ): Unit = js.native
  }
  /* static members */
  object RenderingManager {
    
    @JSImport("babylonjs/Rendering/renderingManager", "RenderingManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to globally prevent autoclearing scenes.
      */
    @JSImport("babylonjs/Rendering/renderingManager", "RenderingManager.AUTOCLEAR")
    @js.native
    def AUTOCLEAR: Boolean = js.native
    @scala.inline
    def AUTOCLEAR_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTOCLEAR")(x.asInstanceOf[js.Any])
    
    /**
      * The max id used for rendering groups (not included)
      */
    @JSImport("babylonjs/Rendering/renderingManager", "RenderingManager.MAX_RENDERINGGROUPS")
    @js.native
    def MAX_RENDERINGGROUPS: Double = js.native
    @scala.inline
    def MAX_RENDERINGGROUPS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_RENDERINGGROUPS")(x.asInstanceOf[js.Any])
    
    /**
      * The min id used for rendering groups (included)
      */
    @JSImport("babylonjs/Rendering/renderingManager", "RenderingManager.MIN_RENDERINGGROUPS")
    @js.native
    def MIN_RENDERINGGROUPS: Double = js.native
    @scala.inline
    def MIN_RENDERINGGROUPS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_RENDERINGGROUPS")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IRenderingManagerAutoClearSetup extends StObject {
    
    /**
      * Defines whether or not autoclear is enable.
      */
    var autoClear: Boolean = js.native
    
    /**
      * Defines whether or not to autoclear the depth buffer.
      */
    var depth: Boolean = js.native
    
    /**
      * Defines whether or not to autoclear the stencil buffer.
      */
    var stencil: Boolean = js.native
  }
  object IRenderingManagerAutoClearSetup {
    
    @scala.inline
    def apply(autoClear: Boolean, depth: Boolean, stencil: Boolean): IRenderingManagerAutoClearSetup = {
      val __obj = js.Dynamic.literal(autoClear = autoClear.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRenderingManagerAutoClearSetup]
    }
    
    @scala.inline
    implicit class IRenderingManagerAutoClearSetupMutableBuilder[Self <: IRenderingManagerAutoClearSetup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClear(value: Boolean): Self = StObject.set(x, "autoClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    }
  }
}

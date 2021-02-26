package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.anon.AdditiveAnimations
import typingsSlinky.babylonjs.anon.Animations
import typingsSlinky.babylonjs.anon.PartialIEnvironmentHelper
import typingsSlinky.babylonjs.iphysicsengineMod.IPhysicsEngine
import typingsSlinky.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import typingsSlinky.babylonjs.rayMod.TrianglePickingPredicate
import typingsSlinky.babylonjs.spriteManagerMod.ISpriteManager
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.babylonjs.vrExperienceHelperMod.VRExperienceHelperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsSceneAugmentingMod {
  
  @js.native
  trait Scene extends StObject {
    
    /** @hidden (Backing field) */
    var _boundingBoxRenderer: typingsSlinky.babylonjs.boundingBoxRendererMod.BoundingBoxRenderer = js.native
    
    /** @hidden */
    var _cachedRayForTransform: typingsSlinky.babylonjs.rayMod.Ray = js.native
    
    /** @hidden */
    def _createMultiviewUbo(): Unit = js.native
    
    /**
      * @hidden
      * Backing field
      */
    var _debugLayer: typingsSlinky.babylonjs.debugLayerMod.DebugLayer = js.native
    
    /** @hidden (Backing field) */
    var _depthRenderer: org.scalablytyped.runtime.StringDictionary[typingsSlinky.babylonjs.depthRendererMod.DepthRenderer] = js.native
    
    /** @hidden */
    var _edgeRenderLineShader: Nullable[typingsSlinky.babylonjs.shaderMaterialMod.ShaderMaterial] = js.native
    
    /** @hidden (Backing field) */
    var _forceShowBoundingBoxes: Boolean = js.native
    
    /** @hidden */
    var _gamepadManager: Nullable[typingsSlinky.babylonjs.gamepadManagerMod.GamepadManager] = js.native
    
    /** @hidden (Backing field) */
    var _geometryBufferRenderer: Nullable[typingsSlinky.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer] = js.native
    
    /** @hidden */
    def _internalMultiPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ]
    ): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    def _internalMultiPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    def _internalMultiPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, Boolean]
    ): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    def _internalMultiPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, Boolean],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    
    /** @hidden */
    def _internalMultiPickSprites(ray: typingsSlinky.babylonjs.rayMod.Ray): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    def _internalMultiPickSprites(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.UndefOr[scala.Nothing],
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    def _internalMultiPickSprites(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean]
    ): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    def _internalMultiPickSprites(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean],
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    
    /** @hidden */
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ]
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: Boolean,
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, Boolean]
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, Boolean],
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, Boolean],
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, Boolean],
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, Boolean],
      fastCheck: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, Boolean],
      fastCheck: Boolean,
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, Boolean],
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPick(
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      predicate: js.Function1[/* mesh */ typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, Boolean],
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    
    /** @hidden */
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: js.UndefOr[scala.Nothing],
      skipBoundingInfo: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean,
      trianglePredicate: js.UndefOr[scala.Nothing],
      skipBoundingInfo: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      fastCheck: js.UndefOr[scala.Nothing],
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      fastCheck: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: js.UndefOr[scala.Nothing],
      skipBoundingInfo: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: js.UndefOr[scala.Nothing],
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: js.UndefOr[scala.Nothing],
      skipBoundingInfo: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickForMesh(
      pickingInfo: Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo],
      rayFunction: js.Function1[
          /* world */ typingsSlinky.babylonjs.mathVectorMod.Matrix, 
          typingsSlinky.babylonjs.rayMod.Ray
        ],
      mesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
      world: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      fastCheck: Boolean,
      onlyBoundingInfo: Boolean,
      trianglePredicate: TrianglePickingPredicate,
      skipBoundingInfo: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    
    /** @hidden */
    def _internalPickSprites(ray: typingsSlinky.babylonjs.rayMod.Ray): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickSprites(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: js.UndefOr[scala.Nothing],
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickSprites(ray: typingsSlinky.babylonjs.rayMod.Ray, predicate: js.UndefOr[scala.Nothing], fastCheck: Boolean): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickSprites(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: Boolean,
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickSprites(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean]
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickSprites(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean],
      fastCheck: js.UndefOr[scala.Nothing],
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickSprites(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean],
      fastCheck: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def _internalPickSprites(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean],
      fastCheck: Boolean,
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    
    /**
      * @hidden
      * Backing field
      */
    var _mainSoundTrack: typingsSlinky.babylonjs.soundTrackMod.SoundTrack = js.native
    
    /** @hidden */
    var _multiviewSceneUbo: Nullable[typingsSlinky.babylonjs.uniformBufferMod.UniformBuffer] = js.native
    
    /** @hidden */
    var _outlineRenderer: typingsSlinky.babylonjs.outlineRendererMod.OutlineRenderer = js.native
    
    /** @hidden (Backing field) */
    var _physicsEngine: Nullable[IPhysicsEngine] = js.native
    
    /** @hidden */
    var _physicsTimeAccumulator: Double = js.native
    
    /** @hidden */
    var _pickWithRayInverseMatrix: typingsSlinky.babylonjs.mathVectorMod.Matrix = js.native
    
    /** @hidden */
    var _pickedDownSprite: Nullable[typingsSlinky.babylonjs.spriteMod.Sprite] = js.native
    
    /** @hidden */
    var _pointerOverSprite: Nullable[typingsSlinky.babylonjs.spriteMod.Sprite] = js.native
    
    /** @hidden (Backing field) */
    var _postProcessRenderPipelineManager: typingsSlinky.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager = js.native
    
    /** @hidden */
    def _processLateAnimationBindings(): Unit = js.native
    
    /** @hidden */
    def _processLateAnimationBindingsForMatrices(holder: AdditiveAnimations): js.Any = js.native
    
    /** @hidden */
    def _processLateAnimationBindingsForQuaternions(holder: Animations, refQuaternion: typingsSlinky.babylonjs.mathVectorMod.Quaternion): typingsSlinky.babylonjs.mathVectorMod.Quaternion = js.native
    
    /** @hidden */
    def _registerTargetForLateAnimationBinding(
      runtimeAnimation: typingsSlinky.babylonjs.runtimeAnimationMod.RuntimeAnimation,
      originalValue: js.Any
    ): Unit = js.native
    
    /** @hidden */
    def _renderMultiviewToSingleView(camera: typingsSlinky.babylonjs.cameraMod.Camera): Unit = js.native
    
    /**
      * @hidden
      * Backing Filed
      */
    var _selectionOctree: typingsSlinky.babylonjs.octreeMod.Octree[typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh] = js.native
    
    /** @hidden (Backing field) */
    var _simplificationQueue: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationQueue = js.native
    
    /** @hidden */
    var _tempPickingRay: Nullable[typingsSlinky.babylonjs.rayMod.Ray] = js.native
    
    /** @hidden */
    var _tempSpritePickingRay: Nullable[typingsSlinky.babylonjs.rayMod.Ray] = js.native
    
    /** @hidden */
    var _transformMatrixR: typingsSlinky.babylonjs.mathVectorMod.Matrix = js.native
    
    /** @hidden */
    def _updateMultiviewUbo(): Unit = js.native
    def _updateMultiviewUbo(viewR: js.UndefOr[scala.Nothing], projectionR: typingsSlinky.babylonjs.mathVectorMod.Matrix): Unit = js.native
    def _updateMultiviewUbo(viewR: typingsSlinky.babylonjs.mathVectorMod.Matrix): Unit = js.native
    def _updateMultiviewUbo(
      viewR: typingsSlinky.babylonjs.mathVectorMod.Matrix,
      projectionR: typingsSlinky.babylonjs.mathVectorMod.Matrix
    ): Unit = js.native
    
    /**
      * Gets or sets if audio support is enabled
      * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
      */
    var audioEnabled: Boolean = js.native
    
    /**
      * Gets or sets custom audio listener position provider
      * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
      */
    var audioListenerPositionProvider: Nullable[js.Function0[typingsSlinky.babylonjs.mathVectorMod.Vector3]] = js.native
    
    /**
      * Gets or sets a refresh rate when using 3D audio positioning
      */
    var audioPositioningRefreshRate: Double = js.native
    
    /**
      * Will start the animation sequence of a given target
      * @param target defines the target
      * @param from defines from which frame should animation start
      * @param to defines until which frame should animation run.
      * @param loop defines if the animation loops
      * @param speedRatio defines the speed in which to run the animation (1.0 by default)
      * @param onAnimationEnd defines the function to be executed when the animation ends
      * @param animatable defines an animatable object. If not provided a new one will be created from the given params
      * @param stopCurrent defines if the current animations must be stopped first (true by default)
      * @param targetMask defines if the target should be animate if animations are present (this is called recursively on descendant animatables regardless of return value)
      * @param onAnimationLoop defines the callback to call when an animation loops
      * @param isAdditive defines whether the animation should be evaluated additively (false by default)
      * @returns the animatable object created for this animation
      */
    def beginAnimation(
      target: js.Any,
      from: Double,
      to: Double,
      loop: js.UndefOr[Boolean],
      speedRatio: js.UndefOr[Double],
      onAnimationEnd: js.UndefOr[js.Function0[Unit]],
      animatable: js.UndefOr[typingsSlinky.babylonjs.animatableMod.Animatable],
      stopCurrent: js.UndefOr[Boolean],
      targetMask: js.UndefOr[js.Function1[/* target */ js.Any, Boolean]],
      onAnimationLoop: js.UndefOr[js.Function0[Unit]],
      isAdditive: js.UndefOr[Boolean]
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    
    /**
      * Begin a new animation on a given node
      * @param target defines the target where the animation will take place
      * @param animations defines the list of animations to start
      * @param from defines the initial value
      * @param to defines the final value
      * @param loop defines if you want animation to loop (off by default)
      * @param speedRatio defines the speed ratio to apply to all animations
      * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
      * @param onAnimationLoop defines the callback to call when an animation loops
      * @param isAdditive defines whether the animation should be evaluated additively (false by default)
      * @returns the list of created animatables
      */
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit]
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit]
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit]
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit]
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit]
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit]
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit]
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit]
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    def beginDirectAnimation(
      target: js.Any,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    
    /**
      * Begin a new animation on a given node and its hierarchy
      * @param target defines the root node where the animation will take place
      * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used.
      * @param animations defines the list of animations to start
      * @param from defines the initial value
      * @param to defines the final value
      * @param loop defines if you want animation to loop (off by default)
      * @param speedRatio defines the speed ratio to apply to all animations
      * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
      * @param onAnimationLoop defines the callback to call when an animation loops
      * @param isAdditive defines whether the animation should be evaluated additively (false by default)
      * @returns the list of animatables created for all nodes
      */
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit]
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit]
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit]
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.UndefOr[scala.Nothing],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit]
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit]
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    def beginDirectHierarchyAnimation(
      target: typingsSlinky.babylonjs.nodeMod.Node,
      directDescendantsOnly: Boolean,
      animations: js.Array[typingsSlinky.babylonjs.animationMod.Animation],
      from: Double,
      to: Double,
      loop: Boolean,
      speedRatio: Double,
      onAnimationEnd: js.Function0[Unit],
      onAnimationLoop: js.Function0[Unit],
      isAdditive: Boolean
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    
    /**
      * Will start the animation sequence of a given target and its hierarchy
      * @param target defines the target
      * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used.
      * @param from defines from which frame should animation start
      * @param to defines until which frame should animation run.
      * @param loop defines if the animation loops
      * @param speedRatio defines the speed in which to run the animation (1.0 by default)
      * @param onAnimationEnd defines the function to be executed when the animation ends
      * @param animatable defines an animatable object. If not provided a new one will be created from the given params
      * @param stopCurrent defines if the current animations must be stopped first (true by default)
      * @param targetMask defines if the target should be animated if animations are present (this is called recursively on descendant animatables regardless of return value)
      * @param onAnimationLoop defines the callback to call when an animation loops
      * @param isAdditive defines whether the animation should be evaluated additively (false by default)
      * @returns the list of created animatables
      */
    def beginHierarchyAnimation(
      target: js.Any,
      directDescendantsOnly: Boolean,
      from: Double,
      to: Double,
      loop: js.UndefOr[Boolean],
      speedRatio: js.UndefOr[Double],
      onAnimationEnd: js.UndefOr[js.Function0[Unit]],
      animatable: js.UndefOr[typingsSlinky.babylonjs.animatableMod.Animatable],
      stopCurrent: js.UndefOr[Boolean],
      targetMask: js.UndefOr[js.Function1[/* target */ js.Any, Boolean]],
      onAnimationLoop: js.UndefOr[js.Function0[Unit]],
      isAdditive: js.UndefOr[Boolean]
    ): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    
    /**
      * Will start the animation sequence of a given target
      * @param target defines the target
      * @param from defines from which frame should animation start
      * @param to defines until which frame should animation run.
      * @param weight defines the weight to apply to the animation (1.0 by default)
      * @param loop defines if the animation loops
      * @param speedRatio defines the speed in which to run the animation (1.0 by default)
      * @param onAnimationEnd defines the function to be executed when the animation ends
      * @param animatable defines an animatable object. If not provided a new one will be created from the given params
      * @param targetMask defines if the target should be animated if animations are present (this is called recursively on descendant animatables regardless of return value)
      * @param onAnimationLoop defines the callback to call when an animation loops
      * @param isAdditive defines whether the animation should be evaluated additively (false by default)
      * @returns the animatable object created for this animation
      */
    def beginWeightedAnimation(
      target: js.Any,
      from: Double,
      to: Double,
      weight: Double,
      loop: js.UndefOr[Boolean],
      speedRatio: js.UndefOr[Double],
      onAnimationEnd: js.UndefOr[js.Function0[Unit]],
      animatable: js.UndefOr[typingsSlinky.babylonjs.animatableMod.Animatable],
      targetMask: js.UndefOr[js.Function1[/* target */ js.Any, Boolean]],
      onAnimationLoop: js.UndefOr[js.Function0[Unit]],
      isAdditive: js.UndefOr[Boolean]
    ): typingsSlinky.babylonjs.animatableMod.Animatable = js.native
    
    /**
      * Creates a default camera for the scene.
      * @see https://doc.babylonjs.com/How_To/Fast_Build#create-default-camera
      * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
      * @param replace has default false, when true replaces the active camera in the scene
      * @param attachCameraControls has default false, when true attaches camera controls to the canvas.
      */
    def createDefaultCamera(): Unit = js.native
    def createDefaultCamera(
      createArcRotateCamera: js.UndefOr[scala.Nothing],
      replace: js.UndefOr[scala.Nothing],
      attachCameraControls: Boolean
    ): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: js.UndefOr[scala.Nothing], replace: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: js.UndefOr[scala.Nothing], replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean, replace: js.UndefOr[scala.Nothing], attachCameraControls: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean, replace: Boolean): Unit = js.native
    def createDefaultCamera(createArcRotateCamera: Boolean, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    
    /**
      * Creates a default camera and a default light.
      * @see https://doc.babylonjs.com/how_to/Fast_Build#create-default-camera-or-light
      * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
      * @param replace has the default false, when true replaces the active camera/light in the scene
      * @param attachCameraControls has the default false, when true attaches camera controls to the canvas.
      */
    def createDefaultCameraOrLight(): Unit = js.native
    def createDefaultCameraOrLight(
      createArcRotateCamera: js.UndefOr[scala.Nothing],
      replace: js.UndefOr[scala.Nothing],
      attachCameraControls: Boolean
    ): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: js.UndefOr[scala.Nothing], replace: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: js.UndefOr[scala.Nothing], replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean, replace: js.UndefOr[scala.Nothing], attachCameraControls: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean, replace: Boolean): Unit = js.native
    def createDefaultCameraOrLight(createArcRotateCamera: Boolean, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
    
    /**
      * Creates a new environment
      * @see https://doc.babylonjs.com/How_To/Fast_Build#create-default-environment
      * @param options defines the options you can use to configure the environment
      * @returns the new EnvironmentHelper
      */
    def createDefaultEnvironment(): Nullable[typingsSlinky.babylonjs.environmentHelperMod.EnvironmentHelper] = js.native
    def createDefaultEnvironment(options: PartialIEnvironmentHelper): Nullable[typingsSlinky.babylonjs.environmentHelperMod.EnvironmentHelper] = js.native
    
    /**
      * Creates a default light for the scene.
      * @see https://doc.babylonjs.com/How_To/Fast_Build#create-default-light
      * @param replace has the default false, when true replaces the existing lights in the scene with a hemispheric light
      */
    def createDefaultLight(): Unit = js.native
    def createDefaultLight(replace: Boolean): Unit = js.native
    
    /**
      * Creates a new sky box
      * @see https://doc.babylonjs.com/how_to/Fast_Build#create-default-skybox
      * @param environmentTexture defines the texture to use as environment texture
      * @param pbr has default false which requires the StandardMaterial to be used, when true PBRMaterial must be used
      * @param scale defines the overall scale of the skybox
      * @param blur is only available when pbr is true, default is 0, no blur, maximum value is 1
      * @param setGlobalEnvTexture has default true indicating that scene.environmentTexture must match the current skybox texture
      * @returns a new mesh holding the sky box
      */
    def createDefaultSkybox(): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: js.UndefOr[scala.Nothing],
      scale: js.UndefOr[scala.Nothing],
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: js.UndefOr[scala.Nothing],
      scale: js.UndefOr[scala.Nothing],
      blur: Double
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: js.UndefOr[scala.Nothing],
      scale: js.UndefOr[scala.Nothing],
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: js.UndefOr[scala.Nothing], pbr: js.UndefOr[scala.Nothing], scale: Double): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: js.UndefOr[scala.Nothing],
      scale: Double,
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: js.UndefOr[scala.Nothing],
      scale: Double,
      blur: Double
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: js.UndefOr[scala.Nothing],
      scale: Double,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: js.UndefOr[scala.Nothing], pbr: Boolean): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: Boolean,
      scale: js.UndefOr[scala.Nothing],
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: Boolean,
      scale: js.UndefOr[scala.Nothing],
      blur: Double
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: Boolean,
      scale: js.UndefOr[scala.Nothing],
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: js.UndefOr[scala.Nothing], pbr: Boolean, scale: Double): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: Boolean,
      scale: Double,
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: js.UndefOr[scala.Nothing], pbr: Boolean, scale: Double, blur: Double): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: js.UndefOr[scala.Nothing],
      pbr: Boolean,
      scale: Double,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
      pbr: js.UndefOr[scala.Nothing],
      scale: js.UndefOr[scala.Nothing],
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
      pbr: js.UndefOr[scala.Nothing],
      scale: js.UndefOr[scala.Nothing],
      blur: Double
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
      pbr: js.UndefOr[scala.Nothing],
      scale: js.UndefOr[scala.Nothing],
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
      pbr: js.UndefOr[scala.Nothing],
      scale: Double
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
      pbr: js.UndefOr[scala.Nothing],
      scale: Double,
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
      pbr: js.UndefOr[scala.Nothing],
      scale: Double,
      blur: Double
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
      pbr: js.UndefOr[scala.Nothing],
      scale: Double,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture, pbr: Boolean): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
      pbr: Boolean,
      scale: js.UndefOr[scala.Nothing],
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
      pbr: Boolean,
      scale: js.UndefOr[scala.Nothing],
      blur: Double
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
      pbr: Boolean,
      scale: js.UndefOr[scala.Nothing],
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
      pbr: Boolean,
      scale: Double
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
      pbr: Boolean,
      scale: Double,
      blur: js.UndefOr[scala.Nothing],
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
      pbr: Boolean,
      scale: Double,
      blur: Double
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    def createDefaultSkybox(
      environmentTexture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture,
      pbr: Boolean,
      scale: Double,
      blur: Double,
      setGlobalEnvTexture: Boolean
    ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
    
    /**
      * Creates a new VREXperienceHelper
      * @see https://doc.babylonjs.com/how_to/webvr_helper
      * @param webVROptions defines the options used to create the new VREXperienceHelper
      * @returns a new VREXperienceHelper
      */
    def createDefaultVRExperience(): typingsSlinky.babylonjs.vrExperienceHelperMod.VRExperienceHelper = js.native
    def createDefaultVRExperience(webVROptions: VRExperienceHelperOptions): typingsSlinky.babylonjs.vrExperienceHelperMod.VRExperienceHelper = js.native
    
    /**
      * Creates a new WebXRDefaultExperience
      * @see https://doc.babylonjs.com/how_to/introduction_to_webxr
      * @param options experience options
      * @returns a promise for a new WebXRDefaultExperience
      */
    def createDefaultXRExperienceAsync(options: typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperienceOptions): js.Promise[typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience] = js.native
    
    /**
      * Creates or updates the octree used to boost selection (picking)
      * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
      * @param maxCapacity defines the maximum capacity per leaf
      * @param maxDepth defines the maximum depth of the octree
      * @returns an octree of AbstractMesh
      */
    def createOrUpdateSelectionOctree(): typingsSlinky.babylonjs.octreeMod.Octree[typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh] = js.native
    def createOrUpdateSelectionOctree(maxCapacity: js.UndefOr[scala.Nothing], maxDepth: Double): typingsSlinky.babylonjs.octreeMod.Octree[typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh] = js.native
    def createOrUpdateSelectionOctree(maxCapacity: Double): typingsSlinky.babylonjs.octreeMod.Octree[typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh] = js.native
    def createOrUpdateSelectionOctree(maxCapacity: Double, maxDepth: Double): typingsSlinky.babylonjs.octreeMod.Octree[typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh] = js.native
    
    /**
      * Gets the debug layer (aka Inspector) associated with the scene
      * @see https://doc.babylonjs.com/features/playground_debuglayer
      */
    var debugLayer: typingsSlinky.babylonjs.debugLayerMod.DebugLayer = js.native
    
    /**
      * Deletes a physics compound impostor
      * @param compound defines the compound to delete
      */
    def deleteCompoundImpostor(compound: js.Any): Unit = js.native
    
    /**
      * Gets the current delta time used by animation engine
      */
    var deltaTime: Double = js.native
    
    /**
      * Disables a depth renderer for a given camera
      * @param camera The camera to disable the depth renderer on (default: scene's active camera)
      */
    def disableDepthRenderer(): Unit = js.native
    def disableDepthRenderer(camera: Nullable[typingsSlinky.babylonjs.cameraMod.Camera]): Unit = js.native
    
    /**
      * Disables the GeometryBufferRender associated with the scene
      */
    def disableGeometryBufferRenderer(): Unit = js.native
    
    /**
      * Disables and disposes the physics engine associated with the scene
      */
    def disablePhysicsEngine(): Unit = js.native
    
    /**
      * Creates a depth renderer a given camera which contains a depth map which can be used for post processing.
      * @param camera The camera to create the depth renderer on (default: scene's active camera)
      * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
      * @param force32bitsFloat Forces 32 bits float when supported (else 16 bits float is prioritized over 32 bits float if supported)
      * @returns the created depth renderer
      */
    def enableDepthRenderer(): typingsSlinky.babylonjs.depthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: js.UndefOr[Nullable[typingsSlinky.babylonjs.cameraMod.Camera]],
      storeNonLinearDepth: js.UndefOr[scala.Nothing],
      force32bitsFloat: Boolean
    ): typingsSlinky.babylonjs.depthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: js.UndefOr[Nullable[typingsSlinky.babylonjs.cameraMod.Camera]],
      storeNonLinearDepth: Boolean
    ): typingsSlinky.babylonjs.depthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(
      camera: js.UndefOr[Nullable[typingsSlinky.babylonjs.cameraMod.Camera]],
      storeNonLinearDepth: Boolean,
      force32bitsFloat: Boolean
    ): typingsSlinky.babylonjs.depthRendererMod.DepthRenderer = js.native
    def enableDepthRenderer(camera: Nullable[typingsSlinky.babylonjs.cameraMod.Camera]): typingsSlinky.babylonjs.depthRendererMod.DepthRenderer = js.native
    
    /**
      * Enables a GeometryBufferRender and associates it with the scene
      * @param ratio defines the scaling ratio to apply to the renderer (1 by default which means same resolution)
      * @returns the GeometryBufferRenderer
      */
    def enableGeometryBufferRenderer(): Nullable[typingsSlinky.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer] = js.native
    def enableGeometryBufferRenderer(ratio: Double): Nullable[typingsSlinky.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer] = js.native
    
    /**
      * Enables physics to the current scene
      * @param gravity defines the scene's gravity for the physics engine
      * @param plugin defines the physics engine to be used. defaults to OimoJS.
      * @return a boolean indicating if the physics engine was initialized
      */
    def enablePhysics(gravity: Nullable[typingsSlinky.babylonjs.mathVectorMod.Vector3]): Boolean = js.native
    def enablePhysics(gravity: Nullable[typingsSlinky.babylonjs.mathVectorMod.Vector3], plugin: IPhysicsEnginePlugin): Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if all bounding boxes must be rendered
      */
    var forceShowBoundingBoxes: Boolean = js.native
    
    /**
      * Gets the gamepad manager associated with the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_gamepads
      */
    var gamepadManager: typingsSlinky.babylonjs.gamepadManagerMod.GamepadManager = js.native
    
    /**
      * Gets or Sets the current geometry buffer associated to the scene.
      */
    var geometryBufferRenderer: Nullable[typingsSlinky.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer] = js.native
    
    /**
      * Gets all animatables associated with a given target
      * @param target defines the target to look animatables for
      * @returns an array of Animatables
      */
    def getAllAnimatablesByTarget(target: js.Any): js.Array[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    
    /**
      * Gets the animatable associated with a specific target
      * @param target defines the target of the animatable
      * @returns the required animatable if found
      */
    def getAnimatableByTarget(target: js.Any): Nullable[typingsSlinky.babylonjs.animatableMod.Animatable] = js.native
    
    /**
      * Gets the bounding box renderer associated with the scene
      * @returns a BoundingBoxRenderer
      */
    def getBoundingBoxRenderer(): typingsSlinky.babylonjs.boundingBoxRendererMod.BoundingBoxRenderer = js.native
    
    /**
      * Gets the outline renderer associated with the scene
      * @returns a OutlineRenderer
      */
    def getOutlineRenderer(): typingsSlinky.babylonjs.outlineRendererMod.OutlineRenderer = js.native
    
    /**
      * Gets the current physics engine
      * @returns a IPhysicsEngine or null if none attached
      */
    def getPhysicsEngine(): Nullable[IPhysicsEngine] = js.native
    
    /**
      * Gets the sprite under the pointer
      * @returns a Sprite or null if no sprite is under the pointer
      */
    def getPointerOverSprite(): Nullable[typingsSlinky.babylonjs.spriteMod.Sprite] = js.native
    
    /**
      * Gets a sound using a given name
      * @param name defines the name to search for
      * @return the found sound or null if not found at all.
      */
    def getSoundByName(name: String): Nullable[typingsSlinky.babylonjs.soundMod.Sound] = js.native
    
    /**
      * Gets or sets if audio will be output to headphones
      * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
      */
    var headphone: Boolean = js.native
    
    /**
      * Gets a boolean indicating if there is an active physics engine
      * @returns a boolean indicating if there is an active physics engine
      */
    def isPhysicsEnabled(): Boolean = js.native
    
    /**
      * The main sound track played by the scene.
      * It cotains your primary collection of sounds.
      */
    var mainSoundTrack: typingsSlinky.babylonjs.soundTrackMod.SoundTrack = js.native
    
    /** Launch a ray to try to pick sprites in the scene
      * @param x position on screen
      * @param y position on screen
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo array
      */
    def multiPickSprite(x: Double, y: Double): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    def multiPickSprite(
      x: Double,
      y: Double,
      predicate: js.UndefOr[scala.Nothing],
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    def multiPickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean]
    ): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    def multiPickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean],
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    
    /** Use the given ray to pick sprites in the scene
      * @param ray The ray (in world space) to use to pick meshes
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo array
      */
    def multiPickSpriteWithRay(ray: typingsSlinky.babylonjs.rayMod.Ray): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    def multiPickSpriteWithRay(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.UndefOr[scala.Nothing],
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    def multiPickSpriteWithRay(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean]
    ): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    def multiPickSpriteWithRay(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean],
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[js.Array[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]] = js.native
    
    /**
      * An event triggered when physic simulation has been done
      */
    var onAfterPhysicsObservable: typingsSlinky.babylonjs.observableMod.Observable[
        typingsSlinky.babylonjs.physicsEngineComponentMod.babylonjsSceneAugmentingMod.Scene
      ] = js.native
    
    /**
      * An event triggered when sprites rendering is done
      * Note: This event can be trigger more than once per frame (because sprites can be rendered by render target textures as well)
      */
    var onAfterSpritesRenderingObservable: typingsSlinky.babylonjs.observableMod.Observable[
        typingsSlinky.babylonjs.spriteSceneComponentMod.babylonjsSceneAugmentingMod.Scene
      ] = js.native
    
    /**
      * An event triggered when physic simulation is about to be run
      */
    var onBeforePhysicsObservable: typingsSlinky.babylonjs.observableMod.Observable[
        typingsSlinky.babylonjs.physicsEngineComponentMod.babylonjsSceneAugmentingMod.Scene
      ] = js.native
    
    /**
      * An event triggered when sprites rendering is about to start
      * Note: This event can be trigger more than once per frame (because sprites can be rendered by render target textures as well)
      */
    var onBeforeSpritesRenderingObservable: typingsSlinky.babylonjs.observableMod.Observable[
        typingsSlinky.babylonjs.spriteSceneComponentMod.babylonjsSceneAugmentingMod.Scene
      ] = js.native
    
    /** Launch a ray to try to pick a sprite in the scene
      * @param x position on screen
      * @param y position on screen
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param fastCheck defines if the first intersection will be used (and not the closest)
      * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo
      */
    def pickSprite(x: Double, y: Double): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: js.UndefOr[scala.Nothing],
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def pickSprite(x: Double, y: Double, predicate: js.UndefOr[scala.Nothing], fastCheck: Boolean): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: Boolean,
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean]
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean],
      fastCheck: js.UndefOr[scala.Nothing],
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean],
      fastCheck: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def pickSprite(
      x: Double,
      y: Double,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean],
      fastCheck: Boolean,
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    
    /** Use the given ray to pick a sprite in the scene
      * @param ray The ray (in world space) to use to pick meshes
      * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
      * @param fastCheck defines if the first intersection will be used (and not the closest)
      * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
      * @returns a PickingInfo
      */
    def pickSpriteWithRay(ray: typingsSlinky.babylonjs.rayMod.Ray): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def pickSpriteWithRay(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: js.UndefOr[scala.Nothing],
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def pickSpriteWithRay(ray: typingsSlinky.babylonjs.rayMod.Ray, predicate: js.UndefOr[scala.Nothing], fastCheck: Boolean): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def pickSpriteWithRay(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.UndefOr[scala.Nothing],
      fastCheck: Boolean,
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def pickSpriteWithRay(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean]
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def pickSpriteWithRay(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean],
      fastCheck: js.UndefOr[scala.Nothing],
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def pickSpriteWithRay(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean],
      fastCheck: Boolean
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    def pickSpriteWithRay(
      ray: typingsSlinky.babylonjs.rayMod.Ray,
      predicate: js.Function1[/* sprite */ typingsSlinky.babylonjs.spriteMod.Sprite, Boolean],
      fastCheck: Boolean,
      camera: typingsSlinky.babylonjs.cameraMod.Camera
    ): Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo] = js.native
    
    /**
      * Gets the postprocess render pipeline manager
      * @see https://doc.babylonjs.com/how_to/how_to_use_postprocessrenderpipeline
      * @see https://doc.babylonjs.com/how_to/using_default_rendering_pipeline
      */
    val postProcessRenderPipelineManager: typingsSlinky.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager = js.native
    
    /**
      * Gets the octree used to boost mesh selection (picking)
      * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
      */
    var selectionOctree: typingsSlinky.babylonjs.octreeMod.Octree[typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh] = js.native
    
    /**
      * Force the sprite under the pointer
      * @param sprite defines the sprite to use
      */
    def setPointerOverSprite(sprite: Nullable[typingsSlinky.babylonjs.spriteMod.Sprite]): Unit = js.native
    
    /**
      * Gets or sets the simplification queue attached to the scene
      * @see https://doc.babylonjs.com/how_to/in-browser_mesh_simplification
      */
    var simplificationQueue: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationQueue = js.native
    
    /**
      * The list of sound tracks added to the scene
      * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
      */
    var soundTracks: Nullable[js.Array[typingsSlinky.babylonjs.soundTrackMod.SoundTrack]] = js.native
    
    /**
      * All of the sprite managers added to this scene
      * @see https://doc.babylonjs.com/babylon101/sprites
      */
    var spriteManagers: js.Array[ISpriteManager] = js.native
    
    /**
      * Stops and removes all animations that have been applied to the scene
      */
    def stopAllAnimations(): Unit = js.native
  }
}

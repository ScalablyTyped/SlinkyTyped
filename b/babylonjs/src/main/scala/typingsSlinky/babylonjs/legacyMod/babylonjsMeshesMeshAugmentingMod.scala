package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.anon.Data
import typingsSlinky.babylonjs.anon.DeepImmutableObjectMatrix
import typingsSlinky.babylonjs.iparticlesystemMod.IParticleSystem
import typingsSlinky.babylonjs.meshSimplificationMod.ISimplificationSettings
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/Legacy/legacy", "babylonjs/Meshes/mesh")
@js.native
object babylonjsMeshesMeshAugmentingMod extends js.Object {
  
  @js.native
  trait Mesh extends js.Object {
    
    /** @hidden */
    def _thinInstanceInitializeUserStorage(): Unit = js.native
    
    /** @hidden */
    def _thinInstanceUpdateBufferSize(kind: String, numInstances: Double): Unit = js.native
    
    /** @hidden */
    var _userInstancedBuffersStorage: Data = js.native
    
    /** @hidden */
    var _userThinInstanceBuffersStorage: Data = js.native
    
    /**
      * true to use the edge renderer for all instances of this mesh
      */
    var edgesShareWithInstances: Boolean = js.native
    
    /**
      * Returns an array populated with IParticleSystem objects whose the mesh is the emitter
      * @returns an array of IParticleSystem
      */
    def getEmittedParticleSystems(): js.Array[IParticleSystem] = js.native
    
    /**
      * Returns an array populated with IParticleSystem objects whose the mesh or its children are the emitter
      * @returns an array of IParticleSystem
      */
    def getHierarchyEmittedParticleSystems(): js.Array[IParticleSystem] = js.native
    
    /**
      * Register a custom buffer that will be instanced
      * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
      * @param kind defines the buffer kind
      * @param stride defines the stride in floats
      */
    def registerInstancedBuffer(kind: String, stride: Double): Unit = js.native
    
    /**
      * Simplify the mesh according to the given array of settings.
      * Function will return immediately and will simplify async
      * @param settings a collection of simplification settings
      * @param parallelProcessing should all levels calculate parallel or one after the other
      * @param simplificationType the type of simplification to run
      * @param successCallback optional success callback to be called after the simplification finished processing all settings
      * @returns the current mesh
      */
    def simplify(settings: js.Array[ISimplificationSettings]): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: js.UndefOr[scala.Nothing],
      simplificationType: js.UndefOr[scala.Nothing],
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: js.UndefOr[scala.Nothing],
      simplificationType: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationType
    ): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: js.UndefOr[scala.Nothing],
      simplificationType: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationType,
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(settings: js.Array[ISimplificationSettings], parallelProcessing: Boolean): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Boolean,
      simplificationType: js.UndefOr[scala.Nothing],
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Boolean,
      simplificationType: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationType
    ): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Boolean,
      simplificationType: typingsSlinky.babylonjs.meshSimplificationMod.SimplificationType,
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typingsSlinky.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    
    def thinInstanceAdd(matrix: js.Array[DeepImmutableObjectMatrix], refresh: Boolean): Double = js.native
    /**
      * Creates a new thin instance
      * @param matrix the matrix or array of matrices (position, rotation, scale) of the thin instance(s) to create
      * @param refresh true to refresh the underlying gpu buffer (default: true). If you do multiple calls to this method in a row, set refresh to true only for the last call to save performance
      * @returns the thin instance index number. If you pass an array of matrices, other instance indexes are index+1, index+2, etc
      */
    def thinInstanceAdd(matrix: DeepImmutableObjectMatrix, refresh: Boolean): Double = js.native
    
    /**
      * Adds the transformation (matrix) of the current mesh as a thin instance
      * @param refresh true to refresh the underlying gpu buffer (default: true). If you do multiple calls to this method in a row, set refresh to true only for the last call to save performance
      * @returns the thin instance index number
      */
    def thinInstanceAddSelf(refresh: Boolean): Double = js.native
    
    /**
      * Synchronize the gpu buffers with a thin instance buffer. Call this method if you update later on the buffers passed to thinInstanceSetBuffer
      * @param kind name of the attribute to update. Use "matrix" to update the buffer of matrices
      */
    def thinInstanceBufferUpdated(kind: String): Unit = js.native
    
    /**
      * Gets / sets the number of thin instances to display. Note that you can't set a number higher than what the underlying buffer can handle.
      */
    var thinInstanceCount: Double = js.native
    
    /**
      * Gets or sets a boolean defining if we want picking to pick thin instances as well
      */
    var thinInstanceEnablePicking: Boolean = js.native
    
    /**
      * Gets the list of world matrices
      * @return an array containing all the world matrices from the thin instances
      */
    def thinInstanceGetWorldMatrices(): js.Array[typingsSlinky.babylonjs.mathVectorMod.Matrix] = js.native
    
    /**
      * Applies a partial update to a buffer directly on the GPU
      * Note that the buffer located on the CPU is NOT updated! It's up to you to update it (or not) with the same data you pass to this method
      * @param kind name of the attribute to update. Use "matrix" to update the buffer of matrices
      * @param data the data to set in the GPU buffer
      * @param offset the offset in the GPU buffer where to update the data
      */
    def thinInstancePartialBufferUpdate(kind: String, data: js.typedarray.Float32Array, offset: Double): Unit = js.native
    
    /**
      * Refreshes the bounding info, taking into account all the thin instances defined
      * @param forceRefreshParentInfo true to force recomputing the mesh bounding info and use it to compute the aggregated bounding info
      */
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Boolean): Unit = js.native
    
    /**
      * Registers a custom attribute to be used with thin instances
      * @param kind name of the attribute
      * @param stride size in floats of the attribute
      */
    def thinInstanceRegisterAttribute(kind: String, stride: Double): Unit = js.native
    
    /**
      * Sets the value of a custom attribute for a thin instance
      * @param kind name of the attribute
      * @param index index of the thin instance
      * @param value value to set
      * @param refresh true to refresh the underlying gpu buffer (default: true). If you do multiple calls to this method in a row, set refresh to true only for the last call to save performance
      */
    def thinInstanceSetAttributeAt(kind: String, index: Double, value: js.Array[Double], refresh: Boolean): Unit = js.native
    
    /**
      * Sets a buffer to be used with thin instances. This method is a faster way to setup multiple instances than calling thinInstanceAdd repeatedly
      * @param kind name of the attribute. Use "matrix" to setup the buffer of matrices
      * @param buffer buffer to set
      * @param stride size in floats of each value of the buffer
      * @param staticBuffer indicates that the buffer is static, so that you won't change it after it is set (better performances - false by default)
      */
    def thinInstanceSetBuffer(kind: String, buffer: Nullable[js.typedarray.Float32Array], stride: Double, staticBuffer: Boolean): Unit = js.native
    
    /**
      * Sets the matrix of a thin instance
      * @param index index of the thin instance
      * @param matrix matrix to set
      * @param refresh true to refresh the underlying gpu buffer (default: true). If you do multiple calls to this method in a row, set refresh to true only for the last call to save performance
      */
    def thinInstanceSetMatrixAt(index: Double, matrix: DeepImmutableObjectMatrix, refresh: Boolean): Unit = js.native
  }
}

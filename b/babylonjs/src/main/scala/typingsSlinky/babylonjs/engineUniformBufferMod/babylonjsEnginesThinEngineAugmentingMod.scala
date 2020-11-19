package typingsSlinky.babylonjs.engineUniformBufferMod

import typingsSlinky.babylonjs.dataBufferMod.DataBuffer
import typingsSlinky.babylonjs.ipipelinecontextMod.IPipelineContext
import typingsSlinky.babylonjs.typesMod.FloatArray
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/Engines/thinEngine", JSImport.Namespace)
@js.native
object babylonjsEnginesThinEngineAugmentingMod extends js.Object {
  
  @js.native
  trait ThinEngine extends js.Object {
    
    /**
      * Bind a specific block at a given index in a specific shader program
      * @param pipelineContext defines the pipeline context to use
      * @param blockName defines the block name
      * @param index defines the index where to bind the block
      */
    def bindUniformBlock(pipelineContext: IPipelineContext, blockName: String, index: Double): Unit = js.native
    
    /**
      * Bind an uniform buffer to the current webGL context
      * @param buffer defines the buffer to bind
      */
    def bindUniformBuffer(buffer: Nullable[DataBuffer]): Unit = js.native
    
    /**
      * Bind a buffer to the current webGL context at a given location
      * @param buffer defines the buffer to bind
      * @param location defines the index where to bind the buffer
      */
    def bindUniformBufferBase(buffer: DataBuffer, location: Double): Unit = js.native
    
    /**
      * Create a dynamic uniform buffer
      * @see http://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
      * @param elements defines the content of the uniform buffer
      * @returns the webGL uniform buffer
      */
    def createDynamicUniformBuffer(elements: FloatArray): DataBuffer = js.native
    
    /**
      * Create an uniform buffer
      * @see http://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
      * @param elements defines the content of the uniform buffer
      * @returns the webGL uniform buffer
      */
    def createUniformBuffer(elements: FloatArray): DataBuffer = js.native
    
    /**
      * Update an existing uniform buffer
      * @see http://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
      * @param uniformBuffer defines the target uniform buffer
      * @param elements defines the content to update
      * @param offset defines the offset in the uniform buffer where update should start
      * @param count defines the size of the data to update
      */
    def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray): Unit = js.native
    def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: js.UndefOr[scala.Nothing], count: Double): Unit = js.native
    def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Double): Unit = js.native
    def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Double, count: Double): Unit = js.native
  }
}

package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buffer extends StObject {
  
  var _buffer: js.Any = js.native
  
  /** @hidden */
  var _data: Nullable[DataArray] = js.native
  
  var _divisor: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  /** @hidden */
  def _increaseReferences(): Unit = js.native
  
  var _instanced: js.Any = js.native
  
  var _isAlreadyOwned: js.Any = js.native
  
  /** @hidden */
  def _rebuild(): Unit = js.native
  
  var _updatable: js.Any = js.native
  
  /**
    * Gets the byte stride.
    */
  val byteStride: Double = js.native
  
  /**
    * Store data into the buffer. If the buffer was already used it will be either recreated or updated depending on isUpdatable property
    * @param data defines the data to store
    */
  def create(): Unit = js.native
  def create(data: Nullable[DataArray]): Unit = js.native
  
  /**
    * Create a new VertexBuffer based on the current buffer
    * @param kind defines the vertex buffer kind (position, normal, etc.)
    * @param offset defines offset in the buffer (0 by default)
    * @param size defines the size in floats of attributes (position is 3 for instance)
    * @param stride defines the stride size in floats in the buffer (the offset to apply to reach next value when data is interleaved)
    * @param instanced defines if the vertex buffer contains indexed data
    * @param useBytes defines if the offset and stride are in bytes     *
    * @param divisor sets an optional divisor for instances (1 by default)
    * @returns the new vertex buffer
    */
  def createVertexBuffer(kind: String, offset: Double, size: Double): VertexBuffer = js.native
  def createVertexBuffer(
    kind: String,
    offset: Double,
    size: Double,
    stride: js.UndefOr[scala.Nothing],
    instanced: js.UndefOr[scala.Nothing],
    useBytes: js.UndefOr[scala.Nothing],
    divisor: Double
  ): VertexBuffer = js.native
  def createVertexBuffer(
    kind: String,
    offset: Double,
    size: Double,
    stride: js.UndefOr[scala.Nothing],
    instanced: js.UndefOr[scala.Nothing],
    useBytes: Boolean
  ): VertexBuffer = js.native
  def createVertexBuffer(
    kind: String,
    offset: Double,
    size: Double,
    stride: js.UndefOr[scala.Nothing],
    instanced: js.UndefOr[scala.Nothing],
    useBytes: Boolean,
    divisor: Double
  ): VertexBuffer = js.native
  def createVertexBuffer(kind: String, offset: Double, size: Double, stride: js.UndefOr[scala.Nothing], instanced: Boolean): VertexBuffer = js.native
  def createVertexBuffer(
    kind: String,
    offset: Double,
    size: Double,
    stride: js.UndefOr[scala.Nothing],
    instanced: Boolean,
    useBytes: js.UndefOr[scala.Nothing],
    divisor: Double
  ): VertexBuffer = js.native
  def createVertexBuffer(
    kind: String,
    offset: Double,
    size: Double,
    stride: js.UndefOr[scala.Nothing],
    instanced: Boolean,
    useBytes: Boolean
  ): VertexBuffer = js.native
  def createVertexBuffer(
    kind: String,
    offset: Double,
    size: Double,
    stride: js.UndefOr[scala.Nothing],
    instanced: Boolean,
    useBytes: Boolean,
    divisor: Double
  ): VertexBuffer = js.native
  def createVertexBuffer(kind: String, offset: Double, size: Double, stride: Double): VertexBuffer = js.native
  def createVertexBuffer(
    kind: String,
    offset: Double,
    size: Double,
    stride: Double,
    instanced: js.UndefOr[scala.Nothing],
    useBytes: js.UndefOr[scala.Nothing],
    divisor: Double
  ): VertexBuffer = js.native
  def createVertexBuffer(
    kind: String,
    offset: Double,
    size: Double,
    stride: Double,
    instanced: js.UndefOr[scala.Nothing],
    useBytes: Boolean
  ): VertexBuffer = js.native
  def createVertexBuffer(
    kind: String,
    offset: Double,
    size: Double,
    stride: Double,
    instanced: js.UndefOr[scala.Nothing],
    useBytes: Boolean,
    divisor: Double
  ): VertexBuffer = js.native
  def createVertexBuffer(kind: String, offset: Double, size: Double, stride: Double, instanced: Boolean): VertexBuffer = js.native
  def createVertexBuffer(
    kind: String,
    offset: Double,
    size: Double,
    stride: Double,
    instanced: Boolean,
    useBytes: js.UndefOr[scala.Nothing],
    divisor: Double
  ): VertexBuffer = js.native
  def createVertexBuffer(kind: String, offset: Double, size: Double, stride: Double, instanced: Boolean, useBytes: Boolean): VertexBuffer = js.native
  def createVertexBuffer(
    kind: String,
    offset: Double,
    size: Double,
    stride: Double,
    instanced: Boolean,
    useBytes: Boolean,
    divisor: Double
  ): VertexBuffer = js.native
  
  /**
    * Release all resources
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets underlying native buffer
    * @returns underlying native buffer
    */
  def getBuffer(): Nullable[DataBuffer] = js.native
  
  /**
    * Gets current buffer's data
    * @returns a DataArray or null
    */
  def getData(): Nullable[DataArray] = js.native
  
  /**
    * Gets the stride in float32 units (i.e. byte stride / 4).
    * May not be an integer if the byte stride is not divisible by 4.
    * @returns the stride in float32 units
    * @deprecated Please use byteStride instead.
    */
  def getStrideSize(): Double = js.native
  
  /**
    * Gets a boolean indicating if the Buffer is updatable?
    * @returns true if the buffer is updatable
    */
  def isUpdatable(): Boolean = js.native
  
  /**
    * Update current buffer data
    * @param data defines the data to store
    */
  def update(data: DataArray): Unit = js.native
  
  /**
    * Updates the data directly.
    * @param data the new data
    * @param offset the new offset
    * @param vertexCount the vertex count (optional)
    * @param useBytes set to true if the offset is in bytes
    */
  def updateDirectly(data: DataArray, offset: Double): Unit = js.native
  def updateDirectly(data: DataArray, offset: Double, vertexCount: js.UndefOr[scala.Nothing], useBytes: Boolean): Unit = js.native
  def updateDirectly(data: DataArray, offset: Double, vertexCount: Double): Unit = js.native
  def updateDirectly(data: DataArray, offset: Double, vertexCount: Double, useBytes: Boolean): Unit = js.native
}

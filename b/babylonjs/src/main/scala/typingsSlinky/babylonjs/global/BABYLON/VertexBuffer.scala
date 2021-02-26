package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.DataArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VertexBuffer")
@js.native
class VertexBuffer protected ()
  extends typingsSlinky.babylonjs.BABYLON.VertexBuffer {
  /**
    * Constructor
    * @param engine the engine
    * @param data the data to use for this vertex buffer
    * @param kind the vertex buffer kind
    * @param updatable whether the data is updatable
    * @param postponeInternalCreation whether to postpone creating the internal WebGL buffer (optional)
    * @param stride the stride (optional)
    * @param instanced whether the buffer is instanced (optional)
    * @param offset the offset of the data (optional)
    * @param size the number of components (optional)
    * @param type the type of the component (optional)
    * @param normalized whether the data contains normalized data (optional)
    * @param useBytes set to true if stride and offset are in bytes (optional)
    * @param divisor defines the instance divisor to use (1 by default)
    * @param takeBufferOwnership defines if the buffer should be released when the vertex buffer is disposed
    */
  def this(
    engine: js.Any,
    data: DataArray | typingsSlinky.babylonjs.BABYLON.Buffer,
    kind: String,
    updatable: Boolean,
    postponeInternalCreation: js.UndefOr[Boolean],
    stride: js.UndefOr[Double],
    instanced: js.UndefOr[Boolean],
    offset: js.UndefOr[Double],
    size: js.UndefOr[Double],
    `type`: js.UndefOr[Double],
    normalized: js.UndefOr[Boolean],
    useBytes: js.UndefOr[Boolean],
    divisor: js.UndefOr[Double],
    takeBufferOwnership: js.UndefOr[Boolean]
  ) = this()
}
/* static members */
object VertexBuffer {
  
  @JSGlobal("BABYLON.VertexBuffer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The byte type.
    */
  @JSGlobal("BABYLON.VertexBuffer.BYTE")
  @js.native
  val BYTE: Double = js.native
  
  /**
    * Colors
    */
  @JSGlobal("BABYLON.VertexBuffer.ColorKind")
  @js.native
  val ColorKind: String = js.native
  
  /**
    * Deduces the stride given a kind.
    * @param kind The kind string to deduce
    * @returns The deduced stride
    */
  @JSGlobal("BABYLON.VertexBuffer.DeduceStride")
  @js.native
  def DeduceStride(kind: String): Double = js.native
  
  /**
    * The float type.
    */
  @JSGlobal("BABYLON.VertexBuffer.FLOAT")
  @js.native
  val FLOAT: Double = js.native
  
  /**
    * Enumerates each value of the given parameters as numbers.
    * @param data the data to enumerate
    * @param byteOffset the byte offset of the data
    * @param byteStride the byte stride of the data
    * @param componentCount the number of components per element
    * @param componentType the type of the component
    * @param count the number of values to enumerate
    * @param normalized whether the data is normalized
    * @param callback the callback function called for each value
    */
  @JSGlobal("BABYLON.VertexBuffer.ForEach")
  @js.native
  def ForEach(
    data: DataArray,
    byteOffset: Double,
    byteStride: Double,
    componentCount: Double,
    componentType: Double,
    count: Double,
    normalized: Boolean,
    callback: js.Function2[/* value */ Double, /* index */ Double, Unit]
  ): Unit = js.native
  
  /**
    * Gets the byte length of the given type.
    * @param type the type
    * @returns the number of bytes
    */
  @JSGlobal("BABYLON.VertexBuffer.GetTypeByteLength")
  @js.native
  def GetTypeByteLength(`type`: Double): Double = js.native
  
  /**
    * The integer type.
    */
  @JSGlobal("BABYLON.VertexBuffer.INT")
  @js.native
  val INT: Double = js.native
  
  /**
    * Additional matrix indices (for bones)
    */
  @JSGlobal("BABYLON.VertexBuffer.MatricesIndicesExtraKind")
  @js.native
  val MatricesIndicesExtraKind: String = js.native
  
  /**
    * Matrix indices (for bones)
    */
  @JSGlobal("BABYLON.VertexBuffer.MatricesIndicesKind")
  @js.native
  val MatricesIndicesKind: String = js.native
  
  /**
    * Additional matrix weights (for bones)
    */
  @JSGlobal("BABYLON.VertexBuffer.MatricesWeightsExtraKind")
  @js.native
  val MatricesWeightsExtraKind: String = js.native
  
  /**
    * Matrix weights (for bones)
    */
  @JSGlobal("BABYLON.VertexBuffer.MatricesWeightsKind")
  @js.native
  val MatricesWeightsKind: String = js.native
  
  /**
    * Normals
    */
  @JSGlobal("BABYLON.VertexBuffer.NormalKind")
  @js.native
  val NormalKind: String = js.native
  
  /**
    * Positions
    */
  @JSGlobal("BABYLON.VertexBuffer.PositionKind")
  @js.native
  val PositionKind: String = js.native
  
  /**
    * The short type.
    */
  @JSGlobal("BABYLON.VertexBuffer.SHORT")
  @js.native
  val SHORT: Double = js.native
  
  /**
    * Tangents
    */
  @JSGlobal("BABYLON.VertexBuffer.TangentKind")
  @js.native
  val TangentKind: String = js.native
  
  /**
    * The unsigned byte type.
    */
  @JSGlobal("BABYLON.VertexBuffer.UNSIGNED_BYTE")
  @js.native
  val UNSIGNED_BYTE: Double = js.native
  
  /**
    * The unsigned integer type.
    */
  @JSGlobal("BABYLON.VertexBuffer.UNSIGNED_INT")
  @js.native
  val UNSIGNED_INT: Double = js.native
  
  /**
    * The unsigned short type.
    */
  @JSGlobal("BABYLON.VertexBuffer.UNSIGNED_SHORT")
  @js.native
  val UNSIGNED_SHORT: Double = js.native
  
  /**
    * Texture coordinates 2
    */
  @JSGlobal("BABYLON.VertexBuffer.UV2Kind")
  @js.native
  val UV2Kind: String = js.native
  
  /**
    * Texture coordinates 3
    */
  @JSGlobal("BABYLON.VertexBuffer.UV3Kind")
  @js.native
  val UV3Kind: String = js.native
  
  /**
    * Texture coordinates 4
    */
  @JSGlobal("BABYLON.VertexBuffer.UV4Kind")
  @js.native
  val UV4Kind: String = js.native
  
  /**
    * Texture coordinates 5
    */
  @JSGlobal("BABYLON.VertexBuffer.UV5Kind")
  @js.native
  val UV5Kind: String = js.native
  
  /**
    * Texture coordinates 6
    */
  @JSGlobal("BABYLON.VertexBuffer.UV6Kind")
  @js.native
  val UV6Kind: String = js.native
  
  /**
    * Texture coordinates
    */
  @JSGlobal("BABYLON.VertexBuffer.UVKind")
  @js.native
  val UVKind: String = js.native
  
  @JSGlobal("BABYLON.VertexBuffer._GetFloatValue")
  @js.native
  def _GetFloatValue: js.Any = js.native
  @scala.inline
  def _GetFloatValue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFloatValue")(x.asInstanceOf[js.Any])
}

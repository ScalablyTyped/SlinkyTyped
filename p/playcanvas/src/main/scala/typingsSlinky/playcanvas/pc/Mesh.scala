package typingsSlinky.playcanvas.pc

import typingsSlinky.playcanvas.anon.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new mesh.
  * @property vertexBuffer - The vertex buffer holding the vertex data of the mesh.
  * @property indexBuffer - An array of index buffers. For unindexed meshes, this array can
  be empty. The first index buffer in the array is used by {@link pc.MeshInstance}s with a renderStyle
  property set to pc.RENDERSTYLE_SOLID. The second index buffer in the array is used if renderStyle is
  set to pc.RENDERSTYLE_WIREFRAME.
  * @property primitive - Array of primitive objects defining how vertex (and index) data in the
  mesh should be interpreted by the graphics device. For details on the primitive object, see.
  * @property primitive[].type - The type of primitive to render. Can be:
  
  * {@link pc.PRIMITIVE_POINTS}
  * {@link pc.PRIMITIVE_LINES}
  * {@link pc.PRIMITIVE_LINELOOP}
  * {@link pc.PRIMITIVE_LINESTRIP}
  * {@link pc.PRIMITIVE_TRIANGLES}
  * {@link pc.PRIMITIVE_TRISTRIP}
  * {@link pc.PRIMITIVE_TRIFAN}
  * @property primitive[].base - The offset of the first index or vertex to dispatch in the draw call.
  * @property primitive[].count - The number of indices or vertices to dispatch in the draw call.
  * @property [primitive[].indexed] - True to interpret the primitive as indexed, thereby using the currently set index buffer and false otherwise.
  {@link pc.GraphicsDevice#draw}. The primitive is ordered based on render style like the indexBuffer property.
  * @property aabb - The axis-aligned bounding box for the object space vertices of this mesh.
  * @property [skin] - The skin data (if any) that drives skinned mesh animations for this mesh.
  * @property [morph] - The morph data (if any) that drives morph target animations for this mesh.
  * @param [graphicsDevice] - The graphics device used to manage this mesh. If it is not provided, a device is obtained
  from the {@link pc.Application}.
  */
@js.native
trait Mesh extends js.Object {
  
  /**
    * The axis-aligned bounding box for the object space vertices of this mesh.
    */
  var aabb: BoundingBox = js.native
  
  /**
    * Clears the mesh of existing vertices and indices and resets the
    {@link pc.VertexFormat} associated with the mesh. This call is typically followed by calls
    to methods such as {@link pc.Mesh#setPositions}, {@link pc.Mesh#setVertexStream} or {@link pc.Mesh#setIndices} and
    finally {@link pc.Mesh#update} to rebuild the mesh, allowing different {@link pc.VertexFormat}.
    * @param [verticesDynamic] - Indicates the {@link pc.VertexBuffer} should be created with {@link pc.BUFFER_DYNAMIC} usage. If not specified, {@link pc.BUFFER_STATIC} is used.
    * @param [indicesDynamic] - Indicates the {@link pc.IndexBuffer} should be created with {@link pc.BUFFER_DYNAMIC} usage. If not specified, {@link pc.BUFFER_STATIC} is used.
    * @param [maxVertices] - {@link pc.VertexBuffer} will be allocated with at least maxVertices, allowing additional vertices to be added to it without the allocation. If
    no value is provided, a size to fit the provided vertices will be allocated.
    * @param [maxIndices] - {@link pc.IndexBuffer} will be allocated with at least maxIndices, allowing additional indices to be added to it without the allocation. If
    no value is provided, a size to fit the provided indices will be allocated.
    */
  def clear(): Unit = js.native
  def clear(
    verticesDynamic: js.UndefOr[scala.Nothing],
    indicesDynamic: js.UndefOr[scala.Nothing],
    maxVertices: js.UndefOr[scala.Nothing],
    maxIndices: Double
  ): Unit = js.native
  def clear(
    verticesDynamic: js.UndefOr[scala.Nothing],
    indicesDynamic: js.UndefOr[scala.Nothing],
    maxVertices: Double
  ): Unit = js.native
  def clear(
    verticesDynamic: js.UndefOr[scala.Nothing],
    indicesDynamic: js.UndefOr[scala.Nothing],
    maxVertices: Double,
    maxIndices: Double
  ): Unit = js.native
  def clear(verticesDynamic: js.UndefOr[scala.Nothing], indicesDynamic: Boolean): Unit = js.native
  def clear(
    verticesDynamic: js.UndefOr[scala.Nothing],
    indicesDynamic: Boolean,
    maxVertices: js.UndefOr[scala.Nothing],
    maxIndices: Double
  ): Unit = js.native
  def clear(verticesDynamic: js.UndefOr[scala.Nothing], indicesDynamic: Boolean, maxVertices: Double): Unit = js.native
  def clear(
    verticesDynamic: js.UndefOr[scala.Nothing],
    indicesDynamic: Boolean,
    maxVertices: Double,
    maxIndices: Double
  ): Unit = js.native
  def clear(verticesDynamic: Boolean): Unit = js.native
  def clear(
    verticesDynamic: Boolean,
    indicesDynamic: js.UndefOr[scala.Nothing],
    maxVertices: js.UndefOr[scala.Nothing],
    maxIndices: Double
  ): Unit = js.native
  def clear(verticesDynamic: Boolean, indicesDynamic: js.UndefOr[scala.Nothing], maxVertices: Double): Unit = js.native
  def clear(
    verticesDynamic: Boolean,
    indicesDynamic: js.UndefOr[scala.Nothing],
    maxVertices: Double,
    maxIndices: Double
  ): Unit = js.native
  def clear(verticesDynamic: Boolean, indicesDynamic: Boolean): Unit = js.native
  def clear(
    verticesDynamic: Boolean,
    indicesDynamic: Boolean,
    maxVertices: js.UndefOr[scala.Nothing],
    maxIndices: Double
  ): Unit = js.native
  def clear(verticesDynamic: Boolean, indicesDynamic: Boolean, maxVertices: Double): Unit = js.native
  def clear(verticesDynamic: Boolean, indicesDynamic: Boolean, maxVertices: Double, maxIndices: Double): Unit = js.native
  
  /**
    * Destroys {@link pc.VertexBuffer} and {@link pc.IndexBuffer} associate with the mesh.
    This is normally called by {@link pc.Model#destroy} and does not need to be called manually.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets the vertex color data.
    * @param colors - An array to populate with the vertex data.
    When typed array is supplied, enough space needs to be reserved, otherwise only partial data is copied.
    * @returns Returns the number of vertices populated.
    */
  def getColors(colors: js.Array[Double]): Double = js.native
  def getColors(colors: js.typedarray.Float32Array): Double = js.native
  def getColors(colors: js.typedarray.Int16Array): Double = js.native
  def getColors(colors: js.typedarray.Int32Array): Double = js.native
  def getColors(colors: js.typedarray.Int8Array): Double = js.native
  def getColors(colors: js.typedarray.Uint16Array): Double = js.native
  def getColors(colors: js.typedarray.Uint32Array): Double = js.native
  def getColors(colors: js.typedarray.Uint8Array): Double = js.native
  def getColors(colors: js.typedarray.Uint8ClampedArray): Double = js.native
  
  /**
    * Gets the index data.
    * @param indices - An array to populate with the index data.
    When a typed array is supplied, enough space needs to be reserved, otherwise only partial data is copied.
    * @returns Returns the number of indices populated.
    */
  def getIndices(indices: js.Array[Double]): Double = js.native
  def getIndices(indices: js.typedarray.Uint16Array): Double = js.native
  def getIndices(indices: js.typedarray.Uint32Array): Double = js.native
  def getIndices(indices: js.typedarray.Uint8Array): Double = js.native
  
  /**
    * Gets the vertex normals data.
    * @param normals - An array to populate with the vertex data.
    When typed array is supplied, enough space needs to be reserved, otherwise only partial data is copied.
    * @returns Returns the number of vertices populated.
    */
  def getNormals(normals: js.Array[Double]): Double = js.native
  def getNormals(normals: js.typedarray.Float32Array): Double = js.native
  def getNormals(normals: js.typedarray.Int16Array): Double = js.native
  def getNormals(normals: js.typedarray.Int32Array): Double = js.native
  def getNormals(normals: js.typedarray.Int8Array): Double = js.native
  def getNormals(normals: js.typedarray.Uint16Array): Double = js.native
  def getNormals(normals: js.typedarray.Uint32Array): Double = js.native
  def getNormals(normals: js.typedarray.Uint8Array): Double = js.native
  def getNormals(normals: js.typedarray.Uint8ClampedArray): Double = js.native
  
  /**
    * Gets the vertex positions data.
    * @param positions - An array to populate with the vertex data.
    When typed array is supplied, enough space needs to be reserved, otherwise only partial data is copied.
    * @returns Returns the number of vertices populated.
    */
  def getPositions(positions: js.Array[Double]): Double = js.native
  def getPositions(positions: js.typedarray.Float32Array): Double = js.native
  def getPositions(positions: js.typedarray.Int16Array): Double = js.native
  def getPositions(positions: js.typedarray.Int32Array): Double = js.native
  def getPositions(positions: js.typedarray.Int8Array): Double = js.native
  def getPositions(positions: js.typedarray.Uint16Array): Double = js.native
  def getPositions(positions: js.typedarray.Uint32Array): Double = js.native
  def getPositions(positions: js.typedarray.Uint8Array): Double = js.native
  def getPositions(positions: js.typedarray.Uint8ClampedArray): Double = js.native
  
  /**
    * Gets the vertex uv data.
    * @param channel - The uv channel in [0..7] range.
    * @param uvs - An array to populate with the vertex data.
    When typed array is supplied, enough space needs to be reserved, otherwise only partial data is copied.
    * @returns Returns the number of vertices populated.
    */
  def getUvs(channel: Double, uvs: js.Array[Double]): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Float32Array): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Int16Array): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Int32Array): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Int8Array): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Uint16Array): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Uint32Array): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Uint8Array): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Uint8ClampedArray): Double = js.native
  
  /**
    * Gets the vertex data corresponding to a semantic.
    * @param semantic - The semantic of the vertex element to get. For supported semantics, see pc.SEMANTIC_* in {@link pc.VertexFormat}.
    * @param data - An array to populate with the vertex data.
    When typed array is supplied, enough space needs to be reserved, otherwise only partial data is copied.
    * @returns Returns the number of vertices populated.
    */
  def getVertexStream(semantic: String, data: js.Array[Double]): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Float32Array): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Int16Array): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Int32Array): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Int8Array): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Uint16Array): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Uint32Array): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Uint8Array): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Uint8ClampedArray): Double = js.native
  
  /**
    * An array of index buffers. For unindexed meshes, this array can
    * be empty. The first index buffer in the array is used by {@link pc.MeshInstance}s with a renderStyle
    * property set to pc.RENDERSTYLE_SOLID. The second index buffer in the array is used if renderStyle is
    * set to pc.RENDERSTYLE_WIREFRAME.
    */
  var indexBuffer: js.Array[IndexBuffer] = js.native
  
  /**
    * The morph data (if any) that drives morph target animations for this mesh.
    */
  var morph: js.UndefOr[Morph] = js.native
  
  /**
    * Array of primitive objects defining how vertex (and index) data in the
    * mesh should be interpreted by the graphics device. For details on the primitive object, see.
    */
  var primitive: js.Array[Base] = js.native
  
  /**
    * Sets the vertex color array. Colors are stored using pc.TYPE_FLOAT32 format, which is useful for HDR colors.
    * @param colors - Vertex data containing colors.
    * @param [componentCount] - The number of values that form a single color element. Defaults to 4 if not specified, corresponding to r, g, b and a.
    * @param [numVertices] - The number of vertices to be used from data array. If not provided, the whole data array is used. This allows to use only part of the data array.
    */
  def setColors(colors: js.Array[Double]): Unit = js.native
  def setColors(colors: js.Array[Double], componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setColors(colors: js.Array[Double], componentCount: Double): Unit = js.native
  def setColors(colors: js.Array[Double], componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Float32Array): Unit = js.native
  def setColors(colors: js.typedarray.Float32Array, componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Float32Array, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Float32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int16Array): Unit = js.native
  def setColors(colors: js.typedarray.Int16Array, componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int16Array, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int32Array): Unit = js.native
  def setColors(colors: js.typedarray.Int32Array, componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int32Array, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int8Array): Unit = js.native
  def setColors(colors: js.typedarray.Int8Array, componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int8Array, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint16Array): Unit = js.native
  def setColors(colors: js.typedarray.Uint16Array, componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint16Array, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint32Array): Unit = js.native
  def setColors(colors: js.typedarray.Uint32Array, componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint32Array, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint8Array): Unit = js.native
  def setColors(colors: js.typedarray.Uint8Array, componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint8Array, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint8ClampedArray): Unit = js.native
  def setColors(
    colors: js.typedarray.Uint8ClampedArray,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setColors(colors: js.typedarray.Uint8ClampedArray, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint8ClampedArray, componentCount: Double, numVertices: Double): Unit = js.native
  
  /**
    * Sets the vertex color array. Colors are stored using pc.TYPE_UINT8 format, which is useful for LDR colors. Values in the array are expected in
    [0..255] range, and are mapped to [0..1] range in the shader.
    * @param colors - Vertex data containing colors. The array is
    expected to contain 4 components per vertex, corresponding to r, g, b and a.
    * @param [numVertices] - The number of vertices to be used from data array. If not provided, the whole data array is used. This allows to use only part of the data array.
    */
  def setColors32(colors: js.Array[Double]): Unit = js.native
  def setColors32(colors: js.Array[Double], numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Float32Array): Unit = js.native
  def setColors32(colors: js.typedarray.Float32Array, numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Int16Array): Unit = js.native
  def setColors32(colors: js.typedarray.Int16Array, numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Int32Array): Unit = js.native
  def setColors32(colors: js.typedarray.Int32Array, numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Int8Array): Unit = js.native
  def setColors32(colors: js.typedarray.Int8Array, numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Uint16Array): Unit = js.native
  def setColors32(colors: js.typedarray.Uint16Array, numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Uint32Array): Unit = js.native
  def setColors32(colors: js.typedarray.Uint32Array, numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Uint8Array): Unit = js.native
  def setColors32(colors: js.typedarray.Uint8Array, numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Uint8ClampedArray): Unit = js.native
  def setColors32(colors: js.typedarray.Uint8ClampedArray, numVertices: Double): Unit = js.native
  
  /**
    * Sets the index array. Indices are stored using 16-bit format by default, unless more than 65535 vertices are specified, in which case 32-bit format is used.
    * @param indices - The array of indicies that define primitives (lines, triangles, etc.).
    * @param [numIndices] - The number of indices to be used from data array. If not provided, the whole data array is used. This allows to use only part of the data array.
    */
  def setIndices(indices: js.Array[Double]): Unit = js.native
  def setIndices(indices: js.Array[Double], numIndices: Double): Unit = js.native
  def setIndices(indices: js.typedarray.Uint16Array): Unit = js.native
  def setIndices(indices: js.typedarray.Uint16Array, numIndices: Double): Unit = js.native
  def setIndices(indices: js.typedarray.Uint32Array): Unit = js.native
  def setIndices(indices: js.typedarray.Uint32Array, numIndices: Double): Unit = js.native
  def setIndices(indices: js.typedarray.Uint8Array): Unit = js.native
  def setIndices(indices: js.typedarray.Uint8Array, numIndices: Double): Unit = js.native
  
  /**
    * Sets the vertex normals array. Normals are stored using pc.TYPE_FLOAT32 format.
    * @param normals - Vertex data containing normals.
    * @param [componentCount] - The number of values that form a single normal element. Defaults to 3 if not specified, corresponding to x, y and z direction.
    * @param [numVertices] - The number of vertices to be used from data array. If not provided, the whole data array is used. This allows to use only part of the data array.
    */
  def setNormals(normals: js.Array[Double]): Unit = js.native
  def setNormals(normals: js.Array[Double], componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setNormals(normals: js.Array[Double], componentCount: Double): Unit = js.native
  def setNormals(normals: js.Array[Double], componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Float32Array): Unit = js.native
  def setNormals(
    normals: js.typedarray.Float32Array,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setNormals(normals: js.typedarray.Float32Array, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Float32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int16Array): Unit = js.native
  def setNormals(normals: js.typedarray.Int16Array, componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int16Array, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int32Array): Unit = js.native
  def setNormals(normals: js.typedarray.Int32Array, componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int32Array, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int8Array): Unit = js.native
  def setNormals(normals: js.typedarray.Int8Array, componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int8Array, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint16Array): Unit = js.native
  def setNormals(normals: js.typedarray.Uint16Array, componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint16Array, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint32Array): Unit = js.native
  def setNormals(normals: js.typedarray.Uint32Array, componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint32Array, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint8Array): Unit = js.native
  def setNormals(normals: js.typedarray.Uint8Array, componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint8Array, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint8ClampedArray): Unit = js.native
  def setNormals(
    normals: js.typedarray.Uint8ClampedArray,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setNormals(normals: js.typedarray.Uint8ClampedArray, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint8ClampedArray, componentCount: Double, numVertices: Double): Unit = js.native
  
  /**
    * Sets the vertex positions array. Vertices are stored using pc.TYPE_FLOAT32 format.
    * @param positions - Vertex data containing positions.
    * @param [componentCount] - The number of values that form a single position element. Defaults to 3 if not specified, corresponding to x, y and z coordinates.
    * @param [numVertices] - The number of vertices to be used from data array. If not provided, the whole data array is used. This allows to use only part of the data array.
    */
  def setPositions(positions: js.Array[Double]): Unit = js.native
  def setPositions(positions: js.Array[Double], componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setPositions(positions: js.Array[Double], componentCount: Double): Unit = js.native
  def setPositions(positions: js.Array[Double], componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Float32Array): Unit = js.native
  def setPositions(
    positions: js.typedarray.Float32Array,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setPositions(positions: js.typedarray.Float32Array, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Float32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int16Array): Unit = js.native
  def setPositions(
    positions: js.typedarray.Int16Array,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setPositions(positions: js.typedarray.Int16Array, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int32Array): Unit = js.native
  def setPositions(
    positions: js.typedarray.Int32Array,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setPositions(positions: js.typedarray.Int32Array, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int8Array): Unit = js.native
  def setPositions(positions: js.typedarray.Int8Array, componentCount: js.UndefOr[scala.Nothing], numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int8Array, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint16Array): Unit = js.native
  def setPositions(
    positions: js.typedarray.Uint16Array,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setPositions(positions: js.typedarray.Uint16Array, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint32Array): Unit = js.native
  def setPositions(
    positions: js.typedarray.Uint32Array,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setPositions(positions: js.typedarray.Uint32Array, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint8Array): Unit = js.native
  def setPositions(
    positions: js.typedarray.Uint8Array,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setPositions(positions: js.typedarray.Uint8Array, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint8ClampedArray): Unit = js.native
  def setPositions(
    positions: js.typedarray.Uint8ClampedArray,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setPositions(positions: js.typedarray.Uint8ClampedArray, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint8ClampedArray, componentCount: Double, numVertices: Double): Unit = js.native
  
  /**
    * Sets the vertex uv array. Uvs are stored using pc.TYPE_FLOAT32 format.
    * @param channel - The uv channel in [0..7] range.
    * @param uvs - Vertex data containing uv-coordinates.
    * @param [componentCount] - The number of values that form a single uv element. Defaults to 2 if not specified, corresponding to u and v coordinates.
    * @param [numVertices] - The number of vertices to be used from data array. If not provided, the whole data array is used. This allows to use only part of the data array.
    */
  def setUvs(channel: Double, uvs: js.Array[Double]): Unit = js.native
  def setUvs(
    channel: Double,
    uvs: js.Array[Double],
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setUvs(channel: Double, uvs: js.Array[Double], componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.Array[Double], componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Float32Array): Unit = js.native
  def setUvs(
    channel: Double,
    uvs: js.typedarray.Float32Array,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Float32Array, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Float32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int16Array): Unit = js.native
  def setUvs(
    channel: Double,
    uvs: js.typedarray.Int16Array,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int16Array, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int32Array): Unit = js.native
  def setUvs(
    channel: Double,
    uvs: js.typedarray.Int32Array,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int32Array, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int8Array): Unit = js.native
  def setUvs(
    channel: Double,
    uvs: js.typedarray.Int8Array,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int8Array, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint16Array): Unit = js.native
  def setUvs(
    channel: Double,
    uvs: js.typedarray.Uint16Array,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint16Array, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint32Array): Unit = js.native
  def setUvs(
    channel: Double,
    uvs: js.typedarray.Uint32Array,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint32Array, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint8Array): Unit = js.native
  def setUvs(
    channel: Double,
    uvs: js.typedarray.Uint8Array,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint8Array, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint8ClampedArray): Unit = js.native
  def setUvs(
    channel: Double,
    uvs: js.typedarray.Uint8ClampedArray,
    componentCount: js.UndefOr[scala.Nothing],
    numVertices: Double
  ): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint8ClampedArray, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint8ClampedArray, componentCount: Double, numVertices: Double): Unit = js.native
  
  /**
    * Sets the vertex data for any supported semantic.
    * @param semantic - The meaning of the vertex element. For supported semantics, see pc.SEMANTIC_* in {@link pc.VertexFormat}.
    * @param data - Vertex data for the specified semantic.
    * @param componentCount - The number of values that form a single Vertex element. For example when setting a 3D position represented by 3 numbers
    per vertex, number 3 should be specified.
    * @param [numVertices] - The number of vertices to be used from data array. If not provided, the whole data array is used. This allows to use only part of the data array.
    * @param [dataType] - The format of data when stored in the {@link pc.VertexBuffer}, see pc.TYPE_* in {@link pc.VertexFormat}. When not specified, pc.TYPE_FLOAT32 is used.
    * @param [dataTypeNormalize] - If true, vertex attribute data will be mapped from a 0 to 255 range down to 0 to 1 when fed to a shader.
    If false, vertex attribute data is left unchanged. If this property is unspecified, false is assumed.
    */
  def setVertexStream(
    semantic: String,
    data: js.Array[Double] | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array,
    componentCount: Double,
    numVertices: js.UndefOr[Double],
    dataType: js.UndefOr[Double],
    dataTypeNormalize: js.UndefOr[Boolean]
  ): Unit = js.native
  
  /**
    * The skin data (if any) that drives skinned mesh animations for this mesh.
    */
  var skin: js.UndefOr[Skin] = js.native
  
  /**
    * Applies any changes to vertex stream and indices to mesh. This allocates or reallocates {@link pc.vertexBuffer} or {@link pc.IndexBuffer}
    to fit all provided vertices and indices, and fills them with data.
    * @param [primitiveType] - The type of primitive to render. Can be one of pc.PRIMITIVE_* - see primitive[].type section above. Defaults
    to pc.PRIMITIVE_TRIANGLES if unspecified.
    * @param [updateBoundingBox] - True to update bounding box. Bounding box is updated only if positions were set since last time update
    was called, and componentCount for position was 3, otherwise bounding box is not updated. See {@link pc.Mesh#setPositions}. Defaults to true if unspecified.
    Set this to false to avoid update of the bounding box and use aabb property to set it instead.
    */
  def update(): Unit = js.native
  def update(primitiveType: js.UndefOr[scala.Nothing], updateBoundingBox: Boolean): Unit = js.native
  def update(primitiveType: Double): Unit = js.native
  def update(primitiveType: Double, updateBoundingBox: Boolean): Unit = js.native
  
  /**
    * The vertex buffer holding the vertex data of the mesh.
    */
  var vertexBuffer: VertexBuffer = js.native
}

package typingsSlinky.babylonjs.edgesRendererMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.bufferMod.VertexBuffer
import typingsSlinky.babylonjs.dataBufferMod.DataBuffer
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.shaderMaterialMod.ShaderMaterial
import typingsSlinky.babylonjs.typesMod.Immutable
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/edgesRenderer", "EdgesRenderer")
@js.native
class EdgesRenderer protected () extends IEdgesRenderer {
  /**
    * Creates an instance of the EdgesRenderer. It is primarily use to display edges of a mesh.
    * Beware when you use this class with complex objects as the adjacencies computation can be really long
    * @param  source Mesh used to create edges
    * @param  epsilon sum of angles in adjacency to check for edge
    * @param  checkVerticesInsteadOfIndices bases the edges detection on vertices vs indices. Note that this parameter is not used if options.useAlternateEdgeFinder = true
    * @param  generateEdgesLines - should generate Lines or only prepare resources.
    * @param  options The options to apply when generating the edges
    */
  def this(source: AbstractMesh) = this()
  def this(source: AbstractMesh, epsilon: Double) = this()
  def this(source: AbstractMesh, epsilon: js.UndefOr[scala.Nothing], checkVerticesInsteadOfIndices: Boolean) = this()
  def this(source: AbstractMesh, epsilon: Double, checkVerticesInsteadOfIndices: Boolean) = this()
  def this(
    source: AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    generateEdgesLines: js.UndefOr[scala.Nothing],
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: js.UndefOr[scala.Nothing],
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    generateEdgesLines: js.UndefOr[scala.Nothing],
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: js.UndefOr[scala.Nothing],
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
  
  var _buffers: StringDictionary[Nullable[VertexBuffer]] = js.native
  
  var _buffersForInstances: StringDictionary[Nullable[VertexBuffer]] = js.native
  
  /**
    * Checks if the pair of p0 and p1 is en edge
    * @param faceIndex
    * @param edge
    * @param faceNormals
    * @param  p0
    * @param  p1
    * @private
    */
  /* protected */ def _checkEdge(faceIndex: Double, edge: Double, faceNormals: js.Array[Vector3], p0: Vector3, p1: Vector3): Unit = js.native
  
  var _checkVerticesInsteadOfIndices: Boolean = js.native
  
  var _epsilon: Double = js.native
  
  /**
    * Generates lines edges from adjacencjes
    * @private
    */
  def _generateEdgesLines(): Unit = js.native
  
  var _generateEdgesLinesAlternate: js.Any = js.native
  
  var _ib: DataBuffer = js.native
  
  var _indicesCount: Double = js.native
  
  var _lineShader: ShaderMaterial = js.native
  
  var _linesIndices: js.Array[Double] = js.native
  
  var _linesNormals: js.Array[Double] = js.native
  
  var _linesPositions: js.Array[Double] = js.native
  
  var _meshDisposeObserver: js.Any = js.native
  
  var _meshRebuildObserver: js.Any = js.native
  
  var _options: Nullable[IEdgesRendererOptions] = js.native
  
  /* protected */ def _prepareRessources(): Unit = js.native
  
  /* protected */ def _processEdgeForAdjacencies(pa: Double, pb: Double, p0: Double, p1: Double, p2: Double): Double = js.native
  
  /* protected */ def _processEdgeForAdjacenciesWithVertices(pa: Vector3, pb: Vector3, p0: Vector3, p1: Vector3, p2: Vector3): Double = js.native
  
  /** @hidden */
  def _rebuild(): Unit = js.native
  
  var _source: AbstractMesh = js.native
  
  /**
    * See https://playground.babylonjs.com/#R3JR6V#1 for a visual display of the algorithm
    */
  var _tessellateTriangle: js.Any = js.native
  
  /**
    * push line into the position, normal and index buffer
    * @protected
    */
  /* protected */ def createLine(p0: Vector3, p1: Vector3, offset: Double): Unit = js.native
  
  /**
    * Define the size of the edges with an orthographic camera
    */
  var edgesWidthScalerForOrthographic: Double = js.native
  
  /**
    * Define the size of the edges with a perspective camera
    */
  var edgesWidthScalerForPerspective: Double = js.native
  
  /** Gets the indices generated by the edge renderer */
  def linesIndices: Immutable[js.Array[Double]] = js.native
  
  /** Gets the normals generated by the edge renderer */
  def linesNormals: Immutable[js.Array[Double]] = js.native
  
  /** Gets the vertices generated by the edge renderer */
  def linesPositions: Immutable[js.Array[Double]] = js.native
}
/* static members */
@JSImport("babylonjs/Rendering/edgesRenderer", "EdgesRenderer")
@js.native
object EdgesRenderer extends js.Object {
  
  var GetShader: js.Any = js.native
}

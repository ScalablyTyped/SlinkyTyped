package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgesRenderer extends IEdgesRenderer {
  var _buffers: org.scalablytyped.runtime.StringDictionary[Nullable[VertexBuffer]] = js.native
  var _checkVerticesInsteadOfIndices: Boolean = js.native
  var _epsilon: Double = js.native
  var _ib: DataBuffer = js.native
  var _indicesCount: Double = js.native
  var _lineShader: ShaderMaterial = js.native
  var _linesIndices: js.Array[Double] = js.native
  var _linesNormals: js.Array[Double] = js.native
  var _linesPositions: js.Array[Double] = js.native
  var _meshDisposeObserver: js.Any = js.native
  var _meshRebuildObserver: js.Any = js.native
  var _source: AbstractMesh = js.native
  /**
    * Define the size of the edges with an orthographic camera
    */
  var edgesWidthScalerForOrthographic: Double = js.native
  /**
    * Define the size of the edges with a perspective camera
    */
  var edgesWidthScalerForPerspective: Double = js.native
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
  /**
    * Generates lines edges from adjacencjes
    * @private
    */
  def _generateEdgesLines(): Unit = js.native
  /* protected */ def _prepareRessources(): Unit = js.native
  /* protected */ def _processEdgeForAdjacencies(pa: Double, pb: Double, p0: Double, p1: Double, p2: Double): Double = js.native
  /* protected */ def _processEdgeForAdjacenciesWithVertices(pa: Vector3, pb: Vector3, p0: Vector3, p1: Vector3, p2: Vector3): Double = js.native
  /** @hidden */
  def _rebuild(): Unit = js.native
  /**
    * push line into the position, normal and index buffer
    * @protected
    */
  /* protected */ def createLine(p0: Vector3, p1: Vector3, offset: Double): Unit = js.native
}

object EdgesRenderer {
  @scala.inline
  def apply(
    _buffers: org.scalablytyped.runtime.StringDictionary[Nullable[VertexBuffer]],
    _checkEdge: (Double, Double, js.Array[Vector3], Vector3, Vector3) => Unit,
    _checkVerticesInsteadOfIndices: Boolean,
    _epsilon: Double,
    _generateEdgesLines: () => Unit,
    _ib: DataBuffer,
    _indicesCount: Double,
    _lineShader: ShaderMaterial,
    _linesIndices: js.Array[Double],
    _linesNormals: js.Array[Double],
    _linesPositions: js.Array[Double],
    _meshDisposeObserver: js.Any,
    _meshRebuildObserver: js.Any,
    _prepareRessources: () => Unit,
    _processEdgeForAdjacencies: (Double, Double, Double, Double, Double) => Double,
    _processEdgeForAdjacenciesWithVertices: (Vector3, Vector3, Vector3, Vector3, Vector3) => Double,
    _rebuild: () => Unit,
    _source: AbstractMesh,
    createLine: (Vector3, Vector3, Double) => Unit,
    dispose: () => Unit,
    edgesWidthScalerForOrthographic: Double,
    edgesWidthScalerForPerspective: Double,
    isEnabled: Boolean,
    isReady: () => Boolean,
    render: () => Unit
  ): EdgesRenderer = {
    val __obj = js.Dynamic.literal(_buffers = _buffers.asInstanceOf[js.Any], _checkEdge = js.Any.fromFunction5(_checkEdge), _checkVerticesInsteadOfIndices = _checkVerticesInsteadOfIndices.asInstanceOf[js.Any], _epsilon = _epsilon.asInstanceOf[js.Any], _generateEdgesLines = js.Any.fromFunction0(_generateEdgesLines), _ib = _ib.asInstanceOf[js.Any], _indicesCount = _indicesCount.asInstanceOf[js.Any], _lineShader = _lineShader.asInstanceOf[js.Any], _linesIndices = _linesIndices.asInstanceOf[js.Any], _linesNormals = _linesNormals.asInstanceOf[js.Any], _linesPositions = _linesPositions.asInstanceOf[js.Any], _meshDisposeObserver = _meshDisposeObserver.asInstanceOf[js.Any], _meshRebuildObserver = _meshRebuildObserver.asInstanceOf[js.Any], _prepareRessources = js.Any.fromFunction0(_prepareRessources), _processEdgeForAdjacencies = js.Any.fromFunction5(_processEdgeForAdjacencies), _processEdgeForAdjacenciesWithVertices = js.Any.fromFunction5(_processEdgeForAdjacenciesWithVertices), _rebuild = js.Any.fromFunction0(_rebuild), _source = _source.asInstanceOf[js.Any], createLine = js.Any.fromFunction3(createLine), dispose = js.Any.fromFunction0(dispose), edgesWidthScalerForOrthographic = edgesWidthScalerForOrthographic.asInstanceOf[js.Any], edgesWidthScalerForPerspective = edgesWidthScalerForPerspective.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isReady = js.Any.fromFunction0(isReady), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[EdgesRenderer]
  }
  @scala.inline
  implicit class EdgesRendererOps[Self <: EdgesRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_buffers(value: org.scalablytyped.runtime.StringDictionary[Nullable[VertexBuffer]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_buffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_checkEdge(value: (Double, Double, js.Array[Vector3], Vector3, Vector3) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_checkEdge")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def with_checkVerticesInsteadOfIndices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_checkVerticesInsteadOfIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_epsilon(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_epsilon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_generateEdgesLines(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_generateEdgesLines")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_ib(value: DataBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_indicesCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_indicesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_lineShader(value: ShaderMaterial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lineShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_linesIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_linesIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_linesNormals(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_linesNormals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_linesPositions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_linesPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_meshDisposeObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_meshDisposeObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_meshRebuildObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_meshRebuildObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_prepareRessources(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_prepareRessources")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_processEdgeForAdjacencies(value: (Double, Double, Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_processEdgeForAdjacencies")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def with_processEdgeForAdjacenciesWithVertices(value: (Vector3, Vector3, Vector3, Vector3, Vector3) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_processEdgeForAdjacenciesWithVertices")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def with_rebuild(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rebuild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_source(value: AbstractMesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateLine(value: (Vector3, Vector3, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLine")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEdgesWidthScalerForOrthographic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgesWidthScalerForOrthographic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdgesWidthScalerForPerspective(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgesWidthScalerForPerspective")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


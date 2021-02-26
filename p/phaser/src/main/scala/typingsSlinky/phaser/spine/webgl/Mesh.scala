package typingsSlinky.phaser.spine.webgl

import typingsSlinky.phaser.spine.Disposable
import typingsSlinky.phaser.spine.Restorable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mesh
  extends Disposable
     with Restorable {
  
  var attributes: js.Any = js.native
  
  def bind(shader: Shader): Unit = js.native
  
  var context: js.Any = js.native
  
  var dirtyIndices: js.Any = js.native
  
  var dirtyVertices: js.Any = js.native
  
  def draw(shader: Shader, primitiveType: Double): Unit = js.native
  
  def drawWithOffset(shader: Shader, primitiveType: Double, offset: Double, count: Double): Unit = js.native
  
  var elementsPerVertex: js.Any = js.native
  
  def getAttributes(): js.Array[VertexAttribute] = js.native
  
  def getIndices(): js.typedarray.Uint16Array = js.native
  
  def getVertexSizeInFloats(): Double = js.native
  
  def getVertices(): js.typedarray.Float32Array = js.native
  
  var indices: js.Any = js.native
  
  var indicesBuffer: js.Any = js.native
  
  var indicesLength: js.Any = js.native
  
  def maxIndices(): Double = js.native
  
  def maxVertices(): Double = js.native
  
  def numIndices(): Double = js.native
  
  def numVertices(): Double = js.native
  
  def setIndices(indices: js.Array[Double]): Unit = js.native
  
  def setIndicesLength(length: Double): Unit = js.native
  
  def setVertices(vertices: js.Array[Double]): Unit = js.native
  
  def setVerticesLength(length: Double): Unit = js.native
  
  def unbind(shader: Shader): Unit = js.native
  
  var update: js.Any = js.native
  
  var vertices: js.Any = js.native
  
  var verticesBuffer: js.Any = js.native
  
  var verticesLength: js.Any = js.native
}
object Mesh {
  
  @scala.inline
  def apply(
    attributes: js.Any,
    bind: Shader => Unit,
    context: js.Any,
    dirtyIndices: js.Any,
    dirtyVertices: js.Any,
    dispose: () => Unit,
    draw: (Shader, Double) => Unit,
    drawWithOffset: (Shader, Double, Double, Double) => Unit,
    elementsPerVertex: js.Any,
    getAttributes: () => js.Array[VertexAttribute],
    getIndices: () => js.typedarray.Uint16Array,
    getVertexSizeInFloats: () => Double,
    getVertices: () => js.typedarray.Float32Array,
    indices: js.Any,
    indicesBuffer: js.Any,
    indicesLength: js.Any,
    maxIndices: () => Double,
    maxVertices: () => Double,
    numIndices: () => Double,
    numVertices: () => Double,
    restore: () => Unit,
    setIndices: js.Array[Double] => Unit,
    setIndicesLength: Double => Unit,
    setVertices: js.Array[Double] => Unit,
    setVerticesLength: Double => Unit,
    unbind: Shader => Unit,
    update: js.Any,
    vertices: js.Any,
    verticesBuffer: js.Any,
    verticesLength: js.Any
  ): Mesh = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], bind = js.Any.fromFunction1(bind), context = context.asInstanceOf[js.Any], dirtyIndices = dirtyIndices.asInstanceOf[js.Any], dirtyVertices = dirtyVertices.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), drawWithOffset = js.Any.fromFunction4(drawWithOffset), elementsPerVertex = elementsPerVertex.asInstanceOf[js.Any], getAttributes = js.Any.fromFunction0(getAttributes), getIndices = js.Any.fromFunction0(getIndices), getVertexSizeInFloats = js.Any.fromFunction0(getVertexSizeInFloats), getVertices = js.Any.fromFunction0(getVertices), indices = indices.asInstanceOf[js.Any], indicesBuffer = indicesBuffer.asInstanceOf[js.Any], indicesLength = indicesLength.asInstanceOf[js.Any], maxIndices = js.Any.fromFunction0(maxIndices), maxVertices = js.Any.fromFunction0(maxVertices), numIndices = js.Any.fromFunction0(numIndices), numVertices = js.Any.fromFunction0(numVertices), restore = js.Any.fromFunction0(restore), setIndices = js.Any.fromFunction1(setIndices), setIndicesLength = js.Any.fromFunction1(setIndicesLength), setVertices = js.Any.fromFunction1(setVertices), setVerticesLength = js.Any.fromFunction1(setVerticesLength), unbind = js.Any.fromFunction1(unbind), update = update.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], verticesBuffer = verticesBuffer.asInstanceOf[js.Any], verticesLength = verticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mesh]
  }
  
  @scala.inline
  implicit class MeshMutableBuilder[Self <: Mesh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBind(value: Shader => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtyIndices(value: js.Any): Self = StObject.set(x, "dirtyIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtyVertices(value: js.Any): Self = StObject.set(x, "dirtyVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraw(value: (Shader, Double) => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDrawWithOffset(value: (Shader, Double, Double, Double) => Unit): Self = StObject.set(x, "drawWithOffset", js.Any.fromFunction4(value))
    
    @scala.inline
    def setElementsPerVertex(value: js.Any): Self = StObject.set(x, "elementsPerVertex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAttributes(value: () => js.Array[VertexAttribute]): Self = StObject.set(x, "getAttributes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndices(value: () => js.typedarray.Uint16Array): Self = StObject.set(x, "getIndices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVertexSizeInFloats(value: () => Double): Self = StObject.set(x, "getVertexSizeInFloats", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVertices(value: () => js.typedarray.Float32Array): Self = StObject.set(x, "getVertices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndices(value: js.Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesBuffer(value: js.Any): Self = StObject.set(x, "indicesBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesLength(value: js.Any): Self = StObject.set(x, "indicesLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIndices(value: () => Double): Self = StObject.set(x, "maxIndices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaxVertices(value: () => Double): Self = StObject.set(x, "maxVertices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNumIndices(value: () => Double): Self = StObject.set(x, "numIndices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNumVertices(value: () => Double): Self = StObject.set(x, "numVertices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetIndices(value: js.Array[Double] => Unit): Self = StObject.set(x, "setIndices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIndicesLength(value: Double => Unit): Self = StObject.set(x, "setIndicesLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVertices(value: js.Array[Double] => Unit): Self = StObject.set(x, "setVertices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVerticesLength(value: Double => Unit): Self = StObject.set(x, "setVerticesLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnbind(value: Shader => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: js.Any): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertices(value: js.Any): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesBuffer(value: js.Any): Self = StObject.set(x, "verticesBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesLength(value: js.Any): Self = StObject.set(x, "verticesLength", value.asInstanceOf[js.Any])
  }
}

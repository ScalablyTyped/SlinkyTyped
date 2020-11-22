package typingsSlinky.rdfjsDataset

import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.BlankNode
import typingsSlinky.rdfJs.mod.DefaultGraph
import typingsSlinky.rdfJs.mod.Literal
import typingsSlinky.rdfJs.mod.NamedNode
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.QuadObject
import typingsSlinky.rdfJs.mod.QuadPredicate
import typingsSlinky.rdfJs.mod.QuadSubject
import typingsSlinky.rdfJs.mod.Variable
import typingsSlinky.rdfjsDataset.datasetCoreMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@rdfjs/dataset", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def blankNode(): BlankNode = js.native
  @JSName("blankNode")
  var blankNode_Original: js.Function0[BlankNode] = js.native
  
  def dataset[InQuad /* <: BaseQuad */](): ^[InQuad] = js.native
  def dataset[InQuad /* <: BaseQuad */](quads: js.Array[InQuad]): ^[InQuad] = js.native
  
  def defaultGraph(): DefaultGraph = js.native
  
  var defaultGraphInstance: DefaultGraph = js.native
  
  @JSName("defaultGraph")
  var defaultGraph_Original: js.Function0[DefaultGraph] = js.native
  
  def literal(value: String): Literal = js.native
  @JSName("literal")
  var literal_Original: js.Function1[/* value */ String, Literal] = js.native
  
  def namedNode[Iri /* <: String */](value: Iri): NamedNode[Iri] = js.native
  @JSName("namedNode")
  var namedNode_Original: js.Function1[/* value */ String, NamedNode[String]] = js.native
  
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): Quad = js.native
  @JSName("quad")
  var quad_Original: js.Function3[
    /* subject */ QuadSubject, 
    /* predicate */ QuadPredicate, 
    /* object */ QuadObject, 
    Quad
  ] = js.native
  
  def variable(value: String): Variable = js.native
  @JSName("variable")
  var variable_Original: js.Function1[/* value */ String, Variable] = js.native
}

package typingsSlinky.rdfExt.dataFactoryMod

import typingsSlinky.rdfExt.anon.BlankNode
import typingsSlinky.rdfExt.anon.TypeofDataFactoryExt
import typingsSlinky.rdfExt.blankNodeMod.BlankNodeExt
import typingsSlinky.rdfExt.datasetMod.DatasetExt
import typingsSlinky.rdfExt.defaultGraphMod.DefaultGraphExt
import typingsSlinky.rdfExt.literalMod.LiteralExt
import typingsSlinky.rdfExt.namedNodeMod.NamedNodeExt
import typingsSlinky.rdfExt.propTypeMod.PropType
import typingsSlinky.rdfExt.quadMod.QuadExt
import typingsSlinky.rdfExt.rdfExtStrings.graph
import typingsSlinky.rdfExt.variableMod.VariableExt
import typingsSlinky.rdfJs.mod.DataFactory
import typingsSlinky.rdfJs.mod.NamedNode
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.QuadGraph
import typingsSlinky.rdfJs.mod.QuadObject
import typingsSlinky.rdfJs.mod.QuadPredicate
import typingsSlinky.rdfJs.mod.QuadSubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-unnecessary-class
@JSImport("rdf-ext/lib/DataFactory", JSImport.Namespace)
@js.native
class ^ () extends DataFactory[QuadExt, Quad]
@JSImport("rdf-ext/lib/DataFactory", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def blankNode(): BlankNodeExt = js.native
  def blankNode(value: String): BlankNodeExt = js.native
  
  def dataset(): DatasetExt = js.native
  def dataset(quads: js.Array[Quad]): DatasetExt = js.native
  @JSName("dataset")
  def dataset_graph(quads: js.UndefOr[scala.Nothing], graph: PropType[QuadExt, graph]): DatasetExt = js.native
  @JSName("dataset")
  def dataset_graph(quads: js.Array[Quad], graph: PropType[QuadExt, graph]): DatasetExt = js.native
  
  def defaultGraph(): DefaultGraphExt = js.native
  
  var defaults: BlankNode = js.native
  
  var factory: TypeofDataFactoryExt = js.native
  
  def graph(): DatasetExt = js.native
  def graph(quads: js.Any): DatasetExt = js.native
  
  def literal(value: String): LiteralExt = js.native
  def literal(value: String, languageOrDatatype: String): LiteralExt = js.native
  def literal(value: String, languageOrDatatype: NamedNode[String]): LiteralExt = js.native
  
  def namedNode(value: String): NamedNodeExt = js.native
  
  def prefixMap(prefixes: Prefixes): typingsSlinky.rdfExt.prefixMapMod.^ = js.native
  
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): QuadExt = js.native
  
  def triple(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  
  def variable(value: String): VariableExt = js.native
}

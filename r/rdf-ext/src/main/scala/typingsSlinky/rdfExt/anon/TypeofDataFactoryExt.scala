package typingsSlinky.rdfExt.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.rdfExt.blankNodeMod.BlankNodeExt
import typingsSlinky.rdfExt.dataFactoryMod.DataFactoryExt
import typingsSlinky.rdfExt.dataFactoryMod.Prefixes
import typingsSlinky.rdfExt.datasetMod.DatasetExt
import typingsSlinky.rdfExt.defaultGraphMod.DefaultGraphExt
import typingsSlinky.rdfExt.literalMod.LiteralExt
import typingsSlinky.rdfExt.namedNodeMod.NamedNodeExt
import typingsSlinky.rdfExt.prefixMapMod.^
import typingsSlinky.rdfExt.propTypeMod.PropType
import typingsSlinky.rdfExt.quadMod.QuadExt
import typingsSlinky.rdfExt.rdfExtStrings.graph
import typingsSlinky.rdfExt.variableMod.VariableExt
import typingsSlinky.rdfJs.mod.NamedNode
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.QuadGraph
import typingsSlinky.rdfJs.mod.QuadObject
import typingsSlinky.rdfJs.mod.QuadPredicate
import typingsSlinky.rdfJs.mod.QuadSubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDataFactoryExt extends Instantiable0[DataFactoryExt] {
  
  def blankNode(): BlankNodeExt = js.native
  def blankNode(value: String): BlankNodeExt = js.native
  
  def dataset(): DatasetExt = js.native
  def dataset(quads: js.Array[Quad]): DatasetExt = js.native
  @JSName("dataset")
  def dataset_graph(quads: js.UndefOr[scala.Nothing], graph: PropType[QuadExt, graph]): DatasetExt = js.native
  @JSName("dataset")
  def dataset_graph(quads: js.Array[Quad], graph: PropType[QuadExt, graph]): DatasetExt = js.native
  
  def defaultGraph(): DefaultGraphExt = js.native
  
  var defaults: Dataset = js.native
  
  def graph(): DatasetExt = js.native
  def graph(quads: js.Any): DatasetExt = js.native
  
  def literal(value: String): LiteralExt = js.native
  def literal(value: String, languageOrDatatype: String): LiteralExt = js.native
  def literal(value: String, languageOrDatatype: NamedNode[String]): LiteralExt = js.native
  
  def namedNode(value: String): NamedNodeExt = js.native
  
  def prefixMap(prefixes: Prefixes): ^ = js.native
  
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): QuadExt = js.native
  
  def triple(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  
  def variable(value: String): VariableExt = js.native
}

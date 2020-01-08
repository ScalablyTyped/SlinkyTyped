package typingsSlinky.rdfDashExt

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.rdfDashExt.libBlankNodeMod.BlankNodeExt
import typingsSlinky.rdfDashExt.libDataFactoryMod.DataFactoryExt
import typingsSlinky.rdfDashExt.libDataFactoryMod.Prefixes
import typingsSlinky.rdfDashExt.libDatasetMod.DatasetExt
import typingsSlinky.rdfDashExt.libDefaultGraphMod.DefaultGraphExt
import typingsSlinky.rdfDashExt.libLiteralMod.LiteralExt
import typingsSlinky.rdfDashExt.libNamedNodeMod.NamedNodeExt
import typingsSlinky.rdfDashExt.libPrefixMapMod.^
import typingsSlinky.rdfDashExt.libQuadMod.QuadExt
import typingsSlinky.rdfDashExt.libUnderscorePropTypeMod.PropType
import typingsSlinky.rdfDashExt.libVariableMod.VariableExt
import typingsSlinky.rdfDashExt.rdfDashExtStrings.graph
import typingsSlinky.rdfDashJs.rdfDashJsMod.BaseQuad
import typingsSlinky.rdfDashJs.rdfDashJsMod.NamedNode
import typingsSlinky.rdfDashJs.rdfDashJsMod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassDataFactoryExt extends Instantiable0[DataFactoryExt] {
  var defaults: Anon_BlankNodeDataset = js.native
  def blankNode(): BlankNodeExt = js.native
  def blankNode(value: String): BlankNodeExt = js.native
  def dataset(): DatasetExt = js.native
  def dataset(quads: js.Array[Quad]): DatasetExt = js.native
  @JSName("dataset")
  def dataset_graph(quads: js.Array[Quad], graph: PropType[QuadExt, graph]): DatasetExt = js.native
  def defaultGraph(): DefaultGraphExt = js.native
  def graph(): DatasetExt = js.native
  def graph(quads: js.Any): DatasetExt = js.native
  def literal(value: String): LiteralExt = js.native
  def literal(value: String, languageOrDatatype: String): LiteralExt = js.native
  def literal(value: String, languageOrDatatype: NamedNode): LiteralExt = js.native
  def namedNode(value: String): NamedNodeExt = js.native
  def prefixMap(prefixes: Prefixes): ^ = js.native
  def quad[Q /* <: BaseQuad */](
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
  ): Q = js.native
  def quad[Q /* <: BaseQuad */](
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any
  ): Q = js.native
  def triple[Q /* <: BaseQuad */](
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
  ): Q = js.native
  def variable(value: String): VariableExt = js.native
}


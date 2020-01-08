package typingsSlinky.rdfDashExt

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.rdfDashExt.libBlankNodeMod.BlankNodeExt
import typingsSlinky.rdfDashExt.libDatasetMod.DatasetExt
import typingsSlinky.rdfDashExt.libDefaultGraphMod.DefaultGraphExt
import typingsSlinky.rdfDashExt.libLiteralMod.LiteralExt
import typingsSlinky.rdfDashExt.libNamedNodeMod.NamedNodeExt
import typingsSlinky.rdfDashExt.libPrefixMapMod.Prefixes
import typingsSlinky.rdfDashExt.libPrefixMapMod.^
import typingsSlinky.rdfDashExt.libQuadMod.QuadExt
import typingsSlinky.rdfDashExt.libVariableMod.VariableExt
import typingsSlinky.rdfDashJs.rdfDashJsMod.DataFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlankNode extends js.Object {
  var BlankNode: BlankNodeExt
  var Dataset: DatasetExt
  var Literal: LiteralExt
  var NamedNode: NamedNodeExt
  var PrefixMap: Instantiable2[/* factory */ DataFactory, /* prefixes */ Prefixes, ^]
  var Quad: QuadExt
  var Variable: VariableExt
  var defaultGraph: DefaultGraphExt
}

object Anon_BlankNode {
  @scala.inline
  def apply(
    BlankNode: BlankNodeExt,
    Dataset: DatasetExt,
    Literal: LiteralExt,
    NamedNode: NamedNodeExt,
    PrefixMap: Instantiable2[/* factory */ DataFactory, /* prefixes */ Prefixes, ^],
    Quad: QuadExt,
    Variable: VariableExt,
    defaultGraph: DefaultGraphExt
  ): Anon_BlankNode = {
    val __obj = js.Dynamic.literal(BlankNode = BlankNode.asInstanceOf[js.Any], Dataset = Dataset.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], NamedNode = NamedNode.asInstanceOf[js.Any], PrefixMap = PrefixMap.asInstanceOf[js.Any], Quad = Quad.asInstanceOf[js.Any], Variable = Variable.asInstanceOf[js.Any], defaultGraph = defaultGraph.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BlankNode]
  }
}


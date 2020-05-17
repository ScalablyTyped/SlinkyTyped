package typingsSlinky.rdfExt.anon

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.rdfExt.blankNodeMod.BlankNodeExt
import typingsSlinky.rdfExt.datasetMod.DatasetExt
import typingsSlinky.rdfExt.defaultGraphMod.DefaultGraphExt
import typingsSlinky.rdfExt.literalMod.LiteralExt
import typingsSlinky.rdfExt.namedNodeMod.NamedNodeExt
import typingsSlinky.rdfExt.prefixMapMod.Prefixes
import typingsSlinky.rdfExt.prefixMapMod.^
import typingsSlinky.rdfExt.quadMod.QuadExt
import typingsSlinky.rdfExt.variableMod.VariableExt
import typingsSlinky.rdfJs.mod.DataFactory
import typingsSlinky.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlankNode extends js.Object {
  var BlankNode: BlankNodeExt = js.native
  var Dataset: DatasetExt = js.native
  var Literal: LiteralExt = js.native
  var NamedNode: NamedNodeExt = js.native
  var PrefixMap: Instantiable2[/* factory */ DataFactory[Quad, Quad], /* prefixes */ Prefixes, ^] = js.native
  var Quad: QuadExt = js.native
  var Variable: VariableExt = js.native
  var defaultGraph: DefaultGraphExt = js.native
}

object BlankNode {
  @scala.inline
  def apply(
    BlankNode: BlankNodeExt,
    Dataset: DatasetExt,
    Literal: LiteralExt,
    NamedNode: NamedNodeExt,
    PrefixMap: Instantiable2[/* factory */ DataFactory[Quad, Quad], /* prefixes */ Prefixes, ^],
    Quad: QuadExt,
    Variable: VariableExt,
    defaultGraph: DefaultGraphExt
  ): BlankNode = {
    val __obj = js.Dynamic.literal(BlankNode = BlankNode.asInstanceOf[js.Any], Dataset = Dataset.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], NamedNode = NamedNode.asInstanceOf[js.Any], PrefixMap = PrefixMap.asInstanceOf[js.Any], Quad = Quad.asInstanceOf[js.Any], Variable = Variable.asInstanceOf[js.Any], defaultGraph = defaultGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlankNode]
  }
  @scala.inline
  implicit class BlankNodeOps[Self <: BlankNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlankNode(value: BlankNodeExt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlankNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataset(value: DatasetExt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiteral(value: LiteralExt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Literal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamedNode(value: NamedNodeExt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixMap(value: Instantiable2[/* factory */ DataFactory[Quad, Quad], /* prefixes */ Prefixes, ^]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrefixMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuad(value: QuadExt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariable(value: VariableExt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultGraph(value: DefaultGraphExt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultGraph")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


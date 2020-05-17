package typingsSlinky.rdfExt.anon

import typingsSlinky.rdfExt.blankNodeMod.BlankNodeExt
import typingsSlinky.rdfExt.datasetMod.DatasetExt
import typingsSlinky.rdfExt.defaultGraphMod.DefaultGraphExt
import typingsSlinky.rdfExt.literalMod.LiteralExt
import typingsSlinky.rdfExt.namedNodeMod.NamedNodeExt
import typingsSlinky.rdfExt.quadMod.QuadExt
import typingsSlinky.rdfExt.variableMod.VariableExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dataset extends js.Object {
  var BlankNode: BlankNodeExt = js.native
  var Dataset: DatasetExt = js.native
  var Literal: LiteralExt = js.native
  var NamedNode: NamedNodeExt = js.native
  var Quad: QuadExt = js.native
  var Variable: VariableExt = js.native
  var defaultGraph: DefaultGraphExt = js.native
}

object Dataset {
  @scala.inline
  def apply(
    BlankNode: BlankNodeExt,
    Dataset: DatasetExt,
    Literal: LiteralExt,
    NamedNode: NamedNodeExt,
    Quad: QuadExt,
    Variable: VariableExt,
    defaultGraph: DefaultGraphExt
  ): Dataset = {
    val __obj = js.Dynamic.literal(BlankNode = BlankNode.asInstanceOf[js.Any], Dataset = Dataset.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], NamedNode = NamedNode.asInstanceOf[js.Any], Quad = Quad.asInstanceOf[js.Any], Variable = Variable.asInstanceOf[js.Any], defaultGraph = defaultGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset]
  }
  @scala.inline
  implicit class DatasetOps[Self <: Dataset] (val x: Self) extends AnyVal {
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


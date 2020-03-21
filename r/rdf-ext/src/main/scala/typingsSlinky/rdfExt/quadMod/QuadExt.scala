package typingsSlinky.rdfExt.quadMod

import typingsSlinky.rdfExt.AnonGraph
import typingsSlinky.rdfExt.blankNodeMod.BlankNodeExt
import typingsSlinky.rdfExt.defaultGraphMod.DefaultGraphExt
import typingsSlinky.rdfExt.literalMod.LiteralExt
import typingsSlinky.rdfExt.namedNodeMod.NamedNodeExt
import typingsSlinky.rdfExt.variableMod.VariableExt
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadExt extends Quad {
  @JSName("graph")
  var graph_QuadExt: DefaultGraphExt | NamedNodeExt | BlankNodeExt | VariableExt
  @JSName("object")
  var object_QuadExt: NamedNodeExt | LiteralExt | BlankNodeExt | VariableExt
  @JSName("predicate")
  var predicate_QuadExt: NamedNodeExt | VariableExt
  @JSName("subject")
  var subject_QuadExt: NamedNodeExt | BlankNodeExt | VariableExt
  def toCanonical(): String
  def toJSON(): AnonGraph
}

object QuadExt {
  @scala.inline
  def apply(
    equals: BaseQuad => Boolean,
    graph: DefaultGraphExt | NamedNodeExt | BlankNodeExt | VariableExt,
    `object`: NamedNodeExt | LiteralExt | BlankNodeExt | VariableExt,
    predicate: NamedNodeExt | VariableExt,
    subject: NamedNodeExt | BlankNodeExt | VariableExt,
    toCanonical: () => String,
    toJSON: () => AnonGraph
  ): QuadExt = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], toCanonical = js.Any.fromFunction0(toCanonical), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadExt]
  }
}


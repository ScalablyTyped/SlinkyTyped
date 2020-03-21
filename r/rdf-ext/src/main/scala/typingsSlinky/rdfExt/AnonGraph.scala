package typingsSlinky.rdfExt

import typingsSlinky.rdfExt.propTypeMod.PropType
import typingsSlinky.rdfExt.quadMod.QuadExt
import typingsSlinky.rdfExt.rdfExtStrings.`object`
import typingsSlinky.rdfExt.rdfExtStrings.graph
import typingsSlinky.rdfExt.rdfExtStrings.predicate
import typingsSlinky.rdfExt.rdfExtStrings.subject
import typingsSlinky.rdfExt.rdfExtStrings.toJSON
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGraph extends js.Object {
  var graph: ReturnType[PropType[PropType[QuadExt, typingsSlinky.rdfExt.rdfExtStrings.graph], toJSON]]
  var `object`: ReturnType[PropType[PropType[QuadExt, typingsSlinky.rdfExt.rdfExtStrings.`object`], toJSON]]
  var predicate: ReturnType[
    PropType[PropType[QuadExt, typingsSlinky.rdfExt.rdfExtStrings.predicate], toJSON]
  ]
  var subject: ReturnType[PropType[PropType[QuadExt, typingsSlinky.rdfExt.rdfExtStrings.subject], toJSON]]
}

object AnonGraph {
  @scala.inline
  def apply(
    graph: ReturnType[PropType[PropType[QuadExt, graph], toJSON]],
    `object`: ReturnType[PropType[PropType[QuadExt, `object`], toJSON]],
    predicate: ReturnType[PropType[PropType[QuadExt, predicate], toJSON]],
    subject: ReturnType[PropType[PropType[QuadExt, subject], toJSON]]
  ): AnonGraph = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGraph]
  }
}


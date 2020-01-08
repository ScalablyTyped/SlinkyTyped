package typingsSlinky.rdfDashExt

import typingsSlinky.rdfDashExt.libQuadMod.QuadExt
import typingsSlinky.rdfDashExt.libUnderscorePropTypeMod.PropType
import typingsSlinky.rdfDashExt.rdfDashExtStrings.`object`
import typingsSlinky.rdfDashExt.rdfDashExtStrings.graph
import typingsSlinky.rdfDashExt.rdfDashExtStrings.predicate
import typingsSlinky.rdfDashExt.rdfDashExtStrings.subject
import typingsSlinky.rdfDashExt.rdfDashExtStrings.toJSON
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Graph extends js.Object {
  var graph: ReturnType[
    PropType[PropType[QuadExt, typingsSlinky.rdfDashExt.rdfDashExtStrings.graph], toJSON]
  ]
  var `object`: ReturnType[
    PropType[PropType[QuadExt, typingsSlinky.rdfDashExt.rdfDashExtStrings.`object`], toJSON]
  ]
  var predicate: ReturnType[
    PropType[PropType[QuadExt, typingsSlinky.rdfDashExt.rdfDashExtStrings.predicate], toJSON]
  ]
  var subject: ReturnType[
    PropType[PropType[QuadExt, typingsSlinky.rdfDashExt.rdfDashExtStrings.subject], toJSON]
  ]
}

object Anon_Graph {
  @scala.inline
  def apply(
    graph: ReturnType[PropType[PropType[QuadExt, graph], toJSON]],
    `object`: ReturnType[PropType[PropType[QuadExt, `object`], toJSON]],
    predicate: ReturnType[PropType[PropType[QuadExt, predicate], toJSON]],
    subject: ReturnType[PropType[PropType[QuadExt, subject], toJSON]]
  ): Anon_Graph = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Graph]
  }
}


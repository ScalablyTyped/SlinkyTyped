package typingsSlinky.rdfExt.anon

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

@js.native
trait Graph extends js.Object {
  var graph: ReturnType[PropType[PropType[QuadExt, typingsSlinky.rdfExt.rdfExtStrings.graph], toJSON]] = js.native
  var `object`: ReturnType[PropType[PropType[QuadExt, typingsSlinky.rdfExt.rdfExtStrings.`object`], toJSON]] = js.native
  var predicate: ReturnType[
    PropType[PropType[QuadExt, typingsSlinky.rdfExt.rdfExtStrings.predicate], toJSON]
  ] = js.native
  var subject: ReturnType[PropType[PropType[QuadExt, typingsSlinky.rdfExt.rdfExtStrings.subject], toJSON]] = js.native
}

object Graph {
  @scala.inline
  def apply(
    graph: ReturnType[PropType[PropType[QuadExt, graph], toJSON]],
    `object`: ReturnType[PropType[PropType[QuadExt, `object`], toJSON]],
    predicate: ReturnType[PropType[PropType[QuadExt, predicate], toJSON]],
    subject: ReturnType[PropType[PropType[QuadExt, subject], toJSON]]
  ): Graph = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
  @scala.inline
  implicit class GraphOps[Self <: Graph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGraph(value: ReturnType[PropType[PropType[QuadExt, graph], toJSON]]): Self = this.set("graph", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: ReturnType[PropType[PropType[QuadExt, `object`], toJSON]]): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicate(value: ReturnType[PropType[PropType[QuadExt, predicate], toJSON]]): Self = this.set("predicate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: ReturnType[PropType[PropType[QuadExt, subject], toJSON]]): Self = this.set("subject", value.asInstanceOf[js.Any])
  }
  
}


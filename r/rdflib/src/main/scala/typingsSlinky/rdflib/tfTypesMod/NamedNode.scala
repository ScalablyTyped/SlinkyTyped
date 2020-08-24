package typingsSlinky.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.rdflib.factoryTypesMod._TFIDFactoryTypes because Already inherited
- typingsSlinky.rdflib.factoryTypesMod._Comparable because Already inherited
- typingsSlinky.rdflib.tfTypesMod.QuadObject because Already inherited */ @js.native
trait NamedNode
  extends Term
     with QuadGraph
     with QuadPredicate
     with QuadSubject {
  @JSName("termType")
  var termType_NamedNode: typingsSlinky.rdflib.rdflibStrings.NamedNode = js.native
}

object NamedNode {
  @scala.inline
  def apply(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.NamedNode, value: String): NamedNode = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedNode]
  }
  @scala.inline
  implicit class NamedNodeOps[Self <: NamedNode] (val x: Self) extends AnyVal {
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
    def setTermType(value: typingsSlinky.rdflib.rdflibStrings.NamedNode): Self = this.set("termType", value.asInstanceOf[js.Any])
  }
  
}


package typingsSlinky.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.rdflib.factoryTypesMod._TFIDFactoryTypes because Already inherited
- typingsSlinky.rdflib.factoryTypesMod._Comparable because Already inherited
- typingsSlinky.rdflib.tfTypesMod.QuadObject because Already inherited */ trait BlankNode
  extends Term
     with QuadGraph
     with QuadSubject {
  @JSName("termType")
  var termType_BlankNode: typingsSlinky.rdflib.rdflibStrings.BlankNode
}

object BlankNode {
  @scala.inline
  def apply(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.BlankNode, value: String): BlankNode = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlankNode]
  }
}


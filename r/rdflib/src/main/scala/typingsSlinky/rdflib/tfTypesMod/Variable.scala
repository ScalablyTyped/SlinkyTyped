package typingsSlinky.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.rdflib.factoryTypesMod._TFIDFactoryTypes because Already inherited
- typingsSlinky.rdflib.tfTypesMod.QuadObject because Already inherited */ trait Variable
  extends Term
     with QuadGraph
     with QuadPredicate
     with QuadSubject {
  /** Contains the constant "Variable". */
  @JSName("termType")
  var termType_Variable: typingsSlinky.rdflib.rdflibStrings.Variable
}

object Variable {
  @scala.inline
  def apply(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.Variable, value: String): Variable = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
}


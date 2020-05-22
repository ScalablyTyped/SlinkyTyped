package typingsSlinky.rdflib.tfTypesMod

import typingsSlinky.rdflib.rdflibStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultGraph
  extends Term
     with QuadGraph {
  @JSName("termType")
  var termType_DefaultGraph: typingsSlinky.rdflib.rdflibStrings.DefaultGraph
  /** should return and empty string'' */
  @JSName("value")
  var value_DefaultGraph: _empty
}

object DefaultGraph {
  @scala.inline
  def apply(equals: Term => Boolean, termType: typingsSlinky.rdflib.rdflibStrings.DefaultGraph, value: _empty): DefaultGraph = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultGraph]
  }
}


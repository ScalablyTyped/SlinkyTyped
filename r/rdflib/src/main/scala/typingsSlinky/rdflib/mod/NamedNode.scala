package typingsSlinky.rdflib.mod

import typingsSlinky.rdflib.namedNodeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdflib", "NamedNode")
@js.native
class NamedNode protected () extends default {
  /**
    * Create a named (IRI) RDF Node
    * @constructor
    * @param iri - The IRI for this node
    */
  def this(iri: String) = this()
}
/* static members */
@JSImport("rdflib", "NamedNode")
@js.native
object NamedNode extends js.Object {
  
  /**
    * Creates a named node from the specified input value
    * @param value - An input value
    */
  def fromValue(value: js.Any): js.Any = js.native
}

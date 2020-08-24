package typingsSlinky.rdfJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rdfJs.mod.DefaultGraph
    - typingsSlinky.rdfJs.mod.NamedNode[java.lang.String]
    - typingsSlinky.rdfJs.mod.BlankNode
    - typingsSlinky.rdfJs.mod.Variable
  */
  type QuadGraph = typingsSlinky.rdfJs.mod._QuadGraph | typingsSlinky.rdfJs.mod.NamedNode[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rdfJs.mod.NamedNode[java.lang.String]
    - typingsSlinky.rdfJs.mod.Literal
    - typingsSlinky.rdfJs.mod.BlankNode
    - typingsSlinky.rdfJs.mod.Variable
  */
  type QuadObject = typingsSlinky.rdfJs.mod._QuadObject | typingsSlinky.rdfJs.mod.NamedNode[java.lang.String]
  type QuadPredicate = typingsSlinky.rdfJs.mod.NamedNode[java.lang.String] | typingsSlinky.rdfJs.mod.Variable
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rdfJs.mod.NamedNode[java.lang.String]
    - typingsSlinky.rdfJs.mod.BlankNode
    - typingsSlinky.rdfJs.mod.Variable
  */
  type QuadSubject = typingsSlinky.rdfJs.mod._QuadSubject | typingsSlinky.rdfJs.mod.NamedNode[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rdfJs.mod.NamedNode[java.lang.String]
    - typingsSlinky.rdfJs.mod.BlankNode
    - typingsSlinky.rdfJs.mod.Literal
    - typingsSlinky.rdfJs.mod.Variable
    - typingsSlinky.rdfJs.mod.DefaultGraph
  */
  type Term = typingsSlinky.rdfJs.mod._Term | typingsSlinky.rdfJs.mod.NamedNode[java.lang.String]
}

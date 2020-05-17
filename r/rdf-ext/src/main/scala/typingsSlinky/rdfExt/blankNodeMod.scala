package typingsSlinky.rdfExt

import typingsSlinky.rdfExt.anon.TermType
import typingsSlinky.rdfJs.mod.BlankNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/BlankNode", JSImport.Namespace)
@js.native
object blankNodeMod extends js.Object {
  @js.native
  trait BlankNodeExt extends BlankNode {
    def toCanonical(): String = js.native
    def toJSON(): TermType = js.native
  }
  
}


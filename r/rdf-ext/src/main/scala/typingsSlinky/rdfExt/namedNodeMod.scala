package typingsSlinky.rdfExt

import typingsSlinky.rdfExt.anon.TermTypeValue
import typingsSlinky.rdfJs.mod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdf-ext/lib/NamedNode", JSImport.Namespace)
@js.native
object namedNodeMod extends js.Object {
  
  @js.native
  trait NamedNodeExt extends NamedNode[String] {
    
    def toCanonical(): String = js.native
    
    def toJSON(): TermTypeValue = js.native
  }
}

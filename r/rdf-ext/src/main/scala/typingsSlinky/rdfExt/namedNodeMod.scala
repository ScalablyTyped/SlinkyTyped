package typingsSlinky.rdfExt

import typingsSlinky.rdfExt.anon.TermTypeValue
import typingsSlinky.rdfJs.mod.NamedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namedNodeMod {
  
  @js.native
  trait NamedNodeExt[Iri /* <: String */] extends NamedNode[Iri] {
    
    def toCanonical(): String = js.native
    
    def toJSON(): TermTypeValue = js.native
  }
}

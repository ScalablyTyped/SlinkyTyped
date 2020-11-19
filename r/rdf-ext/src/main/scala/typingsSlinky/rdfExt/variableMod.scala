package typingsSlinky.rdfExt

import typingsSlinky.rdfExt.anon.TermTypePropType
import typingsSlinky.rdfJs.mod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdf-ext/lib/Variable", JSImport.Namespace)
@js.native
object variableMod extends js.Object {
  
  @js.native
  trait VariableExt extends Variable {
    
    def toCanonical(): String = js.native
    
    def toJSON(): TermTypePropType = js.native
  }
}

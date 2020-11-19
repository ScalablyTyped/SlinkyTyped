package typingsSlinky.rdfExt

import typingsSlinky.rdfExt.anon.Graph
import typingsSlinky.rdfExt.blankNodeMod.BlankNodeExt
import typingsSlinky.rdfExt.defaultGraphMod.DefaultGraphExt
import typingsSlinky.rdfExt.literalMod.LiteralExt
import typingsSlinky.rdfExt.namedNodeMod.NamedNodeExt
import typingsSlinky.rdfExt.variableMod.VariableExt
import typingsSlinky.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdf-ext/lib/Quad", JSImport.Namespace)
@js.native
object quadMod extends js.Object {
  
  @js.native
  trait QuadExt extends Quad {
    
    @JSName("graph")
    var graph_QuadExt: DefaultGraphExt | NamedNodeExt | BlankNodeExt | VariableExt = js.native
    
    @JSName("object")
    var object_QuadExt: NamedNodeExt | LiteralExt | BlankNodeExt | VariableExt = js.native
    
    @JSName("predicate")
    var predicate_QuadExt: NamedNodeExt | VariableExt = js.native
    
    @JSName("subject")
    var subject_QuadExt: NamedNodeExt | BlankNodeExt | VariableExt = js.native
    
    def toCanonical(): String = js.native
    
    def toJSON(): Graph = js.native
  }
}

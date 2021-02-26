package typingsSlinky.rdfExt

import typingsSlinky.rdfExt.anon.Graph
import typingsSlinky.rdfExt.blankNodeMod.BlankNodeExt
import typingsSlinky.rdfExt.defaultGraphMod.DefaultGraphExt
import typingsSlinky.rdfExt.literalMod.LiteralExt
import typingsSlinky.rdfExt.namedNodeMod.NamedNodeExt
import typingsSlinky.rdfExt.rdfExtStrings._empty
import typingsSlinky.rdfExt.variableMod.VariableExt
import typingsSlinky.rdfJs.mod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quadMod {
  
  @js.native
  trait QuadExt extends Quad {
    
    @JSName("graph")
    var graph_QuadExt: DefaultGraphExt | NamedNodeExt[String] | BlankNodeExt | VariableExt = js.native
    
    @JSName("object")
    var object_QuadExt: NamedNodeExt[String] | LiteralExt | BlankNodeExt | VariableExt = js.native
    
    @JSName("predicate")
    var predicate_QuadExt: NamedNodeExt[String] | VariableExt = js.native
    
    @JSName("subject")
    var subject_QuadExt: NamedNodeExt[String] | BlankNodeExt | VariableExt = js.native
    
    @JSName("termType")
    var termType_QuadExt: typingsSlinky.rdfExt.rdfExtStrings.Quad = js.native
    
    def toCanonical(): String = js.native
    
    def toJSON(): Graph = js.native
    
    @JSName("value")
    var value_QuadExt: _empty = js.native
  }
}

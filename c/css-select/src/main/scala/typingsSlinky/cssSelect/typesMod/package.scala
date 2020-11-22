package typingsSlinky.cssSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type CompileToken[Node, ElementNode /* <: Node */] = js.Function3[
    /* token */ js.Array[js.Array[typingsSlinky.cssSelect.typesMod.InternalSelector]], 
    /* options */ typingsSlinky.cssSelect.typesMod.InternalOptions[Node, ElementNode], 
    /* context */ js.UndefOr[js.Array[ElementNode]], 
    typingsSlinky.cssSelect.typesMod.CompiledQuery[ElementNode]
  ]
  
  type InternalSelector = typingsSlinky.cssWhat.parseMod.Selector | typingsSlinky.cssSelect.anon.Type
  
  type Predicate[Value] = js.Function1[/* v */ Value, scala.Boolean]
  
  type Query[ElementNode] = java.lang.String | typingsSlinky.cssSelect.typesMod.CompiledQuery[ElementNode]
}

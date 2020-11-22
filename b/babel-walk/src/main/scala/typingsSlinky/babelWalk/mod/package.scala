package typingsSlinky.babelWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AncestorFunction[TKey /* <: java.lang.String */, TState] = js.Function3[
    /* node */ typingsSlinky.babelWalk.mod.NodeType[TKey], 
    /* state */ TState, 
    /* ancestors */ js.Array[typingsSlinky.babelTypes.mod.Node], 
    scala.Unit
  ]
  
  type NodeType[`type` /* <: java.lang.String */] = (typingsSlinky.std.Extract[typingsSlinky.babelTypes.mod.Node, typingsSlinky.babelWalk.anon.Type[`type`]]) | (/* import warning: importer.ImportType#apply Failed type conversion: @babel/types.@babel/types.Aliases[type] */ js.Any)
  
  type SimpleFunction[TKey /* <: java.lang.String */, TState] = js.Function2[
    /* node */ typingsSlinky.babelWalk.mod.NodeType[TKey], 
    /* state */ TState, 
    scala.Unit
  ]
}

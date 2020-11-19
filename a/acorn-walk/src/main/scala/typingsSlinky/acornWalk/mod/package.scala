package typingsSlinky.acornWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AncestorVisitors[TState] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.acornWalk.mod.AncestorWalkerFn[TState]]
  
  type AncestorWalkerFn[TState] = js.Function3[
    /* node */ typingsSlinky.acorn.mod.Node, 
    /* state */ TState | js.Array[typingsSlinky.acorn.mod.Node], 
    /* ancestors */ js.Array[typingsSlinky.acorn.mod.Node], 
    scala.Unit
  ]
  
  type FindPredicate = js.Function2[/* type */ java.lang.String, /* node */ typingsSlinky.acorn.mod.Node, scala.Boolean]
  
  type FullAncestorWalkerCallback[TState] = js.Function4[
    /* node */ typingsSlinky.acorn.mod.Node, 
    /* state */ TState | js.Array[typingsSlinky.acorn.mod.Node], 
    /* ancestors */ js.Array[typingsSlinky.acorn.mod.Node], 
    /* type */ java.lang.String, 
    scala.Unit
  ]
  
  type FullWalkerCallback[TState] = js.Function3[
    /* node */ typingsSlinky.acorn.mod.Node, 
    /* state */ TState, 
    /* type */ java.lang.String, 
    scala.Unit
  ]
  
  type RecursiveVisitors[TState] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.acornWalk.mod.RecursiveWalkerFn[TState]]
  
  type RecursiveWalkerFn[TState] = js.Function3[
    /* node */ typingsSlinky.acorn.mod.Node, 
    /* state */ TState, 
    /* callback */ typingsSlinky.acornWalk.mod.WalkerCallback[TState], 
    scala.Unit
  ]
  
  type SimpleVisitors[TState] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.acornWalk.mod.SimpleWalkerFn[TState]]
  
  type SimpleWalkerFn[TState] = js.Function2[/* node */ typingsSlinky.acorn.mod.Node, /* state */ TState, scala.Unit]
  
  type WalkerCallback[TState] = js.Function2[/* node */ typingsSlinky.acorn.mod.Node, /* state */ TState, scala.Unit]
}

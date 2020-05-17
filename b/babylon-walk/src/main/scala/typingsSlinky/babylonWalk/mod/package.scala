package typingsSlinky.babylonWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AncestorStatelessVisitor = js.Function3[
    /* node */ typingsSlinky.babylonWalk.mod.NodeTypes, 
    /* state */ js.Any, 
    /* ancestors */ js.Array[typingsSlinky.babelTypes.mod.Node], 
    scala.Unit
  ]
  type AncestorVisitor = js.Function3[
    /* node */ typingsSlinky.babylonWalk.mod.NodeTypes, 
    /* state */ js.Any, 
    /* ancestors */ js.Array[typingsSlinky.babelTypes.mod.Node], 
    scala.Unit
  ]
  type RecursiveVisitor = js.Function3[
    /* node */ typingsSlinky.babylonWalk.mod.NodeTypes, 
    /* state */ js.Any, 
    /* next */ js.Function1[/* node */ typingsSlinky.babelTypes.mod.Node, scala.Unit], 
    scala.Unit
  ]
  type SimpleVisitor = js.Function2[/* node */ typingsSlinky.babylonWalk.mod.NodeTypes, /* state */ js.Any, scala.Unit]
  type Visitor = js.Function2[
    /* commentBlock */ typingsSlinky.babylonWalk.mod.NodeTypes, 
    /* state */ js.Any, 
    scala.Unit
  ]
}

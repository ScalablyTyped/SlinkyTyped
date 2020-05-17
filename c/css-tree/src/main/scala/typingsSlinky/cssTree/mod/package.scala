package typingsSlinky.cssTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EnterOrLeaveFn[NodeType] = js.ThisFunction3[
    /* this */ typingsSlinky.cssTree.mod.WalkContext, 
    /* node */ NodeType, 
    /* item */ typingsSlinky.cssTree.mod.ListItem[typingsSlinky.cssTree.mod.CssNode], 
    /* list */ typingsSlinky.cssTree.mod.List[typingsSlinky.cssTree.mod.CssNode], 
    scala.Unit
  ]
  type FilterFn[TData, TResult /* <: TData */, TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* item */ TData, 
    /* node */ typingsSlinky.cssTree.mod.ListItem[TData], 
    /* list */ typingsSlinky.cssTree.mod.List[TData], 
    /* is TResult */ scala.Boolean
  ]
  type FindFn = js.ThisFunction3[
    /* this */ typingsSlinky.cssTree.mod.WalkContext, 
    /* node */ typingsSlinky.cssTree.mod.CssNode, 
    /* item */ typingsSlinky.cssTree.mod.ListItem[typingsSlinky.cssTree.mod.CssNode], 
    /* list */ typingsSlinky.cssTree.mod.List[typingsSlinky.cssTree.mod.CssNode], 
    scala.Boolean
  ]
  type IteratorFn[TData, TResult, TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* item */ TData, 
    /* node */ typingsSlinky.cssTree.mod.ListItem[TData], 
    /* list */ typingsSlinky.cssTree.mod.List[TData], 
    TResult
  ]
}

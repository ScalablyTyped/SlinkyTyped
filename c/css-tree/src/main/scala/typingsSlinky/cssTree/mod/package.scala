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
  type WalkOptions = (typingsSlinky.cssTree.mod.WalkOptionsVisit[
    typingsSlinky.cssTree.mod.AnPlusB | typingsSlinky.cssTree.mod.Atrule | typingsSlinky.cssTree.mod.AtrulePrelude | typingsSlinky.cssTree.mod.AttributeSelector | typingsSlinky.cssTree.mod.Block | typingsSlinky.cssTree.mod.Brackets | typingsSlinky.cssTree.mod.CDC | typingsSlinky.cssTree.mod.CDO | typingsSlinky.cssTree.mod.ClassSelector | typingsSlinky.cssTree.mod.Combinator | typingsSlinky.cssTree.mod.Comment | typingsSlinky.cssTree.mod.Declaration | typingsSlinky.cssTree.mod.DeclarationList | typingsSlinky.cssTree.mod.Dimension | typingsSlinky.cssTree.mod.FunctionNode | typingsSlinky.cssTree.mod.HexColor | typingsSlinky.cssTree.mod.IdSelector | typingsSlinky.cssTree.mod.Identifier | typingsSlinky.cssTree.mod.MediaFeature | typingsSlinky.cssTree.mod.MediaQuery | typingsSlinky.cssTree.mod.MediaQueryList | typingsSlinky.cssTree.mod.Nth | typingsSlinky.cssTree.mod.NumberNode | typingsSlinky.cssTree.mod.Operator | typingsSlinky.cssTree.mod.Parentheses | typingsSlinky.cssTree.mod.Percentage | typingsSlinky.cssTree.mod.PseudoClassSelector | typingsSlinky.cssTree.mod.PseudoElementSelector | typingsSlinky.cssTree.mod.Ratio | typingsSlinky.cssTree.mod.Raw | typingsSlinky.cssTree.mod.Rule | typingsSlinky.cssTree.mod.Selector | typingsSlinky.cssTree.mod.SelectorList | typingsSlinky.cssTree.mod.StringNode | typingsSlinky.cssTree.mod.StyleSheet | typingsSlinky.cssTree.mod.TypeSelector | typingsSlinky.cssTree.mod.UnicodeRange | typingsSlinky.cssTree.mod.Url | typingsSlinky.cssTree.mod.Value | typingsSlinky.cssTree.mod.WhiteSpace
  ]) | typingsSlinky.cssTree.mod.WalkOptionsNoVisit
}

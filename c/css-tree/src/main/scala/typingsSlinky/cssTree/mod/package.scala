package typingsSlinky.cssTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DSWalkEnterOrLeaveFn = js.Function1[/* node */ typingsSlinky.cssTree.mod.DSNode, scala.Unit]
  
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
  
  @scala.inline
  def clone_(node: typingsSlinky.cssTree.mod.CssNode): typingsSlinky.cssTree.mod.CssNode = typingsSlinky.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clone")(node.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.cssTree.mod.CssNode]
  
  @scala.inline
  def definitionSyntax: typingsSlinky.cssTree.mod.DefinitionSyntax_ = typingsSlinky.cssTree.mod.^.asInstanceOf[js.Dynamic].selectDynamic("definitionSyntax").asInstanceOf[typingsSlinky.cssTree.mod.DefinitionSyntax_]
  
  @scala.inline
  def find(ast: typingsSlinky.cssTree.mod.CssNode, fn: typingsSlinky.cssTree.mod.FindFn): typingsSlinky.cssTree.mod.CssNode = (typingsSlinky.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("find")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cssTree.mod.CssNode]
  
  @scala.inline
  def findAll(ast: typingsSlinky.cssTree.mod.CssNode, fn: typingsSlinky.cssTree.mod.FindFn): js.Array[typingsSlinky.cssTree.mod.CssNode] = (typingsSlinky.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findAll")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.cssTree.mod.CssNode]]
  
  @scala.inline
  def findLast(ast: typingsSlinky.cssTree.mod.CssNode, fn: typingsSlinky.cssTree.mod.FindFn): typingsSlinky.cssTree.mod.CssNode = (typingsSlinky.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findLast")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cssTree.mod.CssNode]
  
  @scala.inline
  def fromPlainObject(node: typingsSlinky.cssTree.mod.CssNodePlain): typingsSlinky.cssTree.mod.CssNode = typingsSlinky.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fromPlainObject")(node.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.cssTree.mod.CssNode]
  
  @scala.inline
  def generate(ast: typingsSlinky.cssTree.mod.CssNode): java.lang.String = typingsSlinky.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def generate(ast: typingsSlinky.cssTree.mod.CssNode, options: typingsSlinky.cssTree.mod.GenerateOptions): java.lang.String = (typingsSlinky.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def keyword(value: java.lang.String): typingsSlinky.cssTree.mod.Keyword_ = typingsSlinky.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("keyword")(value.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.cssTree.mod.Keyword_]
  
  @scala.inline
  def parse(text: java.lang.String): typingsSlinky.cssTree.mod.CssNode = typingsSlinky.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.cssTree.mod.CssNode]
  @scala.inline
  def parse(text: java.lang.String, options: typingsSlinky.cssTree.mod.ParseOptions): typingsSlinky.cssTree.mod.CssNode = (typingsSlinky.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cssTree.mod.CssNode]
  
  @scala.inline
  def property(value: java.lang.String): typingsSlinky.cssTree.mod.Property_ = typingsSlinky.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("property")(value.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.cssTree.mod.Property_]
  
  @scala.inline
  def toPlainObject(node: typingsSlinky.cssTree.mod.CssNode): typingsSlinky.cssTree.mod.CssNodePlain = typingsSlinky.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toPlainObject")(node.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.cssTree.mod.CssNodePlain]
  
  @scala.inline
  def walk(
    ast: typingsSlinky.cssTree.mod.CssNode,
    options: typingsSlinky.cssTree.mod.EnterOrLeaveFn[typingsSlinky.cssTree.mod.CssNode]
  ): scala.Unit = (typingsSlinky.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("walk")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def walk(ast: typingsSlinky.cssTree.mod.CssNode, options: typingsSlinky.cssTree.mod.WalkOptions): scala.Unit = (typingsSlinky.cssTree.mod.^.asInstanceOf[js.Dynamic].applyDynamic("walk")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}

package typingsSlinky.esquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /** Query the code AST using the selector string. */
  @scala.inline
  def apply(ast: typingsSlinky.estree.mod.Node, selector: java.lang.String): js.Array[typingsSlinky.estree.mod.Node] = (typingsSlinky.esquery.mod.^.asInstanceOf[js.Dynamic].apply(ast.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.estree.mod.Node]]
  
  /** From a JS AST and a selector AST, collect all JS AST nodes that match the selector. */
  @scala.inline
  def `match`(ast: typingsSlinky.estree.mod.Node, selector: typingsSlinky.esquery.mod.Selector): js.Array[typingsSlinky.estree.mod.Node] = (typingsSlinky.esquery.mod.^.asInstanceOf[js.Dynamic].applyDynamic("match")(ast.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.estree.mod.Node]]
  
  /** Given a `node` and its ancestors, determine if `node` is matched by `selector`. */
  @scala.inline
  def matches(
    node: typingsSlinky.estree.mod.Node,
    selector: typingsSlinky.esquery.mod.Selector,
    ancestry: js.Array[typingsSlinky.estree.mod.Node]
  ): scala.Boolean = (typingsSlinky.esquery.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matches")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], ancestry.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  /** Parse a selector and return its AST. */
  @scala.inline
  def parse(selector: java.lang.String): typingsSlinky.esquery.mod.Selector = typingsSlinky.esquery.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(selector.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.esquery.mod.Selector]
  
  /** Query the code AST using the selector string. */
  @scala.inline
  def query(ast: typingsSlinky.estree.mod.Node, selector: java.lang.String): js.Array[typingsSlinky.estree.mod.Node] = (typingsSlinky.esquery.mod.^.asInstanceOf[js.Dynamic].applyDynamic("query")(ast.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.estree.mod.Node]]
}

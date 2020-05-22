package typingsSlinky.eslint.mod.Scope

import typingsSlinky.eslint.eslintStrings.ClassName
import typingsSlinky.eslint.eslintStrings.FunctionName
import typingsSlinky.eslint.eslintStrings.ImplicitGlobalVariable
import typingsSlinky.eslint.eslintStrings.ImportBinding
import typingsSlinky.eslint.eslintStrings.Parameter
import typingsSlinky.eslint.eslintStrings.TDZ
import typingsSlinky.estree.mod.ArrowFunctionExpression
import typingsSlinky.estree.mod.CatchClause
import typingsSlinky.estree.mod.ClassDeclaration
import typingsSlinky.estree.mod.ClassExpression
import typingsSlinky.estree.mod.FunctionDeclaration
import typingsSlinky.estree.mod.FunctionExpression
import typingsSlinky.estree.mod.ImportDeclaration
import typingsSlinky.estree.mod.ImportDefaultSpecifier
import typingsSlinky.estree.mod.ImportNamespaceSpecifier
import typingsSlinky.estree.mod.ImportSpecifier
import typingsSlinky.estree.mod.Program
import typingsSlinky.estree.mod.VariableDeclaration
import typingsSlinky.estree.mod.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.eslint.anon.Node
  - typingsSlinky.eslint.anon.Parent
  - typingsSlinky.eslint.anon.Type
  - typingsSlinky.eslint.anon.NodeParent
  - typingsSlinky.eslint.anon.ParentType
  - typingsSlinky.eslint.anon.NodeParentType
  - typingsSlinky.eslint.anon.NodeAny
  - typingsSlinky.eslint.anon.NodeVariableDeclarator
*/
trait DefinitionType extends js.Object

object DefinitionType {
  @scala.inline
  def NodeAny(node: js.Any, parent: Null, `type`: TDZ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def NodeParentType(
    node: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression,
    parent: Null,
    `type`: Parameter
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Node(node: CatchClause, parent: Null, `type`: typingsSlinky.eslint.eslintStrings.CatchClause): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def NodeVariableDeclarator(
    node: VariableDeclarator,
    parent: VariableDeclaration,
    `type`: typingsSlinky.eslint.eslintStrings.Variable
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Type(node: FunctionDeclaration | FunctionExpression, parent: Null, `type`: FunctionName): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def NodeParent(node: Program, parent: Null, `type`: ImplicitGlobalVariable): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Parent(node: ClassDeclaration | ClassExpression, parent: Null, `type`: ClassName): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def ParentType(
    node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier,
    parent: ImportDeclaration,
    `type`: ImportBinding
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
}


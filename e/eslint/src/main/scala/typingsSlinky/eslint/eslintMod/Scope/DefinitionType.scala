package typingsSlinky.eslint.eslintMod.Scope

import typingsSlinky.eslint.eslintStrings.ClassName
import typingsSlinky.eslint.eslintStrings.FunctionName
import typingsSlinky.eslint.eslintStrings.ImplicitGlobalVariable
import typingsSlinky.eslint.eslintStrings.ImportBinding
import typingsSlinky.eslint.eslintStrings.Parameter
import typingsSlinky.eslint.eslintStrings.TDZ
import typingsSlinky.estree.estreeMod.ArrowFunctionExpression
import typingsSlinky.estree.estreeMod.CatchClause
import typingsSlinky.estree.estreeMod.ClassDeclaration
import typingsSlinky.estree.estreeMod.ClassExpression
import typingsSlinky.estree.estreeMod.FunctionDeclaration
import typingsSlinky.estree.estreeMod.FunctionExpression
import typingsSlinky.estree.estreeMod.ImportDeclaration
import typingsSlinky.estree.estreeMod.ImportDefaultSpecifier
import typingsSlinky.estree.estreeMod.ImportNamespaceSpecifier
import typingsSlinky.estree.estreeMod.ImportSpecifier
import typingsSlinky.estree.estreeMod.Program
import typingsSlinky.estree.estreeMod.VariableDeclaration
import typingsSlinky.estree.estreeMod.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eslint.Anon_CatchClause
  - typings.eslint.Anon_ClassName
  - typings.eslint.Anon_FunctionName
  - typings.eslint.Anon_ImplicitGlobalVariable
  - typings.eslint.Anon_ImportBinding
  - typings.eslint.Anon_Node
  - typings.eslint.Anon_NodeParent
  - typings.eslint.Anon_NodeParentType
*/
trait DefinitionType extends js.Object

object DefinitionType {
  @scala.inline
  def Anon_ImplicitGlobalVariable(node: Program, parent: Null, `type`: ImplicitGlobalVariable): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Anon_NodeParent(node: js.Any, parent: Null, `type`: TDZ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Anon_FunctionName(node: FunctionDeclaration | FunctionExpression, parent: Null, `type`: FunctionName): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Anon_CatchClause(node: CatchClause, parent: Null, `type`: typingsSlinky.eslint.eslintStrings.CatchClause): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Anon_ImportBinding(
    node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier,
    parent: ImportDeclaration,
    `type`: ImportBinding
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Anon_ClassName(node: ClassDeclaration | ClassExpression, parent: Null, `type`: ClassName): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Anon_Node(
    node: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression,
    parent: Null,
    `type`: Parameter
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
  @scala.inline
  def Anon_NodeParentType(
    node: VariableDeclarator,
    parent: VariableDeclaration,
    `type`: typingsSlinky.eslint.eslintStrings.Variable
  ): DefinitionType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionType]
  }
}


package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.Identifier
  - typingsSlinky.estree.mod.Literal
  - typingsSlinky.estree.mod.Program
  - typingsSlinky.estree.mod.Function
  - typingsSlinky.estree.mod.SwitchCase
  - typingsSlinky.estree.mod.CatchClause
  - typingsSlinky.estree.mod.VariableDeclarator
  - typingsSlinky.estree.mod.Statement
  - typingsSlinky.estree.mod.Expression
  - typingsSlinky.estree.mod.Property
  - typingsSlinky.estree.mod.AssignmentProperty
  - typingsSlinky.estree.mod.Super
  - typingsSlinky.estree.mod.TemplateElement
  - typingsSlinky.estree.mod.SpreadElement
  - typingsSlinky.estree.mod.Pattern
  - typingsSlinky.estree.mod.ClassBody
  - typingsSlinky.estree.mod.Class
  - typingsSlinky.estree.mod.MethodDefinition
  - typingsSlinky.estree.mod.ModuleDeclaration
  - typingsSlinky.estree.mod.ModuleSpecifier
*/
trait Node extends js.Object

object Node {
  @scala.inline
  implicit def apply(value: AssignmentProperty): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: CatchClause): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Class): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: ClassBody): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Expression): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Function): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Identifier): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Literal): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: MethodDefinition): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: ModuleDeclaration): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: ModuleSpecifier): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Pattern): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Program): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Property): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: SpreadElement): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Statement): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Super): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: SwitchCase): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: TemplateElement): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: VariableDeclarator): Node = value.asInstanceOf[Node]
}


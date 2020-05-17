package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.BlockStatement_
  - typingsSlinky.babelTypes.mod.CatchClause_
  - typingsSlinky.babelTypes.mod.DoWhileStatement_
  - typingsSlinky.babelTypes.mod.ForInStatement_
  - typingsSlinky.babelTypes.mod.ForStatement_
  - typingsSlinky.babelTypes.mod.FunctionDeclaration_
  - typingsSlinky.babelTypes.mod.FunctionExpression_
  - typingsSlinky.babelTypes.mod.Program_
  - typingsSlinky.babelTypes.mod.ObjectMethod_
  - typingsSlinky.babelTypes.mod.SwitchStatement_
  - typingsSlinky.babelTypes.mod.WhileStatement_
  - typingsSlinky.babelTypes.mod.ArrowFunctionExpression_
  - typingsSlinky.babelTypes.mod.ForOfStatement_
  - typingsSlinky.babelTypes.mod.ClassMethod_
  - typingsSlinky.babelTypes.mod.ClassPrivateMethod_
  - typingsSlinky.babelTypes.mod.TSModuleBlock_
*/
trait BlockParent extends Node

object BlockParent {
  @scala.inline
  implicit def apply(value: ArrowFunctionExpression_): BlockParent = value.asInstanceOf[BlockParent]
  @scala.inline
  implicit def apply(value: BlockStatement_): BlockParent = value.asInstanceOf[BlockParent]
  @scala.inline
  implicit def apply(value: CatchClause_): BlockParent = value.asInstanceOf[BlockParent]
  @scala.inline
  implicit def apply(value: ClassMethod_): BlockParent = value.asInstanceOf[BlockParent]
  @scala.inline
  implicit def apply(value: ClassPrivateMethod_): BlockParent = value.asInstanceOf[BlockParent]
  @scala.inline
  implicit def apply(value: DoWhileStatement_): BlockParent = value.asInstanceOf[BlockParent]
  @scala.inline
  implicit def apply(value: ForInStatement_): BlockParent = value.asInstanceOf[BlockParent]
  @scala.inline
  implicit def apply(value: ForOfStatement_): BlockParent = value.asInstanceOf[BlockParent]
  @scala.inline
  implicit def apply(value: ForStatement_): BlockParent = value.asInstanceOf[BlockParent]
  @scala.inline
  implicit def apply(value: FunctionDeclaration_): BlockParent = value.asInstanceOf[BlockParent]
  @scala.inline
  implicit def apply(value: FunctionExpression_): BlockParent = value.asInstanceOf[BlockParent]
  @scala.inline
  implicit def apply(value: ObjectMethod_): BlockParent = value.asInstanceOf[BlockParent]
  @scala.inline
  implicit def apply(value: Program_): BlockParent = value.asInstanceOf[BlockParent]
  @scala.inline
  implicit def apply(value: SwitchStatement_): BlockParent = value.asInstanceOf[BlockParent]
  @scala.inline
  implicit def apply(value: TSModuleBlock_): BlockParent = value.asInstanceOf[BlockParent]
  @scala.inline
  implicit def apply(value: WhileStatement_): BlockParent = value.asInstanceOf[BlockParent]
}


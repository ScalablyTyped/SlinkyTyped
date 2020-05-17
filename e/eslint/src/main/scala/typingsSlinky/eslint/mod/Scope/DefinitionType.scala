package typingsSlinky.eslint.mod.Scope

import typingsSlinky.eslint.anon.Node
import typingsSlinky.eslint.anon.NodeAny
import typingsSlinky.eslint.anon.NodeParent
import typingsSlinky.eslint.anon.NodeParentType
import typingsSlinky.eslint.anon.NodeVariableDeclarator
import typingsSlinky.eslint.anon.Parent
import typingsSlinky.eslint.anon.ParentType
import typingsSlinky.eslint.anon.Type
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
  implicit def apply(value: Node): DefinitionType = value.asInstanceOf[DefinitionType]
  @scala.inline
  implicit def apply(value: NodeAny): DefinitionType = value.asInstanceOf[DefinitionType]
  @scala.inline
  implicit def apply(value: NodeParent): DefinitionType = value.asInstanceOf[DefinitionType]
  @scala.inline
  implicit def apply(value: NodeParentType): DefinitionType = value.asInstanceOf[DefinitionType]
  @scala.inline
  implicit def apply(value: NodeVariableDeclarator): DefinitionType = value.asInstanceOf[DefinitionType]
  @scala.inline
  implicit def apply(value: Parent): DefinitionType = value.asInstanceOf[DefinitionType]
  @scala.inline
  implicit def apply(value: ParentType): DefinitionType = value.asInstanceOf[DefinitionType]
  @scala.inline
  implicit def apply(value: Type): DefinitionType = value.asInstanceOf[DefinitionType]
}


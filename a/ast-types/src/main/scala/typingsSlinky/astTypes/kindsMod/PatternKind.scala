package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectPattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName
import typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.RestElement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParameterProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.RestElement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParameterProperty
*/
trait PatternKind extends js.Object

object PatternKind {
  @scala.inline
  implicit def apply(value: ArrayPattern): PatternKind = value.asInstanceOf[PatternKind]
  @scala.inline
  implicit def apply(value: AssignmentPattern): PatternKind = value.asInstanceOf[PatternKind]
  @scala.inline
  implicit def apply(value: Identifier): PatternKind = value.asInstanceOf[PatternKind]
  @scala.inline
  implicit def apply(value: JSXIdentifier): PatternKind = value.asInstanceOf[PatternKind]
  @scala.inline
  implicit def apply(value: ObjectPattern): PatternKind = value.asInstanceOf[PatternKind]
  @scala.inline
  implicit def apply(value: PrivateName): PatternKind = value.asInstanceOf[PatternKind]
  @scala.inline
  implicit def apply(value: PropertyPattern): PatternKind = value.asInstanceOf[PatternKind]
  @scala.inline
  implicit def apply(value: RestElement): PatternKind = value.asInstanceOf[PatternKind]
  @scala.inline
  implicit def apply(value: SpreadElementPattern): PatternKind = value.asInstanceOf[PatternKind]
  @scala.inline
  implicit def apply(value: SpreadPropertyPattern): PatternKind = value.asInstanceOf[PatternKind]
  @scala.inline
  implicit def apply(value: TSAsExpression): PatternKind = value.asInstanceOf[PatternKind]
  @scala.inline
  implicit def apply(value: TSNonNullExpression): PatternKind = value.asInstanceOf[PatternKind]
  @scala.inline
  implicit def apply(value: TSParameterProperty): PatternKind = value.asInstanceOf[PatternKind]
  @scala.inline
  implicit def apply(value: TSTypeAssertion): PatternKind = value.asInstanceOf[PatternKind]
  @scala.inline
  implicit def apply(value: TSTypeParameter): PatternKind = value.asInstanceOf[PatternKind]
}


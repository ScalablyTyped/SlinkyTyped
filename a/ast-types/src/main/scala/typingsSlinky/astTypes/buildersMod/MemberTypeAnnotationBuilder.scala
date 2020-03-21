package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonLocObject
import typingsSlinky.astTypes.kindsMod.GenericTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.MemberTypeAnnotationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberTypeAnnotationBuilder extends js.Object {
  def apply(`object`: IdentifierKind, property: GenericTypeAnnotationKind): MemberTypeAnnotation = js.native
  def apply(`object`: IdentifierKind, property: MemberTypeAnnotationKind): MemberTypeAnnotation = js.native
  def from(params: AnonLocObject): MemberTypeAnnotation = js.native
}


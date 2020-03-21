package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonQualification
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.QualifiedTypeIdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QualifiedTypeIdentifierBuilder extends js.Object {
  def apply(qualification: IdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier = js.native
  def apply(qualification: QualifiedTypeIdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier = js.native
  def from(params: AnonQualification): QualifiedTypeIdentifier = js.native
}


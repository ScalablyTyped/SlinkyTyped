package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Qualification
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.QualifiedTypeIdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QualifiedTypeIdentifierBuilder extends StObject {
  
  def apply(qualification: IdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier = js.native
  def apply(qualification: QualifiedTypeIdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier = js.native
  
  def from(params: Qualification): QualifiedTypeIdentifier = js.native
}

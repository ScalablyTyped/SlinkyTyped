package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Label
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.LabeledStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabeledStatementBuilder extends StObject {
  
  def apply(label: IdentifierKind, body: StatementKind): LabeledStatement = js.native
  
  def from(params: Label): LabeledStatement = js.native
}

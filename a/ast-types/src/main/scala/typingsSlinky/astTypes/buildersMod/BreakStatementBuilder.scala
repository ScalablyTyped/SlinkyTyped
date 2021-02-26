package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsLabel
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BreakStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakStatementBuilder extends StObject {
  
  def apply(): BreakStatement = js.native
  def apply(label: IdentifierKind): BreakStatement = js.native
  
  def from(params: CommentsLabel): BreakStatement = js.native
}

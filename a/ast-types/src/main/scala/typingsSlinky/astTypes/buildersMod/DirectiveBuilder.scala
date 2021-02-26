package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsLocValue
import typingsSlinky.astTypes.kindsMod.DirectiveLiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Directive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectiveBuilder extends StObject {
  
  def apply(value: DirectiveLiteralKind): Directive = js.native
  
  def from(params: CommentsLocValue): Directive = js.native
}

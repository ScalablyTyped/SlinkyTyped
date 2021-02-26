package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Key
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyPatternBuilder extends StObject {
  
  def apply(key: ExpressionKind, pattern: PatternKind): PropertyPattern = js.native
  def apply(key: IdentifierKind, pattern: PatternKind): PropertyPattern = js.native
  def apply(key: LiteralKind, pattern: PatternKind): PropertyPattern = js.native
  
  def from(params: Key): PropertyPattern = js.native
}

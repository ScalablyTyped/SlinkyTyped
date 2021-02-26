package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Each
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComprehensionBlockBuilder extends StObject {
  
  def apply(left: PatternKind, right: ExpressionKind, each: Boolean): ComprehensionBlock = js.native
  
  def from(params: Each): ComprehensionBlock = js.native
}

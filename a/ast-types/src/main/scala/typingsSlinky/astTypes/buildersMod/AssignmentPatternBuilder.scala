package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.LocRight
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentPatternBuilder extends StObject {
  
  def apply(left: PatternKind, right: ExpressionKind): AssignmentPattern = js.native
  
  def from(params: LocRight): AssignmentPattern = js.native
}

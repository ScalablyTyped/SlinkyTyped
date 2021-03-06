package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsElements
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayPatternBuilder extends StObject {
  
  def apply(elements: js.Array[PatternKind | SpreadElementKind | Null]): ArrayPattern = js.native
  
  def from(params: CommentsElements): ArrayPattern = js.native
}

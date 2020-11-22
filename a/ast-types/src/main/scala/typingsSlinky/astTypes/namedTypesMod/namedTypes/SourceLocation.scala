package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.PositionKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceLocation extends js.Object {
  
  var end: PositionKind = js.native
  
  var source: js.UndefOr[String | Null] = js.native
  
  var start: PositionKind = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.SourceLocation")
@js.native
object SourceLocation extends TopLevel[Type[SourceLocation]]

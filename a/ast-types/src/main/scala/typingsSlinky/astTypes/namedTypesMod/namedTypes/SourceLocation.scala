package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.PositionKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: PositionKind
  var source: js.UndefOr[String | Null] = js.undefined
  var start: PositionKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.SourceLocation")
@js.native
object SourceLocation extends TopLevel[Type[SourceLocation]]


package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Printable extends js.Object {
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Printable")
@js.native
object Printable extends TopLevel[Type[Printable]]


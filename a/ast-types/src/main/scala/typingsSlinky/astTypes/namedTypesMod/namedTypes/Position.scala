package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  var column: Double = js.native
  var line: Double = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Position")
@js.native
object Position extends TopLevel[Type[Position]]


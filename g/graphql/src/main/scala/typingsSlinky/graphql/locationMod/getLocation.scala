package typingsSlinky.graphql.locationMod

import typingsSlinky.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/location", "getLocation")
@js.native
object getLocation extends js.Object {
  def apply(source: Source, position: Double): SourceLocation = js.native
}


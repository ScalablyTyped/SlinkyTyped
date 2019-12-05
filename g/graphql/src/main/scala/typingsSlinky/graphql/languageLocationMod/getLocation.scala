package typingsSlinky.graphql.languageLocationMod

import typingsSlinky.graphql.languageSourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/location", "getLocation")
@js.native
object getLocation extends js.Object {
  def apply(source: Source, position: Double): SourceLocation = js.native
}


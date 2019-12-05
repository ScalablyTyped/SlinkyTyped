package typingsSlinky.graphql

import typingsSlinky.graphql.languageAstMod.Location
import typingsSlinky.graphql.languageLocationMod.SourceLocation
import typingsSlinky.graphql.languageSourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/printLocation", JSImport.Namespace)
@js.native
object languagePrintLocationMod extends js.Object {
  def printLocation(location: Location): String = js.native
  def printSourceLocation(source: Source, sourceLocation: SourceLocation): String = js.native
}


package typingsSlinky.natural.mod

import typingsSlinky.natural.anon.DamerauLevenshteinDistanc
import typingsSlinky.natural.anon.DamerauLevenshteinDistancDeletioncost
import typingsSlinky.natural.anon.DamerauLevenshteinDistancInsertioncost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "DamerauLevenshteinDistance")
@js.native
object DamerauLevenshteinDistance extends js.Object {
  def apply(source: String, target: String): Double = js.native
  def apply(source: String, target: String, options: DamerauLevenshteinDistanc): SubstringDistanceResult = js.native
  def apply(source: String, target: String, options: DamerauLevenshteinDistancDeletioncost): Double = js.native
  def apply(source: String, target: String, options: DamerauLevenshteinDistancInsertioncost): Double | SubstringDistanceResult = js.native
}


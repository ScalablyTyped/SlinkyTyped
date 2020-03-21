package typingsSlinky.conventionalRecommendedBump.mod.Callback.Recommendation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.conventionalRecommendedBump.conventionalRecommendedBumpStrings.major
  - typingsSlinky.conventionalRecommendedBump.conventionalRecommendedBumpStrings.minor
  - typingsSlinky.conventionalRecommendedBump.conventionalRecommendedBumpStrings.patch
*/
trait ReleaseType extends js.Object

object ReleaseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def major: typingsSlinky.conventionalRecommendedBump.conventionalRecommendedBumpStrings.major = this.cast("major")
  @scala.inline
  def minor: typingsSlinky.conventionalRecommendedBump.conventionalRecommendedBumpStrings.minor = this.cast("minor")
  @scala.inline
  def patch: typingsSlinky.conventionalRecommendedBump.conventionalRecommendedBumpStrings.patch = this.cast("patch")
}


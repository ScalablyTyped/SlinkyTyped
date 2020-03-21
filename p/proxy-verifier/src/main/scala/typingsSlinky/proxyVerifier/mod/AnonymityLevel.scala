package typingsSlinky.proxyVerifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.proxyVerifier.proxyVerifierStrings.transparent
  - typingsSlinky.proxyVerifier.proxyVerifierStrings.anonymous
  - typingsSlinky.proxyVerifier.proxyVerifierStrings.elite
*/
trait AnonymityLevel extends js.Object

object AnonymityLevel {
  @scala.inline
  def anonymous: typingsSlinky.proxyVerifier.proxyVerifierStrings.anonymous = this.cast("anonymous")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elite: typingsSlinky.proxyVerifier.proxyVerifierStrings.elite = this.cast("elite")
  @scala.inline
  def transparent: typingsSlinky.proxyVerifier.proxyVerifierStrings.transparent = this.cast("transparent")
}


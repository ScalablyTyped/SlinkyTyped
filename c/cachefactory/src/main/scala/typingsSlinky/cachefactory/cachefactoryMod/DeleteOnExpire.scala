package typingsSlinky.cachefactory.cachefactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cachefactory.cachefactoryStrings.none
  - typings.cachefactory.cachefactoryStrings.passive
  - typings.cachefactory.cachefactoryStrings.aggressive
*/
trait DeleteOnExpire extends js.Object

object DeleteOnExpire {
  @scala.inline
  def aggressive: typingsSlinky.cachefactory.cachefactoryStrings.aggressive = this.cast("aggressive")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsSlinky.cachefactory.cachefactoryStrings.none = this.cast("none")
  @scala.inline
  def passive: typingsSlinky.cachefactory.cachefactoryStrings.passive = this.cast("passive")
}


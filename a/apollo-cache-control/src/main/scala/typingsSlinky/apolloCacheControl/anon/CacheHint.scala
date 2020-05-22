package typingsSlinky.apolloCacheControl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheHint extends js.Object {
  var cacheHint: typingsSlinky.apolloCacheControl.mod.CacheHint
  def setCacheHint(hint: typingsSlinky.apolloCacheControl.mod.CacheHint): Unit
}

object CacheHint {
  @scala.inline
  def apply(
    cacheHint: typingsSlinky.apolloCacheControl.mod.CacheHint,
    setCacheHint: typingsSlinky.apolloCacheControl.mod.CacheHint => Unit
  ): CacheHint = {
    val __obj = js.Dynamic.literal(cacheHint = cacheHint.asInstanceOf[js.Any], setCacheHint = js.Any.fromFunction1(setCacheHint))
    __obj.asInstanceOf[CacheHint]
  }
}


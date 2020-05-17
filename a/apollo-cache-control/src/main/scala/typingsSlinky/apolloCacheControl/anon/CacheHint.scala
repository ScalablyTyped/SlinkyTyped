package typingsSlinky.apolloCacheControl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheHint extends js.Object {
  var cacheHint: typingsSlinky.apolloCacheControl.mod.CacheHint = js.native
  def setCacheHint(hint: typingsSlinky.apolloCacheControl.mod.CacheHint): Unit = js.native
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
  @scala.inline
  implicit class CacheHintOps[Self <: CacheHint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheHint(value: typingsSlinky.apolloCacheControl.mod.CacheHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetCacheHint(value: typingsSlinky.apolloCacheControl.mod.CacheHint => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCacheHint")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.apolloCacheControl

import typingsSlinky.apolloCacheControl.mod.CacheHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCacheHint extends js.Object {
  var cacheHint: CacheHint = js.native
  def setCacheHint(hint: CacheHint): Unit = js.native
}

object AnonCacheHint {
  @scala.inline
  def apply(cacheHint: CacheHint, setCacheHint: CacheHint => Unit): AnonCacheHint = {
    val __obj = js.Dynamic.literal(cacheHint = cacheHint.asInstanceOf[js.Any], setCacheHint = js.Any.fromFunction1(setCacheHint))
    __obj.asInstanceOf[AnonCacheHint]
  }
  @scala.inline
  implicit class AnonCacheHintOps[Self <: AnonCacheHint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheHint(value: CacheHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetCacheHint(value: CacheHint => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCacheHint")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


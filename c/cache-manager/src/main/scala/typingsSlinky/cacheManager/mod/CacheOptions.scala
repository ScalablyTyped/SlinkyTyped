package typingsSlinky.cacheManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheOptions extends js.Object {
  var isCacheableValue: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.native
  /**
    * Promise library to replace global.Promise
    */
  var promiseDependency: js.UndefOr[js.Any] = js.native
}

object CacheOptions {
  @scala.inline
  def apply(): CacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheOptions]
  }
  @scala.inline
  implicit class CacheOptionsOps[Self <: CacheOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCacheableValue(value: /* value */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCacheableValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsCacheableValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCacheableValue")(js.undefined)
        ret
    }
    @scala.inline
    def withPromiseDependency(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseDependency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromiseDependency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseDependency")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.backboneFetchCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCacheKeyObject extends _GetCacheKeyOptions {
  var getCacheKey: js.UndefOr[js.Function1[/* opts */ js.UndefOr[GetCacheOptions], String]] = js.native
  var url: js.UndefOr[js.Function0[String]] = js.native
}

object GetCacheKeyObject {
  @scala.inline
  def apply(): GetCacheKeyObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCacheKeyObject]
  }
  @scala.inline
  implicit class GetCacheKeyObjectOps[Self <: GetCacheKeyObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCacheKey(value: /* opts */ js.UndefOr[GetCacheOptions] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCacheKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetCacheKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCacheKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}


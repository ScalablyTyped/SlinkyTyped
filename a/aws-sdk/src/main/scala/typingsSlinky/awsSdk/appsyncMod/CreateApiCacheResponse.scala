package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApiCacheResponse extends js.Object {
  /**
    * The ApiCache object.
    */
  var apiCache: js.UndefOr[ApiCache] = js.native
}

object CreateApiCacheResponse {
  @scala.inline
  def apply(): CreateApiCacheResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApiCacheResponse]
  }
  @scala.inline
  implicit class CreateApiCacheResponseOps[Self <: CreateApiCacheResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiCache(value: ApiCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiCache")(js.undefined)
        ret
    }
  }
  
}


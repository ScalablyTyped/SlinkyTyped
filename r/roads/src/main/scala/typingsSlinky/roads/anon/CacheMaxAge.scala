package typingsSlinky.roads.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheMaxAge extends js.Object {
  var cacheMaxAge: js.UndefOr[Double] = js.native
  var requestHeaders: js.UndefOr[StringDictionary[js.Any]] = js.native
  var responseHeaders: js.UndefOr[StringDictionary[js.Any]] = js.native
  var supportsCredentials: js.UndefOr[Boolean] = js.native
  var validMethods: js.UndefOr[js.Array[String]] = js.native
  var validOrigins: js.UndefOr[js.Array[String]] = js.native
}

object CacheMaxAge {
  @scala.inline
  def apply(): CacheMaxAge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheMaxAge]
  }
  @scala.inline
  implicit class CacheMaxAgeOps[Self <: CacheMaxAge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheMaxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheMaxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestHeaders(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseHeaders(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withValidMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withValidOrigins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validOrigins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidOrigins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validOrigins")(js.undefined)
        ret
    }
  }
  
}


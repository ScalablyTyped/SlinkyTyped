package typingsSlinky.koaCacheControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxAge extends js.Object {
  var maxAge: js.UndefOr[Double] = js.native
  var mustRevalidate: js.UndefOr[Boolean] = js.native
  var noCache: js.UndefOr[Boolean] = js.native
  var noStore: js.UndefOr[Boolean] = js.native
  var noTransform: js.UndefOr[Boolean] = js.native
  var `private`: js.UndefOr[Boolean] = js.native
  var public: js.UndefOr[Boolean] = js.native
  var sMaxAge: js.UndefOr[Double] = js.native
  var staleIfError: js.UndefOr[Double] = js.native
  var staleWhileRevalidate: js.UndefOr[Double] = js.native
}

object AnonMaxAge {
  @scala.inline
  def apply(): AnonMaxAge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxAge]
  }
  @scala.inline
  implicit class AnonMaxAgeOps[Self <: AnonMaxAge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withMustRevalidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustRevalidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMustRevalidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustRevalidate")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCache")(js.undefined)
        ret
    }
    @scala.inline
    def withNoStore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStore")(js.undefined)
        ret
    }
    @scala.inline
    def withNoTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(js.undefined)
        ret
    }
    @scala.inline
    def withPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(js.undefined)
        ret
    }
    @scala.inline
    def withSMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sMaxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sMaxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withStaleIfError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleIfError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaleIfError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleIfError")(js.undefined)
        ret
    }
    @scala.inline
    def withStaleWhileRevalidate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleWhileRevalidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaleWhileRevalidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleWhileRevalidate")(js.undefined)
        ret
    }
  }
  
}


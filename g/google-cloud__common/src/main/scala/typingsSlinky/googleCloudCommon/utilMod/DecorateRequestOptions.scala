package typingsSlinky.googleCloudCommon.utilMod

import typingsSlinky.googleCloudCommon.serviceObjectMod.Interceptor
import typingsSlinky.teenyRequest.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecorateRequestOptions extends CoreOptions {
  var autoPaginate: js.UndefOr[Boolean] = js.native
  var autoPaginateVal: js.UndefOr[Boolean] = js.native
  var interceptors_ : js.UndefOr[js.Array[Interceptor]] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var objectMode: js.UndefOr[Boolean] = js.native
  var shouldReturnStream: js.UndefOr[Boolean] = js.native
  var uri: String = js.native
}

object DecorateRequestOptions {
  @scala.inline
  def apply(uri: String): DecorateRequestOptions = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorateRequestOptions]
  }
  @scala.inline
  implicit class DecorateRequestOptionsOps[Self <: DecorateRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoPaginate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPaginate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPaginate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPaginate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPaginateVal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPaginateVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPaginateVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPaginateVal")(js.undefined)
        ret
    }
    @scala.inline
    def withInterceptors_(value: js.Array[Interceptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptors_")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterceptors_ : Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptors_")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldReturnStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldReturnStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldReturnStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldReturnStream")(js.undefined)
        ret
    }
  }
  
}


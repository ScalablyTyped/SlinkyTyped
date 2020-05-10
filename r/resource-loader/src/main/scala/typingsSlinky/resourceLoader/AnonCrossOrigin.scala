package typingsSlinky.resourceLoader

import typingsSlinky.resourceLoader.resourceLoaderMod.Resource.IMetadata
import typingsSlinky.resourceLoader.resourceLoaderMod.Resource.LOAD_TYPE
import typingsSlinky.resourceLoader.resourceLoaderMod.Resource.XHR_RESPONSE_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCrossOrigin extends js.Object {
  var crossOrigin: js.UndefOr[String | Boolean] = js.native
  var loadType: js.UndefOr[LOAD_TYPE] = js.native
  var metadata: js.UndefOr[IMetadata] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var xhrType: js.UndefOr[XHR_RESPONSE_TYPE] = js.native
}

object AnonCrossOrigin {
  @scala.inline
  def apply(): AnonCrossOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCrossOrigin]
  }
  @scala.inline
  implicit class AnonCrossOriginOps[Self <: AnonCrossOrigin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrossOrigin(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadType(value: LOAD_TYPE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadType")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withXhrType(value: XHR_RESPONSE_TYPE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhrType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrType")(js.undefined)
        ret
    }
  }
  
}


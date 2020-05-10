package typingsSlinky.resourceLoader.resourceLoaderMod

import typingsSlinky.resourceLoader.resourceLoaderMod.Resource.IMetadata
import typingsSlinky.resourceLoader.resourceLoaderMod.Resource.LOAD_TYPE
import typingsSlinky.resourceLoader.resourceLoaderMod.Resource.OnCompleteSignal
import typingsSlinky.resourceLoader.resourceLoaderMod.Resource.XHR_RESPONSE_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for a call to `.add()`.
  *
  * @see Loader#add
  *
  * @typedef {object} IAddOptions
  * @property {string} [name] - The name of the resource to load, if not passed the url is used.
  * @property {string} [key] - Alias for `name`.
  * @property {string} [url] - The url for this resource, relative to the baseUrl of this loader.
  * @property {string|boolean} [crossOrigin] - Is this request cross-origin? Default is to
  *      determine automatically.
  * @property {number} [timeout=0] - A timeout in milliseconds for the load. If the load takes
  *      longer than this time it is cancelled and the load is considered a failure. If this value is
  *      set to `0` then there is no explicit timeout.
  * @property {Resource.LOAD_TYPE} [loadType=Resource.LOAD_TYPE.XHR] - How should this resource
  *      be loaded?
  * @property {Resource.XHR_RESPONSE_TYPE} [xhrType=Resource.XHR_RESPONSE_TYPE.DEFAULT] - How
  *      should the data being loaded be interpreted when using XHR?
  * @property {Resource.OnCompleteSignal} [onComplete] - Callback to add an an onComplete signal istener.
  * @property {Resource.OnCompleteSignal} [callback] - Alias for `onComplete`.
  * @property {Resource.IMetadata} [metadata] - Extra configuration for middleware and the Resource object.
  */
@js.native
trait IAddOptions extends js.Object {
  var callback: js.UndefOr[OnCompleteSignal] = js.native
  var crossOrigin: js.UndefOr[String | Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var loadType: js.UndefOr[LOAD_TYPE] = js.native
  var metadata: js.UndefOr[IMetadata] = js.native
  var name: js.UndefOr[String] = js.native
  var onComplete: js.UndefOr[OnCompleteSignal] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
  var xhrType: js.UndefOr[XHR_RESPONSE_TYPE] = js.native
}

object IAddOptions {
  @scala.inline
  def apply(): IAddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAddOptions]
  }
  @scala.inline
  implicit class IAddOptionsOps[Self <: IAddOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: /* resource */ Resource => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
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
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: /* resource */ Resource => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
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
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
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


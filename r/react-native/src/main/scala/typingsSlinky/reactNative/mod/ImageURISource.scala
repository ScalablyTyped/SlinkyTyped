package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNative.reactNativeStrings.`force-cache`
import typingsSlinky.reactNative.reactNativeStrings.`only-if-cached`
import typingsSlinky.reactNative.reactNativeStrings.default
import typingsSlinky.reactNative.reactNativeStrings.reload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageURISource extends ImageSourcePropType {
  /**
    * `body` is the HTTP body to send with the request. This must be a valid
    * UTF-8 string, and will be sent exactly as specified, with no
    * additional encoding (e.g. URL-escaping or base64) applied.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * `bundle` is the iOS asset bundle which the image is included in. This
    * will default to [NSBundle mainBundle] if not set.
    * @platform ios
    */
  var bundle: js.UndefOr[String] = js.native
  /**
    * `cache` determines how the requests handles potentially cached
    * responses.
    *
    * - `default`: Use the native platforms default strategy. `useProtocolCachePolicy` on iOS.
    *
    * - `reload`: The data for the URL will be loaded from the originating source.
    * No existing cache data should be used to satisfy a URL load request.
    *
    * - `force-cache`: The existing cached data will be used to satisfy the request,
    * regardless of its age or expiration date. If there is no existing data in the cache
    * corresponding the request, the data is loaded from the originating source.
    *
    * - `only-if-cached`: The existing cache data will be used to satisfy a request, regardless of
    * its age or expiration date. If there is no existing data in the cache corresponding
    * to a URL load request, no attempt is made to load the data from the originating source,
    * and the load is considered to have failed.
    *
    * @platform ios
    */
  var cache: js.UndefOr[default | reload | `force-cache` | `only-if-cached`] = js.native
  /**
    * `headers` is an object representing the HTTP headers to send along with the
    * request for a remote image.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var height: js.UndefOr[Double] = js.native
  /**
    * `method` is the HTTP Method to use. Defaults to GET if not specified.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * `scale` is used to indicate the scale factor of the image. Defaults to 1.0 if
    * unspecified, meaning that one image pixel equates to one display point / DIP.
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * `uri` is a string representing the resource identifier for the image, which
    * could be an http address, a local file path, or the name of a static image
    * resource (which should be wrapped in the `require('./path/to/image.png')`
    * function).
    */
  var uri: js.UndefOr[String] = js.native
  /**
    * `width` and `height` can be specified if known at build time, in which case
    * these will be used to set the default `<Image/>` component dimensions.
    */
  var width: js.UndefOr[Double] = js.native
}

object ImageURISource {
  @scala.inline
  def apply(): ImageURISource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageURISource]
  }
  @scala.inline
  implicit class ImageURISourceOps[Self <: ImageURISource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withBundle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundle")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: default | reload | `force-cache` | `only-if-cached`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}


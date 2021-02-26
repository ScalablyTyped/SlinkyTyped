package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNative.reactNativeStrings.`force-cache`
import typingsSlinky.reactNative.reactNativeStrings.`only-if-cached`
import typingsSlinky.reactNative.reactNativeStrings.default
import typingsSlinky.reactNative.reactNativeStrings.reload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageURISource extends StObject {
  
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
  implicit class ImageURISourceMutableBuilder[Self <: ImageURISource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setBundle(value: String): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleUndefined: Self = StObject.set(x, "bundle", js.undefined)
    
    @scala.inline
    def setCache(value: default | reload | `force-cache` | `only-if-cached`): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

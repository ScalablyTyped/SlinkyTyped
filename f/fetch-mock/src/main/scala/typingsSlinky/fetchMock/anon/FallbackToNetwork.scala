package typingsSlinky.fetchMock.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.fetchMock.fetchMockStrings.always
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FallbackToNetwork extends js.Object {
  /**
    * Reference to the Headers constructor of a custom fetch
    * implementation.
    */
  var Headers: js.UndefOr[Instantiable0[org.scalajs.dom.experimental.Headers]] = js.native
  /**
    * Reference to the Promise constructor of a custom Promise
    * implementation.
    */
  var Promise: js.UndefOr[
    Instantiable1[
      /* executor */ js.Function2[/* resolve */ js.Function0[Unit], /* reject */ js.Function0[Unit], Unit], 
      js.Promise[Response]
    ]
  ] = js.native
  /**
    * Reference to the Request constructor of a custom fetch
    * implementation.
    */
  var Request: js.UndefOr[
    Instantiable2[
      /* input */ String | org.scalajs.dom.experimental.Request, 
      js.UndefOr[/* init */ RequestInit], 
      org.scalajs.dom.experimental.Request
    ]
  ] = js.native
  /**
    * Reference to the Response constructor of a custom fetch
    * implementation.
    */
  var Response: js.UndefOr[Instantiable0[org.scalajs.dom.experimental.Response]] = js.native
  /**
    * - true: Unhandled calls fall through to the network
    * - false: Unhandled calls throw an error
    * - 'always': All calls fall through to the network, effectively
    * disabling fetch-mock.
    * @default false
    */
  var fallbackToNetwork: js.UndefOr[Boolean | always] = js.native
  /**
    * Reference to a custom fetch implementation.
    */
  var fetch: js.UndefOr[
    js.Function2[
      /* input */ js.UndefOr[String | Request], 
      /* init */ js.UndefOr[RequestInit], 
      js.Promise[Response]
    ]
  ] = js.native
  /**
    * Automatically sets a content-length header on each response.
    * @default true
    */
  var includeContentLength: js.UndefOr[Boolean] = js.native
  /**
    * Determines behaviour if a new route has the same name (or
    * inferred name) as an existing one
    * - undefined: An error will be throw when routes clash
    * - true: Overwrites the existing route
    * - false: Appends the new route to the list of routes
    * @default undefined
    */
  var overwriteRoutes: js.UndefOr[Boolean] = js.native
  /**
    * Convert objects into JSON before delivering as stub responses.
    * Can be useful to set to false globally if e.g. dealing with a
    * lot of array buffers. If true, will also add
    * content-type: application/json header.
    * @default true
    */
  var sendAsJson: js.UndefOr[Boolean] = js.native
  /**
    * Print a warning if any call is caught by a fallback handler (set
    * using the fallbackToNetwork option or catch())
    * @default true
    */
  var warnOnFallback: js.UndefOr[Boolean] = js.native
}

object FallbackToNetwork {
  @scala.inline
  def apply(): FallbackToNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FallbackToNetwork]
  }
  @scala.inline
  implicit class FallbackToNetworkOps[Self <: FallbackToNetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: Instantiable0[Headers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Headers")(js.undefined)
        ret
    }
    @scala.inline
    def withPromise(
      value: Instantiable1[
          /* executor */ js.Function2[/* resolve */ js.Function0[Unit], /* reject */ js.Function0[Unit], Unit], 
          js.Promise[Response]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: Instantiable2[/* input */ String | Request, js.UndefOr[/* init */ RequestInit], Request]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Request")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: Instantiable0[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Response")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackToNetwork(value: Boolean | always): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackToNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackToNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackToNetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withFetch(
      value: (/* input */ js.UndefOr[String | Request], /* init */ js.UndefOr[RequestInit]) => js.Promise[Response]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeContentLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeContentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeContentLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeContentLength")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwriteRoutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwriteRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwriteRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwriteRoutes")(js.undefined)
        ret
    }
    @scala.inline
    def withSendAsJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAsJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendAsJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAsJson")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnOnFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnOnFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnOnFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnOnFallback")(js.undefined)
        ret
    }
  }
  
}


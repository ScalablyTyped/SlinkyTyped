package typingsSlinky.fetchMock.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mock options object
  */
@js.native
trait MockOptions extends js.Object {
  /**
    * body to match
    */
  var body: js.UndefOr[String | js.Object] = js.native
  /**
    * A function for arbitrary matching
    */
  var functionMatcher: js.UndefOr[MockMatcherFunction] = js.native
  /**
    * key/value map of headers to match
    */
  var headers: js.UndefOr[StringDictionary[String | Double]] = js.native
  /**
    * Automatically sets a content-length header on each response.
    * @default true
    */
  var includeContentLength: js.UndefOr[Boolean] = js.native
  /**
    * as specified above
    */
  var matcher: js.UndefOr[MockMatcher] = js.native
  /**
    * http method to match
    */
  var method: js.UndefOr[String] = js.native
  /**
    * A unique string naming the route. Used to subsequently retrieve
    * references to the calls, grouped by name.
    * @default matcher.toString()
    *
    * Note: If a non-unique name is provided no error will be thrown
    *  (because names are optional, auto-generated ones may legitimately
    *  clash)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * This option allows for existing routes in a mock to be overwritten.
    * It’s also possible to define multiple routes with ‘the same’ matcher.
    * Default behaviour is to error
    */
  var overwriteRoutes: js.UndefOr[Boolean] = js.native
  /**
    * key/value map of express style path params to match
    */
  var params: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * key/value map of query strings to match, in any order
    */
  var query: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * integer, n, limiting the number of times the matcher can be used.
    * If the route has already been called n times the route will be
    * ignored and the call to fetch() will fall through to be handled by
    * any other routes defined (which may eventually result in an error
    * if nothing matches it).
    */
  var repeat: js.UndefOr[Double] = js.native
  /**
    * as specified above
    */
  var response: js.UndefOr[MockResponse | MockResponseFunction] = js.native
  /**
    * Convert objects into JSON before delivering as stub responses. Can
    * be useful to set to false globally if e.g. dealing with a lot of
    * array buffers. If true, will also add content-type: application/json
    * header.
    * @default true
    */
  var sendAsJson: js.UndefOr[Boolean] = js.native
}

object MockOptions {
  @scala.inline
  def apply(): MockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockOptions]
  }
  @scala.inline
  implicit class MockOptionsOps[Self <: MockOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String | js.Object): Self = {
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
    def withFunctionMatcher(value: (/* url */ String, /* opts */ MockRequest) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionMatcher")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFunctionMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionMatcher")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String | Double]): Self = {
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
    def withMatcherFunction2(value: (/* url */ String, /* opts */ MockRequest) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMatcherRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatcher(value: MockMatcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.undefined)
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
    def withParams(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseFunction2(value: (/* url */ String, /* opts */ MockRequest) => MockResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResponseResponse(value: Response): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: MockResponse | MockResponseFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
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
  }
  
}


package typingsSlinky.inert.mod

import typingsSlinky.hapi.mod.Request
import typingsSlinky.inert.inertBooleans.`false`
import typingsSlinky.inert.inertStrings.hash
import typingsSlinky.inert.inertStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryHandlerRouteObject extends js.Object {
  /**
    * defaultExtension - optional string, appended to file requests if the requested file is not found. Defaults to no extension.
    */
  var defaultExtension: js.UndefOr[String] = js.native
  /**
    * etagMethod - specifies the method used to calculate the ETag header response. Available values:
    *  * 'hash' - SHA1 sum of the file contents, suitable for distributed deployments. Default value.
    *  * 'simple' - Hex encoded size and modification date, suitable when files are stored on a single server.
    *  * false - Disable ETag computation.
    */
  var etagMethod: js.UndefOr[hash | simple | `false`] = js.native
  /**
    * index - optional boolean|string|string[], determines if an index file will be served if found in the folder when requesting a directory.
    * The given string or strings specify the name(s) of the index file to look for. If true, looks for 'index.html'.
    * Any falsy value disables index file lookup. Defaults to true.
    */
  var index: js.UndefOr[Boolean | String | js.Array[String]] = js.native
  /**
    * listing - optional boolean, determines if directory listing is generated when a directory is requested without an index document. Defaults to false.
    */
  var listing: js.UndefOr[Boolean] = js.native
  /**
    * lookupCompressed - optional boolean, instructs the file processor to look for the same filename with the '.gz' suffix for a pre-compressed
    * version of the file to serve if the request supports content encoding. Defaults to false.
    */
  var lookupCompressed: js.UndefOr[Boolean] = js.native
  /**
    * path - (required) the directory root path (relative paths are resolved based on the route files configuration). Value can be:
    * * a single path string used as the prefix for any resources requested by appending the request path parameter to the provided string.
    * * an array of path strings. Each path will be attempted in order until a match is found (by following the same process as the single path string).
    * * a function with the signature function(request) which returns the path string or an array of path strings.
    *   If the function returns an error, the error is passed back to the client in the response.
    */
  var path: String | js.Array[String] | (RequestHandler[String | js.Array[String] | js.Error]) = js.native
  /**
    * redirectToSlash - optional boolean, determines if requests for a directory without a trailing slash are redirected to the same path with the missing slash.
    * Useful for ensuring relative links inside the response are resolved correctly.
    * Disabled when the server config router.stripTrailingSlash is true.Defaults to false.
    */
  var redirectToSlash: js.UndefOr[Boolean] = js.native
  /**
    * showHidden - optional boolean, determines if hidden files will be shown and served. Defaults to false.
    */
  var showHidden: js.UndefOr[Boolean] = js.native
}

object DirectoryHandlerRouteObject {
  @scala.inline
  def apply(path: String | js.Array[String] | (RequestHandler[String | js.Array[String] | js.Error])): DirectoryHandlerRouteObject = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryHandlerRouteObject]
  }
  @scala.inline
  implicit class DirectoryHandlerRouteObjectOps[Self <: DirectoryHandlerRouteObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPathFunction1(value: /* request */ Request => String | js.Array[String] | js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPath(value: String | js.Array[String] | (RequestHandler[String | js.Array[String] | js.Error])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withEtagMethod(value: hash | simple | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etagMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtagMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etagMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Boolean | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withListing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listing")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupCompressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupCompressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupCompressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupCompressed")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectToSlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectToSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectToSlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectToSlash")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHidden")(js.undefined)
        ret
    }
  }
  
}


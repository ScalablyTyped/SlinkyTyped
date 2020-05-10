package typingsSlinky.properUrlJoin.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.queryString.mod.StringifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Add a leading slash.
    *
    * **Default**: `true`
    */
  var leadingSlash: js.UndefOr[Boolean] = js.native
  /**
    * Protocol relative URLs.
    *
    * **Default**: `false`
    */
  var protocolRelative: js.UndefOr[Boolean] = js.native
  /**
    * Query string object that will be properly stringified and appended to the url.
    * It will be merged with the query string in the url, if it exists.
    */
  var query: js.UndefOr[StringDictionary[String | Double | (js.Array[String | Double])]] = js.native
  /**
    * [query-string](https://github.com/sindresorhus/query-string#stringifyobject-options) singify method options to be considered when stringifying the query.
    */
  var queryOptions: js.UndefOr[StringifyOptions] = js.native
  /**
    * Add a trailing slash.
    *
    * **Default**: `false`
    */
  var trailingSlash: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeadingSlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeadingSlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingSlash")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocolRelative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolRelative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocolRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolRelative")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: StringDictionary[String | Double | (js.Array[String | Double])]): Self = {
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
    def withQueryOptions(value: StringifyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailingSlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailingSlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingSlash")(js.undefined)
        ret
    }
  }
  
}


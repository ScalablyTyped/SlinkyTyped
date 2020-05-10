package typingsSlinky.googleCloudPaginator.mod

import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedArguments extends TransformOptions {
  /**
    * Auto-pagination enabled.
    */
  var autoPaginate: js.UndefOr[Boolean] = js.native
  /**
    * Callback function.
    */
  var callback: js.UndefOr[js.Function] = js.native
  /**
    * Maximum API calls to make.
    */
  var maxApiCalls: js.UndefOr[Double] = js.native
  /**
    * Maximum results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Query object. This is most commonly an object, but to make the API more
    * simple, it can also be a string in some places.
    */
  var query: js.UndefOr[ParsedArguments] = js.native
  var streamOptions: js.UndefOr[ParsedArguments] = js.native
}

object ParsedArguments {
  @scala.inline
  def apply(): ParsedArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsedArguments]
  }
  @scala.inline
  implicit class ParsedArgumentsOps[Self <: ParsedArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxApiCalls(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxApiCalls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxApiCalls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxApiCalls")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: ParsedArguments): Self = {
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
    def withStreamOptions(value: ParsedArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamOptions")(js.undefined)
        ret
    }
  }
  
}


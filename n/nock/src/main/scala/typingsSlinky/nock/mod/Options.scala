package typingsSlinky.nock.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowUnmocked: js.UndefOr[Boolean] = js.native
  var badheaders: js.UndefOr[js.Array[String]] = js.native
  var encodedQueryParams: js.UndefOr[Boolean] = js.native
  var filteringScope: js.UndefOr[js.Function1[/* scope */ String, Boolean]] = js.native
  var reqheaders: js.UndefOr[Record[String, RequestHeaderMatcher]] = js.native
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
    def withAllowUnmocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnmocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnmocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnmocked")(js.undefined)
        ret
    }
    @scala.inline
    def withBadheaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badheaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadheaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badheaders")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodedQueryParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodedQueryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodedQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodedQueryParams")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteringScope(value: /* scope */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringScope")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilteringScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringScope")(js.undefined)
        ret
    }
    @scala.inline
    def withReqheaders(value: Record[String, RequestHeaderMatcher]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqheaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReqheaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqheaders")(js.undefined)
        ret
    }
  }
  
}


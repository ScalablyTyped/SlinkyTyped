package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HttpRouteRuleMatch criteria for a request&#39;s query parameter.
  */
@js.native
trait SchemaHttpQueryParameterMatch extends js.Object {
  /**
    * The queryParameterMatch matches if the value of the parameter exactly
    * matches the contents of exactMatch. Only one of presentMatch, exactMatch
    * and regexMatch must be set.
    */
  var exactMatch: js.UndefOr[String] = js.native
  /**
    * The name of the query parameter to match. The query parameter must exist
    * in the request, in the absence of which the request match fails.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specifies that the queryParameterMatch matches if the request contains
    * the query parameter, irrespective of whether the parameter has a value or
    * not. Only one of presentMatch, exactMatch and regexMatch must be set.
    */
  var presentMatch: js.UndefOr[Boolean] = js.native
  /**
    * The queryParameterMatch matches if the value of the parameter matches the
    * regular expression specified by regexMatch. For the regular expression
    * grammar, please see en.cppreference.com/w/cpp/regex/ecmascript  Only one
    * of presentMatch, exactMatch and regexMatch must be set.
    */
  var regexMatch: js.UndefOr[String] = js.native
}

object SchemaHttpQueryParameterMatch {
  @scala.inline
  def apply(): SchemaHttpQueryParameterMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpQueryParameterMatch]
  }
  @scala.inline
  implicit class SchemaHttpQueryParameterMatchOps[Self <: SchemaHttpQueryParameterMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExactMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExactMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactMatch")(js.undefined)
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
    def withPresentMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withRegexMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexMatch")(js.undefined)
        ret
    }
  }
  
}


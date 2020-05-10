package typingsSlinky.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryParserOptions extends js.Object {
  /**
    *  Default false. Transform `?foo.bar=baz` to a nested object: `{foo: {bar: 'baz'}}`.
    */
  var allowDots: js.UndefOr[Boolean] = js.native
  /**
    * Default 20. Only transform `?a[$index]=b` to an array if `$index` is less than `arrayLimit`.
    */
  var arrayLimit: js.UndefOr[Double] = js.native
  /**
    * Default 5. The depth limit for parsing nested objects, e.g. `?a[b][c][d][e][f][g][h][i]=j`.
    */
  var depth: js.UndefOr[Double] = js.native
  /**
    * Default `false`. Copies parsed query parameters into `req.params`.
    */
  var mapParams: js.UndefOr[Boolean] = js.native
  /**
    * Default `false`. Only applies when if mapParams true. When true, will stomp on req.params field when existing value is found.
    */
  var overrideParams: js.UndefOr[Boolean] = js.native
  /**
    * Default 1000. Maximum number of query params parsed. Additional params are silently dropped.
    */
  var parameterLimit: js.UndefOr[Double] = js.native
  /**
    * Default true. Whether to parse `?a[]=b&a[1]=c` to an array, e.g. `{a: ['b', 'c']}`.
    */
  var parseArrays: js.UndefOr[Boolean] = js.native
  /**
    * Default false. Whether `req.query` is a "plain" object -- does not inherit from `Object`.
    * This can be used to allow query params whose names collide with Object methods, e.g. `?hasOwnProperty=blah`.
    */
  var plainObjects: js.UndefOr[Boolean] = js.native
  /**
    * Default false. If true, `?a&b=` results in `{a: null, b: ''}`. Otherwise, `{a: '', b: ''}`.
    */
  var strictNullHandling: js.UndefOr[Boolean] = js.native
}

object QueryParserOptions {
  @scala.inline
  def apply(): QueryParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParserOptions]
  }
  @scala.inline
  implicit class QueryParserOptionsOps[Self <: QueryParserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDots")(js.undefined)
        ret
    }
    @scala.inline
    def withArrayLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withMapParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapParams")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideParams")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withParseArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseArrays")(js.undefined)
        ret
    }
    @scala.inline
    def withPlainObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plainObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlainObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plainObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictNullHandling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictNullHandling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictNullHandling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictNullHandling")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.gulpJade.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  /**
    * If set to true, compiled functions are cached. filename
    * must be set as the cache key.
    */
  var cache: js.UndefOr[Boolean] = js.native
  /**
    * Compile to JS instead of HTML.
    */
  var client: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the function source will be included in the
    * compiled template for better error messages (sometimes useful
    * in development). It is enabled by default unless used with
    * express in production mode.
    */
  var compileDebug: js.UndefOr[Boolean] = js.native
  /**
    * Data to be used while parsing jade files. Has lower
    * precedence than locals.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * If set to true, the tokens and function body is logged
    * to stdout
    */
  var debug: js.UndefOr[Boolean] = js.native
  /*******
    * JADE API OPTIONS
    *******/
  /**
    * If the doctype is not specified as part of the
    * template, you can specify it here. It is sometimes
    * useful to get self-closing tags and remove mirroring
    * of boolean attributes.
    */
  var doctype: js.UndefOr[String] = js.native
  /*******
    * GULP-JADE OPTIONS
    *******/
  /**
    * Used to set a version of jade other than this library's
    * dependency, or to customise filters.
    */
  var jade: js.UndefOr[js.Any] = js.native
  /**
    * Locals to be used while parsing jade files. Takes
    * precedence over data.
    */
  var locals: js.UndefOr[js.Any] = js.native
  /**
    * Adds whitespace to the resulting html to make it
    * easier for a human to read using '  ' as indentation.
    * If a string is specified, that will be used as
    * indentation instead (e.g. '\t').
    */
  var pretty: js.UndefOr[Boolean | String] = js.native
  /**
    * Use a self namespace to hold the locals (false by default)
    */
  var self: js.UndefOr[Boolean] = js.native
}

object Params {
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: Boolean): Self = {
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
    def withClient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withCompileDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileDebug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompileDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileDebug")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDoctype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoctype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctype")(js.undefined)
        ret
    }
    @scala.inline
    def withJade(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jade")(js.undefined)
        ret
    }
    @scala.inline
    def withLocals(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(js.undefined)
        ret
    }
    @scala.inline
    def withPretty(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPretty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(js.undefined)
        ret
    }
    @scala.inline
    def withSelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(js.undefined)
        ret
    }
  }
  
}


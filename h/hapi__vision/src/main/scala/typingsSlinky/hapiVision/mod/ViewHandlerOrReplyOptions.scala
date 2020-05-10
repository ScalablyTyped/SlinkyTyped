package typingsSlinky.hapiVision.mod

import typingsSlinky.hapiHapi.mod.Request
import typingsSlinky.hapiVision.hapiVisionStrings.async
import typingsSlinky.hapiVision.hapiVisionStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * @see {@link https://github.com/hapijs/vision/blob/master/API.md#the-view-handler} > options for the list of attributes it can not have (isCached, partialsPath, helpersPath)
  */
@js.native
trait ViewHandlerOrReplyOptions extends js.Object {
  /** if set to true, allows absolute template paths passed to reply.view(). Defaults to false. */
  var allowAbsolutePaths: js.UndefOr[Boolean] = js.native
  /** if set to true, allows template paths passed to reply.view() to contain '../'. Defaults to false. */
  var allowInsecureAccess: js.UndefOr[Boolean] = js.native
  /** specify whether the engine compile() method is 'sync' or 'async'. Defaults to 'sync'. */
  var compileMode: js.UndefOr[sync | async] = js.native
  /** options object passed to the engine's compile function. Defaults to empty options {}. */
  var compileOptions: js.UndefOr[CompileOptions] = js.native
  /** the content type of the engine results. Defaults to 'text/html'. */
  var contentType: js.UndefOr[String] = js.native
  /**
    * A global context used with all templates.
    * The global context option can be either an object or a function that takes the request as its only argument and returns a context object.
    * The request object is only provided when using the view handler or reply.view().
    * When using server.render() or request.render(), the request argument will be null.
    * When rendering views, the global context will be merged with any context object specified on the handler or using reply.view().
    * When multiple context objects are used, values from the global context always have lowest precedence.
    */
  var context: js.UndefOr[js.Object | (js.Function1[/* request */ Request, js.Object])] = js.native
  /** the text encoding used by the templates when reading the files and outputting the result. Defaults to 'utf8'. */
  var encoding: js.UndefOr[String] = js.native
  /**
    * If set to true or a layout filename, layout support is enabled.
    * A layout is a single template file used as the parent template for other view templates in the same engine.
    * If true, the layout template name must be 'layout.ext' where 'ext' is the engine's extension.
    * Otherwise, the provided filename is suffixed with the engine's extension and loaded.
    * Disable layout when using Jade as it will handle including any layout files independently.
    * Defaults to false.
    */
  var layout: js.UndefOr[Boolean | String] = js.native
  /** the key used by the template engine to denote where primary template content should go. Defaults to 'content'. */
  var layoutKeyword: js.UndefOr[String] = js.native
  /** the root file path, or array of file paths, where layout templates are located (using the relativeTo prefix if present). Defaults to path. */
  var layoutPath: js.UndefOr[String | js.Array[String]] = js.native
  /** the root file path, or array of file paths, used to resolve and load the templates identified when calling reply.view(). Defaults to current working directory. */
  var path: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * a base path used as prefix for path and partialsPath. No default.
    */
  var relativeTo: js.UndefOr[String] = js.native
  /** options object passed to the returned function from the compile operation. Defaults to empty options {}. */
  var runtimeOptions: js.UndefOr[RuntimeOptions] = js.native
}

object ViewHandlerOrReplyOptions {
  @scala.inline
  def apply(): ViewHandlerOrReplyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewHandlerOrReplyOptions]
  }
  @scala.inline
  implicit class ViewHandlerOrReplyOptionsOps[Self <: ViewHandlerOrReplyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAbsolutePaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAbsolutePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAbsolutePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAbsolutePaths")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowInsecureAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsecureAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInsecureAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsecureAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withCompileMode(value: sync | async): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompileMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCompileOptions(value: CompileOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompileOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withContextFunction1(value: /* request */ Request => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: js.Object | (js.Function1[/* request */ Request, js.Object])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutKeyword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutPath(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTo")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeOptions(value: RuntimeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeOptions")(js.undefined)
        ret
    }
  }
  
}


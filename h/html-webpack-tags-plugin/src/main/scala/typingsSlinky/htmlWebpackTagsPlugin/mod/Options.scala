package typingsSlinky.htmlWebpackTagsPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends CommonOptions {
  var cssExtensions: js.UndefOr[String | js.Array[String]] = js.native
  var files: js.UndefOr[js.Array[String]] = js.native
  var jsExtensions: js.UndefOr[String | js.Array[String]] = js.native
  var links: js.UndefOr[String | LinkTagOptions | (js.Array[String | LinkTagOptions])] = js.native
  var metas: js.UndefOr[String | MetaTagOptions | (js.Array[String | MetaTagOptions])] = js.native
  var prependExternals: js.UndefOr[Boolean] = js.native
  var scripts: js.UndefOr[String | ScriptTagOptions | (js.Array[String | ScriptTagOptions])] = js.native
  var tags: js.UndefOr[
    String | MaybeLinkTagOptions | MaybeScriptTagOptions | (js.Array[String | MaybeLinkTagOptions | MaybeScriptTagOptions])
  ] = js.native
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
    def withCssExtensions(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withJsExtensions(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: String | LinkTagOptions | (js.Array[String | LinkTagOptions])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withMetas(value: String | MetaTagOptions | (js.Array[String | MetaTagOptions])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metas")(js.undefined)
        ret
    }
    @scala.inline
    def withPrependExternals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependExternals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrependExternals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependExternals")(js.undefined)
        ret
    }
    @scala.inline
    def withScripts(value: String | ScriptTagOptions | (js.Array[String | ScriptTagOptions])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(
      value: String | MaybeLinkTagOptions | MaybeScriptTagOptions | (js.Array[String | MaybeLinkTagOptions | MaybeScriptTagOptions])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}


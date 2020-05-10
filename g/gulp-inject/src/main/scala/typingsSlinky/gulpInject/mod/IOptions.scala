package typingsSlinky.gulpInject.mod

import typingsSlinky.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  var addPrefix: js.UndefOr[String] = js.native
  var addRootSlash: js.UndefOr[Boolean] = js.native
  var addSuffix: js.UndefOr[String] = js.native
  var empty: js.UndefOr[Boolean] = js.native
  var endtag: js.UndefOr[String | ITagFunction] = js.native
  var ignorePath: js.UndefOr[String | js.Array[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var relative: js.UndefOr[Boolean] = js.native
  var removeTags: js.UndefOr[Boolean] = js.native
  var selfClosingTag: js.UndefOr[Boolean] = js.native
  var starttag: js.UndefOr[String | ITagFunction] = js.native
  var transform: js.UndefOr[ITransformFunction] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withAddRootSlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRootSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddRootSlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRootSlash")(js.undefined)
        ret
    }
    @scala.inline
    def withAddSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withEndtagFunction2(value: (/* targetExt */ String, /* sourceExt */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endtag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEndtag(value: String | ITagFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endtag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endtag")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePath(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(js.undefined)
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
    def withRelative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTags")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfClosingTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfClosingTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfClosingTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfClosingTag")(js.undefined)
        ret
    }
    @scala.inline
    def withStarttagFunction2(value: (/* targetExt */ String, /* sourceExt */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starttag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStarttag(value: String | ITagFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starttag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarttag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starttag")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(
      value: (/* filepath */ String, /* file */ js.UndefOr[File], /* index */ js.UndefOr[Double], /* length */ js.UndefOr[Double], /* targetFile */ js.UndefOr[File]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}


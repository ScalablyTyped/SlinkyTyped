package typingsSlinky.gulpSourcemaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteOptions extends js.Object {
  var addComment: js.UndefOr[Boolean] = js.native
  @JSName("clone")
  var clone_FWriteOptions: js.UndefOr[Boolean | CloneOptions] = js.native
  var includeContent: js.UndefOr[Boolean] = js.native
  var sourceMappingURLPrefix: js.UndefOr[String | WriteMapper] = js.native
  var sourceRoot: js.UndefOr[String | WriteMapper] = js.native
}

object WriteOptions {
  @scala.inline
  def apply(): WriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteOptions]
  }
  @scala.inline
  implicit class WriteOptionsOps[Self <: WriteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addComment")(js.undefined)
        ret
    }
    @scala.inline
    def withClone(value: Boolean | CloneOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeContent")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMappingURLPrefixFunction1(value: /* file */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMappingURLPrefix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSourceMappingURLPrefix(value: String | WriteMapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMappingURLPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMappingURLPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMappingURLPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRootFunction1(value: /* file */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSourceRoot(value: String | WriteMapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(js.undefined)
        ret
    }
  }
  
}


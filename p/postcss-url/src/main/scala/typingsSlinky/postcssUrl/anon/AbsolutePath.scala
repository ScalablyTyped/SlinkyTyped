package typingsSlinky.postcssUrl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbsolutePath extends js.Object {
  /**
    * Absolute path to asset.
    */
  var absolutePath: js.UndefOr[String] = js.native
  /**
    * Hash from URL.
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * URL pathname.
    */
  var pathname: js.UndefOr[String] = js.native
  /**
    * Current relative path to asset.
    */
  var relativePath: js.UndefOr[String] = js.native
  /**
    * Querystring from URL.
    */
  var search: js.UndefOr[String] = js.native
  /**
    * Original URL.
    */
  var url: String = js.native
}

object AbsolutePath {
  @scala.inline
  def apply(url: String): AbsolutePath = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsolutePath]
  }
  @scala.inline
  implicit class AbsolutePathOps[Self <: AbsolutePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbsolutePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsolutePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePath")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withPathname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePath")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
  }
  
}


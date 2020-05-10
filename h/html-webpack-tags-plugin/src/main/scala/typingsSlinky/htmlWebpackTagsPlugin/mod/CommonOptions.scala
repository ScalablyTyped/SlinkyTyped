package typingsSlinky.htmlWebpackTagsPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonOptions extends js.Object {
  var addHash: js.UndefOr[AddHashFunction] = js.native
  var addPublicPath: js.UndefOr[AddPublicPathFunction] = js.native
  var append: js.UndefOr[Boolean] = js.native
  var hash: js.UndefOr[Boolean | String | AddHashFunction] = js.native
  var publicPath: js.UndefOr[Boolean | String | AddPublicPathFunction] = js.native
  var useHash: js.UndefOr[Boolean] = js.native
  var usePublicPath: js.UndefOr[Boolean] = js.native
}

object CommonOptions {
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddHash(value: (/* assetPath */ String, /* hash */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHash")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHash")(js.undefined)
        ret
    }
    @scala.inline
    def withAddPublicPath(value: (/* assetPath */ String, /* publicPath */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPublicPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddPublicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPublicPath")(js.undefined)
        ret
    }
    @scala.inline
    def withAppend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withHashFunction2(value: (/* assetPath */ String, /* hash */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHash(value: Boolean | String | AddHashFunction): Self = {
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
    def withPublicPathFunction2(value: (/* assetPath */ String, /* publicPath */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPublicPath(value: Boolean | String | AddPublicPathFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHash")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePublicPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePublicPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePublicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePublicPath")(js.undefined)
        ret
    }
  }
  
}


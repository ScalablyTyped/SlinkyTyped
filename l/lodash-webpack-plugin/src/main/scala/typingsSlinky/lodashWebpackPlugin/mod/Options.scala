package typingsSlinky.lodashWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var caching: js.UndefOr[Boolean] = js.native
  var chaining: js.UndefOr[Boolean] = js.native
  var cloning: js.UndefOr[Boolean] = js.native
  var coercions: js.UndefOr[Boolean] = js.native
  var collections: js.UndefOr[Boolean] = js.native
  var currying: js.UndefOr[Boolean] = js.native
  var deburring: js.UndefOr[Boolean] = js.native
  var exotics: js.UndefOr[Boolean] = js.native
  var flattening: js.UndefOr[Boolean] = js.native
  var guards: js.UndefOr[Boolean] = js.native
  var memoizing: js.UndefOr[Boolean] = js.native
  var metadata: js.UndefOr[Boolean] = js.native
  var paths: js.UndefOr[Boolean] = js.native
  var placeholders: js.UndefOr[Boolean] = js.native
  var shorthands: js.UndefOr[Boolean] = js.native
  var unicode: js.UndefOr[Boolean] = js.native
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
    def withCaching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caching")(js.undefined)
        ret
    }
    @scala.inline
    def withChaining(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChaining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chaining")(js.undefined)
        ret
    }
    @scala.inline
    def withCloning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloning")(js.undefined)
        ret
    }
    @scala.inline
    def withCoercions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coercions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoercions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coercions")(js.undefined)
        ret
    }
    @scala.inline
    def withCollections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrying(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currying")(js.undefined)
        ret
    }
    @scala.inline
    def withDeburring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deburring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeburring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deburring")(js.undefined)
        ret
    }
    @scala.inline
    def withExotics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exotics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExotics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exotics")(js.undefined)
        ret
    }
    @scala.inline
    def withFlattening(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattening")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlattening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattening")(js.undefined)
        ret
    }
    @scala.inline
    def withGuards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guards")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoizing")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholders")(js.undefined)
        ret
    }
    @scala.inline
    def withShorthands(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorthands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShorthands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorthands")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode")(js.undefined)
        ret
    }
  }
  
}


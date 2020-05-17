package typingsSlinky.esm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<esm.esm.Options.Esm> */
@js.native
trait PartialEsm extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var dedefault: js.UndefOr[Boolean] = js.native
  var esModule: js.UndefOr[Boolean] = js.native
  var extensions: js.UndefOr[Boolean] = js.native
  var mutableNamespace: js.UndefOr[Boolean] = js.native
  var namedExports: js.UndefOr[Boolean] = js.native
  var paths: js.UndefOr[Boolean] = js.native
  var topLevelReturn: js.UndefOr[Boolean] = js.native
  var vars: js.UndefOr[Boolean] = js.native
}

object PartialEsm {
  @scala.inline
  def apply(): PartialEsm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEsm]
  }
  @scala.inline
  implicit class PartialEsmOps[Self <: PartialEsm] (val x: Self) extends AnyVal {
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
    def withDedefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDedefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedefault")(js.undefined)
        ret
    }
    @scala.inline
    def withEsModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEsModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esModule")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withMutableNamespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutableNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutableNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutableNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedExports")(js.undefined)
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
    def withTopLevelReturn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLevelReturn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopLevelReturn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLevelReturn")(js.undefined)
        ret
    }
    @scala.inline
    def withVars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vars")(js.undefined)
        ret
    }
  }
  
}


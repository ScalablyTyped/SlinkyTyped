package typingsSlinky.esm.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Esm extends js.Object {
  var cache: Boolean = js.native
  var dedefault: Boolean = js.native
  var esModule: Boolean = js.native
  var extensions: Boolean = js.native
  var mutableNamespace: Boolean = js.native
  var namedExports: Boolean = js.native
  var paths: Boolean = js.native
  var topLevelReturn: Boolean = js.native
  var vars: Boolean = js.native
}

object Esm {
  @scala.inline
  def apply(
    cache: Boolean,
    dedefault: Boolean,
    esModule: Boolean,
    extensions: Boolean,
    mutableNamespace: Boolean,
    namedExports: Boolean,
    paths: Boolean,
    topLevelReturn: Boolean,
    vars: Boolean
  ): Esm = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], dedefault = dedefault.asInstanceOf[js.Any], esModule = esModule.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], mutableNamespace = mutableNamespace.asInstanceOf[js.Any], namedExports = namedExports.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], topLevelReturn = topLevelReturn.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Esm]
  }
  @scala.inline
  implicit class EsmOps[Self <: Esm] (val x: Self) extends AnyVal {
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
    def withDedefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEsModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMutableNamespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutableNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamedExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopLevelReturn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLevelReturn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vars")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


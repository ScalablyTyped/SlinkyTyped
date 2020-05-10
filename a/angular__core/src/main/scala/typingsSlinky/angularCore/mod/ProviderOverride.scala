package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderOverride extends js.Object {
  var deprecatedBehavior: Boolean = js.native
  var deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _] = js.native
  var flags: ɵNodeFlags = js.native
  var token: js.Any = js.native
  var value: js.Any = js.native
}

object ProviderOverride {
  @scala.inline
  def apply(
    deprecatedBehavior: Boolean,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    flags: ɵNodeFlags,
    token: js.Any,
    value: js.Any
  ): ProviderOverride = {
    val __obj = js.Dynamic.literal(deprecatedBehavior = deprecatedBehavior.asInstanceOf[js.Any], deps = deps.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderOverride]
  }
  @scala.inline
  implicit class ProviderOverrideOps[Self <: ProviderOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeprecatedBehavior(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeps(value: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: ɵNodeFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


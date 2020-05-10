package typingsSlinky.polyfillService.mod

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolyfillSpec extends js.Object {
  var aliasOf: js.UndefOr[Set[String]] = js.native
  var flags: Set[PolyfillFlag] = js.native
}

object PolyfillSpec {
  @scala.inline
  def apply(flags: Set[PolyfillFlag]): PolyfillSpec = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyfillSpec]
  }
  @scala.inline
  implicit class PolyfillSpecOps[Self <: PolyfillSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlags(value: Set[PolyfillFlag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAliasOf(value: Set[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasOf")(js.undefined)
        ret
    }
  }
  
}


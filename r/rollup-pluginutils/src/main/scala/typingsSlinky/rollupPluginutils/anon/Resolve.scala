package typingsSlinky.rollupPluginutils.anon

import typingsSlinky.rollupPluginutils.rollupPluginutilsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolve extends js.Object {
  var resolve: js.UndefOr[String | `false` | Null] = js.native
}

object Resolve {
  @scala.inline
  def apply(): Resolve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resolve]
  }
  @scala.inline
  implicit class ResolveOps[Self <: Resolve] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolve(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(null)
        ret
    }
  }
  
}


package typingsSlinky.node.dnsMod

import typingsSlinky.node.nodeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupOneOptions extends LookupOptions {
  @JSName("all")
  var all_LookupOneOptions: js.UndefOr[`false`] = js.native
}

object LookupOneOptions {
  @scala.inline
  def apply(): LookupOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupOneOptions]
  }
  @scala.inline
  implicit class LookupOneOptionsOps[Self <: LookupOneOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.jestUtil.deepCyclicCopyMod

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepCyclicCopyOptions extends js.Object {
  var blacklist: js.UndefOr[Set[String]] = js.native
  var keepPrototype: js.UndefOr[Boolean] = js.native
}

object DeepCyclicCopyOptions {
  @scala.inline
  def apply(): DeepCyclicCopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepCyclicCopyOptions]
  }
  @scala.inline
  implicit class DeepCyclicCopyOptionsOps[Self <: DeepCyclicCopyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlacklist(value: Set[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepPrototype(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepPrototype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepPrototype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepPrototype")(js.undefined)
        ret
    }
  }
  
}


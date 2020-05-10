package typingsSlinky.debounceFn.mod

import typingsSlinky.debounceFn.debounceFnBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImmediateOptions extends Options {
  @JSName("immediate")
  val immediate_ImmediateOptions: `true` = js.native
}

object ImmediateOptions {
  @scala.inline
  def apply(immediate: `true`): ImmediateOptions = {
    val __obj = js.Dynamic.literal(immediate = immediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmediateOptions]
  }
  @scala.inline
  implicit class ImmediateOptionsOps[Self <: ImmediateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImmediate(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


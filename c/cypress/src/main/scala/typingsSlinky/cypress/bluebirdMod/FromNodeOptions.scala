package typingsSlinky.cypress.bluebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromNodeOptions extends js.Object {
  var multiArgs: js.UndefOr[Boolean] = js.native
}

object FromNodeOptions {
  @scala.inline
  def apply(): FromNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromNodeOptions]
  }
  @scala.inline
  implicit class FromNodeOptionsOps[Self <: FromNodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiArgs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiArgs")(js.undefined)
        ret
    }
  }
  
}


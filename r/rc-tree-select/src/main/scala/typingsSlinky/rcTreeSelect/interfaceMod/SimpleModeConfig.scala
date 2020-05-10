package typingsSlinky.rcTreeSelect.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleModeConfig extends js.Object {
  var id: js.UndefOr[Key] = js.native
  var pId: js.UndefOr[Key] = js.native
  var rootPId: js.UndefOr[Key] = js.native
}

object SimpleModeConfig {
  @scala.inline
  def apply(): SimpleModeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleModeConfig]
  }
  @scala.inline
  implicit class SimpleModeConfigOps[Self <: SimpleModeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withPId(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pId")(js.undefined)
        ret
    }
    @scala.inline
    def withRootPId(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootPId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPId")(js.undefined)
        ret
    }
  }
  
}


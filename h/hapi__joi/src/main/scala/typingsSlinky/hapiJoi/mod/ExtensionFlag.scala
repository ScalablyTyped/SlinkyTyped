package typingsSlinky.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionFlag extends js.Object {
  var default: js.UndefOr[js.Any] = js.native
  var setter: js.UndefOr[String] = js.native
}

object ExtensionFlag {
  @scala.inline
  def apply(): ExtensionFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionFlag]
  }
  @scala.inline
  implicit class ExtensionFlagOps[Self <: ExtensionFlag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withSetter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setter")(js.undefined)
        ret
    }
  }
  
}


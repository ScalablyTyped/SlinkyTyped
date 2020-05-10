package typingsSlinky.ionicCore.gestureControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockerConfig extends js.Object {
  var disable: js.UndefOr[js.Array[String]] = js.native
  var disableScroll: js.UndefOr[Boolean] = js.native
}

object BlockerConfig {
  @scala.inline
  def apply(): BlockerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockerConfig]
  }
  @scala.inline
  implicit class BlockerConfigOps[Self <: BlockerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScroll")(js.undefined)
        ret
    }
  }
  
}


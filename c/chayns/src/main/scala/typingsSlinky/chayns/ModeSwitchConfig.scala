package typingsSlinky.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UI Functions
  * chayns.ui.modeswitch
  * interfaces
  */
// chayns.ui.modeswitch.init()
@js.native
trait ModeSwitchConfig extends js.Object {
  var headline: js.UndefOr[String] = js.native
  var items: js.Array[ModeSwitchItem] = js.native
  var preventclose: js.UndefOr[Boolean] = js.native
  def callback(result: ModeSwitchItem): Unit = js.native
}

object ModeSwitchConfig {
  @scala.inline
  def apply(callback: ModeSwitchItem => Unit, items: js.Array[ModeSwitchItem]): ModeSwitchConfig = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeSwitchConfig]
  }
  @scala.inline
  implicit class ModeSwitchConfigOps[Self <: ModeSwitchConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: ModeSwitchItem => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItems(value: js.Array[ModeSwitchItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headline")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventclose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventclose")(js.undefined)
        ret
    }
  }
  
}


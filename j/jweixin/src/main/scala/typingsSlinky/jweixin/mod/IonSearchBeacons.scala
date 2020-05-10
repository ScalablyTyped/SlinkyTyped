package typingsSlinky.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonSearchBeacons extends BaseParams {
  // 回调函数，可以数组形式取得该商家注册的在周边的相关设备列表
  @JSName("complete")
  def complete_MIonSearchBeacons(argv: js.Any): Unit = js.native
}

object IonSearchBeacons {
  @scala.inline
  def apply(complete: js.Any => Unit): IonSearchBeacons = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[IonSearchBeacons]
  }
  @scala.inline
  implicit class IonSearchBeaconsOps[Self <: IonSearchBeacons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


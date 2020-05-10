package typingsSlinky.angularToasty.toasty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToastyConfigProvider extends js.Object {
  @JSName("$get")
  def $get(): IGlobalConfig = js.native
  def setConfig(`override`: IGlobalConfig): Unit = js.native
}

object IToastyConfigProvider {
  @scala.inline
  def apply($get: () => IGlobalConfig, setConfig: IGlobalConfig => Unit): IToastyConfigProvider = {
    val __obj = js.Dynamic.literal($get = js.Any.fromFunction0($get), setConfig = js.Any.fromFunction1(setConfig))
    __obj.asInstanceOf[IToastyConfigProvider]
  }
  @scala.inline
  implicit class IToastyConfigProviderOps[Self <: IToastyConfigProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$get(value: () => IGlobalConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetConfig(value: IGlobalConfig => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setConfig")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.angularLocalforage.mod.localForage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocalForageProvider extends js.Object {
  def config(config: LocalForageConfig): Unit = js.native
  def setNotify(onItemSet: Boolean, onItemRemove: Boolean): Unit = js.native
}

object ILocalForageProvider {
  @scala.inline
  def apply(config: LocalForageConfig => Unit, setNotify: (Boolean, Boolean) => Unit): ILocalForageProvider = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config), setNotify = js.Any.fromFunction2(setNotify))
    __obj.asInstanceOf[ILocalForageProvider]
  }
  @scala.inline
  implicit class ILocalForageProviderOps[Self <: ILocalForageProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: LocalForageConfig => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNotify(value: (Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNotify")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


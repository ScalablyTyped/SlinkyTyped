package typingsSlinky.ngkookies.angular.kookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKookiesProvider extends js.Object {
  var config: Config = js.native
  var defaults: Options = js.native
  def setConfig(config: Config): Unit = js.native
  def setDefaults(options: Options): Unit = js.native
}

object IKookiesProvider {
  @scala.inline
  def apply(config: Config, defaults: Options, setConfig: Config => Unit, setDefaults: Options => Unit): IKookiesProvider = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], setConfig = js.Any.fromFunction1(setConfig), setDefaults = js.Any.fromFunction1(setDefaults))
    __obj.asInstanceOf[IKookiesProvider]
  }
  @scala.inline
  implicit class IKookiesProviderOps[Self <: IKookiesProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaults(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetConfig(value: Config => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDefaults(value: Options => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaults")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


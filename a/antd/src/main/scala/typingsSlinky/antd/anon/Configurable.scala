package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configurable extends js.Object {
  var configurable: Boolean = js.native
  def get(): js.Any = js.native
}

object Configurable {
  @scala.inline
  def apply(configurable: Boolean, get: () => js.Any): Configurable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Configurable]
  }
  @scala.inline
  implicit class ConfigurableOps[Self <: Configurable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


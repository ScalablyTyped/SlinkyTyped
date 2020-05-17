package typingsSlinky.mobx.anon

import typingsSlinky.mobx.coreActionMod.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configurable extends js.Object {
  var configurable: Boolean = js.native
  var enumerable: Boolean = js.native
  var value: js.Function with IAction = js.native
  var writable: Boolean = js.native
}

object Configurable {
  @scala.inline
  def apply(configurable: Boolean, enumerable: Boolean, value: js.Function with IAction, writable: Boolean): Configurable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
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
    def withEnumerable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Function with IAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


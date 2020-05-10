package typingsSlinky.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginServiceStatic extends js.Object {
  def register(plugin: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions): Unit = js.native
  def unregister(plugin: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions): Unit = js.native
}

object PluginServiceStatic {
  @scala.inline
  def apply(
    register: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions => Unit,
    unregister: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions => Unit
  ): PluginServiceStatic = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[PluginServiceStatic]
  }
  @scala.inline
  implicit class PluginServiceStaticOps[Self <: PluginServiceStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegister(value: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnregister(value: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


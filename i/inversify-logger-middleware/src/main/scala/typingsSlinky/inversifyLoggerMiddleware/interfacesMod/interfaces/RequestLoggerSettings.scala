package typingsSlinky.inversifyLoggerMiddleware.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestLoggerSettings extends js.Object {
  var bindings: js.UndefOr[BindingLoggerSettings] = js.native
  var serviceIdentifier: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[TargetLoggerSettings] = js.native
}

object RequestLoggerSettings {
  @scala.inline
  def apply(): RequestLoggerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLoggerSettings]
  }
  @scala.inline
  implicit class RequestLoggerSettingsOps[Self <: RequestLoggerSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindings(value: BindingLoggerSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceIdentifier(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: TargetLoggerSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}


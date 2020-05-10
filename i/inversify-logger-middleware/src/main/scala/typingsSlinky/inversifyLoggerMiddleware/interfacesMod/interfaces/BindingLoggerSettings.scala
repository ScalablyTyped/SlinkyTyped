package typingsSlinky.inversifyLoggerMiddleware.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingLoggerSettings extends js.Object {
  var activated: js.UndefOr[Boolean] = js.native
  var cache: js.UndefOr[Boolean] = js.native
  var constraint: js.UndefOr[Boolean] = js.native
  var dynamicValue: js.UndefOr[Boolean] = js.native
  var factory: js.UndefOr[Boolean] = js.native
  var implementationType: js.UndefOr[Boolean] = js.native
  var onActivation: js.UndefOr[Boolean] = js.native
  var provider: js.UndefOr[Boolean] = js.native
  var scope: js.UndefOr[Boolean] = js.native
  var serviceIdentifier: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[Boolean] = js.native
}

object BindingLoggerSettings {
  @scala.inline
  def apply(): BindingLoggerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingLoggerSettings]
  }
  @scala.inline
  implicit class BindingLoggerSettingsOps[Self <: BindingLoggerSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activated")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withConstraint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraint")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFactory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(js.undefined)
        ret
    }
    @scala.inline
    def withImplementationType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplementationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementationType")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActivation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnActivation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivation")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
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
    def withType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}


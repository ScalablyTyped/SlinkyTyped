package typingsSlinky.oclazyload.oc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProviderConfig extends js.Object {
  /**
    * If true, all errors will be logged to the console, in addition to rejecting a promise. Defaults to false.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * If true, an event will be broadcast whenever a module, component or file is loaded. Events that can be broadcast are: ocLazyLoad.moduleLoaded,
    * ocLazyLoad.moduleReloaded, ocLazyLoad.componentLoaded, ocLazyLoad.fileLoaded. Defaults to false.
    */
  var events: js.UndefOr[Boolean] = js.native
  /**
    * Predefines a set of module configurations for later use. A name must be provided for each module so that it can be retrieved later.
    */
  var modules: js.UndefOr[js.Array[IModuleConfig]] = js.native
}

object IProviderConfig {
  @scala.inline
  def apply(): IProviderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProviderConfig]
  }
  @scala.inline
  implicit class IProviderConfigOps[Self <: IProviderConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: js.Array[IModuleConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
  }
  
}

